package com.brite.jee.ds;

import java.util.stream.IntStream;

public class LList {

    Lnode head = null;
    Lnode tail = null;

    public  void insertData(int data){
        Lnode newNode = new Lnode(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.setNextRef(newNode);
            tail=newNode;
            tail.setNextRef(null);
        }
    }
    public void traverse(){
        if(head!=null){
            Lnode tempNode = head;
            while(tempNode!=null){
                System.out.print(tempNode.getData()+" ");
                tempNode = tempNode.getNextRef();
            }
        }else{
            System.out.println("list is empty");
        }
    }

    public void reverseList(){
        Lnode previousNode = null;
        Lnode currentNode =head;
        Lnode nextNode;
        while (currentNode!=null){
          nextNode = currentNode.nextRef;
          currentNode.setNextRef(previousNode);
          previousNode = currentNode;
          currentNode = nextNode;
        }
        if (currentNode==null){
            head.setNextRef(null);
            head= previousNode;
        }


    }
    public static void main(String[] args){
        IntStream stream = IntStream.range(1,25);
        LList ll = new LList();
        stream.forEach(e->ll.insertData(e));
        ll.traverse();
        ll.reverseList();
        System.out.println();
        ll.traverse();

    }
}
