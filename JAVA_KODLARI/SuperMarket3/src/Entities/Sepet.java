/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

public class Sepet {
    //"Urun adı", "urun Marka", "urun miktar", "urun fiyar", "toplam"
    private String urunAdi;
    private String urunMarka;
    private int Miktar;
    private float fiyat;
    private float top;

    public Sepet() {
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

    public int getMiktar() {
        return Miktar;
    }

    public void setMiktar(int Miktar) {
        this.Miktar = Miktar;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public float getTop() {
        return top;
    }

    public void setTop(float top) {
        this.top = top;
    }
    
    
}
