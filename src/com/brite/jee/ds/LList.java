package com.brite.jee.ds;

import java.util.stream.IntStream;

public class LList {

    Lnode head = null;
    Lnode tail = null;

    public void insertData(int data) {
        Lnode newNode = new Lnode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextRef(newNode);
            tail = newNode;
            tail.setNextRef(null);
        }
    }

    public void traverse() {
        if (head != null) {
            Lnode tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.getData() + " ");
                tempNode = tempNode.getNextRef();
            }
        } else {
            System.out.println("list is empty");
        }
    }

    public void deleteData(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head != null && head.getData() == data) {
            head = head.getNextRef();
        } else {
            Lnode tempNode = head.getNextRef();
            //Lnode datafound = null;
            Lnode previousNode = head;
            while (tempNode != null) {
                if (tempNode.getData() == data) {
                    //System.out.println(data);
                    break;
                } else if(tempNode.getData()!=data) {
                    previousNode = tempNode;
                    tempNode = tempNode.getNextRef();
                }
            }
           if (tempNode.getNextRef() != null && tempNode.getData() == data) {
                previousNode.setNextRef(tempNode.getNextRef());
               tempNode.setNextRef(null);
            } else if (tempNode.getNextRef() == null) {
                previousNode.setNextRef(null);
                tail = previousNode;
            }

        }
    }

    public void reverseList() {
        Lnode previousNode = null;
        Lnode currentNode = head;
        Lnode nextNode;
        while (currentNode != null) {
            nextNode = currentNode.nextRef;
            currentNode.setNextRef(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        if (currentNode == null) {
            head.setNextRef(null);
            head = previousNode;
        }


    }

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 26);
        LList ll = new LList();
        stream.forEach(e -> ll.insertData(e));
        ll.traverse();
        System.out.println();
        ll.reverseList();
        System.out.println();
        ll.traverse();
        System.out.println();
        ll.deleteData(24);
        System.out.println();
        ll.traverse();
        System.out.println();
        ll.deleteData(12);
        System.out.println();
        ll.traverse();

    }
}
