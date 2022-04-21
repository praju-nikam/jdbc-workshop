package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EmployeePayrollData
{
    public int id;
    public String name;
    public Date doj;

    public EmployeePayrollData(int id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }
    ArrayList<EmployeePayrollData> employeeList;

    public EmployeePayrollData() {

    }

    public ArrayList<EmployeePayrollData> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj='" + doj + '\'' +
                '}';
    }
}

