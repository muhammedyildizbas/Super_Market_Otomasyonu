package Models;

import Database.DBHelper;
import Entities.Personeller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonelDAL {

    DBHelper dbhelper = new DBHelper();
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    List<Personeller> perList = new ArrayList<>();

    public List<Personeller> getAll() {

        String query = "Select * from personeller";
        try {
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Personeller per = new Personeller();
                per.setPersonelId(rs.getInt("PersonelId"));
                per.setPersonelNo(rs.getString("personelNo"));
                per.setPersonelTCNo(rs.getString("personelTcNo"));
                per.setPersonelAd(rs.getString("personelAd"));
                per.setPersonelSoyad(rs.getString("personelSoyad"));
                per.setPersonelCinsiyet(rs.getString("personelCinsiyet"));
                per.setPersonelTel(rs.getString("personelTel"));
                per.setPersonelMaas(rs.getString("personelMaas"));
                per.setPersonelDurum(rs.getString("personelDurum"));
                per.setPersonelGorev(rs.getString("personelGorev"));
                per.setPersonelAciklama(rs.getString("personelAciklama"));
                per.setPersonelEmail(rs.getString("personelEmail"));
                per.setUsername(rs.getString("username"));
                per.setPassword(rs.getString("password"));
                perList.add(per);

            }

        } catch (SQLException ex) {
            System.out.println(" getALL bilgileri getirilirken hata yasandı: " + ex);
        }
        return perList;
    }

    public List<Personeller> getAllSefsiz() {

        String query = "Select * from personeller where personelGorev != 'Sef' ";
        try {
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Personeller per = new Personeller();
                per.setPersonelId(rs.getInt("PersonelId"));
                per.setPersonelNo(rs.getString("personelNo"));
                per.setPersonelTCNo(rs.getString("personelTcNo"));
                per.setPersonelAd(rs.getString("personelAd"));
                per.setPersonelSoyad(rs.getString("personelSoyad"));
                per.setPersonelCinsiyet(rs.getString("personelCinsiyet"));
                per.setPersonelTel(rs.getString("personelTel"));
                per.setPersonelMaas(rs.getString("personelMaas"));
                per.setPersonelDurum(rs.getString("personelDurum"));
                per.setPersonelGorev(rs.getString("personelGorev"));
                per.setPersonelAciklama(rs.getString("personelAciklama"));
                per.setPersonelEmail(rs.getString("personelEmail"));
                per.setUsername(rs.getString("username"));
                per.setPassword(rs.getString("password"));
                perList.add(per);

            }

        } catch (SQLException ex) {
            System.out.println(" getALL bilgileri getirilirken hata yasandı: " + ex);
        }
        return perList;
    }

    public List<Personeller> getPers() {

        String query = "Select * from personeller";
        try {
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Personeller per = new Personeller();
                per.setPersonelId(rs.getInt("PersonelId"));
                per.setPersonelNo(rs.getString("personelNo"));
                per.setPersonelTCNo(rs.getString("personelTcNo"));
                per.setPersonelAd(rs.getString("personelAd"));
                per.setPersonelSoyad(rs.getString("personelSoyad"));
                per.setPersonelCinsiyet(rs.getString("personelCinsiyet"));
                per.setPersonelTel(rs.getString("personelTel"));
                per.setPersonelMaas(rs.getString("personelMaas"));
                per.setPersonelDurum(rs.getString("personelDurum"));
                per.setPersonelGorev(rs.getString("personelGorev"));
                per.setPersonelAciklama(rs.getString("personelAciklama"));
                per.setPersonelEmail(rs.getString("personelEmail"));
                per.setUsername(rs.getString("username"));
                per.setPassword(rs.getString("password"));
                perList.add(per);

            }

        } catch (SQLException ex) {
            System.out.println(" getALL bilgileri getirilirken hata yasandı: " + ex);
        }
        return perList;
    }

    public Personeller findByID(String ID) {
        Personeller per = null;
        String query = "Select * from personeller where username ='" + ID + "'";

        try {
            per = new Personeller();
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                per.setPersonelId(rs.getInt("PersonelId"));
                per.setPersonelNo(rs.getString("personelNo"));
                per.setPersonelAd(rs.getString("personelAd"));//
                per.setPersonelSoyad(rs.getString("personelSoyad"));
                per.setPersonelTCNo(rs.getString("personelTcNo"));
                per.setPersonelCinsiyet(rs.getString("personelCinsiyet"));
                per.setPersonelTel(rs.getString("personelTel"));
                per.setPersonelMaas(rs.getString("personelMaas"));
                per.setPersonelEmail(rs.getString("personelEmail"));
                per.setPersonelDurum(rs.getString("personelDurum"));
                per.setPersonelGorev(rs.getString("personelGorev"));
                per.setPersonelAciklama(rs.getString("personelAciklama"));
                //per.setUsername(rs.getString("username"));
                per.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            System.out.println(" findby bilgileri getirilirken hata yasandı: " + ex);
        }
        return per;
    }

    public int create(Personeller per) {
        int sonuc = 0;

        try {
            String query = "insert into personeller ( "
                    + "personelNo,"
                    + "personelTcNo,"
                    + "personelAd,"
                    + "personelSoyad ,"
                    + "personelCinsiyet,"
                    + "personelTel,"
                    + "personelEmail,"
                    + "personelMaas ,"
                    + "personelDurum,"
                    + "personelGorev ,"
                    + "personelAciklama,"
                    + "username,"
                    + "password ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setString(1, per.getPersonelNo());
            ps.setString(2, per.getPersonelTCNo());
            ps.setString(3, per.getPersonelAd());
            ps.setString(4, per.getPersonelSoyad());
            ps.setString(5, per.getPersonelCinsiyet());
            ps.setString(6, per.getPersonelTel());
            ps.setString(7, per.getPersonelEmail());
            ps.setString(8, per.getPersonelMaas());
            ps.setString(9, per.getPersonelDurum());
            ps.setString(10, per.getPersonelGorev());
            ps.setString(11, per.getPersonelAciklama());
            ps.setString(12, per.getUsername());
            ps.setString(13, per.getPassword());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" eklenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println(" başarılı bir şekilde eklendi");

        }
        return sonuc;
    }

    public int create2(Personeller per) {
        int sonuc = 0;

        try {
            String query = "insert into personeller ( "
                    + "personelNo,"
                    + "personelTcNo,"
                    + "personelAd,"
                    + "personelSoyad ,"
                    + "personelCinsiyet,"
                    + "personelTel,"
                    + "personelEmail,"
                    + "personelMaas ,"
                    + "personelDurum,"
                    + "personelGorev ,"
                    + "personelAciklama,"
                    + "username,"
                    + "password ) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setString(1, per.getPersonelNo());
            ps.setString(2, per.getPersonelTCNo());
            ps.setString(3, per.getPersonelAd());
            ps.setString(4, per.getPersonelSoyad());
            ps.setString(5, per.getPersonelCinsiyet());
            ps.setString(6, per.getPersonelTel());
            ps.setString(7, per.getPersonelEmail());
            ps.setString(8, per.getPersonelMaas());
            ps.setString(9, per.getPersonelDurum());
            ps.setString(10, per.getPersonelGorev());
            ps.setString(11, per.getPersonelAciklama());
            ps.setString(12, per.getUsername());
            ps.setString(13, per.getPassword());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("crate2 eklenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println(" başarılı bir şekilde eklendi");

        }
        return sonuc;
    }

    public int update(Personeller per, int id) {
        int sonuc = 0;

        try {
            String query = "update personeller set "
                    + "personelNo=?,"
                    + "personelTcNo=?,"
                    + "personelAd=?,"
                    + "personelSoyad=? ,"
                    + "personelCinsiyet=?,"
                    + "personelTel=?,"
                    + "personelEmail=?,"
                    + "personelMaas=?,"
                    + "personelDurum=?,"
                    + "personelGorev =?,"
                    + "personelAciklama=? ,"
                    + "username=?,"
                    + "password=? where personelId='" + id + "'";

            ps = con.prepareStatement(query);

            ps.setString(1, per.getPersonelNo());
            ps.setString(2, per.getPersonelTCNo());
            ps.setString(3, per.getPersonelAd());
            ps.setString(4, per.getPersonelSoyad());
            ps.setString(5, per.getPersonelCinsiyet());
            ps.setString(6, per.getPersonelTel());
            ps.setString(7, per.getPersonelEmail());
            ps.setString(8, per.getPersonelMaas());
            ps.setString(9, per.getPersonelDurum());
            ps.setString(10, per.getPersonelGorev());
            ps.setString(11, per.getPersonelAciklama());
            ps.setString(12, per.getUsername());
            ps.setString(13, per.getPassword());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {//where OgrId=?'" +ogr.getOgrID()+"'";
            System.out.println(" guncellenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println("başarılı bir şekilde gucellendi");

        }
        return sonuc;

    }

    public int Sefupdate3(Personeller per, int id) {
        int sonuc = 0;

        try {
            String query = "update personeller set "
                    + "personelNo=?,"
                    + "personelTcNo=?,"
                    + "personelAd=?,"
                    + "personelSoyad=? ,"
                    + "personelCinsiyet=?,"
                    + "personelTel=?,"
                    + "personelEmail=?,"
                    + "personelMaas=?,"
                    + "personelDurum=?,"
                    + "personelGorev =?,"
                    + "personelAciklama=? where personelId='" + id + "'";

            ps = con.prepareStatement(query);

            ps.setString(1, per.getPersonelNo());
            ps.setString(2, per.getPersonelTCNo());
            ps.setString(3, per.getPersonelAd());
            ps.setString(4, per.getPersonelSoyad());
            ps.setString(5, per.getPersonelCinsiyet());
            ps.setString(6, per.getPersonelTel());
            ps.setString(7, per.getPersonelEmail());
            ps.setString(8, per.getPersonelMaas());
            ps.setString(9, per.getPersonelDurum());
            ps.setString(10, per.getPersonelGorev());
            ps.setString(11, per.getPersonelAciklama());

            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {//where OgrId=?'" +ogr.getOgrID()+"'";
            System.out.println(" guncellenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println("başarılı bir şekilde gucellendi");

        }
        return sonuc;

    }

    public int Personelupdate2(Personeller per, int id) {
        int sonuc = 0;

        try {
            String query = "update personeller set "
                    + "personelTel=?,"
                    + "personelEmail=? where personelId='" + id + "'";;

            ps = con.prepareStatement(query);

            ps.setString(1, per.getPersonelTel());
            ps.setString(2, per.getPersonelEmail());
            ps.setString(3, per.getPersonelMaas());

            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {//where OgrId=?'" +ogr.getOgrID()+"'";
            System.out.println(" guncellenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println("başarılı bir şekilde gucellendi");

        }
        return sonuc;

    }

    public int LoginUpdate(Personeller per, int id) {
        int sonuc = 0;

        try {
            String query = "update personeller set "
                    + "password=? where personelId='" + id + "'";;

            ps = con.prepareStatement(query);
            ps.setString(1, per.getPassword());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("sifre  guncellenirken hata meydana geldi" + ex);

        }
        if (sonuc > 0) {
            System.out.println("başarılı bir şekilde gucellendi");

        }
        return sonuc;

    }

    public int delete(int id) {
        int sonuc = 0;

        try {
            String query = "delete from personeller where personelId='" + id + "'";;

            con = dbhelper.getConnection();
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
public void personelMaas(){
     int sonuc = 0;
       Connection con;
    ResultSet rs;
    Statement st;
  
        try {
               String query = "SELECT SUM(personelMaas) from personeller";
       con = dbhelper.getConnection();
            st = con.createStatement();
             sonuc = st.executeUpdate(query);
             System.out.println("personele ödenen toplam maaş: "+ sonuc);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonelDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
