public class InvertBinaryTree {
    Node root;

    static class Node {
        Node left, right;
        int key;

        Node(int n) {
            key = n;
            left = right = null;
        }
    }

    public void  invertTree(){
        invertTree(root);
    }

    public Node invertTree(Node root) {
        if(root == null){
            return root;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {

        InvertBinaryTree tree = new InvertBinaryTree();
        /* creating a binary tree and entering the nodes */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder();
        /* convert tree to its mirror */
        tree.invertTree();

        /* print inorder traversal of the minor tree */
        System.out.println("\nInorder traversal of binary tree is : ");
        tree.inOrder();

    }
}
