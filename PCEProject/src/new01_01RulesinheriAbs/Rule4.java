package new01_01RulesinheriAbs;

public class Rule4 {
	public static void main(String[] args) {
		//Sparrow s = new Sparrow();//error
		duty(new VegCrow());
		duty(new nonvegCroww());
	}
	static void duty(Bird2 b)
	{
		b.eat();
		
		b.fly();
	}
}

abstract class Bird2
{
	public Bird2()
	{
		
	}
	abstract void eat();        //abstract method
	abstract void fly();
} 

abstract class croww extends Bird2{
	void fly()
	{
		System.out.println("Flying");
	}
}
class VegCrow extends croww
{
	void eat()
	{
		//code
		System.out.println("eat grains");
	}
	
}
class nonvegCroww extends croww
{
	void eat()
	{
		System.out.println("eat chik");
		//code
	}
}


//Rule no.4
// if a child class only partially implement the method of an abstract class the child class itself should also be declared as abstract.