package neww06_02JDBCmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDemo2 {
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
	    //statement.executeUpdate("create table Phone(id int primary key,brand varchar(20),price int)");  //already executed
		//statement.executeUpdate("insert into phone values(101,'samsung',100000)");    //already executed
		//statement.executeUpdate("insert into phone values(102,'vivo',120000)"); //already executed
		
        ResultSet rs = statement.executeQuery("select * from phone");
	
        
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}	
	}
}