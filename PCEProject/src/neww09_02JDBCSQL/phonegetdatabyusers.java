package neww09_02JDBCSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class phonegetdatabyusers {
	public static void main(String[] args) throws Exception 
	{	
		String query = "select * from phone where id = ?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
		System.out.println("Connection Established Successfully");
	    
	    PreparedStatement pst = connection.prepareStatement(query);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter id");
	    int id = sc.nextInt();
	    
	    pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		 
	    pst.close();	
	}
}