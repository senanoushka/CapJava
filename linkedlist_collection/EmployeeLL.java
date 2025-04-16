package linkedlist_collection;

public class EmployeeLL implements Comparable<EmployeeLL> {
	int id;
	String name;
	
	public EmployeeLL(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+" "+name;
	}


	@Override
	public int compareTo(EmployeeLL o) {
		return this.id-o.id;
	}
}
