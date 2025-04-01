package interfaces;

public interface C extends A,B{
	default void check() {
		System.out.println(A.a);
		A.message();
		B.message();
		print();
		
	}
	default void print() {
		A.super.print();
		B.super.print();
	}
	/**
	if we create another default method with the same name thyen compiler wll not throw error as new defult
	method will be belonging to type C and both default methods from A and b will be overshadowed
	
	default void print() {
		System.out.println("Hi");
	}
	**/
	public static void main (String[] args) {
		//check();    error
		
		
	}
}
