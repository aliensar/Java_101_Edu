package com.ayabakan;

public class _003_Switch {
    public static void main(String[] args) {
        char harf = 'D' ;
        switch (harf){
            case 'A':
                System.out.println("Girilen harf " + harf);
                break;
            case 'B':
                System.out.println("Girilen harf " + harf);
                break;
            case 'C':
                System.out.println("Girilen harf " + harf);
                break;
            default:
                System.out.println("Girdigin sey bulunamadi " +harf);
                break;
        }
        System.out.println("===========================");
        int gunSirasi = 5;
        switch (gunSirasi){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("thanks god its friday");
                break;
            case 6:
                System.out.println("cumartesi2");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("bulunamadi...");
        }

        System.out.println("===========================");

        for (int i = 0; i < 1000; i++) {
            if (i == 3) {
                System.out.println("Bulundu  : " + i);
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
