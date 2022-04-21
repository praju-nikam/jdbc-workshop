package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollDataBase {
    private static Connection connection = null;
    static String jdbc_Url = "jdbc:mysql://localhost: 3306/employee_payroll";
    static String user_Name = "root";
    static String password = "Anvi@1112";

    public static Connection getConnection() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            connection = DriverManager.getConnection(jdbc_Url, user_Name, password);
            System.out.println("Connection Successfully");
        } catch (ClassNotFoundException e) {
            throw new EmployeeException("invalid driver");
        } catch (SQLException throwable) {
            throw new EmployeeException("Invalid get connection parameters");
        }
        return connection;
    }
}
