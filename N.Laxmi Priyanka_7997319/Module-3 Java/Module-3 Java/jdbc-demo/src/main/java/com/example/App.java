package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        // Change "localhost" to your specific DB host IP if running remotely
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";     
        String password = "1234"; 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to MySQL successfully!");

            String query = "SELECT * FROM students";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                System.out.println("ID | Name | Email");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    System.out.println(id + " | " + name + " | " + email);
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error occurred!");
            e.printStackTrace();
        }
        // Instantiate the DAO class
        StudentDAO dao = new StudentDAO();

        System.out.println("--- Testing Insert ---");
        // 1. Insert a new student record
        dao.insertStudent("Charlie Brown", "charlie@example.com");

        System.out.println("\n--- Testing Update ---");
        // 2. Update the email of the student with ID 1
        dao.updateStudentEmail(1, "alice_new@example.com");
        
        AccountDAO accountDao = new AccountDAO();

        System.out.println("--- Starting Money Transfer Transaction ---");
        // Transfer $200 from Alice (101) to Bob (102)
        accountDao.transferMoney(101, 102, 200.00);
    }
}
