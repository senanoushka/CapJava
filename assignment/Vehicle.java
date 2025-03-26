package assignment;

public class Vehicle {
	private String vehicleNo;
	private String brand;
	private String model;
	private double price;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNo, String brand, String model, double price, boolean isAvailable) {
		this.vehicleNo=vehicleNo;
		this.brand=brand;
		this.model=model;
		this.model=model;
		this.isAvailable=isAvailable;
		
	}
	public void diplayDetails() {
		System.out.println(vehicleNo+" "+brand+" "+model+" "+price);
	}
	public void rentVehicle(boolean isAvaliable) {
		if (isAvailable==true) {
			System.out.println("Available for rent");
		}
	}
}
