package object_class;

public class Employee {
	private String name;
	private int id;
	private int salary;
	
	public Employee(String name, int id, int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj.salary;   error due to static binding
		if (obj instanceof Employee) {
			Employee e=(Employee) obj; //downcasting obj as salary is not present in object class
			return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
			//return this.id==e.id && this.salary==e.salary && this.name==e.name;     also works but strings 			should always be compared using .equals() not ==
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)(this.id+this.salary+this.name.hashCode());
	}
	
	/**worst way of overriding hashcode
	public int hashCode() {
		return 1;
	}
	**/
}
