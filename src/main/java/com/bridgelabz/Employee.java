package com.bridgelabz;

public class Employee
{
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- Welcome to Employee Payroll *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        EmployeePayrollDataBase employeePayrollDataBase = new EmployeePayrollDataBase();
        employeePayrollDataBase.getConnection();
    }
}
