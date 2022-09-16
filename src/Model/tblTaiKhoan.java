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
public class tblTaiKhoan {
    public String TenDN, MatKhau, HoTen;

    public tblTaiKhoan() {
    }

    public tblTaiKhoan(String TenDN, String MatKhau, String HoTen) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
}
