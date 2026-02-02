package new31_01Sortingobject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class SortingtObject 
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
		
		System.out.println(al);
		//if you want to sort the data use sort method.
		Collections.sort(al);
		System.out.println(al);
		
		
		System.out.println("========================");
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
       System.out.println(ts);
       //Sorted already/no need to Sort.
       
       
       System.out.println("===========================");
 
       ArrayDeque ad = new ArrayDeque();
       ad.add(100);
       ad.add(50);
       ad.add(150);
       ad.add(25);
       ad.add(75);
       ad.add(125);
       ad.add(175);
       System.out.println(ad);
       
       //Collections.sort(ad);      
       //you can not use the sort method in Queue.
       //so use sort method using arraylist.
       ArrayList al1 = new ArrayList();
       al1.addAll(ad);
       Collections.sort(al1);
       System.out.println(al1);
	
       System.out.println("=============================");
       
       
       
	}

}
