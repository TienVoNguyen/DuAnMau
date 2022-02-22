/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import xhelper.APIHelper;
import xhelper.DateHelper;

/**
 *
 * @author NTV
 */
public class ThongKeDao {

    public List<Object[]> getBangDiem(int maKH) {
        String sql = "{Call sp_BangDiem(?)}";
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = APIHelper.query(sql, maKH);
            while (rs.next()) {
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getFloat(3)
                });
            }
            rs.getStatement().getConnection().close();

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getLuongNguoiHoc() {
        String sql = "{Call sp_ThongKeNguoiHoc}";
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = APIHelper.query(sql);
            while (rs.next()) {
                String dkSN = DateHelper.toString(DateHelper.toDate(rs.getString(3), "yyyy-MM-dd"), "dd/MM/yyyy");
                String dkMN = DateHelper.toString(DateHelper.toDate(rs.getString(4), "yyyy-MM-dd"), "dd/MM/yyyy");
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    dkSN,
                    dkMN
                });
            }
            rs.getStatement().getConnection().close();

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDiemChuyenDe() {
        String sql = "{Call sp_ThongKeDiem}";
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = APIHelper.query(sql);
            while (rs.next()) {
                String dtb = String.format("%.2f", rs.getFloat(5));
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getFloat(4),
                    dtb
                });
            }
            rs.getStatement().getConnection().close();

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{Call sp_ThongKeDoanhThu(?)}";
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = APIHelper.query(sql, nam);
            while (rs.next()) {
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7)
                });
            }
            rs.getStatement().getConnection().close();

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
