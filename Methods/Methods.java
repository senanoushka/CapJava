package Methods;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Hi1");
		message(); //Since in same class, class name not required 
		System.out.println("Hi2");
		add();
		subtract(3,2);  

	}
	public static void message() {
		System.out.println("Inside message");
	}
	static int a=10;
	static int b=20;
	public static void add() {
		System.out.println(a+b);
	}
	
	public static void subtract(int p, int q) {
		System.out.println(p-q);
	}
	
	
	
}
