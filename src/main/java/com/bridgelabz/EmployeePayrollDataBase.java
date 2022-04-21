package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollDataBase {
    private static Connection connection = null;
    static String jdbc_Url = "jdbc:mysql://localhost: 3306 //employee_payroll";
    static String user_Name = "root";
    static String password = "Anvi@1112";
  static {
      try

    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(jdbc_Url, user_Name, password);
    }
    catch(
    ClassNotFoundException e)

    {
        throw new EmployeeException("Invalid Driver");
    }
    catch(SQLException throwable)

    {
        throw new EmployeeException("Invalid Get Connection");
    }

}
    public static Connection getConnection() {
        return connection;
    }
}
