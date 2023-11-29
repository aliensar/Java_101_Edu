package com.ayabakan;

public class AppMain {
    public static void main(String[] args) {
        boolean medeniDurumu1 = true; // 1 yes YES TRUE
        boolean medeniDurumu2 = false; // 0 no NO FALSE

        int sayi0; // 2,147,483,647
        byte yasi1 = 10;  // 127
        short yasi2 = 32767; // 32767
        int sonuc = yasi1 + yasi2;

        System.out.println(sonuc);
/*
        byte + byte sonucu int tipindedir
        short + short sonucu int tipindedir.
        byte + short sonucu int tipindedir.
*/
        int deneme1 = 2147483647;
        int deneme2 = 10;
        long sonuc2 = (long) deneme1 + deneme2;    //  long sonuc2 =  deneme1 + (long) deneme2;
        System.out.println(sonuc2);

        float piSayisi = 3.14f; // 3.14F; (float) 3.14;
        double bankaHesabiBilgisi = 12.34567893;
        long hesapBilgisi= 100_000_000;

        float sayimiz1 = 1;
        double sayimiz2 = 2;
        double sonucumuz1 = sayimiz1 + sayimiz2;
        System.out.println(sonucumuz1);

        float sayimiz3 = 1.0f;
        double sayimiz4 = 2;
        double sonucumuz2 = sayimiz1 + sayimiz2;
        System.out.println(sonucumuz2);
    }
}
