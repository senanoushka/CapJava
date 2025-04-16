package linkedlist_collection;

import java.util.Comparator;

public class CompareNameLL implements Comparator<EmployeeLL> {

	@Override
	public int compare(EmployeeLL o1, EmployeeLL o2) {
		return o1.name.compareTo(o2.name);
	}

}
