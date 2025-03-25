package methodChaining;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Anoushka");
		Student s2=new Student();
		s2.setName("Rohit");
		
		System.out.println(s1);
		System.out.println(s1.setName("Anoushka"));
		
		System.out.println(s2);
		System.out.println(s2.setName("Rohit"));
		
		Student s=new Student();
		s.setId(1).setName("Raj").display();   //method chaining

	}

}
