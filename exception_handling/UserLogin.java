package exception_handling;

public class UserLogin {
	private int pin=1234;
	
	public void login(int pin) {
		if (this.pin==pin) {
			System.out.println("Login successful");
		}
		else throw new InvalidPinException("Pin invalid");
	}

	public static void main(String[] args) {
		System.out.println("Main start");
		UserLogin user=new UserLogin();
		try{
			user.login(1223);
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main end");
	}

}
