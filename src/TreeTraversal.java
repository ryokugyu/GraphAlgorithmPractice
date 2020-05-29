class Node {
    int key;
    Node left, right;

    Node(int i) {
        key = i;
        left = right = null;
    }
}

public class TreeTraversal {
    Node root;

    TreeTraversal(int key) {
        root = new Node(key);
    }

    TreeTraversal() {
        root = null;
    }

    public void preOrderTraversal(Node node) {
        if(node == null)
            return;

        System.out.print(node.key + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public void postOrderTraversal(Node node) {
        if(node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.key + " ");
    }

    public void inOrderTraversal(Node node) {
        if(node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.key+ " ");
        inOrderTraversal(node.right);


    }

    void preOrderTraversal() {
        preOrderTraversal(root);
    }

    void postOrderTraversal() {
        postOrderTraversal(root);
    }

    void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public static void main(String args[]) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.preOrderTraversal();

        System.out.println("\n Inorder traversal of binary tree is: ");
        tree.inOrderTraversal();

        System.out.println("\n Postorder traversal of binary tree is: ");
        tree.postOrderTraversal();

    }

}
