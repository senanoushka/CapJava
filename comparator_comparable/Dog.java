package comparator_comparable;

import java.util.*;

public class Dog implements Comparable{
	String name;
	int age;
	String breed;
	
	public Dog(String name, int age, String breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	public String toString() {
		return name+" "+age+" "+breed;
	}

	@Override
	public int compareTo(Object o) {
		Dog d=(Dog) o;
		if (this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);  
		}
		else if (this.age-d.age!=0) {
			return this.age-d.age;
		}
		return 0; 
	}

}
