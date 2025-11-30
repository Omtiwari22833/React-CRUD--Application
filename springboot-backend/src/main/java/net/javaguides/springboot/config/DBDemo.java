package net.javaguides.springboot.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBDemo {
    public static void main(String[] args) {
        String JdbcURL = "jdbc:mysql://localhost:3306/employee_management_system?useSSL=false";
        String Username = "root";
        String password = "Arjun22833";
        Connection con = null;
        try {
            con = DriverManager.getConnection(JdbcURL, Username, password);
            System.out.println("Connected to MySQL database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}