package static_nonstatic;

public class Demo2 {
	public Demo2() {
		System.out.println(Demo.id);
		//System.out.println(name);    error
		Demo d=new Demo();
		System.out.println(d.name);
	}

	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		//System.out.println(id);
		//System.out.println(name);
	}
}
