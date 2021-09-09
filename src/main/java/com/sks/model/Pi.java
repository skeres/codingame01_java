package com.sks.model;

import java.util.Arrays;

public class Pi {

    /**
     * approximate Pi
     */

    public static double approx(double [][] pts) {
        double value=0d;
        double ptsInCircle=0;



        for (int i=0;i<pts.length;i++) {
            double x=pts[i][0];
            double y=pts[i][1];
            if (Math.pow(x,2)+Math.pow(y,2) <= 1 ) {
                ptsInCircle++;
            }
        }

        value=(double) ptsInCircle/pts.length*4;

        //other way :
        long ptsInCircle_2=Arrays.stream(pts).filter(f->Math.pow(f[0],2)+Math.pow(f[1],2)<=1).count();
        System.out.println(Double.toString(ptsInCircle_2));
        double d=ptsInCircle_2/(double)pts.length*4d;
        System.out.println(d);
        //





        return value;
    }
}
