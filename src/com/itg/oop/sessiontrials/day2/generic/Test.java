package com.itg.oop.sessiontrials.day2.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
        List<Personel> personelListesi = new ArrayList<>();

        personelListesi.add(new Personel("Ahmet", "Yilmaz", 5000));
        personelListesi.add(new Personel("Ayse", "Kaya", 4500));
        personelListesi.add(new Personel("Mehmet", "Demir", 5500));

        double toplamMaas = 0;
        for (Personel personel : personelListesi) {
            System.out.println("Ad: " + personel.getAd() + ", Soyad: " + personel.getSoyad() + ", Maas: " + personel.getMaas());
            toplamMaas += personel.getMaas();
        }

        System.out.println("Toplam Maas: " + toplamMaas);	}

}
