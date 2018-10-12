package com.ycw.node;

/**
 * 类型       Node.java
 * describe
 * Created by ycongwen on 2018/8/21.
 */
public class Node<T> {
    public T data;
    public Node next;

    public Node() {

    }
    public Node(T data ,Node next){
        this.data = data;
        this.next = next;

    }

    public void setData(T data){
        this.data = data;

    }
    public T getData(){
        return data;
    }

    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }

}
