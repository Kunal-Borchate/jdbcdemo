package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValuesEmp {

	public static void main(String[] args) throws SQLException {
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Data@_123");
		 Statement st=con.createStatement();
		 st.execute("insert into employee values(1,'Smith','Manager')");
		 st.execute("insert into employee values(2,'Allen','Developer')");
		 st.execute("insert into employee values(3,'Conorad','Sailor')");
		 st.execute("insert into employee values(4,'Taylor','CEO')");
		 st.execute("insert into employee values(5,'Clay','Student')");
		 System.out.println("Values are inserted into employee table");
		 
	}
}
