/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TaiKhoan_Controller;
import Model.tblTaiKhoan;
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
public class mdiTaiKhoan extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tblTaiKhoan> arr = new ArrayList<>();
    public String sTenDN, sMatKhau, sHoTen, macu;
    private boolean ktThem;
    public mdiTaiKhoan() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        LayNguon();
        KhoaMo(true);
    }
    public void DesignTable()
    {
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(220);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(100);
    }
    public void xoatrang()
    {
        txttendn.setText("");
        txtmk.setText("");
        txthoten.setText("");
    }
    public void KhoaMo(boolean b)
    {
        cmdthem.setEnabled(b);
        cmdsua.setEnabled(b);
        cmdxoa.setEnabled(b);
        cmdketthuc.setEnabled(b);
        
        cmdghi.setEnabled(!b);
        cmdko.setEnabled(!b);
        
        txttendn.setEditable(!b);
        txthoten.setEditable(!b);
        txtmk.setEditable(!b);
        
        dgDanhSach.setEnabled(b);
    }
    public void LayNguon()
    {
        arr = TaiKhoan_Controller.LayNguonTK();
        tblDanhSach.setRowCount(0);
        arr.forEach(p -> {
            tblDanhSach.addRow(new Object[] {
                p.getTenDN(), p.getHoTen(), p.getMatKhau()
            });
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttendn = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtmk = new javax.swing.JPasswordField();
        cmdthem = new javax.swing.JButton();
        cmdxoa = new javax.swing.JButton();
        cmdsua = new javax.swing.JButton();
        cmdghi = new javax.swing.JButton();
        cmdko = new javax.swing.JButton();
        cmdketthuc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();

        setClosable(true);
        setTitle("Quản lý tài khoản");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Tên đăng nhập:");

        jLabel2.setText("Mật khẩu:");

        jLabel3.setText("Họ và tên:");

        cmdthem.setText("Thêm");
        cmdthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdthemActionPerformed(evt);
            }
        });

        cmdxoa.setText("Xóa");
        cmdxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdxoaActionPerformed(evt);
            }
        });

        cmdsua.setText("Sửa");
        cmdsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsuaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdghi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdketthuc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(41, 41, 41)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addComponent(txtmk)
                                .addComponent(txttendn)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttendn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdthem)
                    .addComponent(cmdxoa)
                    .addComponent(cmdsua)
                    .addComponent(cmdghi)
                    .addComponent(cmdko)
                    .addComponent(cmdketthuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên đăng nhập", "Họ và tên", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        sTenDN = model.getValueAt(index, 0).toString();
        sHoTen = model.getValueAt(index, 1).toString();
        sMatKhau = model.getValueAt(index, 2).toString();
        
        txttendn.setText((sTenDN));
        txtmk.setText(sMatKhau);
        txthoten.setText(sHoTen);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdthemActionPerformed
        xoatrang();
        KhoaMo(false);
        ktThem=true;
        txttendn.requestFocus();
    }//GEN-LAST:event_cmdthemActionPerformed

    private void cmdsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsuaActionPerformed
        if(txttendn.getText().length() <= 0)
            return;
        macu = txttendn.getText();
        KhoaMo(false);
        ktThem=false;
        txttendn.requestFocus();
    }//GEN-LAST:event_cmdsuaActionPerformed

    private void cmdxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdxoaActionPerformed
        if(txttendn.getText().length() <= 0)
            return;
        macu=txttendn.getText();
       int kq=JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa tài khoản ["+macu+"] không?","Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if(kq==JOptionPane.YES_OPTION)
           TaiKhoan_Controller.XoaBo(macu);
           xoatrang();
           LayNguon();
       
    }//GEN-LAST:event_cmdxoaActionPerformed

    private void cmdghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdghiActionPerformed
        //ktra rong
        if(txttendn.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa có tên đăng nhập","Thông báo",JOptionPane.WARNING_MESSAGE);
            txttendn.requestFocus();
            return;
        }
         if(txthoten.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa đặt họ tên!","Thông báo",JOptionPane.WARNING_MESSAGE);
            txthoten.requestFocus();
            return;
        }
          if(txtmk.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa đặt mật khẩu!","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtmk.requestFocus();
            return;
        }
        //ktra trung
        if(TaiKhoan_Controller.KiemTraTrungMa(txttendn.getText(), ktThem, macu)==true)
        {
            JOptionPane.showMessageDialog(this, "Bạn trùng tên tài khoản","Thông báo",JOptionPane.ERROR_MESSAGE);
                txttendn.requestFocus();
                return;
        }
         //ghi       
        sTenDN = txttendn.getText();
        sMatKhau = txtmk.getText();
        sHoTen = txthoten.getText();
        tblTaiKhoan tk = new tblTaiKhoan(sTenDN, sMatKhau, sHoTen);
        if(ktThem == true)
        {
            TaiKhoan_Controller.ThemMoi(tk);
        }
        else 
        {
            TaiKhoan_Controller.CapNhat(tk, macu);
        }
        
        //lay nguon du lieu
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdghiActionPerformed

    private void cmdkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkoActionPerformed
        xoatrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdkoActionPerformed

    private void cmdketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdketthucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát không?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_cmdketthucActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdghi;
    private javax.swing.JButton cmdketthuc;
    private javax.swing.JButton cmdko;
    private javax.swing.JButton cmdsua;
    private javax.swing.JButton cmdthem;
    private javax.swing.JButton cmdxoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txthoten;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttendn;
    // End of variables declaration//GEN-END:variables
}
