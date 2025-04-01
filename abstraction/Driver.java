package abstraction;

public class Driver {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle();     error-abstract class cannot be instantiated ie. object be created
		Vehicle v1=new Bike(); 
		v1.start();
		Vehicle v2=new Car(); 
		v2.start();
	}

}
