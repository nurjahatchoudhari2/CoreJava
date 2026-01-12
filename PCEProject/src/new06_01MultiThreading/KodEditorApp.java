package new06_01MultiThreading;

public class KodEditorApp
{
	public static void main(String[] args) 
	{
		Typing t1 = new Typing();
		SpellCheck t2 = new SpellCheck();
		saving t3 = new saving();
		
		t1.start();
		t2.start();
		t3.start();

	}
}

class Typing extends Thread
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

class SpellCheck extends Thread
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

class saving extends Thread
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
