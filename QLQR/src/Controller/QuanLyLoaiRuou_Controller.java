
package Controller;

import DangNhap.Login;
import Model.tblQuanLyLoaiRuou;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuanLyLoaiRuou_Controller {
    public static String sql;
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;

    public static List<tblQuanLyLoaiRuou> LayNguon(String sTim) {
        List<tblQuanLyLoaiRuou> arr = new ArrayList<>();
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            
            sql = "SELECT MALOAIRUOU, TENLOAIRUOU from QUANLYLOAIR";
            if (sTim.equals("")==false)
                sql = sql + " where TENLOAIRUOU like N'%" + sTim + "%' OR MALOAIRUOU like N'%" + sTim + "%'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                tblQuanLyLoaiRuou temp = new tblQuanLyLoaiRuou();
                temp.setMALOAIRUOU(rs.getString("MALOAIRUOU"));
                temp.setTENLOAIRUOU(rs.getString("TENLOAIRUOU"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void ThemMoi(tblQuanLyLoaiRuou tk) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Insert Into QUANLYLOAIR(MALOAIRUOU, TENLOAIRUOU) values(?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMALOAIRUOU());
            pstate.setString(2, tk.getTENLOAIRUOU());
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void CapNhat(tblQuanLyLoaiRuou tk, String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Update QUANLYLOAIR Set MALOAIRUOU=?, TENLOAIRUOU =? where MALOAIRUOU=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMALOAIRUOU());
            pstate.setString(2, tk.getTENLOAIRUOU());
            pstate.setString(3, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void XoaBo(String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Delete From QUANLYLOAIR Where MALOAIRUOU=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql = "Select MALOAIRUOU From QUANLYLOAIR Where MALOAIRUOU = '" + manhap + "'";
            } else {
                sql = "Select MALOAIRUOU From QUANLYLOAIR Where MALOAIRUOU = '" + manhap + "' and MALOAIRUOU<>'" + macu + "'";
            }
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                kq = true;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null)
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyLoaiRuou_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
    
}
