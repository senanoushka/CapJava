package comparator_comparable;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1=new Person("Anoushka", 22);
		Person p2=new Person("Anoushka", 25);
		
		if (p1.compareTo(p2)>0) {
			System.out.println("p1 name bigger");
		}
		else if (p1.compareTo(p2)<0) {
			System.out.println("p2 name bigger");
		}
		else {
			if (p1.compareTo(p2)>0) {
				System.out.println("p1 age bigger");
			}
			else if (p1.compareTo(p2)<0) {
				System.out.println("p2 age bigger");
			}
			else System.out.println(0);
		
		}
	}
}
