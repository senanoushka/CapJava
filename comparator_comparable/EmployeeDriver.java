package comparator_comparable;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee(456, "Anoushka", 600000);
		Employee e2=new Employee(456, "Anoush", 1200000);
		compareId(e1,e2);
		compareName(e1, e2);
		compareSalary(e1,e2);
	
	}
	public static void compareName(Employee e1, Employee e2) {
		if (e1.compareTo(e2)>0) {
			System.out.println("e1 greater");
		}
		else if (e1.compareTo(e2)<0) {
			System.out.println("e2 greater");
		}
		else System.out.println("Both equal");
	}
	public static void compareId(Employee e1, Employee e2) {
		CompareId obj=new CompareId();
		if (obj.compare(e1,e2)>0) {
			System.out.println("e1 greater");
		}
		else if (obj.compare(e1,e2)<0) {
			System.out.println("e2 greater");
		}
		else System.out.println("Both equal");
	}
	public static void compareSalary(Employee e1, Employee e2) {
		CompareSalary obj1=new CompareSalary();
		if (obj1.compare(e1,e2)>0) {
			System.out.println("e1 greater");
		}
		else if (obj1.compare(e1,e2)<0) {
			System.out.println("e2 greater");
		}
		else System.out.println("Both equal");
	}
	
	

}
