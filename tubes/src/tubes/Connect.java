/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.*;


/**
 *
 * @author Lenovo
 */
public class connect {
     Connection koneksi;
    public Connection getConnection(){
        try{
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/emoney_itera","root","");
                
        } catch (SQLException e){
                        System.out.println("Tidak dapat menyambungkan ke database");
                        }
                return koneksi;
    }
    
     void updateData(Connection Connect, String query){
        try {
            Statement stat = Connect.createStatement();
            ResultSet hasil = stat.executeQuery(query);
            
            String a = hasil.getString("nim");
            System.out.println(a);
        } catch (SQLException ex){
            System.out.println("Gagal update query!");
        }
    }
}
