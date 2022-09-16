package View;

import View.FrmLogin;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {
    public frmMain() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Destop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDangxuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuQLTK = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuKT = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCN = new javax.swing.JMenu();
        mnuQuanLyRuou = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnuQLLoaiRuou = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnuQLNSX = new javax.swing.JMenuItem();
        mnuNV = new javax.swing.JMenu();
        mnuQLNV = new javax.swing.JMenuItem();
        mnuHD = new javax.swing.JMenu();
        mnuQLHoaDon = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phầm mềm quản lý bán hàng siêu thị");

        javax.swing.GroupLayout DestopLayout = new javax.swing.GroupLayout(Destop);
        Destop.setLayout(DestopLayout);
        DestopLayout.setHorizontalGroup(
            DestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        DestopLayout.setVerticalGroup(
            DestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuDangxuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuDangxuat.setText("Đăng xuất");
        mnuDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangxuat);
        jMenu1.add(jSeparator3);

        mnuQLTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQLTK.setText("Quản lý tài khoản");
        mnuQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLTKActionPerformed(evt);
            }
        });
        jMenu1.add(mnuQLTK);
        jMenu1.add(jSeparator4);

        mnuKT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuKT.setText("Kết thúc");
        mnuKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKTActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKT);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        mnuCN.setText("Chức năng");
        mnuCN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuQuanLyRuou.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQuanLyRuou.setText("Quản lý sản phẩm");
        mnuQuanLyRuou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuanLyRuouActionPerformed(evt);
            }
        });
        mnuCN.add(mnuQuanLyRuou);
        mnuCN.add(jSeparator9);

        mnuQLLoaiRuou.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQLLoaiRuou.setText("Quản lý loại sản phẩm");
        mnuQLLoaiRuou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLLoaiRuouActionPerformed(evt);
            }
        });
        mnuCN.add(mnuQLLoaiRuou);
        mnuCN.add(jSeparator10);

        mnuQLNSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQLNSX.setText("Quản lý NSX");
        mnuQLNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNSXActionPerformed(evt);
            }
        });
        mnuCN.add(mnuQLNSX);

        jMenuBar1.add(mnuCN);

        mnuNV.setText("Nhân viên");
        mnuNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuQLNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQLNV.setText("Quản lý nhân viên");
        mnuQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNVActionPerformed(evt);
            }
        });
        mnuNV.add(mnuQLNV);

        jMenuBar1.add(mnuNV);

        mnuHD.setText("Hóa đơn");
        mnuHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuQLHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuQLHoaDon.setText("Quản lý hóa đơn");
        mnuQLHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLHoaDonActionPerformed(evt);
            }
        });
        mnuHD.add(mnuQLHoaDon);

        jMenuBar1.add(mnuHD);

        jMenu7.setText("Thông tin");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem3.setText("Nhóm 1");
        jMenu7.add(jMenuItem3);
        jMenu7.add(jSeparator5);

        jMenuItem5.setText("Nguyễn Đức Anh - 70DCTT22023");
        jMenu7.add(jMenuItem5);
        jMenu7.add(jSeparator6);

        jMenuItem6.setText("Nguyễn Việt Anh - 70DCTT22025");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);
        jMenu7.add(jSeparator7);

        jMenuItem8.setText("Nguyễn Văn Chiến - 70DCTT21213");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);
        jMenu7.add(jSeparator8);

        jMenuItem9.setText("Đỗ Việt Đức - 70DCTT21192");
        jMenu7.add(jMenuItem9);

        jMenuItem7.setText("Nguyễn Thị Nga");
        jMenu7.add(jMenuItem7);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Destop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Destop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangxuatActionPerformed
       int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất không?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION)
        {
            dispose();
            FrmLogin frm = new FrmLogin();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_mnuDangxuatActionPerformed

    private void mnuKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKTActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát không?","Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(kq == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_mnuKTActionPerformed

    private void mnuQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLTKActionPerformed
        mdiTaiKhoan frm = new mdiTaiKhoan();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLTKActionPerformed

    private void mnuQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNVActionPerformed
        mdiQuanLyNhanVien frm = new mdiQuanLyNhanVien();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLNVActionPerformed

    private void mnuQLLoaiRuouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLLoaiRuouActionPerformed
        mdiQuanLyLoaiRuou frm = new mdiQuanLyLoaiRuou();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLLoaiRuouActionPerformed

    private void mnuQLNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNSXActionPerformed
        mdiQuanLyNSX frm = new mdiQuanLyNSX();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLNSXActionPerformed

    private void mnuQuanLyRuouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuanLyRuouActionPerformed
        mdiQuanLyRuou frm = new mdiQuanLyRuou();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQuanLyRuouActionPerformed

    private void mnuQLHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLHoaDonActionPerformed
        mdiQuanLyHoaDon frm = new mdiQuanLyHoaDon();
        Destop.add(frm);
        frm.setLocation((Destop.getWidth()-frm.getWidth())/2, (Destop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLHoaDonActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Destop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu mnuCN;
    private javax.swing.JMenuItem mnuDangxuat;
    private javax.swing.JMenu mnuHD;
    private javax.swing.JMenuItem mnuKT;
    private javax.swing.JMenu mnuNV;
    private javax.swing.JMenuItem mnuQLHoaDon;
    private javax.swing.JMenuItem mnuQLLoaiRuou;
    private javax.swing.JMenuItem mnuQLNSX;
    private javax.swing.JMenuItem mnuQLNV;
    private javax.swing.JMenuItem mnuQLTK;
    private javax.swing.JMenuItem mnuQuanLyRuou;
    // End of variables declaration//GEN-END:variables
}
