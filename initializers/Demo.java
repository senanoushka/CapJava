package initializers;

public class Demo {
	static {
		System.out.println("1st Static multiline");
	}
	static {
		System.out.println("2nd Static multiline ");
	}
	static {
		System.out.println("3rd Static multiline ");
	}
	public Demo(){
		System.out.println("Constructor ");
	}
	{
		System.out.println("1st Non-static multiline ");
	}
	{
		System.out.println("2nd Non-static multiline ");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		
		
		
	}
}
