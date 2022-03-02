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
public class HocVien {

    private int maHV;
    private String maNH;
    private int maKH;
    private float diem;

    public HocVien(int maHV, String maNH, int maKH, float diem) {
        this.maHV = maHV;
        this.maNH = maNH;
        this.maKH = maKH;
        this.diem = diem;
    }

    public HocVien() {
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

}
