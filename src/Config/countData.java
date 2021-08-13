/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author faramadhan
 */
public class countData {
    private static int sumGuru;
    private static int sumSiswa;
    private static int sumTU;
    private static int sumKelas;
    
    public static int getSumGuru(){
        try {
            String sql_select_guru = "SELECT * FROM tbl_guru";
            
            Connection conn = connectionConfig.configDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_select_guru);
            
            rs.next();
            if(rs.last()){
                int total_guru = rs.getRow();
                rs.beforeFirst();
                sumGuru = total_guru;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghitung data guru: "+e.getMessage());
        }
        
        return sumGuru;
    }
    
    public static int getSumSiswa(){
        try {
            String sql_select_siswa = "SELECT * FROM tbl_siswa";
            
            Connection conn = connectionConfig.configDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_select_siswa);
            
            rs.next();
            if(rs.last()){
                int total_siswa = rs.getRow();
                rs.beforeFirst();
                sumSiswa = total_siswa;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghitung data siswa: "+e.getMessage());
        }
        return sumSiswa;
    }
    
    public static int getSumTU(){
        try {
            String sql_select_tu = "SELECT * FROM tbl_tu";
            
            Connection conn = connectionConfig.configDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_select_tu);
            
            rs.next();
            if(rs.last()){
                int total_tu = rs.getRow();
                rs.beforeFirst();
                sumTU = total_tu;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghitung data tata usaha: "+e.getMessage());
        }
        return sumTU;
    }
    
    public static int getSumKelas(){
        try {
            String sql_select_kelas = "SELECT * FROM tbl_kelas";
            
            Connection conn = connectionConfig.configDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_select_kelas);
            
            rs.next();
            if(rs.last()){
                int total_kelas = rs.getRow();
                rs.beforeFirst();
                sumKelas = total_kelas;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghitung data tata usaha: "+e.getMessage());
        }
        return sumKelas;
    }
    
}
