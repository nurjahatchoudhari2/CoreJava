package new01_01RulesinheriAbs;

public class Rule1 {

	public static void main(String[] args) {
		//Sparrow s = new Sparrow();//error
	}
}

abstract class Bird1
{
	abstract void eat();        //abstract method
	void fly()                  //concrete method
	{
		System.out.println("Flying");
	}
}

	
//rule no.1
//we can not instantiate an abstract class.