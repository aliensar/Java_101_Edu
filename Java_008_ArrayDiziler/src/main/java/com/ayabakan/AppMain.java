package com.ayabakan;

public class AppMain {
    public static void main(String[] args) {

        int sayi[] = new int[5];
        sayi[0] = 100;
        sayi[1] = 200;
        sayi[2] = 300;
        sayi[3] = 400;
        sayi[4] = 500;
        System.out.println(sayi[0] + " " + sayi[1] + " " + sayi[2] + " " + sayi[3] + " " + sayi[4]);

        short myArray[] = new short[4];
        myArray[0] = 1000;
        // myArray[1] = 0;
        // myArray[2] = 0;
        // myArray[3] = 0;

        System.out.println(myArray[0]);  // 1000
        System.out.println(myArray[1]);  // 0
        System.out.println(myArray[2]);  // 0
        System.out.println(myArray[3]);  // 0

        System.out.println("=================================================");

/*
        byte myArrayByte[] = new byte[4];
        myArrayByte[0] = 14;
        myArrayByte[1] = 53;
        myArrayByte[2] = ;
        myArrayByte[3] = 0;
*/
        byte myArrayByte[] = {14, 53, 19, 23};
        System.out.println(myArrayByte[0]);
        System.out.println(myArrayByte[1]);
        System.out.println(myArrayByte[2]);
        System.out.println(myArrayByte[3]);

        System.out.println("=======================================================");

        for (int i = 0; i < myArrayByte.length; i++) {
            System.out.println(myArrayByte[i]);

        }
    }
}
