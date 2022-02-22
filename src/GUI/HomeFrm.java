/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import xhelper.Auth;

/**
 *
 * @author NTV
 */
public class HomeFrm extends javax.swing.JInternalFrame {
    static int home = 0;
    /**
     * Creates new form FPTFrm
     */
    public HomeFrm() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnHD = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblIDNV = new javax.swing.JLabel();
        lblRule = new javax.swing.JLabel();

        setTitle("Trang chủ");
        setToolTipText("");
        setName(""); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo-small_1.png"))); // NOI18N
        jLabel1.setText("DESIGNING YOUR LIFE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 50));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 80, 20));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logouticon.jpg"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMaximumSize(new java.awt.Dimension(121, 83));
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout);

        btnChangePass.setBackground(new java.awt.Color(255, 255, 255));
        btnChangePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/changepass.png"))); // NOI18N
        btnChangePass.setText("Đổi mật khẩu");
        btnChangePass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        jPanel2.add(btnChangePass);

        btnHD.setBackground(new java.awt.Color(255, 255, 255));
        btnHD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tutorialicon.jpg"))); // NOI18N
        btnHD.setText("Hướng dẫn");
        btnHD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDActionPerformed(evt);
            }
        });
        jPanel2.add(btnHD);

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infomation.jpg"))); // NOI18N
        btnInfo.setText("Giới thiệu");
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel2.add(btnInfo);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0, 0, 15));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Xin chào,");
        jPanel3.add(lblName);

        lblIDNV.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblIDNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDNV.setText("Mã NV:");
        jPanel3.add(lblIDNV);

        lblRule.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRule.setText("Vai trò:");
        jPanel3.add(lblRule);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        if (Auth.nguoiDungHienTai != null) {
            lblName.setText("Xin Chào, " + Auth.nguoiDungHienTai.getHoTen());
            lblRule.setText("Vai Trò: " + (Auth.nguoiDungHienTai.isVaiTro() ? "Trưởng phòng" : "Nhân Viên"));
            lblIDNV.setText("Tài Khoản: " + Auth.nguoiDungHienTai.getMaNV());
        }else {
            btnLogout.setText("Đăng Nhập");
            btnChangePass.setEnabled(false);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:        
            Auth.nguoiDungHienTai = null;
            home = 1;
            this.dispose();
            
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        home = 2;
        this.dispose();
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        home = 4;
        this.dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDActionPerformed
        // TODO add your handling code here:
        home = 5;
        this.dispose();
    }//GEN-LAST:event_btnHDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnHD;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIDNV;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRule;
    // End of variables declaration//GEN-END:variables

}
