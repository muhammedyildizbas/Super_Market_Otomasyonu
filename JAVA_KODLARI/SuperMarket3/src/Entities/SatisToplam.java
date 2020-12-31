/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Muhammed
 */
public class SatisToplam {

    private int satisId;
    private String kasaNo;
    private String urunNo;
    private String urunAdi;
    private String urunMarka;
    private String OdemeYontemi;
    private int Miktar;
    private Float satisToplam;
    private Float urunAlis;
    private Float urunSatis;
     private String Tarih;

    public String getTarih() {
        return Tarih;
    }

    public void setTarih(String Tarih) {
        this.Tarih = Tarih;
    }

    public SatisToplam() {
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunMarka() {
        return urunMarka;
    }

    public void setUrunMarka(String urunMarka) {
        this.urunMarka = urunMarka;
    }

    public String getOdemeYontemi() {
        return OdemeYontemi;
    }

    public void setOdemeYontemi(String OdemeYontemi) {
        this.OdemeYontemi = OdemeYontemi;
    }

    public int getMiktar() {
        return Miktar;
    }

    public void setMiktar(int Miktar) {
        this.Miktar = Miktar;
    }

    public int getSatisId() {
        return satisId;
    }

    public void setSatisId(int satisId) {
        this.satisId = satisId;
    }

    public String getKasaNo() {
        return kasaNo;
    }

    public void setKasaNo(String kasaNo) {
        this.kasaNo = kasaNo;
    }

    public String getUrunNo() {
        return urunNo;
    }

    public void setUrunNo(String urunNo) {
        this.urunNo = urunNo;
    }

    public Float getUrunAlis() {
        return urunAlis;
    }

    public void setUrunAlis(Float urunAlis) {
        this.urunAlis = urunAlis;
    }

    public Float getUrunSatis() {
        return urunSatis;
    }

    public void setUrunSatis(Float urunSatis) {
        this.urunSatis = urunSatis;
    }

    public Float getSatisToplam() {
        return satisToplam;
    }

    public void setSatisToplam(Float satisToplam) {
        this.satisToplam = satisToplam;
    }

}
