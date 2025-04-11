package stack;

public class ArrayDriver {
	public static void main(String[] args) {
		StkUsingArray s = new StkUsingArray();
        s.push(6);
        s.push(3);
        s.push(7);
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		s.push(10);
		s.display();
	}
}
