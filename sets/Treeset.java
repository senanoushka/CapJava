package sets;
import java.util.*;


public class Treeset {

	public static void main(String[] args) {
		TreeSet set=new TreeSet<>();
		set.add(12);
		set.add(5);
		set.add(8);      //gets auto-sorted
		set.add(5);
		//set.add(34.7);   heterogeneous elements not allowed, will give ClassCastException
		//set.add("hello");   heterogeneous elements not allowed, will give ClassCastException
		System.out.println(set);
		
		TreeSet<Employee> employee = new TreeSet<>();
		employee.add(new Employee( "Anoushka", 12000));
		employee.add(new Employee("Raj",17000));
		employee.add(new Employee("Ayush",11000));
		employee.add(new Employee("Naveen",15000));
		
		System.out.println(employee);   //overrode compareTo() to sort based on sal in asc order

		Iterator<Employee> its=employee.iterator();
		while(its.hasNext()) {
			System.out.println(its);
		}

	}

}
