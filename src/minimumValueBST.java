/*
Find the node with minimum value in a Binary Search Tree.
 */
public class minimumValueBST {
    rNode head;
    static class rNode{
        int data;
        rNode left, right;
        rNode(int key){
            data = key;
            left = right = null;
        }
    }
    rNode insert(rNode node, int data){
        if(node == null){
            return(new rNode(data));
        } else{
            if(data <= node.data){
                node.left = insert(node.left, data);
            } else{
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public int minvalue(rNode node){
        rNode current = node;
        while(current.left != null)
            current = current.left;

        return(current.data);
    }
    public static void main(String[] args){
        minimumValueBST tree = new minimumValueBST();

        rNode root = null;
        root = tree.insert(root,4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);

        System.out.println("Minimum value of BST is " + tree.minvalue(root));

    }
}
