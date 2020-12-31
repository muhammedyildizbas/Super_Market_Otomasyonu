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
public class Personeller {
    //personelId 

    private int personelId;
    private String personelNo;
    private String personelTCNo;
    private String personelAd;
    private String personelSoyad;
    private String personelCinsiyet;
    private String personelTel;
    private String personelEmail;
    private String personelMaas;
    private String personelDurum ;
    private String personelGorev ;
    private String  personelAciklama;
    private String  username;
    private String  password;
    
    
    

    public Personeller() {
    }

    public Personeller(int personelId, String personelNo, String personelTCNo, String personelAd, String personelSoyad, String personelCinsiyet, String personelTel, String personelEmail, String personelMaas, String personelDurum, String personelGorev, String personelAciklama, String username, String password) {
        this.personelId = personelId;
        this.personelNo = personelNo;
        this.personelTCNo = personelTCNo;
        this.personelAd = personelAd;
        this.personelSoyad = personelSoyad;
        this.personelCinsiyet = personelCinsiyet;
        this.personelTel = personelTel;
        this.personelEmail = personelEmail;
        this.personelMaas = personelMaas;
        this.personelDurum = personelDurum;
        this.personelGorev = personelGorev;
        this.personelAciklama = personelAciklama;
        this.username = username;
        this.password = password;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }

    public String getPersonelTCNo() {
        return personelTCNo;
    }

    public void setPersonelTCNo(String personelTCNo) {
        this.personelTCNo = personelTCNo;
    }

    public String getPersonelAd() {
        return personelAd;
    }

    public void setPersonelAd(String personelAd) {
        this.personelAd = personelAd;
    }

    public String getPersonelSoyad() {
        return personelSoyad;
    }

    public void setPersonelSoyad(String personelSoyad) {
        this.personelSoyad = personelSoyad;
    }

    public String getPersonelCinsiyet() {
        return personelCinsiyet;
    }

    public void setPersonelCinsiyet(String personelCinsiyet) {
        this.personelCinsiyet = personelCinsiyet;
    }

    public String getPersonelTel() {
        return personelTel;
    }

    public void setPersonelTel(String personelTel) {
        this.personelTel = personelTel;
    }

    public String getPersonelEmail() {
        return personelEmail;
    }

    public void setPersonelEmail(String personelEmail) {
        this.personelEmail = personelEmail;
    }

    public String getPersonelMaas() {
        return personelMaas;
    }

    public void setPersonelMaas(String personelMaas) {
        this.personelMaas = personelMaas;
    }

    public String getPersonelDurum() {
        return personelDurum;
    }

    public void setPersonelDurum(String personelDurum) {
        this.personelDurum = personelDurum;
    }

    public String getPersonelGorev() {
        return personelGorev;
    }

    public void setPersonelGorev(String personelGorev) {
        this.personelGorev = personelGorev;
    }

    public String getPersonelAciklama() {
        return personelAciklama;
    }

    public void setPersonelAciklama(String personelAciklama) {
        this.personelAciklama = personelAciklama;
    }
     
   
}
