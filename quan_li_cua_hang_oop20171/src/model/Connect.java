/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Connect {
    public Connection getConnect(){
        Connection conn = null;
        try {
            String dbURL = "jdbc:mysql://localhost/quanlibanhang?useUnicode=yes&characterEncoding=UTF-8";
            String username = "root";
            String password = "";
            conn = (Connection) DriverManager.getConnection(dbURL, username, password);
            return conn;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
