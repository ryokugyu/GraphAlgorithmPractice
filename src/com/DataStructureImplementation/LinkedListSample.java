package com.DataStructureImplementation;

public class LinkedListSample {
    Node head; //head of the list

    static class Node {
        int data;
        Node next;

        //Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String args[]){
        LinkedListSample llist = new LinkedListSample();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next =second;
        second.next = third;


    }
}
