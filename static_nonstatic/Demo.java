package static_nonstatic;

public class Demo {
	static int id=10;
	String name="Anoushka";
	public Demo() {
		System.out.println(id);
		System.out.println(name);
		//Shows that we can access both stat and nonstat vars in same class in nonstat context
		//without using class name
	}

	public static void main(String[] args) {
		System.out.println(id);
		//System.out.println(name); error
		Demo d=new Demo();
		System.out.println(d.name);

	}

}
