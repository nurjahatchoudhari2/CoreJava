package neww06_02JDBCmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception 
	{	
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		//Esablishing the Conneciton
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
		System.out.println("Connection established");
		
		//create statemement
		Statement statement = connection.createStatement();
		
		//execute the query
		ResultSet rs = statement.executeQuery("select * from student");
	
		
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
	}

}
