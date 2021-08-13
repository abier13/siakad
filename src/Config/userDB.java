/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class userDB {
    private Connection conn;
    private PreparedStatement pst;
    
    public void akunGuru(String nip, String nama, Date tgl_lahir){ 
        try {
            DateFormat dFormat = new SimpleDateFormat("ddMMyyyy");
            String tanggal_lahir = dFormat.format(tgl_lahir);
            String name = nama;
            String username = nip;
            String access = "Guru";
            String password = encryptConfig.getSHA1(tanggal_lahir);
            String sql_insert_user = "INSERT INTO tbl_user (username, password, name, access) VALUES (?,?,?,?)";
            
            conn = connectionConfig.configDB();
            pst = conn.prepareStatement(sql_insert_user);
            
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, access);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil membuat akun", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void akunSiswa(String nisn, String nama, Date tgl_lahir){ 
        try {
            DateFormat dFormat = new SimpleDateFormat("ddMMyyyy");
            String tanggal_lahir = dFormat.format(tgl_lahir);
            String name = nama;
            String username = nisn;
            String access = "Murid";
            String password = encryptConfig.getSHA1(tanggal_lahir);
            String sql_insert_user = "INSERT INTO tbl_user (username, password, name, access) VALUES (?,?,?,?)";
            
            conn = connectionConfig.configDB();
            pst = conn.prepareStatement(sql_insert_user);
            
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, access);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil membuat akun", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void akunTU(String nip, String nama, Date tgl_lahir){ 
        try {
            DateFormat dFormat = new SimpleDateFormat("ddMMyyyy");
            String tanggal_lahir = dFormat.format(tgl_lahir);
            String name = nama;
            String username = nip;
            String access = "Tata Usaha";
            String password = encryptConfig.getSHA1(tanggal_lahir);
            String sql_insert_user = "INSERT INTO tbl_user (username, password, name, access) VALUES (?,?,?,?)";
            
            conn = connectionConfig.configDB();
            pst = conn.prepareStatement(sql_insert_user);
            
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, access);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil membuat akun", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
