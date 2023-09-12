package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesDynamically {

	public static void main(String[] args) throws SQLException {
		
		Connection con=Helper.getC();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		PreparedStatement ps=con.prepareStatement("insert into student(id,name,age) values(?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.execute();
		System.out.println("Data Saved Successfully");
		
		
	}
}
