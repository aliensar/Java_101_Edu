package com.ayabakan.base;

import com.ayabakan.departman.Mudur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.StringJoiner;
@Setter
@Getter

public class Personel {
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;

    public Personel(){

    }

    public Personel(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo,
                    int personelNo, String departmani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNo = telefonNo;
        this.kimlikNo = kimlikNo;
        this.hesapNo = hesapNo;
        this.personelNo = personelNo;
        this.departmani = departmani;
    }


    public void bilgiYaz(Personel personel) {
        if (personel.getSoyadi()==null)
            personel.setSoyadi("----");
        System.out.println("ADI SOYADI: " + personel.getAdi() + " " + personel.getSoyadi());
        if(personel.getDepartmani()==null)
            personel.setDepartmani("");
            System.out.println("DEPARTMAN: " + personel.getDepartmani());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personel{");
        sb.append("adi='").append(adi).append('\'');
        sb.append(", soyadi='").append(soyadi).append('\'');
        sb.append(", telefonNo='").append(telefonNo).append('\'');
        sb.append(", kimlikNo='").append(kimlikNo).append('\'');
        sb.append(", hesapNo='").append(hesapNo).append('\'');
        sb.append(", personelNo=").append(personelNo);
        sb.append(", departmani='").append(departmani).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void hesapla
}

