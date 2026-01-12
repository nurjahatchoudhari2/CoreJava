package new05_01exceptioninmethods;

public class Test1
{
	void alpha()
	{
		System.out.println("Connection 1 established");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("Connection 1 established");
	}
}