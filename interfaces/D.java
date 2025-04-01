package interfaces;

public class D implements A,B {
	public void print() {
		A.super.print();
	}
	public static void main(String[] args) {
		D d=new D();
		d.print();
	}
	
}
