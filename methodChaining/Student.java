package methodChaining;

public class Student {
	String name;
	int id;
	
	public Student setName(String name) {  //method returns object of type Student
		this.name=name;
		return this;   //this keyword stores reference of currently existing object;
	}
		/**
		 Student s=new Student;
		 return s;
		 //if you write this then in driver different reference will be printed
		 **/
	public Student setId(int id) {  
		this.id=id;
		return this; 
	}
	public void display() {
		System.out.println(this.name+" "+this.id);
	}

}
