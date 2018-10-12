package com.ycw.study;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 类型       VisualAccumulator.java
 * describe
 * Created by ycongwen on 2018/7/27.
 */
public class VisualAccumulator {
    private double total;
    private int N;
    public VisualAccumulator(int trials,double max){
        StdDraw.setYscale(0,max);
        StdDraw.setXscale(0,trials);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val){
        N++;
        total +=val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }

    public double mean(){
        return total/N;
    }
    public String toString(){
        return "mean (" + N + "VALUES):"+String.format("%7.5f",mean());
    }
}
