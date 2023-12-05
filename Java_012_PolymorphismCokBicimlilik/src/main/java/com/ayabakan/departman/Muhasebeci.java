package com.ayabakan.departman;

import com.ayabakan.base.Personel;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Muhasebeci extends Personel {
    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
     */

    private String unvani;
    private long sertifikaNo;



/*
    public Muhasebeci() {
    }
    public Muhasebeci(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo, int personelNo, String departmani, String unvani, long sertifikaNo) {
        super(adi, soyadi, telefonNo, kimlikNo, hesapNo, personelNo, departmani);
        this.unvani = unvani;
        this.sertifikaNo = sertifikaNo;
    }

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public long getSertifikaNo() {
        return sertifikaNo;
    }

    public void setSertifikaNo(long sertifikaNo) {
        this.sertifikaNo = sertifikaNo;
    }
*/

}
