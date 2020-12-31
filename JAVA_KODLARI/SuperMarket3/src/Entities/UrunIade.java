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
public class UrunIade {

    private int urunIadeId;
    private String UrunNo;
    private String UrunAdi;
    private String UrunMarka;
    private float urunFiyat;
    private String UrunIadeTarihi;
    private String UrunSatisTarihi;
    private String UrunAciklama;

    public UrunIade() {
    }

    public String getUrunMarka() {
        return UrunMarka;
    }

    public void setUrunMarka(String UrunMarka) {
        this.UrunMarka = UrunMarka;
    }

    public float getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public int getUrunIadeId() {
        return urunIadeId;
    }

    public void setUrunIadeId(int urunIadeId) {
        this.urunIadeId = urunIadeId;
    }

    public String getUrunNo() {
        return UrunNo;
    }

    public void setUrunNo(String urunNo) {
        this.UrunNo = urunNo;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.UrunAdi = urunAdi;
    }

    public String getUrunAciklama() {
        return UrunAciklama;
    }

    public void setUrunAciklama(String urunAciklama) {
        this.UrunAciklama = urunAciklama;
    }

    public String getUrunIadeTarihi() {
        return UrunIadeTarihi;
    }

    public void setUrunIadeTarihi(String urunIadeTarihi) {
        this.UrunIadeTarihi = urunIadeTarihi;
    }

    public String getUrunSatisTarihi() {
        return UrunSatisTarihi;
    }

    public void setUrunSatisTarihi(String urunSatisTarihi) {
        this.UrunSatisTarihi = urunSatisTarihi;
    }
    
}
