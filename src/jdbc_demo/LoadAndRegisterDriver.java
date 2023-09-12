package jdbc_demo;

public class LoadAndRegisterDriver 
{
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //url of jdbc driver
		System.out.println("driver registered successfully");
	}

}
