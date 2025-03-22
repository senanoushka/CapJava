package Methods;
import java.util.*;

public class ArraysProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0; i<n; i++) arr[i]=sc.nextInt();
		int key=sc.nextInt();
		search(arr, key);
	}
	public static void search(int[] arr, int key) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==key) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}
}
  