package com.matt.datatypes.linkedlist;

import java.util.LinkedList;

public class LinkedListMatt {

    // Properties
    Node head;
    int count;

    // Constructors
    public LinkedListMatt() {
        head = null;
        count = 0;
    }

    public LinkedListMatt(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        if (head == null) {
            head = temp;
            count++;
            return;
        }

        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();

    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        // remove from the back of the list
        Node current = head;
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Frank");
        System.out.println(linkedList);
        linkedList.add("The Tank");
        System.out.println(linkedList);
    }

}
