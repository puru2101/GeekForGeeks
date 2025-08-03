package arrays.LinkedList;

public class IsCircular {

	static boolean isCircularFinder(Node head) {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow.data==fast.data) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next= head;
		System.out.println(isCircularFinder(head));

	}

}
