package many_to_one;

public class Driver {

	public static void main(String[] args) {
		Bank bank=new Bank("SBI");
		Customer c1=new Customer(1, "Rohit", bank);
		Customer c2=new Customer(2, "Anoushka", bank);
		Customer c3=new Customer(3, "Raj", bank);
		
		c1.display();
		c2.display();
		c3.display();
		
		/**
		 c1=null;
		 c2=null;
		 c3=null;
		 Sysopit(bank,bankName);
		 * 
		 */

	}

}
