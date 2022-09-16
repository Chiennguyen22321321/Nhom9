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
public class tblQuanLyNSX {
    public String MANSX, TENNSX, MOTA;

    public tblQuanLyNSX() {
    }

    public tblQuanLyNSX(String MANSX, String TENNSX, String MOTA) {
        this.MANSX = MANSX;
        this.TENNSX = TENNSX;
        this.MOTA = MOTA;
    }

    public String getMANSX() {
        return MANSX;
    }

    public void setMANSX(String MANSX) {
        this.MANSX = MANSX;
    }

    public String getTENNSX() {
        return TENNSX;
    }

    public void setTENNSX(String TENNSX) {
        this.TENNSX = TENNSX;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }
    
    
}
