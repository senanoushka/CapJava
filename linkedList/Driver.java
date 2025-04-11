package linkedList;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to insert data at end\n"
					+ "Enter 2 to insert at position\n"
					+ "Enter 3 to update\n"
					+ "Enter 4 to display\nEnter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter data: ");
					int data=sc.nextInt();
					list.insertTail(data);
					break;
				}
				case 2:{
					System.out.println("Enter data");
					int data=sc.nextInt();
					System.out.println("Enter position");
					int k=sc.nextInt();
					list.insertNode(data, k);
					break;
				}
				case 3:{
					System.out.println("Enter data");
					int data=sc.nextInt();
					System.out.println("Enter position");
					int k=sc.nextInt();
					list.updateNode(data, k);
					break;
				}
				case 4: 
					list.display();
					break;
				
				case 5:{
					flag=false;
					break;
				}
			}
		}
		
	}

}
