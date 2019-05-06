package tubes;
import java.sql.*;
import java.util.logging.*;

public class connect {
    Connection koneksi;
    public Connection getConnection(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/emoney_itera", "root","");
        } catch (SQLException e){
            System.out.println("Gagal");
        }

        return koneksi;

    }

    public void showData(Connection Connect, String query) {
        try {
            System.out.println("Data Suppliers : \n");

            Statement stat = Connect.createStatement();
            ResultSet hasil = stat.executeQuery(query);

            while (hasil.next()){
                String suppliers_id = hasil.getString("suppliers_id");
                String company_nama = hasil.getString("company_nama");
                String nama_kontak = hasil.getString("nama_kontak");

                System.out.println(suppliers_id + "\n" + company_nama + "\n"
                                    + nama_kontak + "\n");
            }
        } catch (SQLException ex){
            System.out.println("Gagal Eksekusi Query Select!");
        }
    }

    void updateData(Connection Connect, String query){
        try {
            PreparedStatement stat = (PreparedStatement) Connect.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil");
        } catch (SQLException ex){
            System.out.println("Gagal update query!");
        }
    }
    

    void close(Connection connect){
        try {
            connect.close();
        } catch (SQLException ex){
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


