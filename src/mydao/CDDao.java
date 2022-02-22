/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydao;

import java.sql.ResultSet;
import java.sql.SQLException;
import myentity.ChuyenDe;

/**
 *
 * @author NTV
 */
public class CDDao extends BaseDao<ChuyenDe, String>{
    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO CHUYENDE(MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?,?,?,?,?,?)";
            case "UPDATE":
                return "UPDATE CHUYENDE SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa =? WHERE  MaCD = ?";
            case "DELETE":
                return "DELETE FROM CHUYENDE WHERE  MaCD = ?";
            case "SELECTBYID":
                return "SELECT * FROM CHUYENDE WHERE  MaCD = ?";
            case "SELECTALL":
                return "SELECT * FROM CHUYENDE";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, ChuyenDe cd) {
         switch (action) {
            case "INSERT":
                return new Object[]{
                    cd.getMaCD(),
                    cd.getTenCD(),
                    cd.getHocPhi(),
                    cd.getThoiLuong(),
                    cd.getHinh(),
                    cd.getMoTa()
                };
            case "UPDATE":
                return new Object[]{
                    cd.getTenCD(),
                    cd.getHocPhi(),
                    cd.getThoiLuong(),
                    cd.getHinh(),
                    cd.getMoTa(),
                    cd.getMaCD()
                };
        }
        return null;
    }

    @Override
    public ChuyenDe createEntity(ResultSet rs) throws SQLException {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(rs.getString("MaCD"));
        cd.setTenCD(rs.getString("TenCD"));
        cd.setHocPhi(rs.getFloat("HocPhi"));
        cd.setThoiLuong(rs.getInt("ThoiLuong"));
        cd.setHinh(rs.getString("Hinh"));
        cd.setMoTa(rs.getString("MoTa"));
        return cd;
    }
}
