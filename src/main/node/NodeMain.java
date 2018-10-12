package main.node;

import com.ycw.node.Node;

/**
 * 类型       NodeMain.java
 * describe
 * Created by ycongwen on 2018/8/21.
 */
public class NodeMain {
    public void St(){

    }
    public static void main(String[] args){
        String a = "1" + "1";
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.data= "to";
        second.data= "be";
        third.data= "or";
        first.next = second;
        second.next = third;

        //third.last = second;
       // second.last = first;



        /**
         * 增加一个头节点
         */
       /* Node oldFirst = first;
        first = new Node();
        first.b="not";
        first.next = oldFirst;*/

        /**
         * 删除一个头节点
         */
        first = first.next;
       //first.last = null;

        System.out.println(first);


    }
}
