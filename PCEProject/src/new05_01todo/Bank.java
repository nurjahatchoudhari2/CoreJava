package new05_01todo;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Bank1 b1 = new Bank1();
		b1.Banking();
	}
}

class Bank1{
	void Banking()
	{
		ATM atm = new ATM();
	
	    try {
			atm.acceptInfo(); 
			atm.verify();
		
	    } catch (InvalidInputException e)
		{
			   System.out.println("Wrong Pin");
			   System.out.println("Attempt 2");
			   
			   try {
				   atm.acceptInfo();
				   atm.verify();
			   }
			   catch(InvalidInputException e1)
			   {
				   System.out.println("Wrong Pin");
				   System.out.println("Final Attempt");
				   
				   
				   try {
					   atm.acceptInfo();
					   atm.verify();
				   }
				   catch(InvalidInputException e2)
				   {
					   System.out.println("Your ATM id blocked for 24 HR");
					   
				   }
			   }
		  
			 
		   
		}
	}


}

class ATM
{
	int ACNO = 20231012;
	int Pass = 2233;
	int u_acno;
	int u_pass;
	
	void acceptInfo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		u_acno = scan.nextInt();
		System.out.println("Enter Password : ");
		u_pass = scan.nextInt();
		
	}
	void verify() throws InvalidInputException
	{
		if(ACNO == u_acno && Pass==u_pass)
		{
			System.out.println("Login successfully");
			 
		}
		
		else
		{
			InvalidInputException e = new InvalidInputException();
			throw e;
		
		}
	}
}

class InvalidInputException extends Exception
{
	public String getMessage()
	{
		return "Wrong pin";
		
	}
	
}