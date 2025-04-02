package exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		alpha();
	}
	public static void alpha() {
		System.out.println("Alpha");
		beta();
	}
	public static void beta() {
		System.out.println("Beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("Gamma");
		System.out.println(10/0);
	}

}
