package aggregation;

public class Driver {

	public static void main(String[] args) {
		Sim s=new Sim(87779216);
		Phone p=new Phone("Redmi",s);
		p.display();
		
		/** 
		 p=null;                   if phone is deleted sim still exists, hence weakly bound
		 System.out.println(s.phoneNo);
		**/ 
		

	}

}
