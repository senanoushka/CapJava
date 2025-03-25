package inheritance;

public class Parent {
	static int a=10;
	int b=20;
	
	static void printStat() {
		System.out.println("static method");
	}
	static void printNonStat() {
		System.out.println("non static method");
	}
	static {
		System.out.println(" static initializer");
	}
	{
		System.out.println("non-static initializer");
	}
	Parent()
	{
		System.out.println("Parent constructor");
	}
}
