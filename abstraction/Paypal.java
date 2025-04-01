package abstraction;

public class Paypal extends Payment{
public Paypal(int amount, int transactionId) {
		super(amount, transactionId);
	}
	
	@Override
	void processPayment(int amount, int transactionId) {
		if (amount>500) {
			amount=(int)(amount-(amount*0.1)+(amount*0.03));
		}
		else amount=(int)(amount-(amount*0.03));
		System.out.println();
	}
}
