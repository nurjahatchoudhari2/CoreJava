package new02_01multipleinheritncewithinterface;

public class CalcApp {

	public static void main(String[] args) {
		duty(new AyushInfoTechh());
	}
	static void duty(Calci2 c) {
		c.div();
		c.mul();
		c.sub();
		c.mod();
		c.add();
	}
}
class AyushInfoTechh extends Object implements Calci2
{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Div");
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		System.out.println("mod");
		
	}

	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}