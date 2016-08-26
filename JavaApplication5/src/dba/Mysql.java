/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Mysql {

    private static String db = "unalm";
    private static String user = "rood";
    private static String pass = "";
    private static String url = "jbdc:mysql://localhost/" + db;
    private static Connection Conn;
    

}
