package comparator_comparable;

import java.util.Arrays;

public class DogDriver {
	public static void main(String[] args) {
		Dog[] arr=new Dog[3];
		Dog d1=new Dog("A",4,"Lab");
		Dog d2=new Dog("A",3,"Husky");
		Dog d3=new Dog("C",5,"Retriever");
		
		arr[0]=d1;
		arr[1]=d2;
		arr[2]=d3;
		
		Arrays.sort(arr);  
		//classcast exception as compareTo() method is not overidden so objects cannot be compared
		//so to sort nonprimitive arr implement comparable interface and override compareTo() mathod
		System.out.println(Arrays.toString(arr));
		//sort() method internally calls compareTo() not compare() thats why breed sorting is not happening
		Arrays.sort(arr, new CompareBreed());    //now Breed sort will happen, read docs of arr sort with comparator
		System.out.println(Arrays.toString(arr));
	}
}
