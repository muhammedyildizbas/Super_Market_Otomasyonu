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
public class PersonelGorevleri {
    
     private int gorevId;
    private String gorevKategori;

    public int getGorevId() {
        return gorevId;
    }

    public void setGorevId(int gorevId) {
        this.gorevId = gorevId;
    }

    public String getGorevKategori() {
        return gorevKategori;
    }

    public void setGorevKategori(String gorevKategori) {
        this.gorevKategori = gorevKategori;
    }

    public PersonelGorevleri(int gorevId, String gorevKategori) {
        this.gorevId = gorevId;
        this.gorevKategori = gorevKategori;
    }
   
}
