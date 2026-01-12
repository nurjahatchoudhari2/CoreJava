package new06_01MultiThreading;

public class Demo {

	public static void main(String[] args) 
	{
		
		Thread t = Thread.currentThread();
		t.setName("PCE");
	    t.setPriority(7);
		System.out.println(t);
		duty();              //only one thread moves in the whole program.
	}
	static void duty()
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
	}
}