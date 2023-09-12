package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValues {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		
		Statement st=con.createStatement();
		
		
		
		st.execute("update student set name='vinayak' where id=2");
		
		System.out.println("Data updated successfully");
	}
}
