package com.ayabakan;

public class _001_For {
    public static void main(String[] args) {

        int i = 0;

        ++i;

        System.out.println(i);


        System.out.println("------------------------");

        for (int j = 0; j < 10 ; j++) {
                System.out.println("j: " + j);
            for (int k = 1; k <= j; k++) {

                System.out.println("\tk: " + k);
            }

        }
    }
}