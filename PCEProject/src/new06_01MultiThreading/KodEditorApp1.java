package new06_01MultiThreading;

public class KodEditorApp1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Application started");

		Thread t1 = new Thread(new Typing());
		Thread t2 = new Thread(new SpellCheck());
		Thread t3 = new Thread(new saving());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Application Terminated");
	}
}

class Typing1 implements Runnable
{
	public void run()
	{
		System.out.println("Typing started");
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
		System.out.println("Typing Terminated");
		 
	}
}

class SpellCheck1 implements Runnable
{
	public void run()
	{
		System.out.println("Spell Check started");
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
		System.out.println("Spell Check Terminated");
		 
	}
}

class saving1 implements Runnable
{
	public void run()
	{
		System.out.println("Saving started");
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
		System.out.println("Saving Terminated");
	}
}

