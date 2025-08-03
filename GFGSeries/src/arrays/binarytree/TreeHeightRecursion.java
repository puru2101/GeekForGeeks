package arrays.binarytree;
//class TreeNode {
//    int value;
//    TreeNode left, right;
//
//    TreeNode(int value) {
//        this.value = value;
//        left = right = null;
//    }
//}

public class TreeHeightRecursion {

    // Function to calculate the height of the binary tree using recursion
    public int findHeight(TreeNode root) {
        // Base case: if the node is null, the height is -1
        if (root == null) {
            return 0;
        }

        // Recursively find the height of the left and right subtrees
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        // The height of the current node is the maximum of the two heights plus 1
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Creating the tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeHeightRecursion tree = new TreeHeightRecursion();

        System.out.println("Height of the tree: " + tree.findHeight(root));  // Output: 2
    }
}
