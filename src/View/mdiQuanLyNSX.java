/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuanLyNSX_Controller;
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
public class mdiQuanLyNSX extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tblQuanLyNSX> arr = new ArrayList<>();
    public String sMaNSX, sTenNSX, sMota, sTim, macu;
    private boolean ktThem;

    public void DesignTable()
    {
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(171);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(171);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(171);
    }
    public void xoatrang()
    {
        txtmansx.setText("");
        txttennsx.setText("");
        txtmota.setText("");
    }
    public void KhoaMo(boolean b)
    {
        cmdthem.setEnabled(b);
        cmdsua.setEnabled(b);
        cmdxoa.setEnabled(b);
        cmdketthuc.setEnabled(b);
        
        cmdghi.setEnabled(!b);
        cmdko.setEnabled(!b);
        
        txtmansx.setEditable(!b);
        txttennsx.setEditable(!b);
        txtmota.setEditable(!b);
        
        dgDanhSach.setEnabled(b);
        
    }
    public void LayNguon()
    {
        arr = QuanLyNSX_Controller.LayNguon(sTim);
        tblDanhSach.setRowCount(0);
        arr.forEach(p -> {
            tblDanhSach.addRow(new Object[] {
                p.getMANSX(), p.getTENNSX(), p.getMOTA()
            });
        });
    }
    public mdiQuanLyNSX() {
        initComponents();
        tblDanhSach=(DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        sTim="";
        LayNguon();
        DesignTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cmdthem = new javax.swing.JButton();
        cmdsua = new javax.swing.JButton();
        cmdxoa = new javax.swing.JButton();
        cmdghi = new javax.swing.JButton();
        cmdko = new javax.swing.JButton();
        cmdketthuc = new javax.swing.JButton();
        txtmansx = new javax.swing.JTextField();
        txttennsx = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtTK = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtHienall = new javax.swing.JButton();
        tbnTK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        txtmota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Quản lý nhà sản xuất");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NHÀ SẢN XUẤT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel41.setText("Mã NSX");

        jLabel42.setText("Tên NSX");

        cmdthem.setText("Thêm");
        cmdthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdthemcmdthemActionPerformed(evt);
            }
        });

        cmdsua.setText("Sửa");
        cmdsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsuacmdsuaActionPerformed(evt);
            }
        });

        cmdxoa.setText("Xóa");
        cmdxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdxoacmdxoaActionPerformed(evt);
            }
        });

        cmdghi.setText("Ghi");
        cmdghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdghicmdghiActionPerformed(evt);
            }
        });

        cmdko.setText("Không");
        cmdko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkocmdkoActionPerformed(evt);
            }
        });

        cmdketthuc.setText("Kết thúc");
        cmdketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdketthuccmdketthucActionPerformed(evt);
            }
        });

        txttennsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttennsxjTextField2ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        txtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKActionPerformed(evt);
            }
        });

        jLabel43.setText("Từ khóa");

        txtHienall.setText("HIỆN TẤT CẢ");
        txtHienall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHienallActionPerformed(evt);
            }
        });

        tbnTK.setText("TÌM KIẾM");
        tbnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tbnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHienall)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHienall)
                    .addComponent(tbnTK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã NSX", "Tên NSX", "Mô tả"
            }
        ));
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        txtmota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmotaMouseClicked(evt);
            }
        });

        jLabel1.setText("Mô tả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmdghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdthem, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmdsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdko, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdketthuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel41))
                                        .addGap(25, 25, 25)
                                        .addComponent(txtmansx, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttennsx, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(txtmota))))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtmansx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txttennsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdxoa)
                    .addComponent(cmdsua)
                    .addComponent(cmdthem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdghi)
                    .addComponent(cmdko)
                    .addComponent(cmdketthuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdthemcmdthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdthemcmdthemActionPerformed
        xoatrang();
        KhoaMo(false);
        ktThem=true;
        txtmansx.requestFocus();
    }//GEN-LAST:event_cmdthemcmdthemActionPerformed

    private void cmdsuacmdsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsuacmdsuaActionPerformed
        if(txtmansx.getText().length() <= 0)
        return;
        macu = txtmansx.getText();
        KhoaMo(false);
        ktThem=false;
        txtmansx.requestFocus();
    }//GEN-LAST:event_cmdsuacmdsuaActionPerformed

    private void cmdxoacmdxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdxoacmdxoaActionPerformed
        if(txtmansx.getText().length() <= 0)
        return;
        macu=txtmansx.getText();
        int kq=JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa mã nhà sản xuất ["+macu+"] không?","Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(kq==JOptionPane.YES_OPTION)
        QuanLyNSX_Controller.XoaBo(macu);
        xoatrang();
        sTim="";
        LayNguon();
    }//GEN-LAST:event_cmdxoacmdxoaActionPerformed

    private void cmdghicmdghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdghicmdghiActionPerformed
        //ktra rong
        if(txtmansx.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa có mã nhà sản xuất","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtmansx.requestFocus();
            return;
        }
        if(txttennsx.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa đặt tên nhà sản xuất!","Thông báo",JOptionPane.WARNING_MESSAGE);
            txttennsx.requestFocus();
            return;
        }

        //ktra trung
        if(QuanLyNSX_Controller.KiemTraTrungMa(txtmansx.getText(), ktThem, macu)==true)
        {
            JOptionPane.showMessageDialog(this, "Bạn trùng mã nhà sản xuất","Thông báo",JOptionPane.ERROR_MESSAGE);
            txtmansx.requestFocus();
            return;
        }
        //ghi
        sMaNSX = txtmansx.getText();
        sTenNSX = txttennsx.getText();
        sMota = txtmota.getText();
        tblQuanLyNSX tk = new tblQuanLyNSX(sMaNSX, sTenNSX, sMota);
        if(ktThem == true)
        {
            QuanLyNSX_Controller.ThemMoi(tk);
        }
        else
        {
            QuanLyNSX_Controller.CapNhat(tk, macu);
        }

        //lay nguon du lieu
        sTim="";
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdghicmdghiActionPerformed

    private void cmdkocmdkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkocmdkoActionPerformed
        xoatrang();
        KhoaMo(true);
        
    }//GEN-LAST:event_cmdkocmdkoActionPerformed

    private void cmdketthuccmdketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdketthuccmdketthucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát không?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_cmdketthuccmdketthucActionPerformed

    private void txttennsxjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttennsxjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttennsxjTextField2ActionPerformed

    private void txtmotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmotaMouseClicked
        
    }//GEN-LAST:event_txtmotaMouseClicked

    private void txtHienallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHienallActionPerformed
        sTim="";
        LayNguon();
    }//GEN-LAST:event_txtHienallActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        sMaNSX= model.getValueAt(index, 0).toString();
        sTenNSX = model.getValueAt(index, 1).toString();
        sMota = model.getValueAt(index, 2).toString();

        txtmansx.setText((sMaNSX));
        txttennsx.setText(sTenNSX);
        txtmota.setText(sMota);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void tbnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTKActionPerformed
        sTim=txtTK.getText();
        LayNguon();
    }//GEN-LAST:event_tbnTKActionPerformed

    private void txtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdghi;
    private javax.swing.JButton cmdketthuc;
    private javax.swing.JButton cmdko;
    private javax.swing.JButton cmdsua;
    private javax.swing.JButton cmdthem;
    private javax.swing.JButton cmdxoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbnTK;
    private javax.swing.JButton txtHienall;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtmansx;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txttennsx;
    // End of variables declaration//GEN-END:variables
}
