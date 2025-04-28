package ride_booking_system;

import java.util.Iterator;
import java.util.List;

import annotations.Info;

@SecurityCheck(role ="Admin")
public class Admin extends User {
	
	public Admin(String id, String name) {
		super(id, name);
	}

	public void showProfile() {
		System.out.println("Admin name: "+name);
		Class<SecurityCheck> c=SecurityCheck.class;
		SecurityCheck s=c.getDeclaredAnnotation(SecurityCheck.class);
		System.out.println("Admin name: "+s.role());
	}
	
	public void removeDriver(List<Driver> drivers, String driverId) {
		try {
			Class<?> adminClass=this.getClass();
			SecurityCheck check=adminClass.getAnnotation(SecurityCheck.class);
			
			if (check!=null && check.role().equals("Admin")) {
				Iterator<Driver> it=drivers.iterator();
				while (it.hasNext()) {
					Driver driver=it.next();
					if (driver.id.equals(driverId)) {
						it.remove();
						System.out.println("Driver id"+driverId+"removed");
						return;
					}
				}
				System.out.println("Driver id"+driverId+"not found");
			}else {
				System.out.println("No access");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
