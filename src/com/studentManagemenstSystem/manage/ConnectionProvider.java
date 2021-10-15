package com.studentManagemenstSystem.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static Connection conn;

    public static Connection createConnection() {
        try {
            // load jdbc the driver
            Class.forName("com.mysql.jdbc.Driver");

            // create the connection..
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/student_management";
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
