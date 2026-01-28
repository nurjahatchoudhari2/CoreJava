package new28_01;

import java.util.ArrayDeque;

public class ArrayDequeDemo 
{
	public static void main(String [] args )
	{
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.addFirst(125);
		ad.add(1);
		ad.addFirst(20);
		System.out.println(ad);
		
	}

}
