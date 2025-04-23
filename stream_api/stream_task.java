package stream_api;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class stream_task {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(2,3,1,5,8,7,4,3,2,1);
		
		//q4
		l1.stream().distinct().map(n->n*n).forEach(n->System.out.print(n+" "));  
		System.out.println();
		
		System.out.println("----------------------------------------------");
		
		List<String> str=Arrays.asList("hello","Demo","hi");
		
		//q2
		str.stream().map(n->n.toUpperCase()).forEach(n->System.out.print(n+" "));  
		System.out.println();
		
		//q6
		str.stream().sorted().forEach(n->System.out.print(n+" "));   
		System.out.println();
		str.stream().sorted((o1,o2)->o2-o1).forEach(n->System.out.print(n+" "));  
		System.out.println();
	}
}
