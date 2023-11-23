package com.ayabakan;

public class _003_StringMetodu {
    private static void cizgiCek() {
        System.out.println("============================");
    }
    public static void main(String[] args) {
        String adi = "AliEnsar";
        System.out.println(adi.length());

        if (adi.length() > 5) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }

        cizgiCek();

        String adi2 = "Mustafa";
        String adi3 = "Mehmet";

        if (adi2 == adi3) {
            System.out.println("ESİT");
        } else {
            System.out.println("Degil");
        }

        cizgiCek();

        if (adi2.equals(adi3)) {
            System.out.println("ESİT");
        } else {
            System.out.println("Degil");
        }

        cizgiCek();

        selamVer("Ali Ensar");

        cizgiCek();

        hesabiKapat(1, "Ali Ensar", "Ayabakan", true);

    }

    private static void hesabiKapat(int uyeNo, String adi, String soyadi, boolean uyeDurumu) {

    }

    private static void selamVer(String isim) {
        System.out.println("SELAMLAR SAYIN " + isim + " HOŞGELDİNİZ.");
    }


}
