package com.DataStructureImplementation;

public class LinkedListDeletion {
    Node head;

    static class Node{
        int data;
        Node next;
        //Constructor
        Node(int d){
            data =d;
            next = null;
        }
    }

    /********* Printing the list*********/
    public void PrintList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    /**********Delete the head of list************/
    public void DeleteAtHead(){
        head = head.next;
    }

    /**********Delete the given element************/
    public void DeleteGivenElement(int d){
        Node previous = head;
        while(previous.next.data != d ){
            previous = previous.next;
        }
        previous.next = previous.next.next;
        previous.next.next = null;

    }

    /**********Delete the end of List*************/
    public void DeleteAtEnd(){
        Node last = head;

        while((last.next).next !=null){
            last = last.next;
        }
        last.next = null;
    }


    public static void main(String args[]){
        LinkedListDeletion llist = new LinkedListDeletion();

        llist. head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next= second;
        second.next = third;

       /* llist.DeleteAtHead();
        llist.PrintList();
        System.out.println();

        llist.DeleteAtEnd();
        llist.PrintList();

        */

        llist.PrintList();
        System.out.println();

        llist.DeleteGivenElement(2);
        llist.PrintList();
    }

}
