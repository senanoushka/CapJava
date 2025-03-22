package Looping;
import java.util.*;

public class loops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=2; i*i<=n; i++) {
			if (n%i==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}
}
