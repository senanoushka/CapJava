package lambda_exp;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Employee e1=new Employee(123, "Anoushka");
		Employee e2=new Employee(456, "Raj");
		Employee e3=new Employee(789, "Naveen");
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e3);
		emp.add(e1);
		emp.add(e2);
		
		Comparator<Employee> c=(o1, o2)->o1.id-o2.id;
		Collections.sort(emp,c);
		System.out.println(emp);
		
	}
}
