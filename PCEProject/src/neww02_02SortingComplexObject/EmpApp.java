package neww02_02SortingComplexObject;

import java.util.ArrayList;
import java.util.Collections;

public class EmpApp
{
	public static void main(String [] args)
	{
		Employee emp1 = new Employee("Kendel",101,150000);
		Employee emp2 = new Employee("Michel",202,200000);
		Employee emp3 = new Employee("Daniel",303,250000);
		
		ArrayList al = new ArrayList();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		System.out.println(al);
		
//		Collections.sort(al);   //Error
//		System.out.println(al);
		
	}
	
}
class Employee {
	String empname;
	int empid;
	int salary;
	 
	
	public Employee(String empname,int empid, int salary)
	{
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return empname;
	}
	
	public String toString()
	{
		return empname+" "+empid+" "+salary;		
	}
}