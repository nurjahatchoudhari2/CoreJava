package neww05_02Hashmap;

public class Student 
{
	String name;
	int age;
	String gender;
	String phonenumber;
	String email;
	String bloodgroup;
	float height;
	float weight;
	String Department;
	
	public Student(String name,int age,String gender,String phonenumber,String email,String bloodgroup,float height,float weight,String Department)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.email = email;
        this.bloodgroup = bloodgroup;
		this.height = height;
		this.weight = weight;
		this.Department = Department;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
 
	public String getPhonenumber() {
		return phonenumber;
	}
 
	public String getEmail() {
		return email;
	}
 

	public String getBloodgroup() {
		return bloodgroup;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
 
	public String getDepartment() {
		return Department;
	}

	public String toString()
	{
		return name+" "+age+" "+gender+" "+phonenumber+" "+email+" "+bloodgroup+" "+height+" "+weight+" "+Department;
	}
}