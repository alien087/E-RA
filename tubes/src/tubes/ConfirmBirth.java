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
public class ConfirmBirth extends javax.swing.JFrame {
    private String id, pass;
    
    /**
     * Creates new form ConfirmBirth
     */
    public ConfirmBirth() {
        initComponents();
    }
    
    public ConfirmBirth(String id, String pass) {
        initComponents();
        this.id = id;
        this.pass = pass;
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
        jLabel12 = new javax.swing.JLabel();
        uName4 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(320, 302));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Big John", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 10, 20, 20);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Birth Date (yyyy-mm-dd)");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 110, 200, 22);

        uName4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        uName4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        uName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uName4ActionPerformed(evt);
            }
        });
        jPanel1.add(uName4);
        uName4.setBounds(40, 140, 250, 20);

        kButton1.setText("CONFIRM");
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
        jPanel1.add(kButton1);
        kButton1.setBounds(80, 200, 150, 30);

        jLabel2.setFont(new java.awt.Font("Big John", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONFIRM BIRTH DATE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 50, 260, 46);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 270);

        setSize(new java.awt.Dimension(336, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uName4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        System.out.println(id);
        try {
            String tgl = null;
            connect konek = new connect();
            Connection koneksi = konek.getConnection();
            String query = "SELECT tgl_lahir FROM mahasiswa where nim = '"+id+"'";
            Statement stat = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(query);
            while (hasil.next()){
            tgl = hasil.getString("tgl_lahir");   
            }
            if (tgl.equals(uName4.getText())){
                query = "update mahasiswa set pin='"+pass+"' where nim = '"+id+"'";
                PreparedStatement statS = (PreparedStatement) koneksi.prepareStatement(query);
                statS.executeUpdate();
                System.out.println("123");
                JOptionPane.showMessageDialog(null, "Ganti Password Berhasil", "Berhasil", WIDTH);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ganti Password Gagal, Cek Tanggal Lahir Kembali", "Gagal", WIDTH);
                uName4.setText(" ");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(ConfirmBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmBirth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private javax.swing.JTextField uName4;
    // End of variables declaration//GEN-END:variables
}
