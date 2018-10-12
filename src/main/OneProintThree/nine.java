package main.OneProintThree;

import edu.princeton.cs.algs4.Stack;

/**
 * 类型       nine.java
 * describe
 * Created by ycongwen on 2018/9/29.
 */
public class nine {


    public static void main(String[] args) {
        String test = " 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String[] word = test.split(" ");

        Stack<String> operator = new Stack<String>();
        Stack<String> value = new Stack<String>();
        for (String e : word) {
            if (e.equals("+")||e.equals("-")||e.equals("*")||e.equals("/")) {
                operator.push(e);
            }else if(e.equals(")")){
                String op = operator.pop();
                String v = value.pop();
                if(op.equals("+") ||op.equals("-") ||op.equals("*") ||op.equals("/")) {
                    v = String.format("( %s %s %s )", value.pop(), op, v);
                }
                else if (op.equals("sqrt")) {
                    v = String.format("( %s %s )", op, v);
                }
                value.push(v);
            }else if(!e.equals(" ")) {
                value.push(e);
            }

        }
        System.out.println(value);
    }

}
