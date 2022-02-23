/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydao;

import java.sql.ResultSet;
import java.sql.SQLException;
import myentity.HocVien;

/**
 *
 * @author NTV
 */
public class HVDao extends BaseDao<HocVien, Integer> {

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO HOCVIEN (MaKH, MaNH, Diem) "
                        + "VALUES (?, ?, ?)";
            case "UPDATE":
                return "UPDATE HOCVIEN SET Diem = ? "
                        + "WHERE MaHV = ?";
            case "DELETE":
                return "DELETE FROM HOCVIEN WHERE MaHV = ?";
            case "SELECTBYID":
                return "SELECT * FROM HOCVIEN WHERE MAHV = ?";
            case "SELECTBYNAME":
                return "SELECT * FROM HOCVIEN WHERE  HoTen like ?";
            case "SELECTALL":
                return "SELECT * FROM HOCVIEN";
            case "SELECTBYIDKH":
                return "SELECT * FROM HOCVIEN WHERE MAKH = ?";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, HocVien hv) {
        switch (action) {
            case "INSERT":
                return new Object[]{
                    hv.getMaKH(),
                    hv.getMaNH(),
                    hv.getDiem()
                };
            case "UPDATE":
                return new Object[]{
                    hv.getDiem(), hv.getMaHV()
                };

        }
        return null;
    }

    @Override
    public HocVien createEntity(ResultSet rs) throws SQLException {
        HocVien hv = new HocVien();
        hv.setMaHV(rs.getInt("MaHV"));
        hv.setMaKH(rs.getInt("MaKH"));
        hv.setMaNH(rs.getString("MaNH"));
        hv.setDiem(rs.getFloat("Diem"));
        return hv;
    }

}
