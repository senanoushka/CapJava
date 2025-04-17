package sets;

import java.util.*;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> student=new HashSet<>();
		student.add(new Student(123, "Anoushka"));
		student.add(new Student(456, "Raj"));
		student.add(new Student(123, "Ayush"));
		student.add(new Student(1234, "Raj"));
		student.add(new Student(1234, "Raj"));
		
		System.out.println(student);
	}
}
