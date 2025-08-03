package arrays.binarytree;

import java.util.Stack;

class TreeNode {
	int value;
	TreeNode left, right;

	TreeNode(int value) {
		this.value = value;
		left = right = null;
	}
}

public class DFSTreeUsingStack {
	// Creating the tree:
    //        1
    //       / \
    //      2   3
    //     / \
    //    4   5

	static void dfsPreOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();

	
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode currentNode = stack.pop();
			System.out.print(currentNode.value + " "); 

			if (currentNode.right != null) {
				stack.push(currentNode.right);
			}

			if (currentNode.left != null) {
				stack.push(currentNode.left);
			}
		}
	}

	public static void main(String[] args) {
	
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.print("DFS Pre-order using Stack: ");
		dfsPreOrder(root); // Output: 1 2 4 5 3
	}

}
