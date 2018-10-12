package com.ycw.study;

/**
 * 类型       FixedCapacityStackOfStrings.java
 * describe
 * Created by ycongwen on 2018/8/20.
 */
public class FixedCapacityStackOfStrings<B> {
    private B[] a;

    public int N;

    public FixedCapacityStackOfStrings(int cap){
        a = (B[])new Object[cap];
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
    public void resize(int max){
        B[] b = (B[])new Object[max];
        for (int i = 0; i<N; i++) {
            b[i]=a[i];
    }
        a = b;
    }

}
