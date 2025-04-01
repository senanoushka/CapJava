package interfaces;

public interface Vehicle {
	//int speed;      error beacuse by default final but nvalue initialised
	int speed=10;
	
	void print() ;
	void start() ;
	
	static void utility() {
		System.out.println("util method");
	}
	
	public static void main(String[] args) {
		utility();
	}
		
	default void text() {
		System.out.println("Default");
	}
}
