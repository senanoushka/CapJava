package abstraction;

abstract public class Payment {
	private double amount;
	private String transactionId;
	
	public Payment(double amount, String transactionId) {
		this.amount=amount;
		this.transactionId=transactionId;
	}
	public double getAmount() {
		return this.amount;
	}
	public String getTransactionId() {
		return this.transactionId;
	}
	abstract void processPayment(double amount);
	
	
}
