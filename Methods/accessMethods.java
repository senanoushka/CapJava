package Methods;

public class accessMethods {

	public static void main(String[] args) {
		System.out.println("Start access message");
		//message();           error if accessMethods doesn't have a message method
		Methods.message();   //if class name mentioned then that class method invokes
		message();           //if class name not mentioned then same class method invoked
		//if class name is mentioned then that method call will get priority, 
		//or else method of same class will be printed
		System.out.println("End access method");

	}
	public static void message() {
		System.out.println("Inside Message method in access method");
	}

}
