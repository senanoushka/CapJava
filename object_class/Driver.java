package object_class;

public class Driver {

	public static void main(String[] args) {
		Employee e1=new Employee("Anoushka",1234,120000);
		System.out.println(e1);  //prints package_name.class_name@hexadecimal_hashcode, implicitly calling toString()
		System.out.println(e1.toString());   //calling same thing explicitly
		
		//override object class toString method to return information about object variables, instead of printing
		//object_class.Employee@50040f0c it prints Anoushka 1234 120000
		
		Employee e2=new Employee("Anoushka",1234,120000);
		System.out.println(e1==e2);   
		System.out.println(e1.equals(e2));   //checks equality based on address - returns false
		//but we have overridden to check values not address so now returns true
		System.out.println(e1.equals("Hello"));   //Hello not an instance of e1 so method returns false
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());  //e1 e2 have different reference hence different hashcodes
		//but we override to generate hashcode based on value, since sal same so same hashcode
		
		String s="Anoushka";
		System.out.println(s.hashCode());  //subtract hashcode of sal,id
		
		
		
	}

}
