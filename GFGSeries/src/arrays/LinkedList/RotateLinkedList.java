package arrays.LinkedList;

public class RotateLinkedList {

	static void rotateLinkedList(Node head) {

		Node temp = null;
		while (head != null) {
			head = head.next;

			if (head.next == null) {
				temp = head;
			}
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

	static int findLinkedListLength(Node head) {
		int length = 0;
		if (head == null) {
			System.out.println("Empty List");
		}

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
			length++;
		}
		return length;

	}

	public static void main(String[] args) {
	
		
		Node head = new Node(10);
		head.next = new Node(20);
		Node n1 = head.next;
		head.next.next = new Node(30);
		Node n2 = head.next.next;
		n2.next = new Node(35);
		rotateLinkedList(head);
		treverseLinkedList(head);
	


	}

}
