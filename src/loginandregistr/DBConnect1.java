package loginandregistr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
//package login;

//import .*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PARTH
 */
public class DBConnect1 {
            
       private Connection con = null;
       private PreparedStatement pre = null;
       private ResultSet rs = null;
            
            DBConnect1(){
                
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","");
                    
                } catch (SQLException ex) {
                    
                }
                
            }

    public Connection getCon() {
        return con;
    }

    public PreparedStatement getPre() {
        return pre;
    }

    public ResultSet getRs() 
    {
        return rs;
    }
}
            
