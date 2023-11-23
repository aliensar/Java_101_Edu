package com.ayabakan;

public class AppMain {
    public static void main(String[] args) {

        int a = 25;
        int b = 10;
        int c = a + b;
        System.out.println("Sonuc: " +c);

        float sonuc = (float) a /  b;
        System.out.println("Bolme: " + sonuc);
        System.out.println("Mod Alma "+ (a % b));
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(( a > b ) ? "EVET" : "HAYIR");

        int i = 0;

        System.out.println(i + 1);
        System.out.println(i + 1);
        System.out.println(i + 1);
        System.out.println(i + 1);
        System.out.println(i + 1);
        System.out.println(i + 1);
    }
}