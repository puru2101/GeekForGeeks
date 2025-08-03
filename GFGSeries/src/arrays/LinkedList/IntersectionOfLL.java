package arrays.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLL {

	public static Integer LengthOfLL(Node head) {
		int length = 0;

		Node curr = head;

		while (curr != null) {
			length++;
			curr = curr.next;
		}

		return length;

	}

	public static Node intersectionNode(Node head1, Node head2) {
		int LL1 = LengthOfLL(head1);
		int LL2 = LengthOfLL(head2);
		if (head1 == head2) {
			return head1;
		}
		while (LL1 > LL2) {
			head1 = head1.next;
			LL1--;
		}
		while (LL1 < LL2) {
			head2 = head2.next;
			LL2--;
		}
		while (head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}

		return head1;

	}

	public static void intersectionHashMap(Node head1, Node head2) {

		Set<Node> hs = new HashSet<>();

		Node curr1 = head1;
		while (curr1 != null) {
			hs.add(curr1);
			curr1 = curr1.next;
		}

		Node curr2 = head2;
		while (curr2 != null) {
			if (hs.contains(curr2)) {
				System.out.println("intersection node :" + curr2.data);
				break;
			}
			curr2 = curr2.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		Node head1 = new Node(15);
		head1.next = new Node(25);
		head1.next.next = new Node(35);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(52);
		head1.next.next.next.next.next = new Node(55);
		head.next.next = head1.next.next; // Intersection at node 3

		intersectionHashMap(head, head1);
		// System.out.println(intersectionNode(head, head1).data);
	}

}
