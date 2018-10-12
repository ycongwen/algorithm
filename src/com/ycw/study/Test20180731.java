package com.ycw.study;

import edu.princeton.cs.algs4.*;

/**
 * 类型       Test20180731.java
 * describe
 * Created by ycongwen on 2018/7/31.
 */
public class Test20180731 {
    public static void main(String[] args){
        String string1 = "HELLO";
        String string2 = string1;
        string1 = "WORLD";
        StdOut.println(string1);
        StdOut.println(string2);
        /**
         * 在除了矩形范围外画点
         */
        String[] arr = {".7", ".8", ".7",".8","100"};
        double xlo = Double.parseDouble(arr[0]);
        double xhi = Double.parseDouble(arr[1]);
        double ylo = Double.parseDouble(arr[2]);
        double yhi = Double.parseDouble(arr[3]);

        int T = Integer.parseInt(arr[4]);
        Interval1D xinterval = new Interval1D(xlo,xhi);
        Interval1D yinterval = new Interval1D(ylo,yhi);
        Interval2D box = new Interval2D(xinterval,yinterval);

        box.draw();

        Counter C = new Counter("hits");

        for (int tt = 0;tt<T;tt++){
            double x = Math.random();
            double y = Math.random();

            Point2D p = new Point2D(x,y);
            if (box.contains(p)) {
                p.draw();
                if(box.contains(p)){
                    p.draw();
                }
            }

        }


        StdOut.println(C);
        StdOut.println(box.area());


    }
}
