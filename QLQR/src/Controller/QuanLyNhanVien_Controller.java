/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DangNhap.Login;
import Model.tblQuanLyNhanVien;
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

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien_Controller {
    public static String sql;
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;

    public static List<tblQuanLyNhanVien> LayNguon(String sTim) {
        List<tblQuanLyNhanVien> arr = new ArrayList<>();
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            
            sql = "SELECT * from QUANLYNV";
            if (sTim.equals("")==false)
                sql = sql + " where TENNHANVIEN like N'%" + sTim + "%' OR MANHANVIEN like N'%" + sTim + "%'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                tblQuanLyNhanVien temp = new tblQuanLyNhanVien();
                temp.setMANHANVIEN(rs.getString("MANHANVIEN"));
                temp.setTENNHANVIEN(rs.getString("TENNHANVIEN"));
                temp.setDIACHI(rs.getString("DIACHI"));
                temp.setDIENTHOAI(rs.getString("DIENTHOAI"));
                temp.setEMAIL(rs.getString("EMAIL"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void ThemMoi(tblQuanLyNhanVien tk) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Insert Into QUANLYNV(MANHANVIEN, TENNHANVIEN, DIACHI, DIENTHOAI, EMAIL) values(?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMANHANVIEN());
            pstate.setString(2, tk.getTENNHANVIEN());
            pstate.setString(3, tk.getDIACHI());
            pstate.setString(4, tk.getDIENTHOAI());
            pstate.setString(5, tk.getEMAIL());
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void CapNhat(tblQuanLyNhanVien tk, String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Update QUANLYNV Set MANHANVIEN=?, TENNHANVIEN =?, DIACHI=?, DIENTHOAI=?, EMAIL=? where MANHANVIEN=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMANHANVIEN());
            pstate.setString(2, tk.getTENNHANVIEN());
            pstate.setString(3, tk.getDIACHI());
            pstate.setString(4, tk.getDIENTHOAI());
            pstate.setString(5, tk.getEMAIL());
            pstate.setString(6, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void XoaBo(String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Delete From QUANLYNV Where MANHANVIEN=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql = "Select MANHANVIEN From QUANLYNV Where MANHANVIEN = '" + manhap + "'";
            } else {
                sql = "Select MANHANVIEN From QUANLYNV Where MANHANVIEN = '" + manhap + "' and MANHANVIEN<>'" + macu + "'";
            }
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                kq = true;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null)
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
}
