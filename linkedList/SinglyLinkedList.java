package linkedList;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count=0;
	public void insertTail(int data) {
		Node node=new Node(data);
		
		if(head==null) {   //indicates linkedlist is empty, indicating that node is the first node 
			head=node;     //so it is both head and tail
			tail=node;
			count++;
		}
		else {
			tail.next=node;
			tail=node;
			count++;
		}
	}
	public void display() {
		Node temp=head;
		if (head==null) {
			System.err.println("No elements present");   //err is error stream - statement is printed in red
			return;
		}
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public void updateNode(int data, int k) {
		if (k<1 || k>count) System.err.println("Position out of bounds");
		int track=1;
		Node temp=head;
		while(temp!=null) {
			if (track==k) {
				temp.data=data;
				return;
			}
			temp=temp.next;
			track++;
		}
	}
	public void insertNode(int data, int k) {
		Node node=new Node(data);
		if (k<1) System.err.println("Position out of bounds");
		if (k==count+1) insertTail(data);
		int track=1;
		if (head==null) {
			head=node;
			return;
		}
		if (k==1) {
			node.next=head;
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			if (track==k-1) {
				node.next=temp.next;
				temp.next=node;
				return;
			}
			temp=temp.next;
			track++;
		}
	}
	public void DeleteNode(int k) {
		
	}
}
