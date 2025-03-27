package polymorphism;

public class PartTimeEmployee extends Employee{
	private int workHours;
	public PartTimeEmployee(String name, int salary, int workHours) {
		super(name, salary);
		this.workHours=workHours;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(this.workHours);
	}
	public void JobRole() {
		System.out.println("Cloud Engineer");
	}
	public void JobDesignation() {
		System.out.println("associate");
	}
}
