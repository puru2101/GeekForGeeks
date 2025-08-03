package arrays.binarytree;

public class PostOrder {

	static void postorder(Node node) {
		
		if(node==null) {
			return ;
		}
		
		
		postorder(node.left);
		postorder(node.Right);
		System.out.print(node.data+ " ");
	}
		
		
		public static void main(String[] args) {
	       Node root= new Node("10");
	       root.left= new Node("20");
	       root.Right = new Node("30");
	       root.left.left = new Node ("60");
	       root.left.Right= new Node("40");
	       root.Right.Right = new Node("50");
	       postorder(root);
		}
}
