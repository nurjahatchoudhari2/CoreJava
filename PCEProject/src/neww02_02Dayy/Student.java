package neww02_02Dayy;

public class Student
{
	String name;
	int age;
	String gender;
	String mobno;

	public Student(String name, int age, String gender, String mobno)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobno = mobno;
	}
	
	public String toString()
	{
		return "NOOR";
	}
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getMobNo()
	{
		return mobno;
	}
}
