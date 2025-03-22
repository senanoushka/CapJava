package variables_datatypes;

public class Variables {
	static int a=10;
	int b=10;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Variables.a);
		// System.out.println(Variables.b);  Cannot make a static reference to the non-static field Variables.b
		int a=20;
		System.out.println(a);
	}
	public static void access() {
		System.out.println(a);    //10
	}

}
