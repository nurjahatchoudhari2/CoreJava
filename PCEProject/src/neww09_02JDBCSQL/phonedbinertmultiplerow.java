package neww09_02JDBCSQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.util.Scanner;

 

public class phonedbinertmultiplerow {
	public static void main(String[] args) throws Exception {	
	String query1 = "insert into phone values (108,'google',14800)";
	String query2 = "insert into phone values (109,'motorola',45782)";
	String query3 = "insert into phone values (110,'readme',74011)";

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
	System.out.println("Connection Established Successfully");

    
	Statement st = connection.createStatement();

    st.addBatch(query1);
    st.addBatch(query2);
    st.addBatch(query3);
    st.executeBatch();

    
    
    System.out.println("Data Inserted Successfully");
    connection.close();
    System.out.println("Connection Closed....");
    
}
}

