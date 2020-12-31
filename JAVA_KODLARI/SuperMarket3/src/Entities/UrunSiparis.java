/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
public class UrunSiparis {
//depocu vermis oldugu urun  siparsişlerini burda tutacak ardından frmdeoDeposuna gidip gelen urunleri eklıyecek labella uyarı vermeyı unutma
    private int  UrunSiparidsId ;
    private String UrunAdı;
    private String UrunKategori;
    private String UrunMarka;
    private int UrunAdet;
    private float UrunAlis;
    private String UrunSiparisT;
    private String UrunGelisT;

    public String getUrunSiparisT() {
        return UrunSiparisT;
    }

    public void setUrunSiparisT(String UrunSiparisT) {
        this.UrunSiparisT = UrunSiparisT;
    }

    public String getUrunGelisT() {
        return UrunGelisT;
    }

    public void setUrunGelisT(String UrunGelisT) {
        this.UrunGelisT = UrunGelisT;
    }

    public UrunSiparis() {
    }

    public int getUrunSiparidsId() {
        return UrunSiparidsId;
    }

    public void setUrunSiparidsId(int UrunSiparidsId) {
        this.UrunSiparidsId = UrunSiparidsId;
    }

    public String getUrunAdı() {
        return UrunAdı;
    }

    public void setUrunAdı(String UrunAdı) {
        this.UrunAdı = UrunAdı;
    }

    public String getUrunKategori() {
        return UrunKategori;
    }

    public void setUrunKategori(String UrunKategori) {
        this.UrunKategori = UrunKategori;
    }

    public String getUrunMarka() {
        return UrunMarka;
    }

    public void setUrunMarka(String UrunMarka) {
        this.UrunMarka = UrunMarka;
    }

    public int getUrunAdet() {
        return UrunAdet;
    }

    public void setUrunAdet(int UrunAdet) {
        this.UrunAdet = UrunAdet;
    }

    public float getUrunAlis() {
        return UrunAlis;
    }

    public void setUrunAlis(float UrunAlis) {
        this.UrunAlis = UrunAlis;
    }
    
    
    
}
