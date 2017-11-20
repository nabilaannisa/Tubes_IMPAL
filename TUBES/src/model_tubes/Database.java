/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_tubes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author nabilaannisa
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/RestoImpal";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection conn = null;
    private ResultSet rs = null;

    public Database() {
        try {
            conn = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
        
    }
    
    public ResultSet getData(String SQLString) {
        try {
            rs = statement.executeQuery(SQLString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public void query(String SQLString) {
        try {
            statement.executeUpdate(SQLString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
