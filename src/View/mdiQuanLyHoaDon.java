/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuanLyHoaDon_Controller;
import Controller.QuanLyNhanVien_Controller;
import Controller.QuanLyRuou_Controller;
import static DangNhap.Login.dbURL;
import Model.tblQuanLyHoaDon;
import Model.tblQuanLyNhanVien;
import Model.tblQuanLyRuou;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Admin
 */
public class mdiQuanLyHoaDon extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tblQuanLyHoaDon> arr = new ArrayList<>();
    List<tblQuanLyRuou> arrR = new ArrayList<>();
    List<tblQuanLyNhanVien> arrNV = new ArrayList<>();
    public String sMaHoaDon, sMaNhanVien, sNgayLap, sTenKhach, sDienThoai, sEmail, sDiaChi, sMaRuou, sTim, macu;
    public int  sSoLuong,sGiaBan, sThanhTien;
    boolean sTinhTrang;
    private boolean ktThem;
    SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
    Date date;

    public void DesignTable() {
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(4).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(5).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(6).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(7).setPreferredWidth(200);
        dgDanhSach.getColumnModel().getColumn(8).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(9).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(10).setPreferredWidth(100);
    }

    public void xoatrang() {
        txtmahoadon.setText("");
        txttenkhach.setText("");
        txtdienthoai.setText("");
        txtemail.setText("");
        txtdiachi.setText("");
        txtsoluong.setText("");
        txtgiaban.setText("");
        txtthanhtien.setText("");
    }

    public void KhoaMo(boolean b) {
        cmdthem.setEnabled(b);
        cmdsua.setEnabled(b);
        cmdxoa.setEnabled(b);
        cmdketthuc.setEnabled(b);

        cmdghi.setEnabled(!b);
        cmdko.setEnabled(!b);

        txtmahoadon.setEditable(!b);
        cbomanv.setEnabled(!b);
        dtngaylap.setEnabled(!b);
        txttenkhach.setEditable(!b);
        txtdienthoai.setEditable(!b);
        txtemail.setEditable(!b);
        txtdiachi.setEditable(!b);
        cbomaruou.setEnabled(!b);     
        txtsoluong.setEditable(!b);
//        txtgiaban.setEditable(!b);
//        txtthanhtien.setEditable(!b);

        dgDanhSach.setEnabled(b);

    }
    public void KhoaMo1(boolean b)
    {
        txtgiaban.setEditable(!b);
        txtthanhtien.setEditable(!b);
    }

    public void LayNguon() {
        arr = QuanLyHoaDon_Controller.LayNguon(sTim);
        tblDanhSach.setRowCount(0);
        arr.forEach(p -> {
            tblDanhSach.addRow(new Object[]{
                p.getMAHOADON(), p.getMANHANVIEN(),p.getNGAYLAP(), p.getTENKHACH(), p.getDIENTHOAI(), p.getEMAIL(),
                p.getDIACHI(), p.getTHANHTIEN(), p.getMARUOU(), p.getGIABAN(), p.getSOLUONG()
            });
        });
    }

    public void LayNguonCBO() {
        
        arrR = QuanLyRuou_Controller.LayNguon(sTim);
        for (int i = 0; i < arrR.size(); i++) {
            cbomaruou.addItem(arrR.get(i).getMARUOU());
        }
        arrNV = QuanLyNhanVien_Controller.LayNguon(sTim);
        for (int i = 0; i < arrNV.size(); i++) {
            cbomanv.addItem(arrNV.get(i).getMANHANVIEN());
        }
    }


    public int vtNV(String MaNV) {
        for (int i = 0; i < arrNV.size(); i++) {
            if (arrNV.get(i).getMANHANVIEN().equals(MaNV) == true) {
                return i;
            }
        }
        return 0;
    }

    public int vtR(String MaR) {
        for (int i = 0; i < arrR.size(); i++) {
            if (arrR.get(i).getMARUOU().equals(MaR) == true) {
                return i;
            }
        }
        return 0;
    }
    public mdiQuanLyHoaDon() {
        initComponents();
        DesignTable();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        KhoaMo1(true);
        sTim = "";
        LayNguonCBO();
        LayNguon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmahoadon = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txttenkhach = new javax.swing.JTextField();
        txtdienthoai = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        cbomanv = new javax.swing.JComboBox<>();
        cbomaruou = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtthanhtien = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtgiaban = new javax.swing.JTextField();
        dtngaylap = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        cmdsua = new javax.swing.JButton();
        cmdxoa = new javax.swing.JButton();
        cmdghi = new javax.swing.JButton();
        cmdko = new javax.swing.JButton();
        cmdketthuc = new javax.swing.JButton();
        cmdthem = new javax.swing.JButton();
        btninhoadon = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtTK2 = new javax.swing.JTextField();
        btnHienall2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Quản lý hóa đơn");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HÓA ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel1.setText("Mã hóa đơn");

        jLabel2.setText("Mã nhân viên");

        jLabel3.setText("Ngày lập");

        jLabel4.setText("Tên khách");

        jLabel5.setText("Điện thoại");

        jLabel6.setText("Email");

        jLabel7.setText("Địa chỉ");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel9.setText("Mã sản phẩm");

        jLabel11.setText("Số lượng");

        txtsoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongActionPerformed(evt);
            }
        });

        jLabel8.setText("Thành tiền");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        txtthanhtien.setEditable(false);
        txtthanhtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthanhtienActionPerformed(evt);
            }
        });

        jLabel15.setText("VND");

        jLabel10.setText("Giá bán");

        txtgiaban.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtmahoadon, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttenkhach, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbomanv, 0, 220, Short.MAX_VALUE)
                    .addComponent(dtngaylap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(58, 58, 58)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdiachi)
                            .addComponent(cbomaruou, 0, 220, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtthanhtien, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtgiaban))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbomanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbomaruou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(dtngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttenkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtthanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã nhân viên", "Ngày lập", "Tên khách", "Điện thoại", "Email", "Địa chỉ", "Thành tiền", "Mã sản phẩm", "Giá bán", "Số lượng"
            }
        ));
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);
        if (dgDanhSach.getColumnModel().getColumnCount() > 0) {
            dgDanhSach.getColumnModel().getColumn(9).setResizable(false);
        }

        cmdsua.setText("Sửa");
        cmdsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsuaActionPerformed(evt);
            }
        });

        cmdxoa.setText("Xóa");
        cmdxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdxoaActionPerformed(evt);
            }
        });

        cmdghi.setText("Ghi");
        cmdghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdghiActionPerformed(evt);
            }
        });

        cmdko.setText("Không");
        cmdko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkoActionPerformed(evt);
            }
        });

        cmdketthuc.setText("Kết thúc");
        cmdketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdketthucActionPerformed(evt);
            }
        });

        cmdthem.setText("Thêm");
        cmdthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdthemActionPerformed(evt);
            }
        });

        btninhoadon.setText("In hóa đơn");
        btninhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninhoadonActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel45.setText("Từ khóa");

        jButton3.setText("TÌM KIẾM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtTK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTK2ActionPerformed(evt);
            }
        });

        btnHienall2.setText("HIỆN TẤT CẢ");
        btnHienall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienall2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTK2)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHienall2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtTK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienall2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btninhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdghi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdko, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdthem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdsua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cmdxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdthem)
                            .addComponent(cmdsua)
                            .addComponent(cmdxoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdghi)
                            .addComponent(cmdko)
                            .addComponent(cmdketthuc))
                        .addGap(18, 18, 18)
                        .addComponent(btninhoadon)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void cmdthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdthemActionPerformed
        xoatrang();
        KhoaMo(false);
        KhoaMo1(true);
        ktThem = true;
        txtmahoadon.requestFocus();
    }//GEN-LAST:event_cmdthemActionPerformed

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoluongActionPerformed

    private void txtthanhtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthanhtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthanhtienActionPerformed

    private void cmdsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsuaActionPerformed
         if (txtmahoadon.getText().length() <= 0) {
            return;
        }
        macu = txtmahoadon.getText();
        KhoaMo(false);
        KhoaMo1(true);
        ktThem = false;
        txtmahoadon.requestFocus();
    }//GEN-LAST:event_cmdsuaActionPerformed

    private void cmdxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdxoaActionPerformed
        if (txtmahoadon.getText().length() <= 0) {
            return;
        }
        macu = txtmahoadon.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa mã hóa đơn [" + macu + "] không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            QuanLyHoaDon_Controller.XoaBo(macu);
        }
        
        xoatrang();
        sTim = "";
        LayNguon();

    }//GEN-LAST:event_cmdxoaActionPerformed

    private void cmdghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdghiActionPerformed
         if (txtmahoadon.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa có mã hóa đơn", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtmahoadon.requestFocus();
            return;
        }
        if (txttenkhach.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txttenkhach.requestFocus();
            return;
        }
        if (txtdienthoai.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtdienthoai.requestFocus();
            return;
        }
        if (txtemail.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtemail.requestFocus();
            return;
        }
        if (txtdiachi.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtdiachi.requestFocus();
            return;
        }
        if (txtsoluong.getText().length() <= 0 ) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtsoluong.requestFocus();
            return;
        }
        //ktra trung
        if (QuanLyHoaDon_Controller.KiemTraTrungMa(txtmahoadon.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Bạn trùng mã hóa đơn!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmahoadon.requestFocus();
            return;
        }
        //ghi
        if(arrR.get(cbomaruou.getSelectedIndex()).getTINHTRANG().equals("Còn hàng"))
        {
        sMaHoaDon = txtmahoadon.getText();
        sMaNhanVien = arrNV.get(cbomanv.getSelectedIndex()).getMANHANVIEN();
        sNgayLap = sDF.format(dtngaylap.getDate());
        sTenKhach = txttenkhach.getText();
        sDienThoai = txtdienthoai.getText();
        sEmail = txtemail.getText();
        sDiaChi = txtdiachi.getText();        
        sMaRuou = arrR.get(cbomaruou.getSelectedIndex()).getMARUOU();
        sGiaBan = arrR.get(cbomaruou.getSelectedIndex()).getGIABAN(); //lay tu ma ruou
        txtgiaban.setText(String.valueOf(arrR.get(cbomaruou.getSelectedIndex()).getGIABAN())); //hien thi gia loai ruou khi chon ma
        sSoLuong = Integer.valueOf(txtsoluong.getText());
        int num1 = Integer.parseInt(String.valueOf(arrR.get(cbomaruou.getSelectedIndex()).getGIABAN()));
        int num2 = Integer.parseInt(txtsoluong.getText());
        sThanhTien = num1*num2;
        txtthanhtien.setText(String.valueOf(sThanhTien));       
        tblQuanLyHoaDon tk = new tblQuanLyHoaDon(sMaHoaDon, sMaNhanVien, sNgayLap, sTenKhach, sDienThoai, sEmail, sDiaChi, sMaRuou, sSoLuong, sGiaBan, sThanhTien);
        if (ktThem == true) {
            QuanLyHoaDon_Controller.ThemMoi(tk);
        } else {
            QuanLyHoaDon_Controller.CapNhat(tk, macu);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm này hiện đã hết hàng!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //lay nguon du lieu
        sTim = "";
        LayNguon();
        KhoaMo(true);
        KhoaMo1(true);
    }//GEN-LAST:event_cmdghiActionPerformed

    private void cmdkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkoActionPerformed
        xoatrang();
        KhoaMo(true);
        KhoaMo1(true);
    }//GEN-LAST:event_cmdkoActionPerformed

    private void cmdketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdketthucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cmdketthucActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    

    }//GEN-LAST:event_jLabel8MouseClicked

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        sMaHoaDon = model.getValueAt(index, 0).toString();
        sMaNhanVien = model.getValueAt(index, 1).toString();
        sNgayLap = model.getValueAt(index, 2).toString();
        sTenKhach = model.getValueAt(index, 3).toString();
        sDienThoai = model.getValueAt(index, 4).toString();
        sEmail = model.getValueAt(index, 5).toString();
        sDiaChi = model.getValueAt(index, 6).toString();
        sThanhTien = Integer.valueOf(model.getValueAt(index, 7).toString());
        sMaRuou = model.getValueAt(index, 8).toString();
        sGiaBan = Integer.valueOf(model.getValueAt(index, 9).toString());
        sSoLuong = Integer.valueOf(model.getValueAt(index, 10).toString());

        
        

        txtmahoadon.setText((sMaHoaDon));
        cbomanv.setSelectedIndex(vtNV(sMaNhanVien));
        try {
            date=sDF.parse(sNgayLap);
            dtngaylap.setDate(date);
        } catch (ParseException ex){
            java.util.logging.Logger.getLogger(mdiQuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        txttenkhach.setText(sTenKhach);
        txtdienthoai.setText(sDienThoai);
        txtemail.setText(sEmail);
        txtdiachi.setText(sDiaChi);
        cbomaruou.setSelectedIndex(vtR(sMaRuou));
        txtsoluong.setText(String.valueOf(sSoLuong));
        txtgiaban.setText(String.valueOf(sGiaBan));
        txtthanhtien.setText(String.valueOf(sThanhTien));
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void btninhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninhoadonActionPerformed
        if(txtmahoadon.getText().length() <=0)
            return;
        if(dgDanhSach.getRowCount()<=0)
            return;
        
         try {
             Hashtable map = new Hashtable();
             JasperReport rpt = JasperCompileManager.compileReport("src\\Report\\RptQLHoaDon.jrxml");
             map.put("sMaHD", txtmahoadon.getText());
             Connection conn = DriverManager.getConnection(dbURL);
             JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
             JasperViewer.viewReport(p, false);
         } catch (JRException ex) {
             Logger.getLogger(mdiQuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(mdiQuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btninhoadonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sTim=txtTK2.getText();
        LayNguon();
        LayNguonCBO();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnHienall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienall2ActionPerformed
        sTim="";
        LayNguon();
        LayNguonCBO();
       
    }//GEN-LAST:event_btnHienall2ActionPerformed

    private void txtTK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTK2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienall2;
    private javax.swing.JButton btninhoadon;
    private javax.swing.JComboBox<String> cbomanv;
    private javax.swing.JComboBox<String> cbomaruou;
    private javax.swing.JButton cmdghi;
    private javax.swing.JButton cmdketthuc;
    private javax.swing.JButton cmdko;
    private javax.swing.JButton cmdsua;
    private javax.swing.JButton cmdthem;
    private javax.swing.JButton cmdxoa;
    private javax.swing.JTable dgDanhSach;
    private com.toedter.calendar.JDateChooser dtngaylap;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTK2;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtmahoadon;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttenkhach;
    private javax.swing.JTextField txtthanhtien;
    // End of variables declaration//GEN-END:variables
}
