package neww11_02DAYYJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.util.Scanner;


public class Orderupdateindbtables {
	public static void main(String [] args) 
	{
		Scanner scan = null;
		Connection connection = null;
		String sql1 = "insert into orderdetail values(105,?,?)";
		String sql2 = "update productdetail set quantity = quantity-? where product_id = ? ";
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;

		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Noor@0209");
			 
			connection.setAutoCommit(false);
			pst1 = connection.prepareStatement(sql1);
			pst2 = connection.prepareStatement(sql2);

			scan = new Scanner(System.in);
			System.out.println("Please product id");
			int productid = scan.nextInt();
			 
			System.out.println("Please quantity ");
			int quantity = scan.nextInt();
			pst1.setInt(1,productid);
			pst1.setInt(2,quantity);
			
			pst2.setInt(1,quantity);
			pst2.setInt(2,productid);
			
			pst1.executeUpdate();
			pst2.executeUpdate();
			
			connection.commit();
			connection.setAutoCommit(true);
			System.out.println("Successfully ordered!!");
			
		
		}catch(Exception e)
		{
			try {
				System.out.println("Error Occured ==== Don't Worry you money will be refunded withiin 24 hours!!");
				connection.rollback();
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
		}
		finally
		{
			try {
				scan.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
