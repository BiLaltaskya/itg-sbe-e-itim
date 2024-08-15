package com.itg.oop.sessiontrials.day2.generic;

public class Personel {
    private String ad;
    private String soyad;
    private double maas;

    public Personel(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public double getMaas() {
        return maas;
    }
}
