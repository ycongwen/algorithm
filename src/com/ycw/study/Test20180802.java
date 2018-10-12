package com.ycw.study;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * 类型       Test20180802.java
 * describe
 * Created by ycongwen on 2018/8/2.
 */
public class Test20180802 {

    public static String mystery(String s){
        int n = s.length();
        if(n <=1){
            return s;
        }
        String a = s.substring(0,n/2);
        String b = s.substring(n/2,n);

        return mystery(a)+mystery(b);

    }
    public static void main(String[] args){
        System.out.println(mystery("789"));

        int n = Integer.parseInt("150");
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++)
        {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        Arrays.sort(points);
        for (int i = 0; i < n; i++)
        {
            points[i].draw();
            System.out.println(points[i]);
        }
        double minDistance = (points[0].x() - points[n-1].x()) * (points[0].x() - points[n-1].x())
                + (points[0].y() - points[n-1].y()) * (points[0].y() - points[n-1].y());
        int minIndex = n;
        for (int i = 0; i < n - 1; i ++)
        {
            double dis = (points[i].x() - points[i+1].x()) * (points[i].x() - points[i+1].x())
                    + (points[i].y() - points[i+1].y()) * (points[i].y() - points[i+1].y());
            if (minDistance > dis)
            {
                minDistance = dis;
                minIndex = i;
            }
        }
        System.out.println(Math.sqrt(minDistance));
        StdDraw.setPenColor(StdDraw.RED);
        if (minIndex == n)
        {
            System.out.println(points[0]);
            System.out.println(points[n-1]);
            StdDraw.line(points[n-1].x(), points[n-1].y(), points[0].x(), points[0].y());
        }
        else
        {
            System.out.println(points[minIndex]);
            System.out.println(points[minIndex + 1]);
            StdDraw.line(points[minIndex].x(), points[minIndex].y(),
                    points[minIndex+1].x(), points[minIndex+1].y());

        }

    }
}
