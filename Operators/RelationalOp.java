package Operators;

public class RelationalOp {

	public static void main(String[] args) {
		//System.out.println(true>false);    error
		System.out.println(10>10.5);
		System.out.println('A'>10.5);
		//System.out.println("ab">="ab");
		System.out.println("ab"=="ab");
		System.out.println("ab"!="ab");      //checks references to compare
		System.out.println('A'==65);
		System.out.println(true==true);
		//System.out.println(5 && 5);
		System.out.println(true && true);
		 
		int var=10>20 || 20>15? 10:20;
		System.out.println(var);
		System.out.println(10>20 || 20>15? 1+1:2+2);
		
		int a=10, b=20, c=30;
		int num=a>b && a>c ? a : b>a && b>c? b:c;
		System.out.println(num);
		                   
		//byte b=10;
		//b=b+10;    //error
		//b+=10;     //ok
		System.out.println(num/0.0);
		
		float f=10.5f;
		long l=(long)f;
		System.out.println(l);
		
		double d=66.555555d;
		char ch=(char)d;
		System.out.println(ch);
	}

}
