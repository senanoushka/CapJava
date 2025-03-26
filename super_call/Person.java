package super_call;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	void displayPerson() {
		System.out.println(name+" "+age);
	}
	
}
