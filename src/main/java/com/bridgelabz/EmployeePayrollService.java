package com.bridgelabz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeePayrollService
{
   
   PreparedStatement preparedStatement;
  Connection connection = EmployeePayrollDataBase.getConnection();

    public void insertData()
    {
            String insert = "insert into employee (Name,DOJ) values(?,?);";
            try{
                preparedStatement = connection.prepareStatement(insert);
                preparedStatement.setString(1,"Vaibhav");
                preparedStatement.setString(2,"2015-03-01");
                preparedStatement.execute();
                preparedStatement.setString(1,"Sanket");
                preparedStatement.setString(2,"2020-01-01");
                preparedStatement.execute();
                preparedStatement.setString(1,"Aparna");
                preparedStatement.setString(2,"2019-06-01");
                preparedStatement.execute();
                preparedStatement.setString(1,"Gargi");
                preparedStatement.setString(2,"2012-03-10");
                preparedStatement.execute();
                preparedStatement.setString(1,"Prajakta");
                preparedStatement.setString(2,"2021-05-01");
                preparedStatement.execute();
                System.out.println("Added Successfully");

            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

        }

        public void deleteData() throws SQLException {
            String delete = "delete from employee where Name = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setString(1, "Prajakta");
            preparedStatement.executeUpdate();
            System.out.println("Delete Record SuccessFully");
        }

        public void displayRecord() throws SQLException {

            try {
                // SQL command data stored in String datatype
                String sql = "select * from employee";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
               ResultSet resultSets = preparedStatement.executeQuery();

                // Printing ID, name, email of customers
                // of the SQL command above
                System.out.println("id\t\t name\t\t DOJ");

                // Condition check
                while (resultSets.next()) {

                    int id = resultSets.getInt("Id");
                    String name = resultSets.getString("Name");
                    String doj = resultSets.getString("DOJ");
                    System.out.println(id + "\t\t" + name + "\t\t" + doj);
                }
            }

            // Catch block to handle exception
            catch (SQLException e) {

                // Print exception pop-up on screen
                System.out.println(e);
            }
        }


    }

