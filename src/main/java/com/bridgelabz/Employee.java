package com.bridgelabz;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args) throws SQLException {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- Welcome to Employee Payroll -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
       EmployeePayrollDataBase employeePayrollDataBase = new EmployeePayrollDataBase();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 4;
        int choice = 0;
        while (choice != EXIT) {
            System.out.println();
            System.out.println(
                    "Enter Your Choice: \n 1. Insert Record \n 2. Delete Record \n 3. Display Record  \n 4. EXIT \n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name :");
                    String empName = scanner.next();
                    System.out.println("Enter Date of Joining :");
                    String doj = scanner.next();
                    employeePayrollService.insertData(empName,doj);
                    break;
                case 2:
                    System.out.println("Enter Name :");
                    String name=scanner.next();
                    employeePayrollService.deleteData(name);
                    break;
                case 3:
                    employeePayrollService.displayRecord();
                    break;
                case  4 :
                    System.out.println("Exit");
                    break;
          
            }
        }

    }
}
