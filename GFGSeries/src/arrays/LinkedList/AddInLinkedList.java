package arrays.LinkedList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;

	}

}

public class AddInLinkedList {

	static void addFirst(Node head, Node newnode) {
		newnode.next = head;
		treverseLinkedList(newnode);	
	}
	
	static void addLast(Node head,Node newNode) {
		if(head==null) {
			System.out.println(newNode.data);
		}
		
		while(head!=null) {
			if(head.next==null) {
				head.next= newNode;
				break;
			}
			head= head.next;
		}

	}
	
	static void addAfterNode(Node head,Node n1,Node newNode) {
		if(head==null) {
			System.out.println(newNode.data);
		}
		
		while(head!=null) {
			if(head.next==n1) {
				head.next= newNode;
				newNode.next=n1;
				break;
			}
			head= head.next;
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
		
		Node n1=head.next;
		head.next.next = new Node(30);
		Node n2=head.next.next ;
		//treverseLinkedList(head);
      //addFirst(head, new Node(31));
		
//		addLast(head,new Node(35));
//		treverseLinkedList(head);
		System.out.println("--------------");
		addAfterNode(head,n2,new Node(36));
		treverseLinkedList(head);
		
	}

}
