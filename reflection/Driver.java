package reflection;

import java.lang.reflect.Field;

public class Driver {
	public static void main(String[] args) throws Exception{
		
		Class<Employee> employee = Employee.class;  
	    Field[] fields = employee.getDeclaredFields();

	    for (Field field : fields) {
	         System.out.println(field.getName());
	    }
	    
	    System.out.println("------------------------------------");
	    //changing the value of field of a particular object
	    Employee e=new Employee(123,"Anoushka",12000,22);
	    Field f=employee.getDeclaredField("name");
	    
	    f.setAccessible(true);
	    f.set(e, "Raj");
	    System.out.println(f.get(e));
	    f.setAccessible(false);
	    System.out.println(e.getName());
	    //System.out.println(f.get(e));   accessibilty is false so cannot access name anymore
	    //System.out.println(employee.name);
	}
}
	 

