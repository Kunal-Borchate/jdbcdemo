package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDriver {

	

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		Statement st=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Save Student 2) View Student 3)Update Student 4)Delete Student" );
		int ip=sc.nextInt();
		
		switch (ip) {
		case 1:{
			
			st.execute("insert into student values(2,'Yash',20)");
			System.out.println("Data Saved Successfully");
			
			
			break;
		}
		case 2:{
			ResultSet rs=st.executeQuery("Select * from student where id=2");
			rs.next();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			break;
		}
		case 3:{
			st.executeUpdate("update student set name='vinayak' where id=2");
			System.out.println("Data updated successfully");
			break;
		    
		}
		case 4:{
			 st.execute("delete from student where id=2");
		     System.out.println("Data deleted succcessfully");
		     break;
		}
		
		

		default:
			System.out.println("invalid input");
			break;
		}
	}
}
