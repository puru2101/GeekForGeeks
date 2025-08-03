package arrays.binarytree;

public class CompareTree {

	
	public static boolean compareIdenticalTree(Node node1,Node node2) {
		
		if(node1==null && node2==null) {
			return true;
		}
		
		if(node1!=null && node2!=null&& node1.data==node2.data &&
				compareIdenticalTree(node1.left, node2.Right) &&
						compareIdenticalTree(node1.Right, node2.left) ) {
			return true;		
		}
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root1= new Node("40");
	       root1.Right= new Node("20");
	       root1.left = new Node("50");
	       root1.Right.Right = new Node ("10");
	       root1.Right.left= new Node("30");
	       root1.left.left = new Node("60");
	       
	       
	       
	       Node root= new Node("40");
	       root.left= new Node("20");
	       root.Right = new Node("50");
	       root.left.left = new Node ("10");
	       root.left.Right= new Node("30");
	       root.Right.Right = new Node("60");
	
	       System.out.println(compareIdenticalTree(root,root1));
	
	}
	
	

}
