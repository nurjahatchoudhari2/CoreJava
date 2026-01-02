package new02_01interfaces;

import java.util.Scanner;

public class Calculator {
	 
	public static void main(String[] args)
	{  
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1: ");
		int a = scan.nextInt();
		System.out.println("Enter number2: ");
		int b = scan.nextInt();
		
		duty(new AyushInfoTechh(a,b));
	}
	static void duty(KodCalci k)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Operator");
		String o = scan.next();
		char operator = o.charAt(0);
		switch(operator) {
			case '+':
				k.add();
				break;
			case '-':
				k.sub();
				break;
			case '*':
				k.mul();
				break;
			case '/':
				k.div();
				break;
				
		}
	
	}
}


class AyushInfoTechh implements KodCalci
{
	int a;
	int b;
	public AyushInfoTechh(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}
	public void add() 
	{
		System.out.println("Add : " + (a+b));
	}
	public void sub() {
		System.out.println("Sub : " + (a-b));		
	}
	public void mul() { 
		System.out.println("Mul : " + (a*b));
	}
	public void div() {
		System.out.println("Div : " + (a/b));	
	}
}
