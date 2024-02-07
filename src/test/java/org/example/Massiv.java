package org.example;

import java.util.Arrays;

public class Massiv {

    public static void change(int[] x, int[] c, int k) {

        for (int i = 0; i < c.length; i++) {
            x[k] = c[i];
            k++;
        }
    }
}

//        public void main(String[] args) throws IOException {
//        String a = "j a v a . u t i l .A rrays 1 .2";
//        String b = a.replaceAll(" ","");
//        //      System.out.println(b);
//        int [] q = {1,2,3,4,5};
//        int [] w = {7,8,9};
//        q = Arrays.copyOfRange(w,0,3);
//        System.out.println(Arrays.toString(q));
//
//public static change () {
//    for (int i=0; i<3;i++) {
//    }
//}


