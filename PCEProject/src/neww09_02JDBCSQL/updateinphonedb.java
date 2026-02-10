package neww09_02JDBCSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class updateinphonedb
{
	public static void main(String[] args) throws Exception 
	{	
		String query = "update phone set brand = ? where id =?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
		System.out.println("Connection Established Successfully");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter id ");
	    int id = sc.nextInt();
		    
	    System.out.println("update brand name");
	    String brand = sc.next();
		    	   
	    PreparedStatement pst = con.prepareStatement(query);
	    
	    pst.setString(1, brand);
	    pst.setInt(2, id);  
		
     	pst.executeUpdate();
     	
     	System.out.println("Updated successfully");
	
	    pst.close();	
	    con.close();
	}   
}