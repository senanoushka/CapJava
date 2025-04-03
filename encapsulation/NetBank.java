package encapsulation;

public class NetBank {
	private int currentBalance=50000;  //cant access outside class
	private int pin=1234;
	
	public void getBalance(int pin) {   //getter method
		if (this.pin==pin) {
			System.out.println(currentBalance);
		}
		else System.out.println("Wrong pin");
	}
	public void setBalance(int deposit, int pin) {     //setter
		if (this.pin==pin) {
			currentBalance+=deposit;
		}
		else System.out.println("Wrong pin");
	}
	public void withdraw(int withdraw, int pin) {
		if (this.pin==pin) {
			if (currentBalance>=withdraw) {
				currentBalance-=withdraw;
				System.out.println(withdraw);
			}
			else System.out.println("Insufficient funds");
			
		}
		else System.out.println("Wrong pin");
	}
	
	
	
	

}
