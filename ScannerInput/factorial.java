package ScannerInput;

public class factorial {
	//prog to
	public static void main(String[] args) {
		int n=188;
		int cnt=0;
		for (int i=n; i>0; i=i/10) cnt++;
		System.out.println(cnt);
	}

}
