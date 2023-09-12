package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws SQLException {
		Connection con=Helper.getC();
		Scanner sc=new Scanner(System.in);
		
		
//		PreparedStatement ps = con.prepareStatement("create table user(id int,name varchar(10),email varchar(20),password varchar(20),mobno varchar(10))");
//		ps.execute();
//		System.out.println("Table created successfully");
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		System.out.println("Enter mobile number");
		long mobno=sc.nextLong();
		
		PreparedStatement ps1=con.prepareStatement("insert into user(id,name,email,password,mobno) values(?,?,?,?,?)");
		
		ps1.setInt(1, id);
		ps1.setString(2, name);
		ps1.setString(3, email);
		ps1.setString(4, password);
		ps1.setLong(5, mobno);
		ps1.execute();
		System.out.println("Values saved successfully");
	}
}
