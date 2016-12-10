package com.matt.datatypes.queue;


import java.util.LinkedList;

public class Queue {

    LinkedList queue;

    // Constructor. Making a queue instance.
    public Queue() {
        queue = new LinkedList();
    }

    // Methods
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(int n) {
        queue.addLast(n);
    }

    public int dequeue() {
        return (int) queue.removeFirst();
    }

    public int peek() {
        return (int) queue.getFirst();
    }

    public static void main(String args[]) {
        Queue numberQueue = new Queue();

        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);

        System.out.println("1st out: " + numberQueue.dequeue());
        System.out.println("Peek at 2nd item: " + numberQueue.peek());
        System.out.println("2nd out: " + numberQueue.dequeue());
        System.out.println("3rd out: " + numberQueue.dequeue());
    }
}
