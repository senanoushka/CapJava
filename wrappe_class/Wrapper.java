package wrappe_class;

public class Wrapper {
	public static void main(String[] args) {
		int i =10;
		//2 ways of boxing - using constructor (deprecated now) and using valueOf() method
		Integer x=new Integer(i);   //boxing using constructors - deprecated
		System.out.println(x);	   
		Integer z=Integer.valueOf(i);  //boxing using valueOf() method - a static method
		System.out.println(z);
		
		Integer n=i;     //autoboxing 
		Integer a=10;
		System.out.println(n+" "+a);
		
		int b=z.intValue();   //unboxing  - intValue(), shortValue(), booleanValue() are all nonstatic
		Boolean flag=true;
		boolean bool=flag.booleanValue();  //unboxing
		System.out.println(b+" "+bool);
		
		Character ch='a';    //auto unboxing
		char c=ch;
		
		Integer p=10;
		Integer q=10;
		System.out.println(p==q);  //auto unboxed to 10==10
		
		Integer i1=10;
		Short s=2;
		Long l=(long)s+i;
		System.out.println(l);
		//String str=(String)(i1+s);    error-string cannot be typecasted to int
		
		//confusion :) wtf :)
		Integer g=128;
		Integer h=128;      //range is -128 to 127
		System.out.println(g==h);   //god knows??????????? 
		System.out.println(g+h);
		System.out.println(g*h);
		
	}
}
