package hashmap;

public class HashMapImplementation {
	static int size=16;
	Entry[] bucket=new Entry[size];
	
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	
	public void put(int key, int value) {    //insert entry into array
		int index=getBucketIndex(key);
		System.out.println("Entry is added at index: "+index);
		Entry node=new Entry(key, value);
		Entry current=bucket[index];
		
		while(current!=null) {
			if (current.key==key) {   //checking if new entry key is already present in linked list
				current.value=value;  //yes then update value
				return;
			}
			current=current.next;
		}
		
		node.next=bucket[index];     //make new entry as head
		bucket[index]=node;         //store head
	}
	
	public void getValue(int key) {
		int index=getBucketIndex(key);
		Entry current=bucket[index];
		while (current!=null) {
			if (current.key==key) {
				System.out.println("Value at key "+key+" is "+current.value);
				return;
			}
			current=current.next;
		}
		System.out.println("Not found");	
	}
	
	public void display() {
		System.out.println("Displaying map");
		for (int i=0; i<size; i++) {
			Entry current=bucket[i];
			while(current!=null) {
				System.out.println(current.key+" "+current.value);
				current=current.next;
			}
		}
	}
	
	public void remove(int key) {
		int index=getBucketIndex(key);
		Entry current=bucket[index];
		Entry prev=current;
		while(current!=null) {
			if (current.key==key) {
				bucket[index]=current.next;
				prev.next=null;
			}
			current=current.next;
			prev=prev.next;
		}
	}
	
	public static void main(String[] args) {
		HashMapImplementation map=new HashMapImplementation();
		map.put(10, 1);
		map.put(20, 9);
		map.put(20, 5);
		map.put(30, 4);
		System.out.println("--------------------------------");
		map.getValue(20);
		System.out.println("--------------------------------");
		map.display();
		System.out.println("--------------------------------");
		map.remove(50);
		map.display();
	}
}
