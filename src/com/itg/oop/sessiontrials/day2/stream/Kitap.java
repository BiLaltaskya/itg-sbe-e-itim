package com.itg.oop.sessiontrials.day2.stream;

public class Kitap {
	private String adi;
	private String yazari;
	private int sayfaSayisi;
 
	public Kitap(String adi, String yazari, int sayfaSayisi) {
		super();
		this.adi = adi;
		this.yazari = yazari;
		this.sayfaSayisi = sayfaSayisi;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getYazari() {
		return yazari;
	}
	public void setYazari(String yazari) {
		this.yazari = yazari;
	}
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	@Override
	public String toString() {
		return "Kitap [adi=" + adi + ", yazari=" + yazari + ", sayfaSayisi=" + sayfaSayisi + "]";
	}
	 
}
