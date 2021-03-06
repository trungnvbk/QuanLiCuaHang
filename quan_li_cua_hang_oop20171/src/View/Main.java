/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setResizable(false); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnl_menu = new javax.swing.JPanel();
        pn_QLLSP = new javax.swing.JPanel();
        lb_QLLSP = new javax.swing.JLabel();
        pn_BH = new javax.swing.JPanel();
        lb_BH = new javax.swing.JLabel();
        pn_QLNV = new javax.swing.JPanel();
        lb_QLNV = new javax.swing.JLabel();
        pn_KhoH = new javax.swing.JPanel();
        lb_KhoH = new javax.swing.JLabel();
        pn_NPP = new javax.swing.JPanel();
        lbl_QLNPP = new javax.swing.JLabel();
        pn_KH = new javax.swing.JPanel();
        lb_KH = new javax.swing.JLabel();
        pnl_right = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang quản lí chính");

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("VNI-StageCoach", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quaûn Lí Baùn Haøng");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xin chào: Admin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thứ 3, ngày 10 tháng 10 năm 2017");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(303, 303, 303)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnl_menu.setBackground(new java.awt.Color(255, 255, 255));
        pnl_menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnl_menuMouseMoved(evt);
            }
        });

        pn_QLLSP.setBackground(new java.awt.Color(0, 0, 204));
        pn_QLLSP.setLayout(new java.awt.GridLayout(1, 0));

        lb_QLLSP.setBackground(new java.awt.Color(255, 255, 255));
        lb_QLLSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_QLLSP.setForeground(new java.awt.Color(255, 255, 255));
        lb_QLLSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_QLLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loai_sp.png"))); // NOI18N
        lb_QLLSP.setText("QL Loại SP");
        lb_QLLSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_QLLSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_QLLSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_QLLSP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lb_QLLSPMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb_QLLSPMouseMoved(evt);
            }
        });
        lb_QLLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_QLLSPMouseClicked(evt);
            }
        });
        pn_QLLSP.add(lb_QLLSP);

        pn_BH.setBackground(new java.awt.Color(0, 0, 204));
        pn_BH.setPreferredSize(new java.awt.Dimension(109, 22));
        pn_BH.setLayout(new java.awt.GridLayout(1, 0));

        lb_BH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_BH.setForeground(new java.awt.Color(255, 255, 255));
        lb_BH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_BH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ban hang.png"))); // NOI18N
        lb_BH.setText("Bán Hàng");
        lb_BH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_BH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_BH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_BH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb_BHMouseMoved(evt);
            }
        });
        pn_BH.add(lb_BH);

        pn_QLNV.setBackground(new java.awt.Color(0, 0, 204));
        pn_QLNV.setLayout(new java.awt.GridLayout(1, 0));

        lb_QLNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_QLNV.setForeground(new java.awt.Color(255, 255, 255));
        lb_QLNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nv.png"))); // NOI18N
        lb_QLNV.setText("QL Nhân Viên");
        lb_QLNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_QLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_QLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_QLNV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb_QLNVMouseMoved(evt);
            }
        });
        pn_QLNV.add(lb_QLNV);

        pn_KhoH.setBackground(new java.awt.Color(0, 0, 204));
        pn_KhoH.setLayout(new java.awt.GridLayout(1, 0));

        lb_KhoH.setBackground(new java.awt.Color(255, 255, 255));
        lb_KhoH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_KhoH.setForeground(new java.awt.Color(255, 255, 255));
        lb_KhoH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_KhoH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kho hang.png"))); // NOI18N
        lb_KhoH.setText("QL Kho Hàng");
        lb_KhoH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_KhoH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_KhoH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_KhoH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb_KhoHMouseMoved(evt);
            }
        });
        pn_KhoH.add(lb_KhoH);

        pn_NPP.setBackground(new java.awt.Color(0, 0, 204));
        pn_NPP.setLayout(new java.awt.GridLayout(1, 0));

        lbl_QLNPP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_QLNPP.setForeground(new java.awt.Color(255, 255, 255));
        lbl_QLNPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_QLNPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhà pp.png"))); // NOI18N
        lbl_QLNPP.setText("QL Nhà PP");
        lbl_QLNPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_QLNPP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_QLNPP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_QLNPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_QLNPPMouseMoved(evt);
            }
        });
        lbl_QLNPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_QLNPPMouseClicked(evt);
            }
        });
        pn_NPP.add(lbl_QLNPP);

        pn_KH.setBackground(new java.awt.Color(0, 0, 204));
        pn_KH.setLayout(new java.awt.GridLayout(1, 0));

        lb_KH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_KH.setForeground(new java.awt.Color(255, 255, 255));
        lb_KH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachHang.png"))); // NOI18N
        lb_KH.setText("QL Khách Hàng");
        lb_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_KH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_KH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_KH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb_KHMouseMoved(evt);
            }
        });
        lb_KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_KHMouseClicked(evt);
            }
        });
        pn_KH.add(lb_KH);

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_KhoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_NPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(pn_QLLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_BH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(pn_BH, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pn_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_KhoH, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_QLLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_NPP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pnl_right.setBackground(new java.awt.Color(102, 204, 255));
        pnl_right.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnl_rightMouseMoved(evt);
            }
        });
        pnl_right.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_right, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_right, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lb_QLLSPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLLSPMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        setBg(pn_QLLSP);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_BH);
        resetBg(pn_QLNV);
    }//GEN-LAST:event_lb_QLLSPMouseMoved

    private void pnl_menuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_menuMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        resetBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
        
    }//GEN-LAST:event_pnl_menuMouseMoved

    private void lb_QLLSPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLLSPMouseDragged
        // TODO add your handling code here:
        //lb_NV.setBackground(Color.red);
        
    }//GEN-LAST:event_lb_QLLSPMouseDragged

    private void lb_KhoHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KhoHMouseMoved
        // TODO add your handling code here:
        setBg(pn_KhoH);
        resetBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
        
    }//GEN-LAST:event_lb_KhoHMouseMoved

    private void lb_BHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_BHMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        setBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
        
        
    }//GEN-LAST:event_lb_BHMouseMoved

    private void lb_QLNVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLNVMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        resetBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        setBg(pn_QLNV);
    }//GEN-LAST:event_lb_QLNVMouseMoved

    private void lbl_QLNPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_QLNPPMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        setBg(pn_NPP);
        resetBg(pn_KH);
        resetBg(pn_BH);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
    }//GEN-LAST:event_lbl_QLNPPMouseMoved

    private void lb_KHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KHMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        resetBg(pn_BH);
        setBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
    }//GEN-LAST:event_lb_KHMouseMoved

    private void lbl_QLNPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_QLNPPMouseClicked
        // TODO add your handling code here:
        Pn_NhaPP pn_NhaPP = new Pn_NhaPP();
        pnl_right.removeAll();
        pnl_right.add(pn_NhaPP);
        pnl_right.validate();
    }//GEN-LAST:event_lbl_QLNPPMouseClicked

    private void pnl_rightMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_rightMouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        resetBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
    }//GEN-LAST:event_pnl_rightMouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
        resetBg(pn_KhoH);
        resetBg(pn_BH);
        resetBg(pn_KH);
        resetBg(pn_NPP);
        resetBg(pn_QLLSP);
        resetBg(pn_QLNV);
    }//GEN-LAST:event_jPanel2MouseMoved

    private void lb_QLLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLLSPMouseClicked
        // TODO add your handling code here:
        Pn_LSP pn_LSP = new Pn_LSP();
        pnl_right.removeAll();
        pnl_right.add(pn_LSP);
        pnl_right.validate();
    }//GEN-LAST:event_lb_QLLSPMouseClicked

    private void lb_KHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KHMouseClicked
        // TODO add your handling code here:
        Pn_KhachHang pn_KhachHang = new Pn_KhachHang();
        pnl_right.removeAll();
        pnl_right.add(pn_KhachHang);
        pnl_right.validate();
    }//GEN-LAST:event_lb_KHMouseClicked
    public void setBg(javax.swing.JPanel a) {
        a.setBackground(new Color(51, 255, 51));
        
    }

    public void resetBg(javax.swing.JPanel a) {
        a.setBackground(new Color(0, 0, 204));
    }
    public void setBgMouseClick(javax.swing.JPanel a){
        a.setBackground(Color.white);
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_BH;
    private javax.swing.JLabel lb_KH;
    private javax.swing.JLabel lb_KhoH;
    private javax.swing.JLabel lb_QLLSP;
    private javax.swing.JLabel lb_QLNV;
    private javax.swing.JLabel lbl_QLNPP;
    private javax.swing.JPanel pn_BH;
    private javax.swing.JPanel pn_KH;
    private javax.swing.JPanel pn_KhoH;
    private javax.swing.JPanel pn_NPP;
    private javax.swing.JPanel pn_QLLSP;
    private javax.swing.JPanel pn_QLNV;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JPanel pnl_right;
    // End of variables declaration//GEN-END:variables
}
