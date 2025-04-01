package abstraction;

public class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("Inside car ");
		
	}

	@Override
	public void greet() {
		System.out.println("Inside car greet");
		
	}

}
