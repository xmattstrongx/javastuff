package com.matt.datatypes.stack;

import java.util.LinkedList;

public class Stack {

    LinkedList stack;

    public Stack() {
        stack = new LinkedList<String>();
    }

    public void push(String s) {
        stack.addLast(s);
    }

    public String pop() {
        return (String) stack.removeLast();
    }

    public int size() {
        return stack.size();
    }

    public String peek() {
        return (String) stack.getLast();
    }

    public static void main(String args[]) {
        Stack stacky = new Stack();

        stacky.push("Hi");
        stacky.push("there");
        System.out.println("Size of stacky: " + stacky.size());

        System.out.println("Peek: " + stacky.peek());

        System.out.println(stacky.pop() + " ");
        System.out.println(stacky.pop() + "! ");
    }
}
