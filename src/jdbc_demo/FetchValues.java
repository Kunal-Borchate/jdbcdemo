package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchValues {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student where id=1");
		
		boolean b=rs.next();
		System.out.println(b);
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		
		boolean b1=rs.next();
		System.out.println(b1);
	}
}
