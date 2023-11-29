package com.ayabakan;

import com.ayabakan.departman.Mudur;
import com.ayabakan.departman.Muhasebeci;

public class AppMain {
    public static void main(String[] args) {
    Mudur mudur = new Mudur();
    mudur.setAdi("Helen");
    mudur.setSoyadi("Baysal");
    mudur.setTelefonNo("1233246");
    mudur.setPersonelNo(14);
    mudur.setDepartmani("Bilişim");
    mudur.setTahsilDurumu("üniversite");

    mudur.mudurBilgisiniYaz(mudur);
        //System.out.println("ADI SOYADI: " + mudur.getAdi() + " " + mudur.getSoyadi());
        //System.out.println("TAHSİL: "+ mudur.getTahsilDurumu());
        System.out.println("=========================================================");




    Muhasebeci muhasebeci= new Muhasebeci ();
    muhasebeci.setAdi("Helen");
    muhasebeci.setSoyadi("Baysal");
    muhasebeci.setTelefonNo("1233246");
    muhasebeci.setUnvani("Mali Müşavir");
    muhasebeci.setDepartmani("muhasebe");

    muhasebeci.bilgiYaz(muhasebeci);

    System.out.println(muhasebeci);
    System.out.println(mudur);
    }

}
