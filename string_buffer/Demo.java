package string_buffer;

public class Demo {

	public static void main(String[] args) {
		//EXACT SAME THINGS BELOW CAN BE DONE FOR BUILDER
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Hello");
		sb1.append(false);
		sb1.append(12);
		System.out.println(sb1);
		sb1.delete(0, 3);
		System.out.println(sb1);
		System.out.println(sb1.charAt(3));
		sb1.insert(1, "Heiiii");
		System.out.println(sb1);
		
		System.out.println("----------------------");
		
		char[] arr= {'D','e','m','o'};
		StringBuffer sb2 = new StringBuffer(100);
		sb2.append(arr);
		System.out.println(sb2);
		
		System.out.println(sb2.capacity()); 
		sb2.ensureCapacity(150);  //used to set extra capacity, can be increased not decreased
		//100x2+2
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(400);
		System.out.println(sb2.capacity());
		
		System.out.println("---------------------------");
		
		StringBuffer sb3 = new StringBuffer("Hello World");
		sb3.reverse();
		System.out.println(sb3);
		sb3.setCharAt(3, 'A');
		System.out.println(sb3);
		
		String str=new String(sb3.reverse());
		System.out.println(str);

	}

}
