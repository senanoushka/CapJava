package list;
import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(123, "Anoushka"));
		employee.add(new Employee(456, "Raj"));
		employee.add(new Employee(789, "Ayush"));
		employee.add(new Employee(1234, "Naveen"));
		
		System.out.println(employee);
		
		for (Employee i:employee) {
			System.out.println(i);
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		//DONT USE FOR-EACH LOOP FOR MODIFICATIONS IT WILL SHOW CONCURRENT MODIFICATION ERROR if break not used
		//comment out break to understand
		//for each loop uses pointer to traverse array, if you remove an element the pointer gets broken
		//and loop can no longer traverse so error, break prevents further traversal so ok
		//BETTER TO NOT USE FOR-EACH FOR ANYTHING OTHER THAN PRINING
//		for (int i:arr) {
//			if (i==20) {
//				Integer x=i;
//				arr.remove(x);
//				break;
//			}
//		}
//		System.out.println(arr);
		
		//Iterator is an interface
		//But object of interface cannot be created so how below code works?
		//an implementng class of iterator interface is written and that is being called
		//itr will make modifications such that modification made in itr will reflect in arr as well
		
		Iterator<Integer> itr=arr.iterator();
		while (itr.hasNext()) {
			int x=itr.next();    //auto-unboxed Integers 
			if (x==30) {
				itr.remove();
			}
		}
		System.out.println(arr);
		
		Iterator<Employee> itr1=employee.iterator();
		while (itr1.hasNext()) {
			Employee e= itr1.next(); 
			if (e.name.equals("Ayush")) {      //(e.name=="Raj") also works because "Raj" is a string literal												
				itr1.remove();               //if "Raj" was a String object == wouldnt work then .equals() would be needed
			}
		}
		System.out.println(employee);
		
		System.out.println("---------------------------------------");
		
		
		//ListIterator java docs
		ListIterator<Integer> list=arr.listIterator();
		while (list.hasNext()) {
			System.out.println("Index: "+list.nextIndex()+",  Element: "+list.next());
		}
		
		//we will now reset pointer back to beginning because pointer is at end and if we dont reset
		//then hasNext() wont run for the next while 
		while (list.hasPrevious()) {
			list.previous();
		}
		//now pointer is back to -1 so .hasNext() will now traverse from beginning as usual
		while (list.hasNext()) {
			int index=list.nextIndex();
			if (index==1) {
				list.add(60);
			}
			int element=list.next();
			if (element==50) {
				list.set(100);
			}
		}
		System.out.println(arr);
		
		ArrayList al = new ArrayList();
		al.add(3);
		al.add("hello");
		al.add(null);
		al.add(5.6);
		al.add(true);
		
		//Collections.sort(al);    cannot sort list if not generic - class cast exception
		//Collections.sort(employee);     Collection.sort implements comparable interface, but employee class doesnr
		
		//now employee class mein i wrote implements Comparable<Employee> and i overrode
		//compareTo(), now collections.sort() will work
		
		//sorting based on id using comparable
		Collections.sort(employee); 
		System.out.println(employee);
		
		//sorting based on name using comparator
		Collections.sort(employee, new CompareName()); 
		System.out.println(employee);
		
		
	}

}
