package new06_01MultiThreading;

public class KodEditorApp1 {

	public static void main(String[] args) {
		

		Thread t1 = new Thread(new Typing());
		Thread t2 = new Thread(new SpellCheck( ));
		Thread t3 = new Thread(new saving());
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}

class Typing1 implements Runnable
{
	public void run()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("Typing----------");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		 
	}
}

class SpellCheck1 implements Runnable
{
	public void run()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("Spell Check----------");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		 
	}
}

class saving1 implements Runnable
{
	public void run()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("Saving----------");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

