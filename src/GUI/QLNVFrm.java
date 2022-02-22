/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MyInterface.BaseDaoInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import mydao.NVDao;
import myentity.NhanVien;
import xhelper.Auth;
import xhelper.MyMess;

/**
 *
 * @author NTV
 */
public class QLNVFrm extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private BaseDaoInterface dao;
    private int index;

    /**
     * Creates new form QLKH
     */
    public QLNVFrm() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIDNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        radNV = new javax.swing.JRadioButton();
        radTP = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        radMoKhoa = new javax.swing.JRadioButton();
        radDaKhoa = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel3.setLayout(new java.awt.GridLayout(6, 1));

        jLabel3.setText("Mã Nhân Viên");
        jPanel3.add(jLabel3);
        jPanel3.add(txtIDNV);

        jLabel2.setText("Họ Và Tên");
        jPanel3.add(jLabel2);
        jPanel3.add(txtName);

        jLabel4.setText("Email");
        jPanel3.add(jLabel4);
        jPanel3.add(txtEmail);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(6, 0));

        jLabel5.setText("Mật Khẩu");
        jPanel4.add(jLabel5);
        jPanel4.add(txtMK);

        jLabel6.setText("Vai Trò");
        jPanel4.add(jLabel6);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(radNV);
        radNV.setSelected(true);
        radNV.setText("Nhân Viên");
        jPanel5.add(radNV);

        buttonGroup1.add(radTP);
        radTP.setText("Trưởng Phòng");
        jPanel5.add(radTP);

        jPanel4.add(jPanel5);

        jLabel7.setText("Trạng Thái");
        jPanel4.add(jLabel7);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup2.add(radMoKhoa);
        radMoKhoa.setSelected(true);
        radMoKhoa.setText("Mở Khoá");
        jPanel10.add(radMoKhoa);

        buttonGroup2.add(radDaKhoa);
        radDaKhoa.setText("Đã Khoá");
        jPanel10.add(radDaKhoa);

        jPanel4.add(jPanel10);

        jPanel2.add(jPanel4);

        jPanel8.setLayout(new java.awt.GridLayout(1, 4, 15, 15));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel8.add(btnSua);

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa);

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel8.add(btnMoi);

        txtTimkiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimkiem.setText("Nhập mã nhân viên cần tìm");
        txtTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusLost(evt);
            }
        });
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyPressed(evt);
            }
        });

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/firtsicon.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel9.add(btnFirst);

        btnpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preicon.png"))); // NOI18N
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });
        jPanel9.add(btnpre);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nexticon.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel9.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lasticon.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel9.add(btnLast);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTimkiem)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khoá Học", "Mật Khẩu", "Họ Tên", "Vai Trò", "Email", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLNV.setRowHeight(24);
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQLNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        // TODO add your handling code here:
        if (mouseClicked());
        
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (themNhanVien());
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (suaNhanVien());
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (xoaNhanVien());
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        if (txtTimkiem.getText().equalsIgnoreCase("Nhập mã nhân viên cần tìm")
                || txtTimkiem.getText().trim().isEmpty()) {
            timKiemFocus();
            return;
        }
        String manv = txtTimkiem.getText();
        if (!checkTrung(manv)) {
            MyMess.msgFalse(this, "Mã nhân viên này không tồn tại!");
            return;
        }
        for (int i = 0; i < tblQLNV.getRowCount(); i++) {
            if (manv.equals(tblQLNV.getValueAt(i, 0))) {
                index = i;
                showForm(index);
                updateStatus();
            }
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtTimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusGained
        // TODO add your handling code here:
        if (txtTimkiem.getText().equals("Nhập mã nhân viên cần tìm")) {
            txtTimkiem.setText("");
            txtTimkiem.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTimkiemFocusGained

    private void txtTimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusLost
        // TODO add your handling code here:
        timKiemFocus();
    }//GEN-LAST:event_txtTimkiemFocusLost

    private void txtTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyPressed
        // TODO add your handling code here:
        EnterAcctions(evt);
    }//GEN-LAST:event_txtTimkiemKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnpre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radDaKhoa;
    private javax.swing.JRadioButton radMoKhoa;
    private javax.swing.JRadioButton radNV;
    private javax.swing.JRadioButton radTP;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDNV;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        //Khai báo lớp dao
        this.dao = new NVDao();

        this.dtm = (DefaultTableModel) tblQLNV.getModel();
        
        if(!Auth.isManager()) {
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
            btnMoi.setEnabled(false);
            btnThem.setEnabled(false);
        }
        
        LoadDataToTable();
    }

    private void LoadDataToTable() {
        //load dữ liệu từ cơ sở dữ liệu vào bảng
        this.dtm.setRowCount(0);
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            list = dao.selectALL();
            for (NhanVien nv : list) {
                setDataRow(nv);
            }
            this.index = 0;
            updateStatus();
            showForm(index);
        } catch (Exception ex) {
            MyMess.msgFalse(this, ex.getMessage());
        }
    }

    private void setDataRow(NhanVien nv) {
        //thêm một row vào bảng
        String tt, vt;
        tt = nv.isTrangThai() ? "Mở khóa" : "Khóa";
        vt = nv.isVaiTro() ? "Quản Trị" : "Nhân viên";
        this.dtm.addRow(new Object[]{
            nv.getMaNV(),
            nv.getMatKhau(),
            nv.getHoTen(),
            vt,
            nv.getEmail(),
            tt
        });
    }

    private void showForm(int i) {
        //hiển thị dữ liệu lên form tương ứng
        boolean isVT = false, isTT = false;
        if (tblQLNV.getValueAt(i, 3).equals("Quản Trị")) {
            isVT = true;
        }
        if (tblQLNV.getValueAt(i, 5).equals("Mở khóa")) {
            isTT = true;
        }

        this.txtIDNV.setText(tblQLNV.getValueAt(i, 0) + "");
        this.txtName.setText(tblQLNV.getValueAt(i, 2) + "");
        this.radTP.setSelected(isVT);
        this.radNV.setSelected(!isVT);
        this.txtEmail.setText(tblQLNV.getValueAt(i, 4) + "");
        this.radMoKhoa.setSelected(isTT);
        this.radDaKhoa.setSelected(!isTT);
        this.txtMK.setText(tblQLNV.getValueAt(i, 1) + "");
        tblQLNV.setRowSelectionInterval(i, i);
    }

    private NhanVien getForm() {
        //lấy dữ liệu đã nhập từ trên form
        String manv = txtIDNV.getText();
        String hoTen = txtName.getText();
        String Email = txtEmail.getText();
        String matKhau = txtMK.getText();
        boolean vaiTro = radTP.isSelected();
        boolean trangThai = radMoKhoa.isSelected();
        return new NhanVien(manv, matKhau, hoTen, vaiTro, trangThai, Email);
    }

    private void clearForm() {
        //xóa trắng form
        this.txtIDNV.setText("");
        this.txtName.setText("");
        this.radTP.setSelected(true);
        this.txtEmail.setText("");
        this.txtMK.setText("");
        this.radMoKhoa.setSelected(true);
        this.index = -1;
        updateStatus();
    }

    private void updateStatus() {
        //cập nhập trạng thái cho các button điều hướng
        boolean first = (this.index <= 0);
        boolean last = (this.index >= tblQLNV.getRowCount() - 1);
        this.btnFirst.setEnabled(!first);
        this.btnpre.setEnabled(!first);
        this.btnLast.setEnabled(!last);
        this.btnNext.setEnabled(!last);
        if (index == -1) {
            this.tblQLNV.setRowSelectionAllowed(false);
        } else {
            this.tblQLNV.setRowSelectionAllowed(true);
        }
    }

    private boolean mouseClicked() {
        //xử lý sưk kiện click lên table
        this.index = tblQLNV.getSelectedRow();
        updateStatus();
        if (index == -1) {
            return true;
        }
        showForm(index);
        return false;
    }

    private void next() {
        index++;
        updateStatus();
        showForm(index);
    }

    private void last() {
        index = tblQLNV.getRowCount() - 1;
        updateStatus();
        showForm(index);
    }

    private void prev() {
        index--;
        updateStatus();
        showForm(index);
    }

    private void first() {
        index = 0;
        updateStatus();
        showForm(index);
    }

    private boolean checkForm() {
        //checkRong
        StringBuilder loi = new StringBuilder();
        NhanVien nv = getForm();
        // check mã nhân viên
        if (nv.getMaNV().trim().isEmpty()) {
            loi.append("Không được để trống mã nhân viên\n");
        } else if (nv.getMaNV().length() > 50) {
            loi.append("Mã nhân viên không được quá 50 ký tự\n");
        }
        //check họ tên nhân viên
        Pattern pHoTen = Pattern.compile("^[\\p{L} .'-]+$");
        if (nv.getHoTen().trim().isEmpty()) {
            loi.append("Không được để trống họ tên nhân viên\n");
        } else if (!pHoTen.matcher(nv.getHoTen()).find()) {
            loi.append("Họ tên không hợp lệ\n");
        } else if (nv.getHoTen().length() > 50) {
            loi.append("Họ tên nhân viên không được quá 50 ký tự\n");
        }
        //check Email
        Pattern pEmail = Pattern.compile("^\\w+@+[a-zA-Z]+(\\.[a-zA-Z]+){1,2}$");
        if (nv.getEmail().trim().isEmpty()) {
            loi.append("Không được để trống Email\n");
        } else if (!pEmail.matcher(nv.getEmail()).find()) {
            loi.append("Email phải đúng định dạng!\nVD: ...@gmail.com hoặc ...@fpt.edu.vn\n");
        }
        //check mật khẩu
        if (nv.getMatKhau().trim().isEmpty()) {
            loi.append("Không được để trống mật khẩu\n");
        }

        //hiển thị thông báo lỗi
        if (loi.length() > 0) {
            MyMess.msgFalse(this, loi.toString());
            return true;
        }
        return false;
    }

    private boolean checkTrung(String manv) {
        //check Trùng
        for (int i = 0; i < tblQLNV.getRowCount(); i++) {
            if (manv.equals(tblQLNV.getValueAt(i, 0))) {
                this.tblQLNV.setRowSelectionInterval(i, i);
                return true;
            }
        }
        return false;
    }

    private boolean themNhanVien() {
        if (checkForm()) {
            return true;
        }
        if (checkTrung(getForm().getMaNV())) {
            MyMess.msgFalse(this, "Mã nhân viên đã tồn tại!");
            return true;
        }
        try {
            this.dao.insert(getForm());
            MyMess.msgTrue(this, "Thêm thành công");
            setDataRow(getForm());
            this.index = tblQLNV.getRowCount() - 1;
            this.tblQLNV.setRowSelectionInterval(index, index);
            showForm(index);
        } catch (Exception ex) {
            MyMess.msgFalse(this, "Lỗi truy vấn!");
            ex.printStackTrace();
            return true;
        }
        return false;
    }

    private boolean suaNhanVien() {
        if (checkForm()) {
            return true;
        }
        if (!checkTrung(getForm().getMaNV())) {
            MyMess.msgFalse(this, "Mã nhân viên không tồn tại!");
            return true;
        }
        try {
            this.dao.update(getForm());
            MyMess.msgTrue(this, "Sửa thành công");
            this.index = tblQLNV.getSelectedRow();
            this.tblQLNV.setValueAt(getForm().getMatKhau(), index, 1);
            this.tblQLNV.setValueAt(getForm().getHoTen(), index, 2);
            this.tblQLNV.setValueAt(radNV.isSelected() ? radNV.getText() : radTP.getText(), index, 3);
            this.tblQLNV.setValueAt(getForm().getEmail(), index, 4);
            this.tblQLNV.setValueAt(radDaKhoa.isSelected() ? radDaKhoa.getText() : radMoKhoa.getText(), index, 5);
        } catch (Exception ex) {
            MyMess.msgFalse(this, "Lỗi truy vấn!");
            ex.printStackTrace();
            return true;
        }
        return false;
    }

    private boolean xoaNhanVien() {
        String manv = getForm().getMaNV();
        manv = nhapMaNV(manv);
        if (!MyMess.question(this, "Bạn có muốn xóa nhân viên " + manv + " này không?")) {
            try {
                this.dao.delete(manv);
                MyMess.msgTrue(this, "Xoá thành công");
                for (int i = 0; i < tblQLNV.getRowCount(); i++) {
                    if (manv.equals(tblQLNV.getValueAt(i, 0))) {
                        this.index = i;
                    }
                }
                this.dtm.removeRow(index);
                showForm(0);
            } catch (Exception ex) {
                MyMess.msgFalse(this, "Xoá Các Khoá Học Nhân Viên: " + Auth.nguoiDungHienTai.getHoTen() + " Đã Tạo Trước!");
                ex.printStackTrace();
                return true;
            }
        }
        return false;
    }

    private String nhapMaNV(String manv) {
        //Bắt phải nhập không nhập thì bấm cancel mới thoát được nhá
        if (manv.isEmpty()) {
            manv = String.valueOf(MyMess.prompt(this, "Bạn phải nhập vào mã nhân viên muốn xóa"));
            if (manv.isEmpty()) {
                manv = nhapMaNV(manv);
            }
        }
        return manv;
    }

    private void EnterAcctions(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnTimkiem.doClick();
        }
    }

    private void timKiemFocus() {
        if (btnTimkiem.getText().trim().isEmpty()) {
            btnTimkiem.setForeground(new Color(255, 0, 0));
            btnTimkiem.setText("Nhập mã nhân viên cần tìm");

        }
    }
}