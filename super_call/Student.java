package super_call;

public class Student extends Person{
	private int studentId;
	
	public Student(int studentId, String name, int age){
		super(name, age);
		this.studentId=studentId;
	}
	public void displayStudent() {
		displayPerson();
		System.out.println(studentId);
	}
}
