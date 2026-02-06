package neww04_02Dayy;

import java.util.ArrayList;
import java.util.Collections;

//Sorting Complex Object Using-----by implementing Comparable interface.
public class EmpApp 
{
	public static void main(String [] args)
	{
		Emp e1 = new Emp(303,"Noorr",800);
		Emp e2 = new Emp(404,"Nomuu",750);
		Emp e3 = new Emp(101,"Darsh",690);
		Emp e4 = new Emp(202,"Khush",950);
		
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
class Emp implements Comparable
{
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int sal){
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
	//Ascending on the basis of id
	public int compareTo(Object o) {
		if(this.id>((Emp)(o)).id){
			return 1;
		}
		else {
			return -1;
		}		
	}
}