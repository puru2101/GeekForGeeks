package arrays.binarytree;

//class Node1{
//	String data;
//	Node1 left;
//	Node1 Right;
//	
//	Node1(String  data){
//		this.data=data;
//	}
//}


public class preorder {
	static int count = 0;
	static int Max=0;
	static void preorder(Node node) {
		
		if(node==null) {
			Max=count;
			return ;
		}
		
		System.out.print(node.data+ " ");
		preorder(node.left);
		
			count++ ;
		count--;
		preorder(node.Right);
	}
		
		
		public static void main(String[] args) {
	       Node root= new Node("40");
	       root.left= new Node("20");
	       root.Right = new Node("50");
	       root.left.left = new Node ("10");
	       root.left.Right= new Node("30");
	       root.Right.Right = new Node("60");
	       root.Right.Right = new Node("70");
	       preorder(root);
		}
}
