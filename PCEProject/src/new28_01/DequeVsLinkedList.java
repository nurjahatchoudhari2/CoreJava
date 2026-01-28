package new28_01;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeVsLinkedList {

	public static void main(String[] args) {
	
		
        LinkedList l1 = new LinkedList();
		long t3 = System.currentTimeMillis();		
		for(int i=0; i<50000000; i++)
		{
			l1.push(i);
		}
		long t4 = System.currentTimeMillis();

		ArrayDeque ad = new ArrayDeque();
		long t1 = System.currentTimeMillis();
		for(int i=0; i<50000000; i++)
		{
			ad.push(i);
		}
		long t2 = System.currentTimeMillis();
 
		
		System.out.println(t2-t1);
		System.out.println(t4-t3);


	
	
	
	}

}
