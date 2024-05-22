package com.employeeAssignment;
import java.sql.*;
import java.util.*;

public class Employee_Fetch1{
	public static void main(String args[])
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

			System.out.println("Fetched the items: ");
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"	 "+rs.getString(2)+"	 "+rs.getString(3)+"	 "+rs.getInt(4)+"	 "+rs.getString(5));
			}

			

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

