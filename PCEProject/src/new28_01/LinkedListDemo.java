package new28_01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String [] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add(50);
		l1.add(150);
		l1.add(99);
		l1.add(25);
		l1.add(1,99);
		System.out.println(l1);
		System.out.println(l1.get(2));

		
		LinkedList l2 = new LinkedList();
		l2.push(10);
		l2.push(20);
		l2.push(30);
		System.out.println(l2);
		
		l2.pop();
		System.out.println(l2);
		System.out.println(l2.peek());
		System.out.println(l2.peekFirst());
		System.out.println(l2.peekLast());
		System.out.println(l2.poll());
		System.out.println(l2);
		
	}
	
}
