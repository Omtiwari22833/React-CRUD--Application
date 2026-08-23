package net.javaguides.springboot.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBDemo {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/employee_management_system?useSSL=false";
        String username = "root";
        String password = "Arjun22833";

        try {
            Connection con = DriverManager.getConnection(
                    jdbcURL,
                    username,
                    password
            );

            System.out.println("Connected to MySQL database successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}