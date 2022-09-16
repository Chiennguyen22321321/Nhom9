/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuanLyLoaiRuou_Controller;
import Controller.QuanLyNSX_Controller;
import Controller.QuanLyRuou_Controller;
import Model.tblQuanLyLoaiRuou;
import Model.tblQuanLyRuou;
import Model.tblQuanLyNSX;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class mdiQuanLyRuou extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhSach;
    List<tblQuanLyRuou> arrR = new ArrayList<>();
    List<tblQuanLyLoaiRuou> arrLR = new ArrayList<>();
    List<tblQuanLyNSX> arrNSX = new ArrayList<>();
    public String sMaRuou, sTenRuou, sMaLoaiRuou, sMaNSX, sTinhTrang, sTim, macu; 
    public int sSoLuong, sGiaBan;
    boolean TinhTrang;
    private boolean ktThem;

    public void DesignTable() {
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(4).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(5).setPreferredWidth(120);
        dgDanhSach.getColumnModel().getColumn(6).setPreferredWidth(120);
    }

    public void xoatrang() {
        txtmaruou.setText("");
        txttenruou.setText("");
        txtgiaban.setText("");
        txtsoluong.setText("");
    }

    public void KhoaMo(boolean b) {
        cmdthem.setEnabled(b);
        cmdsua.setEnabled(b);
        cmdxoa.setEnabled(b);
        cmdketthuc.setEnabled(b);

        cmdghi.setEnabled(!b);
        cmdko.setEnabled(!b);

        txtmaruou.setEditable(!b);
        txttenruou.setEditable(!b);
        txtgiaban.setEditable(!b);
        cbomaloaiR.setEnabled(!b);
        cbomansx.setEnabled(!b);
        cbotinhtrang.setEnabled(!b);
//        if(cbotinhtrang.equals("Hết hàng"))
//        {
//            txtsoluong.setEditable(!b);
//            txtmota.setEditable(!b);
//        }
        txtsoluong.setEditable(!b);

        dgDanhSach.setEnabled(b);

    }

    public void LayNguon() {
        arrR = QuanLyRuou_Controller.LayNguon(sTim);
        tblDanhSach.setRowCount(0);
        arrR.forEach(p -> {
            tblDanhSach.addRow(new Object[]{
                p.getMARUOU(), p.getTENRUOU(),p.getGIABAN(), p.getMALOAIRUOU(), p.getMANSX(), p.getTINHTRANG(), p.getSOLUONG()
            });
        });
    }

    public void LayNguonCBO() {
        
        arrNSX = QuanLyNSX_Controller.LayNguon(sTim);
        for (int i = 0; i < arrNSX.size(); i++) {
            cbomansx.addItem(arrNSX.get(i).getMANSX());
        }
        arrLR = QuanLyLoaiRuou_Controller.LayNguon(sTim);
        for (int i = 0; i < arrLR.size(); i++) {
            cbomaloaiR.addItem(arrLR.get(i).getMALOAIRUOU());
        }
    }


    public int vtLR(String MaLoaiRuou) {
        for (int i = 0; i < arrLR.size(); i++) {
            if (arrLR.get(i).getMALOAIRUOU().equals(MaLoaiRuou) == true) {
                return i;
            }
        }
        return 0;
    }

    public int vtNSX(String MaNSX) {
        for (int i = 0; i < arrNSX.size(); i++) {
            if (arrNSX.get(i).getMANSX().equals(MaNSX) == true) {
                return i;
            }
        }
        return 0;
    }

    public mdiQuanLyRuou() {
        initComponents();
        DesignTable();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        sTim = "";
        LayNguonCBO();
        LayNguon();
    }

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
        cmdthem = new javax.swing.JButton();
        cmdsua = new javax.swing.JButton();
        cmdxoa = new javax.swing.JButton();
        cmdghi = new javax.swing.JButton();
        cmdko = new javax.swing.JButton();
        cmdketthuc = new javax.swing.JButton();
        txtmaruou = new javax.swing.JTextField();
        txttenruou = new javax.swing.JTextField();
        txtgiaban = new javax.swing.JTextField();
        cbomaloaiR = new javax.swing.JComboBox<>();
        cbomansx = new javax.swing.JComboBox<>();
        cbotinhtrang = new javax.swing.JComboBox<>();
        txtsoluong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnHienall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();

        setClosable(true);
        setTitle("Quản lý sản phẩm");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ SẢN PHẨM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel1.setText("Mã sản phẩm");

        jLabel2.setText("Tên sản phẩm");

        jLabel3.setText("Giá bán");

        jLabel4.setText("Mã loại sản phẩm");

        jLabel5.setText("Mã NSX");

        jLabel6.setText("Tình trạng");

        jLabel7.setText("Số lượng");

        cmdthem.setText("Thêm");
        cmdthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdthemActionPerformed(evt);
            }
        });

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

        txttenruou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenruouActionPerformed(evt);
            }
        });

        cbomaloaiR.setToolTipText("");

        cbotinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn hàng", "Hết hàng", " " }));
        cbotinhtrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotinhtrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbomaloaiR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txttenruou, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(txtmaruou, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbomansx, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(cmdthem)
                        .addGap(18, 18, 18)
                        .addComponent(cmdsua)
                        .addGap(18, 18, 18)
                        .addComponent(cmdxoa)
                        .addGap(18, 18, 18)
                        .addComponent(cmdghi)
                        .addGap(18, 18, 18)
                        .addComponent(cmdko)
                        .addGap(18, 18, 18)
                        .addComponent(cmdketthuc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmaruou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttenruou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbomaloaiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbomansx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbotinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdthem)
                    .addComponent(cmdsua)
                    .addComponent(cmdxoa)
                    .addComponent(cmdghi)
                    .addComponent(cmdko)
                    .addComponent(cmdketthuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel9.setText("Từ khóa");

        jButton1.setText("TÌM KIẾM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHienall.setText("HIỆN TẤT CẢ");
        btnHienall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHienall)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnHienall)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá bán", "Mã loại sản phẩm", "Mã NSX", "Tình trạng", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdthemActionPerformed
        xoatrang();
        KhoaMo(false);
        ktThem = true;
        txtmaruou.requestFocus();
    }//GEN-LAST:event_cmdthemActionPerformed

    private void cmdsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsuaActionPerformed
        if (txtmaruou.getText().length() <= 0) {
            return;
        }
        macu = txtmaruou.getText();
        KhoaMo(false);
        ktThem = false;
        txtmaruou.requestFocus();
    }//GEN-LAST:event_cmdsuaActionPerformed

    private void cmdxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdxoaActionPerformed
        if (txtmaruou.getText().length() <= 0) {
            return;
        }
        macu = txtmaruou.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa tài khoản [" + macu + "] không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            QuanLyRuou_Controller.XoaBo(macu);
        }
        
        xoatrang();
        sTim = "";
        LayNguon();

    }//GEN-LAST:event_cmdxoaActionPerformed

    private void cmdghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdghiActionPerformed
        //ktra rong
        if (txtmaruou.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa có mã sản phẩm", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtmaruou.requestFocus();
            return;
        }
        if (txttenruou.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đặt tên sản phẩm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txttenruou.requestFocus();
            return;
        }
        if (txtgiaban.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá bán!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtgiaban.requestFocus();
            return;
        }
        if (txtsoluong.getText().length() <= 0 ) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtsoluong.requestFocus();
            return;
        }
        //ktra trung
        if (QuanLyRuou_Controller.KiemTraTrungMa(txtmaruou.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Bạn trùng mã sản phẩm", "Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmaruou.requestFocus();
            return;
        }
        //ghi
        sMaRuou = txtmaruou.getText();
        sTenRuou = txttenruou.getText();
        sGiaBan = Integer.valueOf(txtgiaban.getText());
        sMaLoaiRuou = arrLR.get(cbomaloaiR.getSelectedIndex()).getMALOAIRUOU();
        sMaNSX = arrNSX.get(cbomansx.getSelectedIndex()).getMANSX();
        TinhTrang = cbotinhtrang.getSelectedIndex() == 0 ? true : false;
        if(TinhTrang == true)
        {
        sSoLuong = Integer.valueOf(txtsoluong.getText());       
        }
        else
        { 
        sSoLuong = 0;
        txtsoluong.setText(String.valueOf(sSoLuong));
        }
        tblQuanLyRuou tk = new tblQuanLyRuou(sMaRuou, sTenRuou, sGiaBan, sMaLoaiRuou, sMaNSX, TinhTrang, sSoLuong);
        if (ktThem == true) {
            QuanLyRuou_Controller.ThemMoi(tk);
        } else {
            QuanLyRuou_Controller.CapNhat(tk, macu);
        }

        //lay nguon du lieu
        sTim = "";
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdghiActionPerformed

    private void cmdkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkoActionPerformed
        xoatrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdkoActionPerformed

    private void cmdketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdketthucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cmdketthucActionPerformed

    private void txttenruouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenruouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenruouActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        sMaRuou = model.getValueAt(index, 0).toString();
        sTenRuou = model.getValueAt(index, 1).toString();
        sGiaBan = Integer.valueOf(model.getValueAt(index, 2).toString());
        sMaLoaiRuou = model.getValueAt(index, 3).toString();
        sMaNSX = model.getValueAt(index, 4).toString();
        sTinhTrang = model.getValueAt(index, 5).toString();
        sSoLuong = Integer.valueOf(model.getValueAt(index, 6).toString());

        txtmaruou.setText((sMaRuou));
        txttenruou.setText(sTenRuou);
        txtgiaban.setText(String.valueOf(sGiaBan));
        cbomaloaiR.setSelectedIndex(vtLR(sMaLoaiRuou));
        cbomansx.setSelectedIndex(vtNSX(sMaNSX));
        cbotinhtrang.setSelectedIndex(sTinhTrang.equalsIgnoreCase("Còn hàng") ? 0 : 1);
        txtsoluong.setText(String.valueOf(sSoLuong));
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cbotinhtrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotinhtrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotinhtrangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         sTim=txtTK.getText();
         LayNguon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHienallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienallActionPerformed
        sTim="";
        LayNguon();
    }//GEN-LAST:event_btnHienallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienall;
    private javax.swing.JComboBox<String> cbomaloaiR;
    private javax.swing.JComboBox<String> cbomansx;
    private javax.swing.JComboBox<String> cbotinhtrang;
    private javax.swing.JButton cmdghi;
    private javax.swing.JButton cmdketthuc;
    private javax.swing.JButton cmdko;
    private javax.swing.JButton cmdsua;
    private javax.swing.JButton cmdthem;
    private javax.swing.JButton cmdxoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtmaruou;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttenruou;
    // End of variables declaration//GEN-END:variables
}
