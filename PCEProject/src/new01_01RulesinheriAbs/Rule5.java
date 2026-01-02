package new01_01RulesinheriAbs;

public class Rule5 {
	//Abstract class Component
	
	//an abstract class can have a all components which a normal class can have.
	//including instance variable, instance method, instance block, static variable , static methods, static block, constructor.
	
	
	public static void main(String[] args)
	{
		
	}
	public Rule5()
	{ 
		
	}
	static int a;
	
	static {
		a=10;
	}
	
	static void disp()
	{
		System.out.println(a);
	}
	
	int b;
	
	{
		b=20;
	}
	
	
	void disp2()
	{
		System.out.println(b);
	}

}