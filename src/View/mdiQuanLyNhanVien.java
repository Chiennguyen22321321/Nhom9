/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuanLyNhanVien_Controller;
import Model.tblQuanLyNhanVien;
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
public class mdiQuanLyNhanVien extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tblQuanLyNhanVien> arr = new ArrayList<>();
    public String sMaNV, sTenNV, sDiaChi, sDienThoai, sEmail, sTim, macu;
    private boolean ktThem;

    public void DesignTable()
    {
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(150);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(150);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(150);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(150);
        dgDanhSach.getColumnModel().getColumn(4).setPreferredWidth(150);
    }
    public void xoatrang()
    {
        txtmanv.setText("");
        txttennv.setText("");
        txtdiachi.setText("");
        txtdienthoai.setText("");
        txtemail.setText("");
    }
    public void KhoaMo(boolean b)
    {
        cmdthem.setEnabled(b);
        cmdsua.setEnabled(b);
        cmdxoa.setEnabled(b);
        cmdketthuc.setEnabled(b);
        
        cmdghi.setEnabled(!b);
        cmdko.setEnabled(!b);
        
        txtmanv.setEditable(!b);
        txttennv.setEditable(!b);
        txtdiachi.setEditable(!b);
        txtdienthoai.setEditable(!b);
        txtemail.setEditable(!b);
        
        
        dgDanhSach.setEnabled(b);
        
    }
    public void LayNguon()
    {
        arr = QuanLyNhanVien_Controller.LayNguon(sTim);
        tblDanhSach.setRowCount(0);
        arr.forEach(p -> {
            tblDanhSach.addRow(new Object[] {
                p.getMANHANVIEN(), p.getTENNHANVIEN(), p.getDIACHI(), p.getDIENTHOAI(), p.getEMAIL()
            });
        });
    }
    public mdiQuanLyNhanVien() {
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
        txtmanv = new javax.swing.JTextField();
        txttennv = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdienthoai = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtTK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnHienall = new javax.swing.JButton();

        setClosable(true);
        setTitle("Qu???n l?? nh??n vi??n");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QU???N L?? NH??N VI??N", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel41.setText("M?? nh??n vi??n");

        jLabel42.setText("T??n nh??n vi??n");

        cmdthem.setText("Th??m");
        cmdthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdthemcmdthemActionPerformed(evt);
            }
        });

        cmdsua.setText("S???a");
        cmdsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsuacmdsuaActionPerformed(evt);
            }
        });

        cmdxoa.setText("X??a");
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

        cmdko.setText("Kh??ng");
        cmdko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkocmdkoActionPerformed(evt);
            }
        });

        cmdketthuc.setText("K???t th??c");
        cmdketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdketthuccmdketthucActionPerformed(evt);
            }
        });

        txttennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttennvjTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("?????a ch???");

        jLabel2.setText("??i???n tho???i");

        jLabel3.setText("Email");

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? nh??n vi??n", "T??n nh??n vi??n", "?????a ch???", "??i???n tho???i", "Email"
            }
        ));
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??M KI???M", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        txtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKActionPerformed(evt);
            }
        });

        jLabel9.setText("T??? kh??a");

        jButton1.setText("T??M KI???M");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHienall.setText("HI???N T???T C???");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmanv, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txttennv)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(txtdienthoai))
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdthem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdko, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdsua, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(cmdxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdthem)
                            .addComponent(cmdsua)
                            .addComponent(cmdxoa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdketthuc)
                            .addComponent(cmdko)
                            .addComponent(cmdghi))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttennvjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttennvjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttennvjTextField2ActionPerformed

    private void cmdghicmdghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdghicmdghiActionPerformed
        //ktra rong
        if(txtmanv.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "B???n ch??a c?? m?? nh??n vi??n!","Th??ng b??o",JOptionPane.WARNING_MESSAGE);
            txtmanv.requestFocus();
            return;
        }
        if(txttennv.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "B???n ch??a ?????t h??? t??n nh??n vi??n!","Th??ng b??o",JOptionPane.WARNING_MESSAGE);
            txttennv.requestFocus();
            return;
        }
      
        //ktra trung
        if(QuanLyNhanVien_Controller.KiemTraTrungMa(txtmanv.getText(), ktThem, macu)==true)
        {
            JOptionPane.showMessageDialog(this, "B???n nh???p tr??ng m?? nh??n vi??n","Th??ng b??o",JOptionPane.ERROR_MESSAGE);
            txtmanv.requestFocus();
            return;
        }
        //ghi
        sMaNV = txtmanv.getText();
        sTenNV = txttennv.getText();
        sDiaChi = txtdiachi.getText();
        sDienThoai = txtdienthoai.getText();
        sEmail = txtemail.getText();
        tblQuanLyNhanVien tk = new tblQuanLyNhanVien(sMaNV, sTenNV, sDiaChi, sDienThoai, sEmail);
        if(ktThem == true)
        {
            QuanLyNhanVien_Controller.ThemMoi(tk);
        }
        else
        {
            QuanLyNhanVien_Controller.CapNhat(tk, macu);
        }

        //lay nguon du lieu
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdghicmdghiActionPerformed

    private void cmdkocmdkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkocmdkoActionPerformed
        xoatrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdkocmdkoActionPerformed

    private void cmdketthuccmdketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdketthuccmdketthucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"B???n c?? mu???n tho??t kh??ng?","Th??ng b??o",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_cmdketthuccmdketthucActionPerformed

    private void cmdxoacmdxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdxoacmdxoaActionPerformed
        if(txtmanv.getText().length() <= 0)
        return;
        macu=txtmanv.getText();
        int kq=JOptionPane.showConfirmDialog(this,"B???n c?? mu???n x??a t??i kho???n ["+macu+"] kh??ng?","Th??ng b??o",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(kq==JOptionPane.YES_OPTION)
        QuanLyNhanVien_Controller.XoaBo(macu);
        xoatrang();
        LayNguon();
    }//GEN-LAST:event_cmdxoacmdxoaActionPerformed

    private void cmdsuacmdsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsuacmdsuaActionPerformed
        if(txtmanv.getText().length() <= 0)
        return;
        macu = txtmanv.getText();
        KhoaMo(false);
        ktThem=false;
        txtmanv.requestFocus();
    }//GEN-LAST:event_cmdsuacmdsuaActionPerformed

    private void cmdthemcmdthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdthemcmdthemActionPerformed
        xoatrang();
        KhoaMo(false);
        ktThem=true;
        txtmanv.requestFocus();
    }//GEN-LAST:event_cmdthemcmdthemActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        sMaNV= model.getValueAt(index, 0).toString();
        sTenNV = model.getValueAt(index, 1).toString();
        sDiaChi = model.getValueAt(index, 2).toString();
        sDienThoai = model.getValueAt(index, 3).toString();
        sEmail = model.getValueAt(index, 4).toString();

        txtmanv.setText(sMaNV);
        txttennv.setText(sTenNV);
        txtdiachi.setText(sDiaChi);
        txtdienthoai.setText(sDienThoai);
        txtemail.setText(sEmail);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sTim=txtTK.getText();
        LayNguon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHienallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienallActionPerformed
        sTim="";
        LayNguon();
    }//GEN-LAST:event_btnHienallActionPerformed

    private void txtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienall;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txttennv;
    // End of variables declaration//GEN-END:variables
}
