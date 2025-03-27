package method_overriding;

public class Driver {

	public static void main(String[] args) {
		/**
		Dog d=new Dog();
		d.sound();    //non static method so getting inherited from Parent then getting overridden by Child
		Tiger t=new Tiger();
		t.sound();
		Animal a=new Animal();
		a.sound();
		
		//upcasting - Child methods gets executed
		Animal dog=new Dog();
		dog.sound();
		Animal tiger=new Tiger();
		tiger.sound();
		**/
		
		//downcasting
		Animal dog=new Dog("Siberian Husky");
		dog.sound();     //upcasting
		//System.out.println(dog.breed);	error due to upcasting as Animal doesnt contain breed
		String dogBreed=((Dog)dog).breed;    //explicitly typecasting to downcast
		System.out.println(dogBreed);  //now okkk
		
		dog.greet();    //executes animal method, child does not override parent because static methods belong
		//to class not object,
		
		
		
		

	}

}
