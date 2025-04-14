package mergeSort;
import java.util.*;
//TC- for dividing logn, for conquering n, hence O(nlogn)
//SC- O(n) for storing the intermediate conquered arrays
//Draw stacks to track recursive calls

public class MergeSort {
	public static void main(String[] args) {
		int[] arr= {6,3,9,5,2,8};
		System.out.println(Arrays.toString(arr));
		divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void divide(int[] arr, int start, int end) {
		if (start>=end) {
			return;
		}
		int mid=start+(end-start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid, end);
	}
	public static void conquer(int[] arr, int start, int mid, int end) {
		int leftLength=mid-start+1;
		int rightLength=end-mid;
		
		int[] left=new int[leftLength];
		int[] right=new int[rightLength];
		
		for (int i=0; i<leftLength; i++) {
			left[i]=arr[start+i];
		}
		for (int i=0; i<rightLength; i++) {
			right[i]=arr[mid+i+1];
		}
		int i,j,k=start;
		i=j=0;
		
		while(i<leftLength && j<rightLength) {
			if (left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}
			else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while (i<leftLength) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while (j<rightLength) {
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	
}
