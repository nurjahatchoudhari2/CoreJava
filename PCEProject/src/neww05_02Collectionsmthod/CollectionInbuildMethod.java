package neww05_02Collectionsmthod;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionInbuildMethod {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 75));
		System.out.println(Collections.binarySearch(al, 999));

		Collections.rotate(al, 2);
		System.out.println(al);		
	}
}