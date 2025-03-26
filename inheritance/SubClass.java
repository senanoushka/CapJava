package inheritance;

public class SubClass extends SuperClass{
	String a="Anoushka";
	static int b=30;
	
	public void print() {
		System.out.println(a);   //Method shadowing - subclass shadowing superclass due to same name
		System.out.println(a);
		System.out.println(super.a);   //fixing method shadowing using super
		System.out.println(b);  //Variable shadowing
		System.out.println(b);
		System.out.println(SuperClass.b);   //fixing var shadowing using class name as static vars are accessed by class name
		//here super.b would also work but convention states always access static using class name
	}
}
