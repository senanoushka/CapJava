package list;

public class Employee implements Comparable<Employee> {
	public int id;
	public String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+" "+name;
	}


	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
}
