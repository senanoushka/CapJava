package file_handling;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return name+" "+id+" "+salary;
	}
}
