public class LinkedListInsertion {
    Node head;

    /******* Node definition *********/
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    /*************** Print the list *****************/
    public void PrintList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    /**********Insert element at the head of the Linked List ********************/
    public void insertAtHead(int d){
        // 0->1->2->3->4
        Node newNodeAtHead = new Node(d);
        newNodeAtHead.next = head;
        head = newNodeAtHead;
    }
    /****** Insert element after the given element in the list*******************/
    public void insertAfterGivenNode(int given_element, int new_data){
        // 0->1->2->10->3->4->5
        Node newNode = new Node(new_data);

        Node previous_node = head;
        while(previous_node.data != given_element){
            previous_node = previous_node.next;
        }
        newNode.next = previous_node.next;
        previous_node.next = newNode;

    }

    /************* Insert element at the end of the list ************************/
    public void insertAtEnd(int d){
        // 0->1->2->3->4->5
        Node newNode = new Node(d);

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
    }

    public static void main(String args[]){
        LinkedListInsertion llist = new LinkedListInsertion();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        //1 ->2->3->4
        llist.head.next = second;
        second.next = third;
        third.next =fourth;

        System.out.println("List before insertion:");
        llist.PrintList();
        System.out.println();

        llist.insertAtHead(0);
        System.out.println("List after insertion at head: ");
        llist.PrintList();
        System.out.println();

        llist.insertAtEnd(5);
        System.out.println("List after insertion at end: ");
        llist.PrintList();

        System.out.println();
        llist.insertAfterGivenNode(2,10);
        System.out.println("List after insertion at given element: ");
        llist.PrintList();

    }
}

