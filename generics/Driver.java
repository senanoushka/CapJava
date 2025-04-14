package generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Student<Person> student=new Student<Person>(new Person(10, "Anoushka"));
		printDetails(student);
		
//		List<Boolean> list=new ArrayList<Boolean>();
//		list.add(true);
//		list.add(false);
//		list.add(true);
		
		List<Integer> list=new ArrayList<Integer>();   //works with <Double>,<Byte>
		list.add(1);
		list.add(2);
		list.add(3);
		
		print(list);
		
		List<Number> list1=new ArrayList<Number>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		printData(list1);

	}
	public static void print(List<? extends Number> list) {
		//list.add(true);   error because boolean is not subclass of Number
		//list.add(4);   <? extends> allows only read
		//System.out.println(list.get(0));     only read ops allowed, write not allowed
		System.out.println(list.get(0));
	}
	public static void printData(List<? super Number> list1) {
		list1.add(8);      //<? super> allows both read and write
		System.out.println(list1.get(3));
	}
	public static void printList(List<?> list1) {
		//list1.add(8);    <?> doesnt allow write
		System.out.println(list1.get(3));
	}
	
	
	
	
	
	public static void printDetails(Student<? extends Person> student) {
		Person p=student.obj;
		System.out.println(p);
	}
}


