package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableManager {

    static Connection connect = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Establish database connection
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "cdac");
            System.out.println("Connection Successful");

            while (true) {
                System.out.println("\n1. Create Table");
                System.out.println("2. Display Columns of a Table");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createTable();
                        break;
                    case 2:
                        displayColumns();
                        break;
                    case 3:
                        closeConnection();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 1. Create Table
    public static void createTable() {
        try {
            System.out.print("Enter Table Name: ");
            String tableName = sc.next();

            List<String> columns = new ArrayList<>();
            String primaryKey = null;

            while (true) {
                System.out.println("\n1. Add Column");
                System.out.println("2. Set Primary Key");
                System.out.println("3. Save Table");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // Add Column
                        System.out.print("Enter Column Name: ");
                        String columnName = sc.next();
                        System.out.println("Select Data Type:");
                        System.out.println("1. VARCHAR");
                        System.out.println("2. INT");
                        System.out.println("3. FLOAT");
                        int typeChoice = sc.nextInt();

                        String dataType;
                        switch (typeChoice) {
                            case 1:
                                System.out.print("Enter Length for VARCHAR: ");
                                int length = sc.nextInt();
                                dataType = "VARCHAR(" + length + ")";
                                break;
                            case 2:
                                dataType = "INT";
                                break;
                            case 3:
                                dataType = "FLOAT";
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                continue;
                        }
                        columns.add(columnName + " " + dataType);
                        System.out.println("Column added: " + columnName + " " + dataType);
                        break;

                    case 2:
                        // Set Primary Key
                        if (columns.isEmpty()) {
                            System.out.println("Add at least one column first.");
                            continue;
                        }
                        System.out.println("Available Columns:");
                        for (int i = 0; i < columns.size(); i++) {
                            System.out.println((i + 1) + ". " + columns.get(i).split(" ")[0]);
                        }
                        System.out.print("Select column number to set as Primary Key: ");
                        int pkChoice = sc.nextInt();
                        if (pkChoice < 1 || pkChoice > columns.size()) {
                            System.out.println("Invalid choice. Try again.");
                            continue;
                        }
                        primaryKey = columns.get(pkChoice - 1).split(" ")[0];
                        System.out.println("Primary Key set to: " + primaryKey);
                        break;

                    case 3:
                        // Save Table
                        if (columns.isEmpty()) {
                            System.out.println("Cannot save table without columns.");
                            continue;
                        }
                        if (primaryKey == null) {
                            System.out.println("Please set a primary key before saving.");
                            continue;
                        }

                        // Construct SQL CREATE TABLE statement
                        StringBuilder createSQL = new StringBuilder("CREATE TABLE " + tableName + " (");
                        for (String column : columns) {
                            createSQL.append(column).append(", ");
                        }
                        createSQL.append("PRIMARY KEY(").append(primaryKey).append("))");

                        // Execute SQL statement
                        Statement stmt = connect.createStatement();
                        stmt.executeUpdate(createSQL.toString());
                        System.out.println("Table " + tableName + " created successfully.");
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 2. Display Columns of a Table
    public static void displayColumns() {
        try {
            System.out.print("Enter Table Name: ");
            String tableName = sc.next();

            String query = "DESCRIBE " + tableName;
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Columns in table " + tableName + ":");
            while (rs.next()) {
                System.out.println("- " + rs.getString("Field"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Close Database Connection
    public static void closeConnection() {
        try {
            if (connect != null) connect.close();
            System.out.println("Connection closed successfully.");
        } catch (SQLException e) {
            System.out.println("Error while closing connection: " + e.getMessage());
        }
    }
}
