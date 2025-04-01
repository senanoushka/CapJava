package abstraction;

public class PaymentDriver {

	public static void main(String[] args) {
		Payment p1=new CreditCard(600, 1234);
		p1.processPayment(600);
		

	}

}
