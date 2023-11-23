package com.ayabakan;

public class _002_KareAl {
    public static void main(String[] args) {
        System.out.println("Kare al");

        System.out.println(kareal(5,2));

        System.out.println("TOPLAMA : " + topla(5, 2, 4));

    }

    private static float topla(int sayi1, int sayi2, int sayi3) {
        return (sayi1+sayi2+sayi3);
    }

    private static double kareal(double taban, double us) {
        return Math.pow(taban, us);
    }
}
