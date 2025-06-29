/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdur
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class KONEKSI {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/restoran";
            String user = "root";       // Default user MySQL
            String password = "";       // Default password MySQL (kosong)

            // Load driver MySQL (dalam .jar)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Membuat koneksi
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }

        return con;
    }
    public static void main(String[] args) {
        KONEKSI koneksi = new KONEKSI();
        Connection conn = koneksi.getConnection();

        if (conn != null) {
            System.out.println("Tes koneksi sukses.");
        } else {
            System.out.println("Tes koneksi gagal.");
        }
    }
}
