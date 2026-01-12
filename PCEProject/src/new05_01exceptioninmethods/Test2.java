package new05_01exceptioninmethods;

public class Test2 {
	void beta()
	{
		System.out.println("Connection 2 established");
		Test3 t3 = new Test3();
		try
		{
		   t3.gamma();
	    }
	    catch (Exception e)
		{
		     System.out.println("exception handle by beta");
		 
		}	
	
		System.out.println("Connection 2 established");
	}

}
