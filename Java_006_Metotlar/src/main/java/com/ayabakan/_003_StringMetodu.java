package com.ayabakan;

public class _003_StringMetodu {
    private static void cizgiCek() {
        System.out.println("============================");
    }
    private String hesabiKapat(int uyeNo, String adi, String soyadi, boolean uyeDurumu) {

        if ( (uyeBul(uyeNo) == true ) && (uyeDurumu ==true) ){
            return "Tamam hesap borcu " + adi + " " + soyadi + " için ödenmiştir";
        }
        return "OLMADI";
    }
    private static boolean uyeBul(int uyeNo) {
        if(uyeNo>0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        _003_StringMetodu obj = new _003_StringMetodu();
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

        String sonuc = obj.hesabiKapat(1, "Ali Ensar", "Ayabakan", true);
        System.out.println("Gelen Cevap: " +sonuc);
    }

    private static void selamVer(String isim) {
        System.out.println("SELAMLAR SAYIN " + isim + " HOŞGELDİNİZ.");
    }

}
