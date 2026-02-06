package neww02_02SortingComplexObject;

import java.util.ArrayList;
import java.util.Collections;

public class SortCompObj {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
//		al.add("ARSH");   //Error
//		al.add(10.5);
//		al.add(true);
		System.out.println(al);
		

		
		Collections.sort(al);
		System.out.println(al);
		
		

	}

}
