public class BinaryTreeController {
    public static void main(String[] args) {

        BinaryTreeImpl binaryTree = new BinaryTreeImpl();

        //TreeNode root = binaryTree.createBinaryTree(new int[]{-1});

        TreeNode root = binaryTree.createBinaryTree(new int[]{1, 2, 3, -1, -1, 4, 5, -1, -1, -1, -1});
    }
}