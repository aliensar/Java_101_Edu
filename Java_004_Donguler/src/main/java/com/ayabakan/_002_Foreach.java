package com.ayabakan;

public class _002_Foreach {
    public static void main(String[] args) {
        /*
    String ogrenci1 = "Mert";
    String ogrenci2 = "Ali";
    String ogrenci3 = "Ebru";
    String ogrenci4 = "Elcin";
    */
        String[] ogrenciler = {"Mert","Ali ","Ebru","Elcin" };

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);

    }
        System.out.println("*************************** \n");
        int[] numbers = {1, 23, 45, 6};
        for (int num : numbers) {
            System.out.println((num) + "\t" + (num + 5));
        }

    }
}
