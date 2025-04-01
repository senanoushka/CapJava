package interfaces;

class Bike implements Vehicle {
	public void print() {
		System.out.println("Hi");
	}

	@Override
	public void start() {
		System.out.println("Hi");
		
	}
}
