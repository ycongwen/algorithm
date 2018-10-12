package com.ycw.study;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * 类型       Evalatue.java
 * describe
 * Created by ycongwen on 2018/8/16.
 */
public class Evalatue {
    public static void main (String[] args){

        Stack<String> ops = new Stack<String>();
        Stack<Double> val = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            String std = StdIn.readString();
            String[] sp = std.split(" ");
            for (String s : sp) {
                if (s.equals("(")) {

                } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("sqrt")) {
                    ops.push(s);
                } else if (s.equals(")")) {
                    String a = ops.pop();
                    double value = val.pop();
                    if (a.equals("+")) {
                        value = value + val.pop();
                    } else if (s.equals("-")) {
                        value = value - val.pop();
                    } else if (s.equals("*")) {
                        value = value * val.pop();
                    } else if (s.equals("/")) {
                        value = value / val.pop();
                    } else if (s.equals("sqrt")) {
                        value = Math.sqrt(value);
                    }
                    val.push(value);
                } else {
                    val.push(Double.valueOf(s));
                }
            }
        }
        System.out.println(val.pop());
    }
}
