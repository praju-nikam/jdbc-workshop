package com.bridgelabz;

public class EmployeePayrollData
{
    public int id;
    public String name;
    public String doj;

    public EmployeePayrollData(int id, String name, String doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
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

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
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

