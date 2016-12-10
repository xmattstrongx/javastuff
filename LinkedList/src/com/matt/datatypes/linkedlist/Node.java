package com.matt.datatypes.linkedlist;

public class Node {
    // Properties
    private Node next;
    private int data;

    // Constructors
    public Node(int newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(int newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters & Setters
    public int getData() {
        return this.data;
    }

    public void setData(int newData) {
        this.data = newData;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }


}
