package com.ycw.node;

/**
 * 类型       LinkList.java
 * describe
 * Created by ycongwen on 2018/8/22.
 */
public class LinkList<T> {
    public Node head;
    public int count;
    public LinkList(){
        head = null;
        count = 0;
    }
    public void addNode(T data){
        Node node = new Node(data,null);
        Node tmp = null;
        if (head == null) {
            head = node;
            tmp = node;
        } else {
            tmp = head;
            while (tmp.next != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(node);
        }
        count ++;

    }

    public void delNode(T data) {
        Node front = null;//定义一个空节点
        while (head != null) {
            if (head.equals(data)){
                break;
            }
            front = head;
            head = front.getNext();
        }

        if (head != null) {
            if (front != null) {
                head = head.next;
            }else {
                front.setNext(head.getNext());
            }
            count--;
        } else {
            count--;
        }
    }

}
