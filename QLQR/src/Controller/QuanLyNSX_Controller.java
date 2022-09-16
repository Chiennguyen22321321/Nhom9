/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DangNhap.Login;
import Model.tblQuanLyNSX;
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

public class QuanLyNSX_Controller {
    public static String sql;
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;

    public static List<tblQuanLyNSX> LayNguon(String sTim) {
        List<tblQuanLyNSX> arr = new ArrayList<>();
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
             sql = "SELECT MANSX, TENNSX, MOTA from QUANLYNSX";
            if (sTim.equals("")==false)
                sql = sql + " where MANSX like N'%" + sTim + "%' OR TENNSX like N'%" + sTim + "%' OR MOTA like N'%" + sTim + "%'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                tblQuanLyNSX temp = new tblQuanLyNSX();
                temp.setMANSX(rs.getString("MANSX"));
                temp.setTENNSX(rs.getString("TENNSX"));
                temp.setMOTA(rs.getString("MOTA"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void ThemMoi(tblQuanLyNSX tk) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Insert Into QUANLYNSX(MANSX, TENNSX, MOTA) values(?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMANSX());
            pstate.setString(2, tk.getTENNSX());
            pstate.setString(3, tk.getMOTA());
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void CapNhat(tblQuanLyNSX tk, String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Update QUANLYNSX Set MANSX=?, TENNSX =?, MOTA=? where MANSX=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMANSX());
            pstate.setString(2, tk.getTENNSX());
            pstate.setString(3, tk.getMOTA());
            pstate.setString(4, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void XoaBo(String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Delete From QUANLYNSX Where MANSX=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql = "Select MANSX From QUANLYNSX Where MANSX = '" + manhap + "'";
            } else {
                sql = "Select MANSX From QUANLYNSX Where MANSX = '" + manhap + "' and MANSX<>'" + macu + "'";
            }
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                kq = true;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null)
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNSX_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
    
}
