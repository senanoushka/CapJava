package ride_booking_system;

public class Customer extends User{
	
	 public Customer(String id, String name) {
		 super(id, name);
	 }
	 public void showProfile() {
		 System.out.println("Customer name: "+name);
	 }
}
