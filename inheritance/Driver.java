package inheritance;

public class Driver {

	public static void main(String[] args) {
		Bike bike=new Bike("Kawasaki","V4");
		Car car=new Car("Ferrari","V2",1000);
		System.out.println(bike.name);
		System.out.println(car.price);
	}

}
