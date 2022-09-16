/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhap;
import View.FrmLogin;


/**
 *
 * @author Admin
 */
public class Login {
    public static String dbURL = "jdbc:sqlserver://NGUYENCHIEN\\SQLEXPRESS:1433;databaseName=QLQR;user=sa;password=88888888";
    public static String sTenDN, sHoTen, sMatKhau;
    public static String UN, PW, FN;
    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
    
}
    

