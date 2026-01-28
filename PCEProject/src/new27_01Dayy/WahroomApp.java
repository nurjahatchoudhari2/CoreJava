package new27_01Dayy;

public class WahroomApp {
	public static void main(String[] args) throws InterruptedException
	{
		washroom w = new washroom();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("Thor");
		t2.setName("loki");
		t3.setName("Hulk");
		
		t1.start();
		t2.start();
        t3.start();
		 
		
	}

}

class washroom implements Runnable
{
	synchronized public void run()
	{
		try
		{
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " is enter in washroom");
			Thread.sleep(3000);
			System.out.println(tName + " is using in washroom");
			Thread.sleep(3000);
			System.out.println(tName + " is exit in washroom");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
