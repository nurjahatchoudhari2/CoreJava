package new05_01exceptioninmethods;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.banking();	
	}
}

class Bank{
	void banking()
	{
		System.out.println("Bank connection established");
		ATM card = new ATM();
		try {
			card.Transaction();
		} catch (Exception e) { 
			System.out.println("Info Receive by the bank, your amount will be refunded within 24 hr");
		}
		finally {
			System.out.println("Bank connection Terminated");
		}   
	}	
}

class ATM{
	void Transaction() throws Exception
	{
		try {
		System.out.println("ATM conncetion establish");
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter num 1:");
    	int a = scan.nextInt();
		System.out.println("Enter num 2:");
		int b = scan.nextInt();	
		int c = a/b;
		System.out.println(c);			 
		}
    	catch(Exception e)
	    {
    		System.out.println("exception handled by ATM");
    		throw e;
   	    }
	    finally {
	    	   System.out.println("ATM connection terminated");
	  		 
	    } 
	}
}
