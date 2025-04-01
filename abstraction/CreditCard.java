package abstraction;

public class CreditCard extends Payment {
	
	public CreditCard(double amount, String transactionId) {
		super(amount, transactionId);
	}
	
	@Override
	void processPayment(double amount,String transactionId) {
		if (amount>500) {
			amount=(amount-(amount*0.1)+(amount*0.02));
		}
		else amount=(amount-(amount*0.02));
		
		System.out.println();
	}

}
