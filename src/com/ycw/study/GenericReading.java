package com.ycw.study;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 类型       GenericReading.java
 * describe
 * Created by ycongwen on 2018/8/15.
 */
public class GenericReading {

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Orange> oranges = Arrays.asList(new Orange());

    static class Reader<T>{
        T readExact(List<? extends T > t){
            return t.get(0);
        }
    }
    static void f1(){
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExact(oranges);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<String> stack1 = new Stack<String>();
        while (!StdIn.isEmpty())
            stack.push(StdIn.readInt());

        for (int t : stack) {
            System.out.println(t);
        }

    }
    public static void main1(String[] args){
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }
        int n = numbers.size();
        System.out.println(n);
        double sum =0.0;
        for (double x : numbers){
            sum += x;
        }
        double pingjun = sum/n;

        sum = 0.0;

        for (double x:numbers){
            sum += (x-pingjun) * (x-pingjun);
        }
        double biaozhun = sum/n-1;

        System.out.println("平均数"+pingjun);
        System.out.println("方差"+Math.sqrt(biaozhun));
    }



}
