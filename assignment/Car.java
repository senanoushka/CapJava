package assignment;

public class Car extends Vehicle{
	private int doors;
	
	public Car(String vehicleNo, String brand, String model, double price, int doors, boolean isAvailable) {
		super(vehicleNo, brand, model, price, isAvailable);
		this.doors=doors;
	}
	public void diplayDetails() {
		super.diplayDetails();
		System.out.println(doors);
	}
}
