package comparator_comparable;

public class Employee implements Comparable{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	/**
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee) o;    //downcast
		//return (int)(this.salary-e.salary);    comparing based on sal, you can do id or name also
		return this.id-e.id;      //checks if difference is -1, 0 or +1
	}
	**/
	public int compareTo(Object o) {
		Employee e=(Employee) o;
		return this.name.compareTo(e.name);    
		//String class has compareTo() method that overrides compareTo() method of Comparable interface
		//compareTo of String class compares Strings character by character
	}
}
