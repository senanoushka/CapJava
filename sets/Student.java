package sets;

import java.util.Objects;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}






