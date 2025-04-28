package ride_booking_system;

public class Driver extends User{
	private boolean available=true;
	
	public Driver(String id, String name) {
		 super(id, name);
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public boolean setAvailable(boolean available) {
		return this.available=available;
	}
	
	public void showProfile() {
		 System.out.println("Driver name: "+name);
		 System.out.println("Driver available: "+available);
	}
}
