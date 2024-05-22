package com.employeeAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_Update {

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
            sc.nextLine(); // consume newline

            System.out.println("Enter employee name: ");
            String name = sc.nextLine();

            System.out.println("Enter designation: ");
            String designation = sc.nextLine();

            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Enter address: ");
            String address = sc.nextLine();

            String query = "update employee_detail set name=?, designation=?, salary=?, address=? where emp_id=? ";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setInt(3, salary);
            ps.setString(4, address);
            ps.setInt(5, emp_id);
            
          
            ps.executeUpdate();
            System.out.println("Updated the values");

        } catch (Exception e) {
            System.out.println("Error occurred while updating the record:");
            e.printStackTrace();
        }
    }
}
