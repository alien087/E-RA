/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Alien
 */
import java.awt.event.*;
import java.awt.*;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
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
        kButton1 = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        try {
            jLabel1 =(javax.swing.JLabel)java.beans.Beans.instantiate(getClass().getClassLoader(), "tubes.NewJFrame_jLabel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        kButton1.setText("LOGIN");
        kButton1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 153, 0));
        kButton1.setkEndColor(new java.awt.Color(0, 205, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 153, 0));
        kButton1.setkSelectedColor(new java.awt.Color(255, 153, 0));
        kButton1.setkStartColor(new java.awt.Color(0, 205, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1);
        kButton1.setBounds(355, 320, 140, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Group 1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 140, 360, 290);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, -10, 380, 520);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Path 4.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 246, 196);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/WELCOME TO E-RA.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 160, 420, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Path 5.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 310, 260);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/E-MONEY ITERA.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 220, 393, 130);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Path 1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 180, 20, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Nikmati Pengalaman Jajan YangLebih Mudah Bersama E-RA.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 260, 280, 130);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new login().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_kButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        NewJFrame a = new NewJFrame();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                a.kButton1.setFocusPainted(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    // End of variables declaration//GEN-END:variables
}
