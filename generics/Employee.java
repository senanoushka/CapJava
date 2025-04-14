package generics;
import java.util.*;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.name=name;
		this.id=id;
	}
	
	
//	@Override
//	public int compareTo(Object o) {    
//		Employee e=(Employee) o;     
//		alot of times classcast exceptions happens here, so to prevent it i want compareTo() to explicitly
//		accept Employee class only to ensure type safety like this-
//		public int compareTo(Employee o)
//		but then compareTo cant be overridden as to override we have to keep method definition
//		 intact so we use generics
//		return this.id-e.id;
//	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
