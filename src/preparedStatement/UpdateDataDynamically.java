package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id to update");
		int id=sc.nextInt();
		System.out.println("Enter new name");
		String name=sc.next();
		
		PreparedStatement ps=con.prepareStatement("update user set name=? where id=?");
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.execute();
		System.out.println("Data updated successfully");
		
		
	}
}
