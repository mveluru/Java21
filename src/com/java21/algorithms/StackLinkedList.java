package com.java21.algorithms;

import com.brite.jee.datastructures.Lnode;

public class StackLinkedList {
    Node head;
    Node tail;
    int size;
    int top;

    StackLinkedList(int size) {
        this.size = size;
        this.top = 0;
    }

    public void push(int data) {
        //stack head always is top element
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node nexNode = head;
            head = newNode;
            tail = nexNode;
            tail.setNext(null);
        }
    }


    public void pop() {

        System.out.print(head.data + " ");
        Node nextNode = head.next;
        head = nextNode;
    }

    public void traverse() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();

        }

        //ystem.out.println("Stack LinkedList is empty");

    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        StackLinkedList list = new StackLinkedList(5);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        list.traverse();
    }
}
