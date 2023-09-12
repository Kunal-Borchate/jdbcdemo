package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface InsertValues 
{
	public static void main(String[] args) throws SQLException {
		
	Connection con	=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
	Statement st=con.createStatement();
	st.execute("insert into student values(1,'Kunal',23)");
	System.out.println("Values inserted successfully");
	}

}
