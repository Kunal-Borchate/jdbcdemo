package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable2 
{
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Statement st=con.createStatement();
		st.execute("create table employee(id int,name varchar(20),role varchar(10))");
		System.out.println("Table Of Emp created successfully");
	}

}
