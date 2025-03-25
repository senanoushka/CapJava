package many_to_many;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Student s1=new Student("Anoushka",3);
		Student s2=new Student("Rohit",2);
		
		Course c1=new Course("java",3);
		Course c2=new Course("python",4);
		Course c3=new Course("AIML",2);
		
		s1.addCourse(c1);   //passing reference of c1 to method addCourse
		s1.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c1);
		System.out.println(Arrays.toString(s1.arr)+" "+Arrays.toString(s2.arr));
		//course array stores reference of course not actual course name 

	}

}
