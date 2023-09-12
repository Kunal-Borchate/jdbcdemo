package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDataDynamically {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to fetch the data");
		int id=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		PreparedStatement ps=con.prepareStatement("select * from user where id=?");
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getLong(5));
		}
		else
		{
			System.out.println("no user found -invalid id");
		}
		
	}
}
