/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBHelper;
import Entities.UrunIstek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UrunIstekDAL {

    DBHelper dbHelper = new DBHelper();
    List<UrunIstek> istekList = new ArrayList<>();

    public List<UrunIstek> getAll() {
        Connection con;
        ResultSet rs;
        Statement st;
        PreparedStatement ps;
        String query = "Select * from urunistek";
        try {
            con = dbHelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                UrunIstek istek = new UrunIstek();
                istek.setIstekId(rs.getInt("IstekId"));
                istek.setUrunAdi(rs.getString("urunAdi"));
                istek.setUrunMarka(rs.getString("urunMarka"));
                istek.setUrunKategori(rs.getString("urunKategori"));
                istek.setPersonelNo(rs.getString("personelNo"));
                istek.setUrunAdet(rs.getString("urunAdet"));
                istek.setUrunAciklama(rs.getString("urunAciklama"));
                istek.setSefOnay(rs.getString("sefOnay"));
                istek.setDepodurum(rs.getString("depodurum"));
                istekList.add(istek);

            }

        } catch (SQLException ex) {
            System.out.println(" getALL bilgileri getirilirken hata yasandı: " + ex);
        }
        return istekList;
    }

    public UrunIstek findById(String id) {
        Connection con;
        ResultSet rs;
        Statement st;
        PreparedStatement ps;
        String query = "Select from urunistek username= '" + id + "'";
        UrunIstek istek = new UrunIstek();
        try {
            con = dbHelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                istek.setIstekId(rs.getInt("IstekId"));
                istek.setUrunAdi(rs.getString("urunAdi"));
                istek.setUrunMarka(rs.getString("urunMarka"));
                istek.setUrunKategori(rs.getString("urunKategori"));
                istek.setPersonelNo(rs.getString("personelNo"));
                istek.setUrunAdet(rs.getString("urunAdet"));
                istek.setUrunAciklama(rs.getString("urunAciklama"));
                   istek.setSefOnay(rs.getString("sefOnay"));
                istek.setDepodurum(rs.getString("depodurum"));

            }

        } catch (SQLException ex) {
            System.out.println(" findbId bilgileri getirilirken hata yasandı: " + ex);
        }
        return istek;
    }

    public int update(UrunIstek istek, int id) {
        int sonuc = 0;
        Connection con;
        PreparedStatement ps;
        try {
            con = dbHelper.getConnection();
            /*
            UPDATE `urunistek` SET `urunAdi` = 'beyaz et' WHERE `urunistek`.`IstekId` = 6;
            run:

            create yapısında guncellenmede bir hata meydana 
            geldicom.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException:
            You have an error in your SQL syntax; check the manual that corresponds 
            to your MariaDB server version for the right syntax to use near 'urunAdet='50',urunAciklama='acil' where IstekId='5'' at line 1

             */
            String query = "update urunistek set "
                    + "urunAdi=?,"
                    + "urunMarka=?,"
                    + "urunKategori=?,"
                    + "personelNo=?,"
                    + "urunAdet=?,"
                    + "urunAciklama=?,"
                    +"sefOnay=?,"
                    +"depodurum=? where IstekId='" + id + "'";

            ps = con.prepareStatement(query);
            ps.setString(1, istek.getUrunAdi());
            ps.setString(2, istek.getUrunMarka());
            ps.setString(3, istek.getUrunKategori());
            ps.setString(4, istek.getPersonelNo());
            ps.setString(5, istek.getUrunAdet());
            ps.setString(6, istek.getUrunAciklama());
            ps.setString(7, istek.getSefOnay());
            ps.setString(8, istek.getDepodurum());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("create yapısında guncellenmede bir hata meydana geldi" + ex);
        }
        return sonuc;
    }

    public int create(UrunIstek istek) {
        int sonuc = 0;
        Connection con;
        PreparedStatement ps;
        try {
            con = dbHelper.getConnection();

            String query = "insert into urunistek ("
                    + "urunAdi,"
                    + "urunMarka,"
                    + "urunKategori,"
                    + "personelNo,"
                    + "urunAdet,"
                    + "urunAciklama,"
                    + "sefOnay,"
                    + "depodurum) values (?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(query);
            ps.setString(1, istek.getUrunAdi());
            ps.setString(2, istek.getUrunMarka());
            ps.setString(3, istek.getUrunKategori());
            ps.setString(4, istek.getPersonelNo());
            ps.setString(5, istek.getUrunAdet());
            ps.setString(6, istek.getUrunAciklama());
                 ps.setString(7, istek.getSefOnay());
            ps.setString(8, istek.getDepodurum());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("create yapısında eklenmede bir hata meydana geldi" + ex);
        }
        return sonuc;
    }

    public int delete(int id) {
        int sonuc = 0;
        Connection con;
        ResultSet rs;
        Statement st;
        PreparedStatement ps;
        try {
            String query = "delete from urunistek where IstekId ='" + id + "'";;

            con = dbHelper.getConnection();
            st = con.createStatement();
            sonuc = st.executeUpdate(query);
          
        } catch (SQLException ex) {
            System.out.println("silinirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {

            System.out.println("başarılı bir şekilde silindi");

        }

        return sonuc;
    }
}
