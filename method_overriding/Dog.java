package method_overriding;

public class Dog extends Animal{
	String breed;
	public Dog(String breed) {  //variable belonging to dog class only
		this.breed=breed;
	}
	public void sound() {
		System.out.println("Dog woof woof");
		//Child class has 1 method not 2 as existing method gets overridden
	}
	static void greet() {
		System.out.println("Dog greeting");
	}

}
