package new27_01Dayy;

import java.util.ArrayList;

public class Retainallandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.set(1, 15);  //override
		System.out.println("List 1 => "+arr);
		
		ArrayList arr1 = new ArrayList();
		arr1.add(10);
		arr1.add(30);
		arr1.add(300);
		arr1.add(400);
		arr1.add(500);
		
		System.out.println("List 2 => "+arr1);
		
		arr.retainAll(arr1);
		System.out.println("List 1 => "+arr);
		 

	}

}
