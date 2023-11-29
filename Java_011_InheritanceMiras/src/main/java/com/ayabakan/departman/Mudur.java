package com.ayabakan.departman;

import com.ayabakan.base.Personel;

public class Mudur extends Personel {
    private String tahsilDurumu;
    private byte tecrubeYili;

    public Mudur() {
    }

    public Mudur(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo,
                 int personelNo, String departmani, String tahsilDurumu, byte tecrubeYili) {
        super(adi, soyadi, telefonNo, kimlikNo, hesapNo, personelNo, departmani);
        this.tahsilDurumu = tahsilDurumu;
        this.tecrubeYili = tecrubeYili;
    }

    public String getTahsilDurumu() {
        return tahsilDurumu;
    }

    public void setTahsilDurumu(String tahsilDurumu) {
        this.tahsilDurumu = tahsilDurumu;
    }

    public byte getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(byte tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }


    public void mudurBilgisiniYaz(Mudur mudur) {
        System.out.println("ADI SOYADI: " + mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println("TAHSİL: " + mudur.getTahsilDurumu());
        System.out.println("DEPARTMAN: " +mudur.getDepartmani());
    }
}
