package com.employeeAssignment;

import java.sql.DriverManager;
import java.sql.*;

public class Employee_Connection {

	public static void main(String[] args) {
		// check the connection
		try {
			String url = "jdbc:mysql://localhost:3306/Employee";
			String password = "root";
			String username = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is open");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
