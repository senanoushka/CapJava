package sets;

public class Employee implements Comparable<Employee>{
	String name;
	int sal;
	
	public Employee(String name, int sal) {
		this.name=name;
		this.sal=sal;
	}
	
	public String toString() {
		return name+" "+sal;
	}

	@Override
	public int compareTo(Employee o) {
		return this.sal-o.sal;
	}
}
