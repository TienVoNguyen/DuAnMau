/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myentity;

/**
 *
 * @author NTV
 */
public class MyQRCode {
    private String maQR, maNV, ngayTao;

    public MyQRCode() {
    }

    public MyQRCode(String maQR, String maNV, String ngayTao) {
        this.maQR = maQR;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    public String getMaQR() {
        return maQR;
    }

    public void setMaQR(String maQR) {
        this.maQR = maQR;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
