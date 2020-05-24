package com.DataStructureImplementation;/*
Java program to implement Queue data structure using Array.
Operations to perform: Front, Rear, Enqueue, Dequeue
 */

public class QueueUsingArrayImplementation{
    int front, rear,capacity,size;
    int[] array;

    QueueUsingArrayImplementation(int capacity){
        front = this.size = 0;
        this.capacity = capacity;
        rear = capacity-1;
        array = new int[this.capacity];
    }

    //When queue size is equals to capacity. Overflow
    boolean isFull(QueueUsingArrayImplementation queue){
        return (queue.size == queue.capacity);
    }

    //When queue size is 0. Underflow
    boolean isEmpty(QueueUsingArrayImplementation queue){
        return (queue.size==0);
    }

    //Add element to the front
    public void enqueue(int item){
        if(isFull(this)) {
            return;
        }
        this.rear = (this.rear+1)%this.capacity;
        this.array[this.rear] = item;
        this.size+=1;
        System.out.println(item+ " enqueued to queue");
    }

    //Removes element from the last and return the element
    public int dequeue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size -=1;
        return item;
    }

    //Returns the first element of the queue
    public int front(){
        if(isEmpty(this)) return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    //Return the rear element of the queue(FIFO method)
    public int rear(){
        if(isEmpty(this)) return Integer.MIN_VALUE;

        return this.array[this.rear];
    }

    public static void main(String[] args){
        QueueUsingArrayImplementation queue = new QueueUsingArrayImplementation(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());
    }
}