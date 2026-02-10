package neww07_02JDBCoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDemooracle {
	public static void main(String[] args) throws Exception 
	{	
		//loading the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully");
		
		//Established the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLPDB", "system", "Noor@0209");
		System.out.println("Connection established");
		
		 
		
		
		 
		
		
	}

}
