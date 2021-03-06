/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alien
 */
public class EntryData extends javax.swing.JFrame {

    /**
     * Creates new form EntryData
     */
    public EntryData() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        uName2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        uName1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uName3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uName4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(444, 570));
        setPreferredSize(new java.awt.Dimension(444, 570));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("PIN");
        jLabel10.setToolTipText("");
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(50, 360, 150, 50);

        uName2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uName2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(uName2);
        uName2.setBounds(50, 410, 330, 20);

        jLabel1.setFont(new java.awt.Font("Big John", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ENTRY CUSTOMER DATA");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 280, 46);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Nama Depan");
        jLabel8.setToolTipText("");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(50, 150, 120, 50);

        uName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(uName);
        uName.setBounds(50, 200, 330, 20);

        uName1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uName1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(uName1);
        uName1.setBounds(50, 130, 330, 20);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("NIM");
        jLabel9.setToolTipText("");
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(50, 80, 120, 50);

        uName3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uName3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(uName3);
        uName3.setBounds(50, 270, 330, 20);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Nama Belakang");
        jLabel11.setToolTipText("");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(50, 220, 150, 50);

        uName4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uName4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(uName4);
        uName4.setBounds(50, 340, 330, 20);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Tanggal Lahir (yyyy-mm-dd)");
        jLabel12.setToolTipText("");
        kGradientPanel1.add(jLabel12);
        jLabel12.setBounds(50, 290, 240, 50);

        kButton1.setText("CREATE");
        kButton1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 153, 0));
        kButton1.setkEndColor(new java.awt.Color(0, 205, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        kButton1.setkSelectedColor(new java.awt.Color(255, 153, 0));
        kButton1.setkStartColor(new java.awt.Color(0, 205, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1);
        kButton1.setBounds(50, 460, 330, 45);

        jLabel2.setFont(new java.awt.Font("Big John", 0, 14)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(410, 10, 11, 20);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 444, 550);

        setSize(new java.awt.Dimension(460, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void uName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uName1ActionPerformed

    private void uName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uName2ActionPerformed

    private void uName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uName3ActionPerformed

    private void uName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uName4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try {
            // TODO add your handling code here:
            connect baru = new connect();
            Connection koneksi = baru.getConnection();
            String nim = uName1.getText();
            String nama_depan = uName.getText();
            String nama_belakang = uName3.getText();
            String tgl = uName4.getText();
            String pin = uName2.getText();
            String query = "insert into mahasiswa value ('"+nim+"','"+nama_depan+"','"+nama_belakang+"','"+tgl+"','"+pin+"',0)";
            PreparedStatement statS = (PreparedStatement) koneksi.prepareStatement(query);
            statS.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!", "Data Update", WIDTH);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!", "Failed", WIDTH);
        }
        dispose();
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(EntryData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uName1;
    private javax.swing.JTextField uName2;
    private javax.swing.JTextField uName3;
    private javax.swing.JTextField uName4;
    // End of variables declaration//GEN-END:variables
}
