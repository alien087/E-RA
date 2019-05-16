/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alien
 */
public class Confirms extends javax.swing.JFrame {
    String id, idCasier, idKantin;
    long billss;
    /**
     * Creates new form NewJFrame1
     */
    public Confirms() {
        initComponents();
    }
    public Confirms(String id, long billss, String idCasier, String idKantin) {
        initComponents();
        this.id = id;
        this.billss = billss;
        this.idCasier = idCasier;
        this.idKantin = idKantin;
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(315, 389));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 350));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 120, 120, 50);

        jLabel1.setFont(new java.awt.Font("Big John", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("cONFIRM ACCOUNT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 200, 60);

        kButton1.setText("Confirm");
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
        kButton1.setBounds(40, 270, 210, 40);

        kButton2.setText("Confirm  by QR");
        kButton2.setFocusable(false);
        kButton2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkForeGround(new java.awt.Color(51, 51, 51));
        kButton2.setkHoverColor(new java.awt.Color(0, 205, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 205, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2);
        kButton2.setBounds(130, 230, 120, 30);

        jLabel2.setFont(new java.awt.Font("Big John", 0, 12)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 10, 10, 16);

        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pass.setCaretColor(new java.awt.Color(51, 51, 51));
        jPanel1.add(pass);
        pass.setBounds(50, 170, 190, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
           
            if(PasswordChecking()){
                setSaldo();
                setTransaction();
                setKantin();
                JOptionPane.showMessageDialog(null, "Transaksi Pembayaran Berhasil!", "Transaksi Berhasil", WIDTH);
                dispose();
            }
            else JOptionPane.showMessageDialog(null, "Transaksi Pembayaran Gagal, Coba Password Kembali", "Transaksi Gagal", WIDTH);
          
            
            
        
    }//GEN-LAST:event_kButton1ActionPerformed

    
    private boolean PasswordChecking(){
       String password="";
        try{
           connect connects = new connect();
           Connection connections = connects.getConnection();
           String query = "SELECT pin FROM mahasiswa WHERE nim='" + id +"'";
           Statement stat = connections.createStatement();
           ResultSet hasil = stat.executeQuery(query);
           while(hasil.next()){
               password = hasil.getString("pin");
           }
       }
       catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Gagal Mendapat Data Dari Database", "Transaksi Gagal", WIDTH);
       }
       
       if(pass.getText().equals(password)) return true;
       else return false;
    }
    /**
     * @param args the command line arguments
     */
    
    void setSaldo(){
        try{
        connect konek = new connect();
        Connection koneks = konek.getConnection();
        CasierInterface kasir = new CasierInterface();
        String com = "SELECT saldo FROM mahasiswa WHERE nim='" + id + "'";
        Statement stat = koneks.createStatement();
        ResultSet hasil = stat.executeQuery(com);
        long saldo = 0;
        while(hasil.next()){
            saldo = hasil.getLong("saldo");
        }
        saldo = saldo-billss;
        String query = "UPDATE mahasiswa SET saldo = " + saldo + " WHERE nim='" + id + "'";
        PreparedStatement statS = (PreparedStatement) koneks.prepareStatement(query);
        statS.executeUpdate();
        kasir.setBalance(saldo);
        }
        catch (SQLException ex) {
                System.out.println(ex);
        }
    }
    
    void setTransaction(){
        Date dates = new Date();
        SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
        String date = today.format(dates);
        try{
        connect konek = new connect();
        Connection koneks = konek.getConnection();
        CasierInterface kasir = new CasierInterface();
        String query = "INSERT INTO transaksi VALUES ('" + id +"', '" + idCasier + "', '" + idKantin + "', '" + date +"', '" + billss + "', 'payment')" ;
        PreparedStatement statS = (PreparedStatement) koneks.prepareStatement(query);
        statS.executeUpdate();
        }
        catch (SQLException ex) {
                System.out.println(ex);
        }
    }
    
    void setKantin(){
        try{
        connect konek = new connect();
        Connection koneks = konek.getConnection();
        String com = "SELECT saldo FROM kantin WHERE id='" + idKantin + "'";
        Statement stat = koneks.createStatement();
        ResultSet hasil = stat.executeQuery(com);
        long saldo = 0;
        while(hasil.next()){
            saldo = hasil.getLong("saldo");
        }
        saldo = saldo+billss;
        String query = "UPDATE kantin SET saldo = " + saldo + " WHERE id='" + idKantin + "'";
        PreparedStatement statS = (PreparedStatement) koneks.prepareStatement(query);
        statS.executeUpdate();
        }
        catch (SQLException ex) {
                System.out.println(ex);
        }
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
            java.util.logging.Logger.getLogger(Confirms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
