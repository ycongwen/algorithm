package com.ycw.study;

import edu.princeton.cs.algs4.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类型       Test.java
 * describe
 * Created by ycongwen on 2018/7/24.
 */
public class Test {
    public  void main1(String[] args) throws Exception{
        int[] e = In.readInts(args[0]);
        int f = 0;
        int g = 1;
        List b = new ArrayList();
        for (int i=0; i<=15;i++){
            b.add(f);
            Thread.sleep(200);
            System.out.println(b);
            f = f+g;
            g = f-g;
        }
        System.out.println(1+1+"3");
        Double a = Double.POSITIVE_INFINITY;
    }
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if( key < a[mid]){
                hi = mid -1 ;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static String exR2(int n){
        if(n <= 0)
            return "";
        return exR2(n-3)+n+exR2(n-2)+n;
    }
    public  void main2(String[] args) throws Exception{
        int[] whiteList = {11,12,25,36,34,81,1,9,18,77,84,98};
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key,whiteList)<0){
                System.out.println(key);
            }
        }
    }
    public  static  void main(String[] args) throws Exception{

        int[][] a={{1,2,3},{4,5,6},{7,8}};

        int b[][]={{1},{2},{3}};

        int[][] c=new int[][]{{1},{2},{3}};
        int d=b[1][0];



        //打印二维布尔型数组的每行每列
        Boolean[][] e = {{true,false},{true,false},{true,false},{true,false}};
        for(int i=0;i<e.length;i++){
            for(int j =0;j<e[i].length;j++){
                //System.out.println((e[i][j]==true?"*":"")+"第"+i+"行,第"+j+"列");
            }

        }
        /**
         * 二维数组行列交换
         */
        Boolean[][] f = {{true,false},{true,false},{true,false},{true,false}};
        for(int i=0;i<f.length;i++){
            for(int j =0;j<f[i].length;j++){
                //f[i]={true,true};
            }

        }
        //输入整数N,使log2N的最大证书

        int n = 1;//StdIn.readInt();
        int k=0;
        if(0 < n && n < 1){
            int count = 1;
            while(count>n){
                count *= 1/2.0;
                k -=1;
            }
            System.out.print(k+1);

        }else if (n >= 1){
            int count = 1;
            k =0;
            while (count <= n){
                count *= 2;
                k +=1;
            }
            System.out.println(k-1);
        }

        /**
         * exR1
         */
        //System.out.println(exR2(16));

        /**
         * 测试代码
         */
        double t = 9.0;
        while (Math.abs(t - 9.0/t) >.001){
            t = (9.0/t + t) /2.0;
        }

        StdOut.printf("%.5f\n",t);

       /* int[] whiteList = {111,121,251,361,341,811,11,91,181,771,841,981,
                112,122,252,362,342,812,12,92,182,772,842,982,
                113,123,253,363,343,813,13,93,183,773,843,983,
                117,127,257,367,347,817,17,97,187,777,847,987,
                118,128,258,368,348,818,18,98,188,778,848,988,
                119,129,259,369,349,819,19,99,189,779,849,989,
                114,124,254,364,344,814,14,94,184,774,844,984,
                115,125,255,365,345,815,15,95,185,775,845,985,
                116,126,256,366,346,816,16,96,186,776,846,986};

        int[] b = {111,121,251,361,341,811,11,91,181,771,841,981,
                112,122,252,362,342,812,12,92,182,772,842,982,
                113,123,253,363,343,813,13,93,183,773,843,983,
                114,124,254,364,344,814,14,94,184,774,844,984,
                115,125,255,365,345,815,15,95,185,775,845,985,
                116,126,256,366,346,816,16,96,186,776,846,986,
                117,127,257,367,347,817,17,97,187,777,847,987,
                118,128,258,368,348,818,18,98,188,778,848,988,
                119,129,259,369,349,819,19,99,189,779,849,989,
                110,120,250,360,340,810,10,90,180,770,840,980};
        List e = new ArrayList();
        for(int i=0;i<whiteList.length;i++){
            for (int j=0;j<b.length;j++){
                if(whiteList[i]==b[j]){
                    e.add(whiteList[i]);
                    System.out.println(e);
                }
            }
        }*/

        /**
         * 在除了矩形范围外画点
         */
        String[] arr = {".2", ".90", ".81",".92","10000"};
        double xlo = Double.parseDouble(arr[0]);
        double xhi = Double.parseDouble(arr[1]);
        double ylo = Double.parseDouble(arr[2]);
        double yhi = Double.parseDouble(arr[3]);

        int T = Integer.parseInt(arr[4]);
        Interval1D xinterval = new Interval1D(xlo,xhi);
        Interval1D yinterval = new Interval1D(ylo,yhi);
        Interval2D box = new Interval2D(xinterval,yinterval);

        //box.draw();

        Counter C = new Counter("hits");

        /*for (int tt = 0;tt<T;tt++){
            double x = Math.random();
            double y = Math.random();

            Point2D p = new Point2D(x,y);
            if (box.contains(p)) {
                C.increment();
            }else {
                p.draw();
            }

        }

        for (int tt = 0;tt<1000;tt++){
            double x = Math.random();
            double y = Math.random();

            Point2D p = new Point2D(x,y);
            if (box.contains(p)) {
                C.increment();
                p.draw();
            }

        }*/
        StdOut.println(C);
        StdOut.println(box.area());

        /**
         * 画图
         */

        int TT = Integer.parseInt("5000");
        VisualAccumulator vis = new VisualAccumulator(TT,1.0);
        for (int tt =0;tt<TT;tt++){
            vis.addDataValue(StdRandom.random());
        }
        StdOut.println(vis);

    }
}
