/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

public class UrunIstek {
    /*IstekId 
urunAdı 
urunKategori 
UrunMarka 
UrunAdet 
UrunAciklama 
    */
    private int IstekId;
    private String urunAdi;
    private String personelNo;
 private String urunKategori;
    private String urunMarka;
    private String urunAdet;
    private String urunAciklama;
    private String sefOnay;
    private String depodurum;

    public String getSefOnay() {
        return sefOnay;
    }

    public void setSefOnay(String sefOnay) {
        this.sefOnay = sefOnay;
    }

    public String getDepodurum() {
        return depodurum;
    }

    public void setDepodurum(String depodurum) {
        this.depodurum = depodurum;
    }
    
    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }
   

    public UrunIstek() {
    }

    public int getIstekId() {
        return IstekId;
    }

    public void setIstekId(int IstekId) {
        this.IstekId = IstekId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunKategori() {
        return urunKategori;
    }

    public void setUrunKategori(String urunKategori) {
        this.urunKategori = urunKategori;
    }

    public String getUrunMarka() {
        return urunMarka;
    }

    public void setUrunMarka(String urunMarka) {
        this.urunMarka = urunMarka;
    }

    public String getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(String urunAdet) {
        this.urunAdet = urunAdet;
    }

    public String getUrunAciklama() {
        return urunAciklama;
    }

    public void setUrunAciklama(String urunAciklama) {
        this.urunAciklama = urunAciklama;
    }
    
    
}
