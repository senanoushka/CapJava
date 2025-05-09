package sets;

import java.util.Comparator;

import list.Employee;

public class CompareName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
