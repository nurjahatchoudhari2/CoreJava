package new05_01exceptioninmethods;

public class StackOverflow {

	public static void main(String[] args) {
		disp();

	}
	static void disp()
	{
		System.out.println("HELLOOOOOO");        //error stack over flow.
		try {
			disp();
		}
		catch(Error e)
		{
			System.out.println("Error handle");
		}
	}
}
