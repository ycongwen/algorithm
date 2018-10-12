package main;

import com.ycw.study.FixedCapacityStackOfStrings;
import edu.princeton.cs.algs4.StdIn;

/**
 * 类型       FixedCapacityStackOfStringsMain.java
 * describe
 * Created by ycongwen on 2018/8/20.
 */
public class FixedCapacityStackOfStringsMain {
    public static void main(String[] args){

        //ResizingArrayStack e = new ResizingArrayStack();
        FixedCapacityStackOfStrings<String> a = new FixedCapacityStackOfStrings<String>(2);
        String d = "to be or not to - be - - that - - - is";
        while (!StdIn.isEmpty()) {
            String c = StdIn.readString();
            if (!c.equals("-")) {
                a.push(c);
            } else if (!c.isEmpty()){
                System.out.println(a.pop()+" ");
            }
        }
        System.out.println(a.N+ "left on stack");


    }
}

