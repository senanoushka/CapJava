package oops;

public class Main {
	public static void main(String[] args) {
		/**
		Student s1=new Student();  //Student() calls constructor
		System.out.println(s1.id+" "+s1.name+" "+s1.college+" "+s1.marks);
		s1.study();
		System.out.println("------------------------------");
		
		s1.name="Anoushka";
		s1.id=1;
		s1.college="IEM";
		s1.marks=93.2;
		System.out.println(s1.id+" "+s1.name+" "+s1.college+" "+s1.marks);
		s1.study();
		System.out.println("------------------------------"); 
		
		Student s2=new Student();   //Student() calls constructor
		s2.name="Rohit";
		s2.id=2;
		s2.college="Capgemini";
		s2.marks=83.2;
		System.out.println(s2.id+" "+s2.name+" "+s2.college+" "+s2.marks);
		s2.study();
		
		//new keyword creates memory block for object creation and assignes it to s1/s2
		//Constructor loads non static members into the object, assigns default values
		
		**/
		Student s1=new Student(1,"Anoushka","IEM", 90.2); 
		System.out.println(s1.id+" "+s1.name+" "+s1.college+" "+s1.marks);
		Student s2=new Student(2,"Sen"); 
		System.out.println(s2.id+" "+s2.name+" "+s2.college+" "+s2.marks);
		Student s3=new Student(3, "Rohit","Capgem");
		System.out.println(s3.id+" "+s3.name+" "+s3.college+" "+s3.marks); 
		Student s4=new Student(3, 74.8);
		System.out.println(s4.id+" "+s4.name+" "+s4.college+" "+s4.marks); 
		System.out.println("-----------------------------");
		Employee e1=new Employee();
		System.out.println(e1.id+" "+e1.name+" "+e1.company+" "+e1.salary);
		Employee e2=new Employee("Aman",450000);
		System.out.println(e2.id+" "+e2.name+" "+e2.company+" "+e2.salary);
		Employee e3=new Employee(12,"Anamika","Deloiite",2000000);
		System.out.println(e1.id+" "+e1.name+" "+e1.company+" "+e1.salary);
	}
}
