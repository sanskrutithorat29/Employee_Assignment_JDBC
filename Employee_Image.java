package com.employeeAssignment;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee_Image {
	public static void main(String[] args) {
		//insert images in database
				try {
					String url = "jdbc:mysql://localhost:3306/Employee";
					String password="root";
					String username="root";
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url, username, password);
					String q="insert into image(pic) values (?)";
					
				PreparedStatement ps=con.prepareStatement(q);
				
				FileInputStream fs=new FileInputStream("D:\\Fusion Institute\\JDBC_Code\\src\\com\\employeeAssignment\\doremon.jpg");
				ps.setBinaryStream(1, fs, fs.available());
				ps.executeUpdate();
				
				System.out.println("Inserted the image");
				
			con.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
}
