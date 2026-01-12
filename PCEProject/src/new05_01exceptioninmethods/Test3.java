package new05_01exceptioninmethods;

import java.util.Scanner;

public class Test3 {

	void gamma() throws Exception
	{ 
		 
		System.out.println("Connection 3 established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1:");
		int a = scan.nextInt();
		System.out.println("Enter num 2:");
		int b = scan.nextInt();
		
		int c = a/b;
		System.out.println(c);
	  
		
		System.out.println("Connection 3 established");
	}
}
