package polymorphism;

public class Driver {
	public static void main(String[] args) {
		Employee e1=new FullTimeEmployee("Anoushka",1000,50);
		Employee e2=new PartTimeEmployee("Raj",5000,8);
		
		e1.employeeInfo();
		e2.employeeInfo();
		((FullTimeEmployee)e1).JobRole();
		((PartTimeEmployee)e2).JobRole();
		((PartTimeEmployee)e2).JobDesignation();
	}
}
