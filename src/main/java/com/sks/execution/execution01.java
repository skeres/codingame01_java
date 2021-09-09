package com.sks.execution;

import com.sks.model.Pi;

public class execution01 {
    public static void main(String[] args) {
        System.out.println("begin");

        calculPi();

        System.out.println("end");
    }

    public static void calculPi(){
        //100 000 random points
        double[][] randamPoints=new double[10000][2];
        for (int i=0; i< randamPoints.length; i++) {
            randamPoints[i][0]=Math.random();
            randamPoints[i][1]=Math.random();
        }

        System.out.println("PI approximation="+Double.toString(Pi.approx(randamPoints)));

    }
}
