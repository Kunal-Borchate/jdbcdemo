package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root", "Data@_123");
		PreparedStatement ps=con.prepareStatement("delete from user where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to delete record");
		int id=sc.nextInt();
		
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Data Deleted Successfully");
	}
}
