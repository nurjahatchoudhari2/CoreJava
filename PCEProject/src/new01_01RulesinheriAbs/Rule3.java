package new01_01RulesinheriAbs;

public class Rule3 {
	public static void main(String[] args) {
		//Sparrow s = new Sparrow();//error
	}
}

abstract class Birdd
{
	abstract void eat();       
	abstract void fly();
}

//class crow extends Bird1           //error // you have to override every abstract method of parent class in the child class.
//{
//	void fly(){
		//
//	}
//}

	
 
//Rule no.3
//A child class inheriting from abstract class must implement or override the abstract methods present in parent class.