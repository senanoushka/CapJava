package generics;

//GENERIC CLASS
public class Employee1<T> {
	T data1;
	T data2;
	
	Employee1 (T data1, T data2){
		this.data1=data1;
		this.data2=data2;
	}
	public String toString() {
		//System.out.println(data1+data2);  error - arithmetic ops on generics not allowed as datatype is not known 
		return data1+" "+data2;
	}
	
	//GENERIC METHOD - method accepts generic type array;
	public static <T> void print(T[] arr) {     
		 
		//<T> specifies that the method is generic method, nothing to do with return type, return is void only
		for (T i:arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Employee1<Integer> e1=new Employee1<Integer>(12, 56);
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		System.out.println(e1.data1+e1.data2);   //now ok because data type is now known
		
		Employee1<String> e2=new Employee1<String>("hello", "world");
		System.out.println(e2);
		System.out.println(e2.data1 instanceof Object);
		
		Employee1<Boolean> e3=new Employee1<Boolean>(true, true);
		//System.out.println(e3.data1+e3.data2);    this is why ops are not allowed  on generic data type as compiler wont know if arithmetic ops would be posible or not
		
		//int[] arr={1,2,3,4};   ERROR - GENERICS ONLY APPLY TO NON PRIMITIVE TYPE DATA AND REFERENCES, NEVER TO PRIMITIVE, PRIMITIVES WILL THROW ERROR
		Integer[] arr= {1,2,3,4};
		String[] sarr= {"hello","world","hehehehehehe"};
		
		print(arr);
		print(sarr);
		
		//T[] arr1= {1,2,3};    Notes - Generic Restriction - Point 4
		//T is not a data type, it is a placeholder for a datatype
		
		//**NOTE- static vars not allowed in generic class because static vars belong to class,
		//        if type not known how can it be static
	}

}
