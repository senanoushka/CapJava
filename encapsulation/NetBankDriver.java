package encapsulation;

public class NetBankDriver {

	public static void main(String[] args) {
		NetBank b=new NetBank();
		//System.out.println(b.currentBalance);   error 
		b.getBalance(1234);
		b.setBalance(5000, 1234);
		b.getBalance(1234);
		b.withdraw(1000, 1234);
		b.getBalance(1234);
		
		

	}

}
