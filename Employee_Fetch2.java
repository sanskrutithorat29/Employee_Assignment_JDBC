package com.employeeAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee_Fetch2 {

	public static void main(String args[])
	//sorting elements using collection
	{
		try {
			String url = "jdbc:mysql://localhost:3306/Employee";
			String password = "root";
			String username = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String query = "select * from employee_detail";
			Statement st = con.createStatement();
			st.executeQuery(query);

			

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}