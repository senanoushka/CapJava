package ScannerInput;
import java.util.*;

public class scannerTests {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/**
		System.out.println("Enter: ");   //take input 7 8 9 to understand
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		//output - Scanner class will print 7 then skip space in between and print 8
		
		String str=sc.next();  //take input hello world
		System.out.println(str);
		**/
		System.out.println("String: ");
		System.out.println(sc.next());
		System.out.println(sc.nextLine());
		
		//next() will consume hello leaving behind _world\n
		//now since there is already string in the buffer nextLine will consume remaining _world
		//and print it, so we can use nextLine() 2 times once to take input and then to clear buffer
		
	}
}
