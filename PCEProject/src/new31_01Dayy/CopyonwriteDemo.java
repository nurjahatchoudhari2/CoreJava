package new31_01Dayy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwriteDemo {

	public static void main(String[] args) 
	{
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
        Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
			al.add(50);
		}	
		
		System.out.println();
		
		
		System.out.println(al);
		
		
		Iterator itr1 = al.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next() +" ");
		}
	}
}