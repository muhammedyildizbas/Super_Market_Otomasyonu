/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
//bu ksımda da yapmıs oldugumuz tabloların sınıfını yapacgız ozelliklerini verecgiz tamam 

public class Admin {
    
    private int adminId;
    private String adminNo;
    private String adminTCNo;
    private String adminAd;
    private String adminSoyad;
    private String adminCinsiyet;
    private String adminTel;
    private String adminEmail;
    private String adminUserName;
    private String adminPassword;

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public String getAdminTCNo() {
        return adminTCNo;
    }

    public void setAdminTCNo(String adminTCNo) {
        this.adminTCNo = adminTCNo;
    }

    public String getAdminAd() {
        return adminAd;
    }

    public void setAdminAd(String adminAd) {
        this.adminAd = adminAd;
    }

    public String getAdminSoyad() {
        return adminSoyad;
    }

    public void setAdminSoyad(String adminSoyad) {
        this.adminSoyad = adminSoyad;
    }

    public String getAdminCinsiyet() {
        return adminCinsiyet;
    }

    public void setAdminCinsiyet(String adminCinsiyet) {
        this.adminCinsiyet = adminCinsiyet;
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Admin(int adminId, String adminNo, String adminTCNo, String adminAd, String adminSoyad, String adminCinsiyet, String adminTel, String adminEmail, String adminUserName, String adminPassword) {
        this.adminId = adminId;
        this.adminNo = adminNo;
        this.adminTCNo = adminTCNo;
        this.adminAd = adminAd;
        this.adminSoyad = adminSoyad;
        this.adminCinsiyet = adminCinsiyet;
        this.adminTel = adminTel;
        this.adminEmail = adminEmail;
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }
    
}
