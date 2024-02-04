package org.rd.lessons.Odevler.HW8LESSON11;

import org.rd.lessons.Odevler.HW8LESSON11.Erkek;

public class Personel {
    private String ad;
    private String soyad;
    private String dogumTarihi;

    public Personel(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int retirementAge() {
        return (this instanceof Erkek) ? 65 : 60;
    }
}