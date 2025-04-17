package linkedlist_collection;
import java.util.*;

import list.CompareName;
import list.Employee;

public class LLDemo {	
	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add(12);
		list.add(true);
		list.add("hello");
		list.add(5.8);
		list.add(null);
		
		//try sorting using comparable and comparator - works 
		//try using iterator/list_iterator - works
		
		LinkedList<EmployeeLL> employee = new LinkedList<>();
		employee.add(new EmployeeLL(123, "Anoushka"));
		employee.add(new EmployeeLL(456, "Raj"));
		employee.add(new EmployeeLL(789, "Ayush"));
		employee.add(new EmployeeLL(1234, "Naveen"));
		
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);
		
		Iterator<Integer> itr=llist.iterator();
		while (itr.hasNext()) {
			int x=itr.next();    //auto-unboxed Integers 
			if (x==30) {
				itr.remove();
			}
		}
		System.out.println(llist);
		
		Iterator<EmployeeLL> itr1=employee.iterator();
		while (itr1.hasNext()) {
			EmployeeLL e= itr1.next(); 
			if (e.name.equals("Ayush")) {       											
				itr1.remove();               
			}
		}
		System.out.println(employee);
		
		System.out.println("---------------------------------------");
		
		
		//ListIterator java docs
		ListIterator<Integer> itlist=llist.listIterator();
		while (itlist.hasNext()) {
			System.out.println("Index: "+itlist.nextIndex()+",  Element: "+itlist.next());
		}
		
		//we will now reset pointer back to beginning because pointer is at end and if we dont reset
		//then hasNext() wont run for the next while 
		while (itlist.hasPrevious()) {
			itlist.previous();
		}
		//now pointer is back to -1 so .hasNext() will now traverse from beginning as usual
		while (itlist.hasNext()) {
			int index=itlist.nextIndex();
			if (index==1) {
				itlist.add(60);
			}
			int element=itlist.next();
			if (element==50) {
				itlist.set(100);
			}
		}
		System.out.println(llist);
		
		System.out.println("----------------------------------");
		
		LinkedList l1 = new LinkedList();
		l1.add(3);
		l1.add("hello");
		l1.add(null);
		l1.add(5.6);
		l1.add(true);
		
		Collections.sort(employee); 
		System.out.println(employee);
		
		//sorting based on name using comparator
		Collections.sort(employee, new CompareNameLL()); 
		System.out.println(employee);
		
		System.out.println("----------------------------------------");
		
		llist.addFirst(70);
		llist.addLast(90);
		System.out.println(llist);
		System.out.println(llist.peek());
		System.out.println(llist.peekLast());
		System.out.println(llist.poll());     //retrieves and removes head
		System.out.println(llist.pollLast());     //retrieves and removes tail
		System.out.println(llist);
		llist.remove(2);
		System.out.println(llist);
		
		
		
	}
}
