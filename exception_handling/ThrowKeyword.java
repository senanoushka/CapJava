package exception_handling;

public class ThrowKeyword {
	public static void div(int x, int y) {
		if (y!=0) {
			System.out.println(x/y);
		}
		else throw new ArithmeticException("Denominator is 0");
	}

	public static void main(String[] args) {
		div(10, 0);
	}

}
