package neww04_02Dayy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Sorting Complex Object Using-----by implementing Comparator interface.
public class EmpApp1 
{
	public static void main(String [] args)
	{
		Emp1 e1 = new Emp1(303,"Noorr",800);
		Emp1 e2 = new Emp1(404,"Nomuu",750);
		Emp1 e3 = new Emp1(101,"Darsh",690);
		Emp1 e4 = new Emp1(202,"Khush",950);
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);	
	}
}

 
class Emp1 implements Comparator
{
	int id;
	String name;
	int salary;
	
	public Emp1(int id, String name, int sal){
		super();
		this.id = id;
		this.name = name;
		this.salary = sal;	
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;	
	}
	public int getSal() {
		return salary;
		
	}
	public String toString(){
		return id+" "+name+" "+salary+" ";	
	}
 

	@Override
	public int compare(Object o1, Object o2) {
		if(((Emp1)(o1)).id>((Emp1)(o2)).id)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	 
}