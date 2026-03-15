package com.java21.algorithms;

public class LNode {
    public int data;

    public LNode nextRef;

    public LNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LNode getNextRef() {
        return nextRef;
    }

    public void setNextRef(LNode nextRef) {
        this.nextRef = nextRef;
    }


}
