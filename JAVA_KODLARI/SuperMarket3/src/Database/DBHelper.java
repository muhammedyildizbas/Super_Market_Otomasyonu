/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBHelper {

    private Connection conn = null;
    private String URI = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=utf-8";
    private String dbUsername = "root";
    private String dbPassword = "";

    public Connection getConnection() {

        if (this.conn == null) {

            try {
                this.conn = DriverManager.getConnection(URI, dbUsername, dbPassword);
            } catch (SQLException ex) {
                System.out.println("hata yaşandi :" + ex);
            }
        }

        return this.conn;
    }

}
