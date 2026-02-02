package new31_01Dayy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoTest 
{
	public static void main(String [] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
//		for (int i = 0; i < al.size(); i++) {
//			System.out.print(al.get(i) + " ");
//			al.add(i);
//		}
		
		
		
//in the above program we use two things read and write(add) ========= two threads causes a issues, this is the problem.
//so here we use Iterator !!
		
// while reading the content in this structure concurrently modification to the structure is happen by writing the data into the structure.
//for loops are not designing to identify the structural modifications that is happening concurrently.
//while reading the data from the structure Iterators are cable of identifying this concurrent modifications and can stop reading by generating concurrent modification exception.
//because iterators are cable of identifying concurrent modification and are design to fail in performing reading operation iterators are also called as fail fast.	
 		Iterator i = al.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
			al.add(i);
		}
		
		
		//if reading should happen without generating an exception then instead of using array we have to make use of copy on right arraylist.
		//in general instead of classes present in java.util package we have to mak euse of classes present in javs.util.concurrent package.


		
		
	}
}