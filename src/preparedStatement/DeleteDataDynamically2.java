package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically2 {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		PreparedStatement ps=con.prepareStatement("delete from user where name=?");
		ps.setString(1, name);
		ps.executeUpdate();
		System.out.println("Data Deleted Successfully");
		
		
	}

}
