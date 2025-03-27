package polymorphism;

public class FullTimeEmployee extends Employee{
	private int bonus;
	
	public FullTimeEmployee(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus=bonus;

	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(" "+this.bonus);
	}
}
