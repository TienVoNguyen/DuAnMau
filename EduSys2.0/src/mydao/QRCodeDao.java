/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydao;

import java.sql.ResultSet;
import java.sql.SQLException;
import myentity.MyQRCode;
import xhelper.APIHelper;

/**
 *
 * @author NTV
 */
public class QRCodeDao extends BaseDao<MyQRCode, Object> {
    
    public void deleteAll() throws SQLException {
        String sql = "DELETE FROM QRCODE WHERE (DATEDIFF(day, NGAYTAO, GETDATE())) > 3";
        APIHelper.update(sql);
    }

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO QRCODE (MAQRCODE, MANV, NGAYTAO) VALUES (?,?,?)";
            case "DELETE":
                return "DELETE FROM QRCODE WHERE (DATEDIFF(day, NGAYTAO, GETDATE())) > 3 ?";
            case "SELECTBYID":
                return "SELECT * FROM QRCODE WHERE (MAQRCODE = ?)";
            case "SELECTNGAYTAO":
                return "select count(ngaytao) from QRCODE where (DATEDIFF(day, NGAYTAO, GETDATE())) = 0 and MANV = ? group by NGAYTAO";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, MyQRCode qr) {
        switch (action) {
            case "INSERT":
                return new Object[]{
                    qr.getMaQR(),
                    qr.getMaNV(),
                    qr.getNgayTao()
                };
        }
        return null;
    }

    @Override
    public MyQRCode createEntity(ResultSet rs) throws SQLException {
        MyQRCode qr = new MyQRCode();
        qr.setMaQR(rs.getString("MAQRCODE"));
        qr.setMaNV(rs.getString("MANV"));
        qr.setNgayTao(rs.getString("NGAYTAO"));
        
//        return cd;
        return qr;
    }
    
    

}
