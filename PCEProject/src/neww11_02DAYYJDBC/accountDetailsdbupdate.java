package neww11_02DAYYJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class accountDetailsdbupdate {
	public static void main(String [] args) 
	{
		Scanner scan = null;
		Connection connection = null;
		String sql1 = "update account set balance = balance-? where acc_no = ?";
		String sql2 = "update account set balance = balance+? where acc_no = ? ";
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;

		try {
 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountdetails", "root", "Noor@0209");
			
			connection.setAutoCommit(false);
			pst1 = connection.prepareStatement(sql1);
			pst2 = connection.prepareStatement(sql2);

			scan = new Scanner(System.in);
			System.out.println("Please enter you accno");
			int u_acc = scan.nextInt();
			System.out.println("Please enter Receiver accno");
			int r_acc = scan.nextInt();
			System.out.println("Please enter amunt to sent");
			int s_amount = scan.nextInt();
			
			pst1.setInt(1,s_amount);
			pst1.setInt(2,u_acc);
			
			pst2.setInt(1,s_amount);
			pst2.setInt(2,r_acc);
			
			pst1.executeUpdate();
			pst2.executeUpdate();
			
			connection.commit();
			connection.setAutoCommit(true);
			System.out.println("Successfully transferd!!");
			
		
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
