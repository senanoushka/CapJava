package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//All elements arwe stored as objects
		ArrayList arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr.get(0));
		//System.out.println(arr.get(0)+arr.get(1));   10 and 20 are objects not Integers hence arithmetic ops not allowed
		
	}

}
