package arrays.binarytree;


class Node{
	String data;
	Node left;
	Node Right;
	
	Node(String  data){
		this.data=data;
	}
}

public class Inorder {

  static void inorder(Node node) {
	
	if(node==null) {
		return ;
	}
	
	inorder(node.left);
	System.out.print(node.data+ " ");
	inorder(node.Right);
}
	
	
	public static void main(String[] args) {
       Node root= new Node("10");
       root.left= new Node("20");
       root.Right = new Node("30");
       root.left.left = new Node ("60");
       root.left.Right= new Node("40");
       root.Right.Right = new Node("50");
       inorder(root);
	}

}
