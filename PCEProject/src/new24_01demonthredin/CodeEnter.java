package new24_01demonthredin;

public  class CodeEnter extends Thread{
	public void run()
	{
    	 String tname = Thread.currentThread().getName();
    	 if(tname.equals("Type"))
    	 {
    		 typing();
   
    	 }
    	 else if (tname.equals("Spellcheck"))
    	{
    		 spellcheck();
    	}
    	 else {
    		 saving();
    	 }
 	 }

    void typing() 
	{ 
		for(int i =0; i<10;i++)
		{
			System.out.println("Typing----------");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}		 
	}
	
	void spellcheck()
	{
		for(; ;)
		{
			System.out.println("Spell Check----------");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void saving()
	{ 
		for(; ;)
		{
			System.out.println("Saving----------");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	 

		 
}
