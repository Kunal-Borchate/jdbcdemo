package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicCrudOperation {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		PreparedStatement ps;
		
		
		for(;;)
		{
			System.out.println(" 1)Insert values  2)Update 3)Fetch All 4) Fetch by Id 6)Delete ");
			switch(sc.nextInt())
			{
			  case 1:
			  {
				  ps=con.prepareStatement("insert into user(id,name,email,password,mobno) values(?,?,?,?,?)  ");
				  System.out.println("Enter User Id");
				  int id=sc.nextInt();
				  System.out.println("Enter User Name");
				  String name=sc.next();
				  System.out.println("Enter Email");
				  String email=sc.next();
				  System.out.println("Enter user password");
				  String password=sc.next();
				  System.out.println("Enter user mobile number");
				  long mobno=sc.nextLong();
				  ps.setInt(1, id);
				  ps.setString(2, name);
				  ps.setString(3, email);
				  ps.setString(4, password);
				  ps.setLong(5, mobno);
				  ps.execute();
				  System.out.println("Data inserted successfully");
				  break;
			  
			  
			  }
			  case 2:
			  {
				  ps=con.prepareStatement("update user set name=? where id=?");
				  System.out.println("Enter user id to update");
				  int id=sc.nextInt();
			      System.out.println("Enter new name");
				  String name=sc.next();
				  ps.setString(1, name);
				  ps.setInt(2, id);
				  ps.execute();
				  System.out.println("Data updated successfully");
				  break;
				  
			  }
			  case 3:
			  {
				  ps=con.prepareStatement("select * from user");
				  ResultSet rs=ps.executeQuery();
				  rs.next();
				  System.out.println(rs.getInt(1));
				  System.out.println(rs.getString(2));
				  System.out.println(rs.getString(3));
				  System.out.println(rs.getString(4));
				  System.out.println(rs.getLong(5));
				  break;
			  }
			  case 4:
			  {
				  ps=con.prepareStatement("select * from user where id=?");
				  System.out.println("Enter the id to fetch data");
				  int id=sc.nextInt();
				  ps.setInt(1, id);
				  ResultSet rs=ps.executeQuery();
				  if(rs.next())
				  {
					  System.out.println(rs.getInt(1));
					  System.out.println(rs.getString(2));
					  System.out.println(rs.getString(3));
					  System.out.println(rs.getString(4));
					  System.out.println(rs.getLong(5));
					  break;
				  }
				  else
				  {
					  System.out.println("Invalid id");
					  break;
				  }
				  

				  
			  }
			  
			
			}
			
		}
	}
}
