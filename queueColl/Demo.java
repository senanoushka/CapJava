package queueColl;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(1);
		queue.add(5);
		//queue.add(7.8);    class cast excep - heterogeneous/null not allowed
		queue.add(9);
		queue.add(7);
		queue.add(5);
		
		System.out.println(queue);
		

	}

}
