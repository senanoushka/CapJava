package stream_api;
import java.util.*;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(4);
		list.add(3);
		System.out.println(list);
		
		Stream s=list.stream();    //converting list to stream to remove duplicates without using loops or writing my own logic
//		s.distinct();    returns a stream only
//		s.forEach(n->System.out.println(n));
		
//		this will throw error as stream is single use so again reusing stream in line 21 will throw
//		java.lang.IllegalStateException
		
		Stream s2=s.distinct();      //telling what to do not how to do hence declarative
		s2.forEach(n->System.out.println(n));   //no loop needed
		
		System.out.println(list);    //last has'nt been modifies - stream doesnt change state of original collection
		
		System.out.println("------------------------------------------------------------------------");
		
		List<Integer> l1=Arrays.asList(2,3,1,5,8,7,4,3,2,1);
		l1.stream().distinct().forEach(n->System.out.println(n));    //pipelining of operations
		
		//each method in a stream accepts an object of type Consumer
		//In backend: Consumer<Integer> c = n->S.out.println(n)    this is internally what happens for each method
		//Internally c is calling accept() method of Consumer interface (read Oracle docs)
		//how higher order fx. works in streams
		
		//Stream s= l1.stream().distinct().forEach(n->System.out.println(n));
//		error because return type of last method is void not stream, so cannot store in stream type
//		return type of last method is what is considered
		
		System.out.println("------------------------------------------");
		
		//min
		Optional<Integer>optional = l1.stream().distinct().min((o1,o2)->o1-o2);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//max
		Integer i=l1.stream().distinct().max((o1,o2)->o1-o2).get();
		System.out.println(i);
		
		//asc. sort
		list.stream().sorted().forEach(n->System.out.print(n+" "));   
		System.out.println();
		
		//desc. sort
		list.stream().sorted((o1,o2)->o2-o1).forEach(n->System.out.print(n+" "));  
		System.out.println();
		
		//distinct elements multiplied by itself using map
		list.stream().distinct().sorted().map(n->n*n).forEach(n->System.out.print(n+" "));  
		System.out.println();
		
		//prints distinct even methods 
		list.stream().distinct().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		//convert stream back to list (type is object)
		List<Integer> l2=list.stream().distinct().filter(n->n%2==0).toList();
		System.out.println(l2);
		
		//directly create a stream without a collection
		Stream st=Stream.of(1,7,16.8,"Demo",null,true);
		st.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		//fetch first element
		Optional<Integer> op=list.stream().findFirst();
		System.out.println(op.get());
		
		//fetch any element random
		Optional<Integer> op1=list.stream().findAny();
		System.out.println(op1.get());
		
		//no. of elements
		System.out.println(list.stream().count());
		
		//concat 2 streams
		List<String> str=Arrays.asList("hello","Demo","hi");
		List<Integer> l3=Arrays.asList(1,2,3,3);
		Stream s3=str.stream();
		Stream s4=l3.stream();
		Stream.concat(s3, s4).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println(l1.stream().distinct().allMatch(n->n%2==0));
		System.out.println(l1.stream().distinct().anyMatch(n->n%2==0));
	} 
	
}
