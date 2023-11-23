package com.aliensar;

public class Insan { //scope kapsam
    /*....*/

    public static void main(String[] args) {

        String firstName = "Ali" ;
        String lastName = "Ayabakan";
        Integer kilo = 65;
        double boy = 1.77;

        System.out.println("Ad Bilgisi: " + firstName);
        System.out.println("Soyadi: " + lastName);
        System.out.println("Kilo: " + kilo);
        System.out.println("boy : " + boy);

        firstName ="Muhammed Ali";
        lastName = "Çiftçi";
        kilo = 80;
        boy = 1.78;

        System.out.println("\n\nboy:" + boy + " - KİLO: " + kilo + "\n" + firstName + " " +lastName);

    }


}
