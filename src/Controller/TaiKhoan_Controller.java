package Controller;

import DangNhap.Login;
import Model.tblTaiKhoan;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class TaiKhoan_Controller {

    public static String sql;
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;

    public static List<tblTaiKhoan> LayNguonTK() {
        List<tblTaiKhoan> arr = new ArrayList<>();
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "SELECT TENDN, HOTEN, MATKHAU from TAIKHOAN Order by TENDN";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                tblTaiKhoan temp = new tblTaiKhoan();
                temp.setTenDN(rs.getString("TENDN"));
                temp.setMatKhau(rs.getString("MATKHAU"));
                temp.setHoTen(rs.getString("HOTEN"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void ThemMoi(tblTaiKhoan tk) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Insert Into TAIKHOAN(TENDN, HOTEN, MATKHAU) values(?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getTenDN());
            pstate.setString(2, tk.getHoTen());
            pstate.setString(3, tk.getMatKhau());
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void CapNhat(tblTaiKhoan tk, String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Update TAIKHOAN Set TENDN=?, HOTEN =?, MATKHAU=? where TENDN=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getTenDN());
            pstate.setString(2, tk.getHoTen());
            pstate.setString(3, tk.getMatKhau());
            pstate.setString(4, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void XoaBo(String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Delete From TAIKHOAN Where TENDN=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static boolean KiemTraTrungMa(String manhap, boolean ktThem, String macu) {
        boolean kq = false;
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            if (ktThem == true) {
                sql = "Select TENDN From TAIKHOAN Where TENDN = '" + manhap + "'";
            } else {
                sql = "Select TENDN From TAIKHOAN Where TENDN = '" + manhap + "' and TENDN<>'" + macu + "'";
            }
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                kq = true;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null)
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
}
