package generics;

public class Person {
	int id;
	String name;
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}

}
