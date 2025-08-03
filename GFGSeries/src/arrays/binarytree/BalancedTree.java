package arrays.binarytree;



class Node1{
	int data;
	Node1 left;
	Node1 Right;
	
	Node1(int  data){
		this.data=data;
	}
}


public class BalancedTree {

	static int isBalancedt(Node1 root) {

		if (root.left == null && root.Right == null) {
			return 0;
		}

		int leftOfLeftHeight = isBalancedt(root.left.left);
		int rightOfLeftHeight = isBalancedt(root.left.Right);

		int Heightleft = 1 + Math.max(leftOfLeftHeight, rightOfLeftHeight);

		int leftOfRightHeight = isBalancedt(root.Right.left);
		int rightOfRightHeight = isBalancedt(root.Right.Right);

		int HeightRight = 1 + Math.max(leftOfRightHeight, rightOfRightHeight);

		return Heightleft - HeightRight;

	}

	public static void main(String[] args) {

		Node1 root1 = new Node1(40);
		root1.Right = new Node1(20);
		root1.left = new Node1(50);
		root1.Right.Right = new Node1(10);
		root1.Right.left = new Node1(30);
		root1.left.left = new Node1(60);

		int height = isBalancedt(root1);
		if (height == 1 || height == -1 || height == 0) {
			System.out.println("Balanced Tree");
		} else {
			System.out.println("Non Balanced Tree");
		}
	}

}
