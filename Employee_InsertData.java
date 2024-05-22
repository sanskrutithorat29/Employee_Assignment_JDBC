package com.employeeAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_InsertData {
//insert values dynamically
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;

		try {
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

			String url = "jdbc:mysql://localhost:3306/Employee";
			String username = "root";
			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);

			String query = "INSERT INTO employee_detail (emp_id, name, designation, salary, address) VALUES (?, ?, ?, ?, ?)";
			ps = con.prepareStatement(query);

			ps.setInt(1, emp_id);
			ps.setString(2, name);
			ps.setString(3, designation);
			ps.setInt(4, salary);
			ps.setString(5, address);

			ps.executeUpdate();
			System.out.println("Inserted the values");
		} catch (Exception e) {
			System.out.println("Not inserted");
			e.printStackTrace();
		}
	}
}
