/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DangNhap.Login;
import Model.tblQuanLyHoaDon;
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
public class QuanLyHoaDon_Controller {
    public static String sql;
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;

    public static List<tblQuanLyHoaDon> LayNguon(String sTim) {
        List<tblQuanLyHoaDon> arr = new ArrayList<>();
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            
            sql = "SELECT * from QUANLYHD";
            if (sTim.equals("")==false)
                sql = sql + " where MAHOADON like N'%" + sTim +"%'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                tblQuanLyHoaDon temp = new tblQuanLyHoaDon();
                temp.setMAHOADON(rs.getString("MAHOADON"));
                temp.setMANHANVIEN(rs.getString("MANHANVIEN"));
                temp.setNGAYLAP(rs.getString("NGAYLAP"));
                temp.setTENKHACH(rs.getString("TENKHACH"));
                temp.setDIENTHOAI(rs.getString("DIENTHOAI"));
                temp.setEMAIL(rs.getString("EMAIL"));
                temp.setDIACHI(rs.getString("DIACHI"));
                temp.setMARUOU(rs.getString("MARUOU"));
                temp.setGIABAN(rs.getInt("GIABAN"));
                temp.setSOLUONG(rs.getInt("SOLUONG"));
                temp.setTHANHTIEN(rs.getInt("THANHTIEN"));        
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void ThemMoi(tblQuanLyHoaDon tk) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Insert Into QUANLYHD(MAHOADON, MANHANVIEN, NGAYLAP, TENKHACH, DIENTHOAI, EMAIL, DIACHI, THANHTIEN,MARUOU, SOLUONG, GIABAN) values(?,?,?,?,?,?,?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMAHOADON());
            pstate.setString(2, tk.getMANHANVIEN());
            pstate.setString(3, tk.getNGAYLAP());
            pstate.setString(4, tk.getTENKHACH());
            pstate.setString(5, tk.getDIENTHOAI());
            pstate.setString(6, tk.getEMAIL());
            pstate.setString(7, tk.getDIACHI());
            pstate.setInt(8, tk.getTHANHTIEN());
            pstate.setString(9, tk.getMARUOU());
            pstate.setInt(10, tk.getSOLUONG());
            pstate.setInt(11, tk.getGIABAN());
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void CapNhat(tblQuanLyHoaDon tk, String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Update QUANLYHD Set MAHOADON=?, MANHANVIEN =?, NGAYLAP=?, TENKHACH=?, DIENTHOAI=?, EMAIL=?, DIACHI=?, THANHTIEN=? ,MARUOU =?, SOLUONG=?, GIABAN=? where MAHOADON=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getMAHOADON());
            pstate.setString(2, tk.getMANHANVIEN());
            pstate.setString(3, tk.getNGAYLAP());
            pstate.setString(4, tk.getTENKHACH());
            pstate.setString(5, tk.getDIENTHOAI());
            pstate.setString(6, tk.getEMAIL());
            pstate.setString(7, tk.getDIACHI());
            pstate.setInt(8, tk.getTHANHTIEN());
            pstate.setString(9, tk.getMARUOU());
            pstate.setInt(10, tk.getSOLUONG());
            pstate.setInt(11, tk.getGIABAN());
            pstate.setString(12, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void XoaBo(String macu) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(Login.dbURL);
            sql = "Delete From QUANLYHD Where MAHOADON=?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, macu);
            pstate.execute();
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null)
                try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                     try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql = "Select MAHOADON From QUANLYHD Where MAHOADON = '" + manhap + "'";
            } else {
                sql = "Select MAHOADON From QUANLYHD Where MAHOADON = '" + manhap + "' and MAHOADON<>'" + macu + "'";
            }
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                kq = true;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null)
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
    
}
