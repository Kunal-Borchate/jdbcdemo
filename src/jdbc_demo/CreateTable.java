package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) throws SQLException {
		
		/*
		 * After 1.4 registering the driver mannualy is not mandatory
		 */
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Statement st=con.createStatement();
		st.execute("create table student(id int,name varchar(20),age int)");
		System.out.println("table created successfully");
		
		
		
	}

}
