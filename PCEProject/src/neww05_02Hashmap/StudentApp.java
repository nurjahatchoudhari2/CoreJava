package neww05_02Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;



public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("Noor", 21, "Female", "+917499562318", "noor@gmail.com", "O+", 5.1f, 65, "AIDS");
		Student s2 = new Student("Khus", 22, "Female", "+917378854347", "khushi@gmail.com", "B+", 5.3f, 61, "EE");
		Student s3 = new Student("Rehh", 21, "Male", "+918208411218", "rehaan@gmail.com", "B+", 5.6f, 67, "CSE");
		Student s4 = new Student("Nomu", 22, "Female", "+917499054505", "nomu@gmail.com", "AB-", 5.2f, 48, "IT");
		Student s5 = new Student("Dars", 21, "male", "+919130790472", "darshan@gmail.com", "A+", 5.6f, 67, "CTech");

		
		
		HashMap<Integer, Student> hs = new HashMap<>();
		
		hs.put(101, s1);
		hs.put(102, s2);
		hs.put(103, s3);
		hs.put(104, s4);
		hs.put(105, s5);
		
		System.out.println(hs);
		
		LinkedHashMap<Integer, Student> lhs = new LinkedHashMap();
		
		lhs.put(111, s1);
		lhs.put(112, s2);
		lhs.put(113, s3);
		lhs.put(114, s4);
		lhs.put(115, s5);
		
		System.out.println(lhs);
	}

}
