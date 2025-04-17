package sets;
import java.util.*;

public class Hashset {
	public static void main(String[] args) {
		HashSet set=new HashSet<>();
		set.add(12);
		set.add(null);      
		set.add("hello");
		set.add(6.8);
		set.add(null);
		System.out.println(set);
	}
}
