package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchValues2 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student where id =3");
		rs.next();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		
		ResultSet rs1=st.executeQuery("select * from student where id=4");
		rs1.next();
		System.out.println(rs1.getInt(1));
		System.out.println(rs1.getString(2));
		System.out.println(rs1.getInt(3));
		
	}

}
