package com.employeeAssignment;

import java.sql.*;

public class Employee_CreateTable {

	public static void main(String[] args) {
		// create a table in database
		try {
			String url = "jdbc:mysql://localhost:3306/Employee";
			String password = "root";
			String username = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String query = "Create table employee_detail(emp_id int(5) primary key not null,name varchar(200) not null,designation varchar(200) not null, salary int(10) not null,address varchar(200) not null)";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			System.out.println("Created a table");

		} catch (Exception e) {
			System.out.println("Not created a table");
			System.out.println(e);
		}
	}

}
