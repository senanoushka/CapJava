package assignment;

public class Bike extends Vehicle{
	private boolean hasGear;
	
	public Bike(String vehicleNo, String brand, String model, double price, boolean hasGear){
		super(vehicleNo, brand, model, price, isAvailable);
		this.hasGear=hasGear;
	}
	public void diplayDetails() {
		super.diplayDetails();
		System.out.println(hasGear);
	}
	public void rentVehicle(boolean isAvaliable) {
		if (isAvailable==true) {
			System.out.println("Available for rent");
		}
	}
	

}
