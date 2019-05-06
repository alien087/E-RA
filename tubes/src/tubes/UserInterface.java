/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.math.BigDecimal;
import javax.swing.JTable;

/**
 *
 * @author Alien
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    
    public UserInterface() {
       initComponents();
    }
    public UserInterface(String id, String name, BigDecimal balance) {
       initComponents();
       
       jLabel4.setText(id);
       jLabel12.setText(id);
       jLabel13.setText(name);
       jLabel7.setText("Rp. " + balance);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_history = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        kButton1.setText("Balance");
        kButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkFillButton(false);
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 153, 0));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(kButton1);
        kButton1.setBounds(40, 35, 90, 20);

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 51));
        jLabel14.setText("15-02-2019");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(680, 140, 260, 40);

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setText("Dino Febriyanto");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(490, 140, 250, 40);

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("14117124");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 140, 240, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/data akun.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, 90, 540, 160);

        jLabel7.setFont(new java.awt.Font("Big John", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 205, 255));
        jLabel7.setText("Rp. 500.000");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 130, 240, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/BALANCE.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 110, 99, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Rectangle 4.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 90, 290, 160);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(750, 0, 100, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/line.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 850, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/user icon.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(710, -10, 40, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Asset 1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -80, 940, 223);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/user icon.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(710, -10, 40, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/Trassaction History.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 240, 190, 40);

        table_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_history.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_history);
        if (table_history.getColumnModel().getColumnCount() > 0) {
            table_history.getColumnModel().getColumn(0).setResizable(false);
            table_history.getColumnModel().getColumn(1).setResizable(false);
            table_history.getColumnModel().getColumn(2).setResizable(false);
            table_history.getColumnModel().getColumn(3).setResizable(false);
        }
        table_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null, null},
                {null, null, null, null,null, null},
                {null, null, null, null,null, null},
                {null, null, null, null,null, null}
            },
            new String [] {
                "Nomor Transaksi", "NIM", "ID Karyawan", "Lokasi", "Jumlah", "Tanggal"
            }
        ));

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 280, 810, 402);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 500);

        setSize(new java.awt.Dimension(900, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel4AncestorAdded

    /**
     * @param args the command line arguments
     */
    public void setTextLabel4(){
        login loginn = new login();
        jLabel4.setText(loginn.getText());
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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
                jTable1.setModel(new javax.swing.table.DefaultTableModel);
                String[] column = new String[] {
                 "Produk Name", "Price"
                };
                
                Object[][] product = new Object[][]{
                    {"Beras", "20000"},
                    {"Susu", "50000"}
                };
                
                JTable a = new JTable(column, product);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton1;
    private javax.swing.JTable table_history;
    // End of variables declaration//GEN-END:variables
}
