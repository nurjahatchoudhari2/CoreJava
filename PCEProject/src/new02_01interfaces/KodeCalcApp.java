package new02_01interfaces;

import java.util.Scanner;

public class KodeCalcApp {

	public static void main(String[] args)
	{
		duty(new RehSoft());
		duty(new AyushInfoTech());

	}
	static void duty(KodCalci k)
	{
		k.add();
		k.sub();
		k.mul();
		k.div();
	}
}

class RehSoft implements KodCalci
{	
	public void add() 
	{
		int a = 20;
		int b = 10;
		int c = a+b;
		System.out.println("Add : " + c);
	}
	public void sub() {
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println("Sub : " + c);
	}
	public void mul() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("Mul : " + c);
	}
 
	public void div() {
		int a = 10;
		int b = 20;
		int c = a/b;
		System.out.println("Div : " + c);
	}
}

class AyushInfoTech implements KodCalci
{
	Scanner scan  = new Scanner(System.in);
	public void add() 
	{
		System.out.println("Enter number1 to add : ");
		int a = scan.nextInt();
		System.out.println("Enter number2 to add : ");
		int b = scan.nextInt();
		System.out.println("Add : " + (a+b));
		
		
	}
	public void sub() {
		System.out.println("Enter number1 to Sub : ");
		int a = scan.nextInt();
		System.out.println("Enter number2 to Sub : ");
		int b = scan.nextInt();
		System.out.println("Add : " + (a-b));
		
	}
	public void mul() { 
		System.out.println("Enter number1 to Mul : ");
		int a = scan.nextInt();
		System.out.println("Enter number2 to Mul : ");
		int b = scan.nextInt();
		System.out.println("Add : " + (a*b));
	}
	public void div() {
		System.out.println("Enter number1 to Div : ");
		int a = scan.nextInt();
		System.out.println("Enter number2 to Div : ");
		int b = scan.nextInt();
		System.out.println("Add : " + (a/b));
		
	}
}