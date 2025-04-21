package higher_order_fx;

public class Test {
	void greet(Demo d) {     //higher order fx - greet() method accepts Demo of type functional interface
		d.print();
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.greet(()->System.out.println("Hello"));    
		
		//greet() accepts a reference of type functional interface
		//i am providing implementation of abstract greet() using lambda exp.
	}
}
