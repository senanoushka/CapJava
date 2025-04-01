package interfaces;

public interface B {
	double a=30;
	
	static void message() {
		System.out.println("Interface B");
	}
	default void print() {
		System.out.println("Hello B");
	}
	
}
