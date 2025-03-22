package ScannerInput;

public class armstrong {

	public static void main(String[] args) {
		int n=11 , og=n, cnt=0, arm=0;
		for (int i=n; i>0; i=i/10) cnt++;
		while (n>0) {
			int digit=n%10;
			arm=arm+(int)Math.pow(digit,cnt);
			n=n/10;
			
		}
		System.out.println(arm==og);
	}

}
