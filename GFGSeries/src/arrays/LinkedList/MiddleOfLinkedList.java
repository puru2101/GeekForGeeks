package arrays.LinkedList;

public class MiddleOfLinkedList {

	static int middleFinder(Node head) {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {

		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next= new Node(50);
		
		System.out.println(middleFinder(head));
	}

}
