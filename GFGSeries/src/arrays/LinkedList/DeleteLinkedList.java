package arrays.LinkedList;

public class DeleteLinkedList {

	static void deleteFromStart(Node head) {
		if (head == null) {
			System.out.println("No nodes to delete");
		}
		treverseLinkedList(head.next);
	}

	static void deleteFromEnd(Node head) {
		if (head == null) {
			System.out.println("No nodes to delete");
		}
		
		while(head!=null) {
			if(head.next.next==null) {
				head.next=null;
				break;
			}
			head=head.next;
		}
	}
	
	static void deleteFromNode(Node head,Node n1) {
		if (head == null) {
			System.out.println("No nodes to delete");
		}
		
		while(head!=null) {
			if(head.next==n1) {
				head.next=head.next.next;
				break;
			}
			head=head.next;
		}
	}
	
	static void treverseLinkedList(Node head) {
		if (head == null) {
			System.out.println("Empty List");
		}

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);

		Node n1 = head.next;
		head.next.next = new Node(30);
		Node n2 = head.next.next;
		deleteFromNode(head,n1);
		treverseLinkedList(head);

	}

}
