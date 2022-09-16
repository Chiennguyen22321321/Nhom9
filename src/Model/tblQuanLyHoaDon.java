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
public class tblQuanLyHoaDon {
   private String MAHOADON, MANHANVIEN, NGAYLAP, TENKHACH, DIENTHOAI, EMAIL, DIACHI, MARUOU;
   private int SOLUONG, GIABAN, THANHTIEN;

    public tblQuanLyHoaDon() {
    }

    public tblQuanLyHoaDon(String MAHOADON, String MANHANVIEN, String NGAYLAP, String TENKHACH, String DIENTHOAI, 
            String EMAIL, String DIACHI, String MARUOU, int SOLUONG, int GIABAN, int THANHTIEN) {
        this.MAHOADON = MAHOADON;
        this.MANHANVIEN = MANHANVIEN;
        this.NGAYLAP = NGAYLAP;
        this.TENKHACH = TENKHACH;
        this.DIENTHOAI = DIENTHOAI;
        this.EMAIL = EMAIL;
        this.DIACHI = DIACHI;
        this.MARUOU = MARUOU;
        this.SOLUONG = SOLUONG;
        this.GIABAN = GIABAN;
        this.THANHTIEN = THANHTIEN;
    }

    public String getMAHOADON() {
        return MAHOADON;
    }

    public void setMAHOADON(String MAHOADON) {
        this.MAHOADON = MAHOADON;
    }

    public String getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(String MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public String getNGAYLAP() {
        return NGAYLAP;
    }

    public void setNGAYLAP(String NGAYLAP) {
        this.NGAYLAP = NGAYLAP;
    }

    public String getTENKHACH() {
        return TENKHACH;
    }

    public void setTENKHACH(String TENKHACH) {
        this.TENKHACH = TENKHACH;
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

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getMARUOU() {
        return MARUOU;
    }

    public void setMARUOU(String MARUOU) {
        this.MARUOU = MARUOU;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public int getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(int GIABAN) {
        this.GIABAN = GIABAN;
    }

    public int getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(int THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }
    
    
    
}
