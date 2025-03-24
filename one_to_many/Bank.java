package one_to_many;

public class Bank {
	Customer[] customers;    //reference of customer object
	String bankName;
	static int count=0;
	
	public Bank(int size, String bankName) {
		this.customers=new Customer[size];  //creating customer array, Customer=[null,null,null,null] 
		//stored in 0x2
		this.bankName=bankName;
	}
	public void addCustomer(Customer customer) {     //accepts 0x2
		if (count<customers.length) {
			customers[count++]=customer;
			System.out.println("Customer added");
		}
		else System.out.println("Cant add anymore customers");
	}
	public void displayCustomer() {
		for (int i=0; i<count; i++) {
			Customer c=customers[i];
			System.out.println(c.customerName+" "+c.id);
		}
	}
}
