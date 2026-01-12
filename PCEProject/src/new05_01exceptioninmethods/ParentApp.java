package new05_01exceptioninmethods;

import java.sql.SQLException;

//Rule1:
//public class ParentApp {
//
//	public static void main(String[] args) {
//		 
//
//	}
//}
//class Parent
//{
//	void disp() throws SQLException
//	{
//		 
//	}
//}
//
//class child extends Parent{
//	
//	void disp() throws SQLException  //if you want to throw exception throw the same exception as parent or don't throw exception                     
//	{
//		
//	}
//}

//Rule2:
//public class ParentApp1 {
//
//	public static void main(String[] args) {             //here we throw parent to parent and child to child;
//		 
//
//	}
//}
//class Parent1
//{
//	void disp() throws RuntimeException
//	{
//		 
//	}
//}
//
//class child1 extends Parent1{
//	
//	void disp() throws ArithemeticException                       
//	{
//		
//	}
//}

//Rule3:
//public class ParentApp1 {
//
//	public static void main(String[] args) {
//		 
//
//	}
//}
//class Parent1
//{
//	void disp() throws SQLException                    //parent throw whatever exception it want but child must be throw only runtime exception.
//	{
//		 
//	}
//}
//
//class child1 extends Parent1{
//	
//	void disp() throws ArithemeticException                       
//	{
//		
//	}
//}

