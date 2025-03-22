package oops;

public class Employee {
	int id;
	String name;
	String company;
	double salary;
	
	public Employee() {
		System.out.println("Employee Constructor called");
	}
	public Employee(int id) {
		this.id=id;
	}
	public Employee(int id, String name) {
		this(id);
		this.name=name;
	}
	public Employee(int id, String name, String company) {
		this(id,name);
		this.company=company;
	}
	public Employee(int id, String name, String company, double salary) {
		this(id,name,company);
		this.salary=salary;
	}
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
		

}
