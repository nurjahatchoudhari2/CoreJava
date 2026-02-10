package neww09_02JDBCSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class PhonedbgetData {
	public static void main(String[] args) throws Exception 
	{	
		String query = "select * from phone";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
	    
	    Statement st = connection.createStatement();
	    
	    ResultSet rs = st.executeQuery(query);
	    
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
	    
	}

}


