package new27_01Dayy;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String [] args)
	{
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(10);
		System.out.println("List 1 => "+arr);
		
		ArrayList arr1 = new ArrayList();
		arr1.add(100);
		arr1.add(200);
		arr1.add(300);
		System.out.println("List 2 => "+arr1);
		
		arr.addAll(arr1);
		System.out.println("List 1 => "+arr);
		
		arr.add(1,15);
		System.out.println("List 1 => "+arr);
		
		System.out.println(arr.contains(10));
		System.out.println(arr.containsAll(arr1));
		
		arr.remove(1);
		System.out.println("List 1 => "+arr);
		
		arr.removeAll(arr1);
		System.out.println("List 1 => "+arr);
		 
		
	}
}
