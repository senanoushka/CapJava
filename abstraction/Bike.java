package abstraction;

public class Bike extends Vehicle{

	@Override
	public void start() {
		System.out.println("Inside Bike");
		
	}

	@Override
	public void greet() {
		System.out.println("Inside Bike greet");
		
	}

}
