package string_class;

public class Demo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);    //pointing to same location in string pool
		System.out.println(s1.equals(s2));    //.equals() method overridden by String class to compare value
		
		String s3=new String("Hello");
		System.out.println(s1==s3); //comparing reference address, s1 in pool s3 in heap so different location
		System.out.println(s1.equals(s3));    //.equals() method overridden by String class to compare value
		
		s1=s1+"World";    //concatenation
		System.out.println(s1==s2);      //new reference for s1 created in heap and referenced to s1
		System.out.println(s1.equals(s2));    //same as above
		
		String s4="Hi World";
		String s5="Hi"+" World";
		System.out.println(s4.equals(s5));
		String s6=new String(" World");
		System.out.println(s4.equals(s6));
		
	}

}
