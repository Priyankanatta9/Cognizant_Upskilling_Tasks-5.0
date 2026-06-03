package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAO {
    private String url = "jdbc:mysql://localhost:3306/school_db";
    private String user = "root";
    private String password = "1234";

    public void transferMoney(int fromAccount, int toAccount, double amount) {
        String debitSql = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String creditSql = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            // 1. Disable Auto-Commit (Starts the Transaction)
            conn.setAutoCommit(false);

            // 2. Perform Debit (Deduct money)
            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql)) {
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccount);
                debitStmt.executeUpdate();
            }

            // Simulating a potential error (uncomment to test rollback manually)
            // if (true) { throw new SQLException("Simulated network/system crash!"); }

            // 3. Perform Credit (Add money)
            try (PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccount);
                creditStmt.executeUpdate();
            }

            // 4. Commit transaction if both operations succeeded
            conn.commit();
            System.out.println("✅ Transaction completed successfully! Money transferred.");

        } catch (SQLException e) {
            System.err.println("❌ Transaction failed! Rolling back changes...");
            if (conn != null) {
                try {
                    // 5. Rollback everything if an error occurs
                    conn.rollback(); 
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Always close connection manually when auto-commit is false
            if (conn != null) {
                try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        }
    }
}
