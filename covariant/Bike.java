package covariant;

public class Bike extends Vehicle{
	/**
	public Vehicle getObject() {
		return new Bike();     
		//if method return type is Parent but child object is getting returned no error shows because upcasted
		
	}
	**/
	public Bike getObject() {
		return new Bike();     //covariant return type
	}
	/**vice versa doesnt work that is-
	public class Vehicle {
		public Bike getObject() {B
			return new Bike();
		}
	}
	public class Bike extends Vehicle{
	public Vehicle getObject() {
		return new Bike();     	
	}
	
	**/
}
