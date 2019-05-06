/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.math.BigDecimal;
import java.math.BigInteger;
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
    private String pin,nama;
    private BigDecimal balance;
     void updateData(Connection Connect, String query){
        try {
            Statement stat = Connect.createStatement();
            ResultSet hasil = stat.executeQuery(query);
            
            while(hasil.next()){
                pin = hasil.getString("pin");
                balance = hasil.getBigDecimal("saldo");
                nama = hasil.getString("nama_depan") + hasil.getString("nama_belakang");
            }
            
        } catch (SQLException ex){
            System.out.println("Gagal update query!");
        }
    }
     
     public String returnpin(){
         return pin;
     }
     public String returnnama(){
         return nama;
     }
     public BigDecimal returnsaldo(){
         return balance;
     }
}
