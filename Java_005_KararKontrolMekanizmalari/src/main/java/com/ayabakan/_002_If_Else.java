package com.ayabakan;

import java.util.Scanner;

public class _002_If_Else {
    public static void main(String[] args) {
        System.out.println("-----------IF ELSE--------------");
        if(1 < 50){
            System.out.println("EVET");
        }else {
            System.out.println("HAYIR");
        }
/*
        System.out.println("--------Oy Kulllanma-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz: ");
        int yas =sc.nextInt();
        int secmenYasi = 18;

        if(secmenYasi <= yas){
            System.out.println("EVET Oy kullanabilirsiniz");
        }else {
            System.out.println("HAYIR oy kullanamazsınız");
        }
*/

/*
        System.out.println("--------Ehliyet Alma-------------------");

        int adayYasi = 25;

        if(adayYasi == 16){
            System.out.println("Aday stajyer olabilir");
        }else if (17 < adayYasi ) {
            System.out.println("Reşit ehliyet alablir");
        } else {
            System.out.println("Uzgunum ehliyet icin uygun degilsiniz");
        }

*/

        System.out.println("--------Ehliyet Alma-------------------");

        int adayKisiYasi = 25;
        boolean saglikDurumu = false;

        if (saglikDurumu ==true) {
                if (adayKisiYasi == 16) {
                    System.out.println("Aday stajyer olabilir");
                } else if (17 < adayKisiYasi) {
                    System.out.println("Reşit ehliyet alablir");
                } else {
                    System.out.println("Uzgunum ehliyet icin uygun degilsiniz");
                }
            }
        else{
            System.out.println("Sağlıklı değil ehliyet alamaz");
        }

    }
}
