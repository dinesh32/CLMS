package com.example.common;

import java.sql.*;

public class DBConnection {

    static final String username = "root";
    static final String password = "";
    static final String url = "jdbc:mysql://localhost:3306/clms";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

}
