package exception_handling;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int x=sc.nextInt();    //input mismatch exception if input is 0 and hi
			int y=sc.nextInt();
			System.out.println(x/y);   //arithmetic excep if input is 10 and 0
		}
		catch(ArithmeticException e) {
			System.out.println("Arith excep handled");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch handled");
		}
		try {
			int[] arr= {1,2,3,4,5};
			System.out.println("Enter index: ");   //index out of bound excep if index is negative or >5
			System.out.println(arr[sc.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds handled");
		}
		try{
			Class.forName("Demo");     //class not found exception
		}
		catch(Exception e) {
			System.out.println("Excep handled");
		}
		
	}

}
