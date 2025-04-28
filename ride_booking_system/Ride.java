package ride_booking_system;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	public Ride(Customer customer, Driver driver) {
		this.customer=customer;
		this.driver=driver;
		this.status="Booked";
	}
	
	public void completeRide() {
		status="Completed";
		driver.setAvailable(true);
	}
	
	public String getStatus() {
		return status;
	}
	
	public String rideDetails() {
		return customer.name+" "+driver.name+" "+status;
	}
}
