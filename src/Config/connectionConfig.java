package Config;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class connectionConfig {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/kuliah_siakad";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed: \n" + e.getMessage());
        }
     
        return MySQLConfig;
    }
    
    public connectionConfig(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuliah_siakad","root","");
            st = con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Connection failed: \n"+e);
        }
    }
    
    public List searchLogin(String username, String password){
        List logLogin = new ArrayList();
        int result;
        sql = "select * from tbl_user where username='"+username+"' and password='"+password+"'";
        
        try {
            rs = st.executeQuery(sql);
            while(rs.next()){
                userConfig uc = new userConfig();
                uc.setUsername(rs.getString("username"));
                uc.setPassword(rs.getString("password"));
                uc.setName(rs.getString("name"));
                uc.setAccess(rs.getString("access"));
                logLogin.add(uc);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Login Failed: "+e);
        }
        
        return logLogin;
    }
}
