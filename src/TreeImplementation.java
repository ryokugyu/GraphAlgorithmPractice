/*
Creating a simple tree
        ----
        1    <-- root
      /   \
     2     3
    /
   4
*/

// Node Definition
class Node{
    int key;
    Node left, right;

    Node(int i){
        key = i;
        left = right = null;
    }
}

public class TreeImplementation {
    Node root;

    //Binary Tree implementation -- Constructor
    TreeImplementation(int key){
        root = new Node(key);
    }

    //Default Constructor
    TreeImplementation(){
        root = null;
    }

    public static void main(String[] args){
        TreeImplementation t = new TreeImplementation();

        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.left.left = new Node(4);
        t.root.right = new Node(3);
    }

}
