package com.ycw.study;

import java.util.Iterator;

/**
 * 类型       ResizingArrayStack.java
 * describe
 * Created by ycongwen on 2018/8/21.
 */
public class ResizingArrayStack<B> implements Iterable<B> {
    private B[] a = (B[]) new Object[1];
    private int N=0;
    public boolean isEmpty(){
        return  N==0;
    }
    public int size(){
        return N;
    }
    private void resize(int max){
        B[] b = (B[])new Object[max];
        for (int i = 0; i < N; i++){
            b[i] = a[i];
        }
        a = b;

    }
    public void push(B v){

        if (N == a.length){
            resize(2*a.length);
        }
        a[N++] = v;
    }

    public B pop(){
        B b = a[--N];
        a[N] = null;
        if(N > 0 && N== a.length/4){
            resize(a.length/2);
        }
        return b;
    }




    public Iterator<B> iterator(){
        return new ReverseArryIterator();
    }

    private class ReverseArryIterator implements Iterator<B>{

        private int i = N;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public B next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
