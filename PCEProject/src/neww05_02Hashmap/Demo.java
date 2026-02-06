package neww05_02Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100, 99);
		hm.put(50, 999);
		hm.put(150, 9999);
		hm.put(25, 99999);
		hm.put(75, 999999);
		hm.put(125, 9999999);
		
		System.out.println(hm);
		System.out.println("===========");
		
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collection c = hm.values();
		System.out.println("Values");
		Iterator itr1 = s.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}