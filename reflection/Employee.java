package reflection;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int age;
	
	public Employee(int id, String name, double salary, int age) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+salary+" "+age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}
	
}
