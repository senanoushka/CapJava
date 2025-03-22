package oops;

public class Student {
	int id;
	String name;
	String college;
	double marks;
	
	/**
	//constructor overloading
	public Student() {
		System.out.println("Student constructor called");
	}
	public Student(int id) {
		this.id=id;
	}
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Student(int id, double marks) {
		this.id=id;
		this.marks=marks;
	}
	public Student(int x, String n, String c, double m) {
		id=x;
		name=n;
		college=c;
		marks=m;
	}
	public void study() {
		System.out.println(name+" is Reading");
	}
	**/
	
	//Constructor Chaining
	public Student() {
		System.out.println("Student constructor called");
	}
	public Student(int id) {
		this.id=id;
	}
	public Student(int id, String name) {
		this(id);
		this.name=name;
	}
	public Student(int id, String name, String college) {
		this(id, name);
		this.college=college;
	}
	public Student(int id, String name, String college, double marks) {
		this(id, name, college);
		this.marks=marks;
	}
	public Student(int id, double marks) {
		this(id);
		this.marks=marks;
	}
	public void study() {
		System.out.println(name+" is Reading");
	}
	
}
