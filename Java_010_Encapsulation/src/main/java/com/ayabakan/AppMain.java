package com.ayabakan;

public class AppMain {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Ali", "Ayabakan", "12413251435",
                1231252346l, 30.15);
        System.out.println(musteri);

        musteri.setAdi("Mustafa");
        musteri.setSoyadi("kara");
        System.out.println(musteri.getAdi());
        System.out.println(musteri.getSoyadi());
        System.out.println(musteri.getIban());
        System.out.println(musteri.getHesapNo());
        System.out.println(musteri.getHesapCuzdani());

    }
}
