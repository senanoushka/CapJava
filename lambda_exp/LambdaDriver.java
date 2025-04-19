package lambda_exp;
import java.util.*;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo1 d1=()-> System.out.println("Hello");
		LambdaDemo2 d2=()-> System.out.println("Hello");
		
		d1.print();
		d2.greet();
		
		LambdaDemo3 d3=(a,b)->{
			if (a>b) return a;
			else return b;
		};
		
		System.out.println(d3.check(10,20));
		
		ArrayList<Integer> arr=new ArrayList<>();
		
	}
	
}
