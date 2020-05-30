//My method for creating a tree from InOrder and PostOrder Traversal.

public class PostOrderFromInPre {
    TreeFromInOrderPreOrder.Node root;
    static int postIndex;

    void SetIndex(int n){
        postIndex = n;
    }

    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right =null;
        }
    }

    public Node buildTree(int in[], int post[], int inStrt, int inEnd){
        if(inStrt>inEnd)
            return null;

        Node tNode;
        tNode = new Node(post[postIndex--]);
        if(inStrt == inEnd)
            return tNode;

        int inIndex = search(in,inStrt,inEnd,tNode.data);
        tNode.right = buildTree(in, post, inIndex+1, inEnd);
        tNode.left = buildTree(in, post, inStrt, inIndex-1);


        return tNode;
    }

    public int search(int arr[], int strt, int end, int value){
        int i;

        for(i=strt; i <= end; i++){
            if(arr[i] == value)
                return i;
        }
        return i;
    }

    public void printPreOrder(Node node){
        if(node == null)
            return;

        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args){
        PostOrderFromInPre tree = new PostOrderFromInPre();
        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };

        int len =  in.length;
        tree.SetIndex(post.length-1);
        Node root = tree.buildTree(in, post, 0, len-1);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printPreOrder(root);
    }
}
