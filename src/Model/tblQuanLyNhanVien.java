/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class tblQuanLyNhanVien {
    public String MANHANVIEN, TENNHANVIEN, DIACHI, DIENTHOAI, EMAIL;

    public tblQuanLyNhanVien() {
    }

    public tblQuanLyNhanVien(String MANHANVIEN, String TENNHANVIEN, String DIACHI, String DIENTHOAI, String EMAIL) {
        this.MANHANVIEN = MANHANVIEN;
        this.TENNHANVIEN = TENNHANVIEN;
        this.DIACHI = DIACHI;
        this.DIENTHOAI = DIENTHOAI;
        this.EMAIL = EMAIL;
    }

    public String getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(String MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public String getTENNHANVIEN() {
        return TENNHANVIEN;
    }

    public void setTENNHANVIEN(String TENNHANVIEN) {
        this.TENNHANVIEN = TENNHANVIEN;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getDIENTHOAI() {
        return DIENTHOAI;
    }

    public void setDIENTHOAI(String DIENTHOAI) {
        this.DIENTHOAI = DIENTHOAI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
}
