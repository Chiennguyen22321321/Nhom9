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
public class tblQuanLyRuou {
    public String MARUOU, TENRUOU, MALOAIRUOU, MANSX;
    public int SOLUONG, GIABAN;
    public boolean TINHTRANG;

    public tblQuanLyRuou() {
    }

    public tblQuanLyRuou(String MARUOU, String TENRUOU, int GIABAN, String MALOAIRUOU, String MANSX, boolean TINHTRANG, int SOLUONG) {
        this.MARUOU = MARUOU;
        this.TENRUOU = TENRUOU;
        this.GIABAN = GIABAN;
        this.MALOAIRUOU = MALOAIRUOU;
        this.MANSX = MANSX;
        this.TINHTRANG = TINHTRANG;
        this.SOLUONG = SOLUONG;
        
    }

    public String getMARUOU() {
        return MARUOU;
    }

    public void setMARUOU(String MARUOU) {
        this.MARUOU = MARUOU;
    }

    public String getTENRUOU() {
        return TENRUOU;
    }

    public void setTENRUOU(String TENRUOU) {
        this.TENRUOU = TENRUOU;
    }

    public int getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(int GIABAN) {
        this.GIABAN = GIABAN;
    }

    public String getMALOAIRUOU() {
        return MALOAIRUOU;
    }

    public void setMALOAIRUOU(String MALOAIRUOU) {
        this.MALOAIRUOU = MALOAIRUOU;
    }

    public String getMANSX() {
        return MANSX;
    }

    public void setMANSX(String MANSX) {
        this.MANSX = MANSX;
    }

    public boolean isTINHTRANG() 
    {
        return TINHTRANG;
    }
            
    public String getTINHTRANG() {
        if(TINHTRANG==true)
            return "Còn hàng";
        else return "Hết hàng";
    }

    public void setTINHTRANG(boolean TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    
}
