package neww09_02JDBCSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 
public class PhoneDBsetData {
	public static void main(String[] args) throws Exception 
	{	
		String query = "insert into phone values (?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
		System.out.println("Connection Established Successfully");
	    
	    PreparedStatement pst = connection.prepareStatement(query);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter id");
	    int id = sc.nextInt();
	    
	    System.out.println("please enter brand name");
	    String brand = sc.next();
	    
	    
	    System.out.println("please enter price");
	    int price = sc.nextInt();
	    
	    pst.setInt(1,id);
	    pst.setString(2, brand);
	    pst.setInt(3, price);
	 
	
	    
	    pst.executeUpdate();
	    
	    System.out.println("Data Inserted Successfully");
	   
	    pst.close();
	    connection.close();
	    
	    System.out.println("Connection Closed....");
	    
	}

}
