package com.employeeAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_Delete {

    public static void main(String[] args) {
    	//update query 
        try {

            String url = "jdbc:mysql://localhost:3306/Employee";
            String password = "root";
            String username = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee id: ");
            int emp_id = sc.nextInt();
         

            String query = "delete from employee_detail where emp_id=? ";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, emp_id);
            
          
            ps.executeUpdate();
            System.out.println("Delete the values");

        } catch (Exception e) {
        	
            System.out.println("Error occurred while deleting the record:");
            e.printStackTrace();
        }
    }
}
