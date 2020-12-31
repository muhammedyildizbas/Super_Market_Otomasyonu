/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
/**
 *
 * @author ZEYNEP
 */

import Database.DBHelper;
import Entities.SatisToplam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SatisDAL {

    DBHelper dbhelper = new DBHelper();

    List<SatisToplam> urunList = new ArrayList<>();

    public List<SatisToplam> getAll() {
        Connection conn;
        Statement statement;
        PreparedStatement prStatement;
        ResultSet resultSet;
        String query = "SELECT * FROM `satistoplam`";

        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                SatisToplam top = new SatisToplam();
                top.setSatisId(resultSet.getInt("SatisId"));
                top.setKasaNo(resultSet.getString("KasaNo"));
                top.setUrunNo(resultSet.getString("UrunNo"));
                top.setUrunAdi(resultSet.getString("UrunAdi"));
                top.setUrunMarka(resultSet.getString("UrunMarka"));
                top.setOdemeYontemi(resultSet.getString("OdemeYontemi"));
                top.setMiktar(resultSet.getInt("Miktar"));
                top.setUrunAlis(resultSet.getFloat("UrunAlis"));
                top.setUrunSatis(resultSet.getFloat("UrunSatis"));
                top.setSatisToplam(resultSet.getFloat("SatisToplam"));
                   top.setTarih(resultSet.getString("Tarih"));
                urunList.add(top);

            }

        } catch (SQLException ex) {
            System.out.println("SatisDAL urun  getirilirken hata meyadana geldi: " + ex);

        }

        return urunList;

    }

    public SatisToplam findByID(String ID) {
        Connection conn1;
        Statement st;
        ResultSet resultSet;

        SatisToplam top = new SatisToplam();
        String query = "select * from urunler where SatisId='" + ID + "'";

        try {
            conn1 = dbhelper.getConnection();
            st = conn1.createStatement();
            resultSet = st.executeQuery(query);
            while (resultSet.next()) {

                top.setSatisId(resultSet.getInt("SatisId"));
                top.setKasaNo(resultSet.getString("KasaNo"));
                top.setUrunNo(resultSet.getString("UrunNo"));
                top.setUrunAdi(resultSet.getString("UrunAdi"));
                top.setUrunMarka(resultSet.getString("UrunMarka"));
                top.setOdemeYontemi(resultSet.getString("OdemeYontemi"));
                top.setMiktar(resultSet.getInt("Miktar"));
                top.setUrunAlis(resultSet.getFloat("UrunAlis"));
                top.setUrunSatis(resultSet.getFloat("UrunSatis"));
                top.setSatisToplam(resultSet.getFloat("SatisToplam"));
                   top.setTarih(resultSet.getString("Tarih"));

            }

        } catch (SQLException ex) {
            System.out.println("urunDal urun getirilirken hata meyadana geldi: " + ex);

        }

        return top;

    }

    public int create(SatisToplam urun) {
        Connection conn4;
        PreparedStatement ps4;
        /*
               SatisId 
KasaNo 
UrunNo 
UrunAdi 
UrunMarka 
Miktar 
UrunAlis 
UrunSatis 
SatisToplam 
OdemeYontemi 
         */

        int sonuc = 0;

        try {

            conn4 = dbhelper.getConnection();

            String query = "insert into satistoplam ( "
                    + "KasaNo,"
                    + "UrunNo,"
                    + "UrunAdi,"
                    + "UrunMarka,"
                    + "Miktar,"
                    + "OdemeYontemi,"
                    + "UrunAlis,"
                    + "SatisToplam,"
                    + "UrunSatis,"
                    +"Tarih)   values(?,?,?,?,?,?,?,?,?,?)";

            ps4 = conn4.prepareStatement(query);
         
            ps4.setString(1, urun.getKasaNo());
            ps4.setString(2, urun.getUrunNo());
            ps4.setString(3, urun.getUrunAdi());
            ps4.setString(4, urun.getUrunMarka());
            ps4.setInt(5, urun.getMiktar());
            ps4.setString(6, urun.getOdemeYontemi());
            ps4.setFloat(7, urun.getUrunAlis());
            ps4.setFloat(8, urun.getSatisToplam());
            ps4.setFloat(9, urun.getUrunSatis());
            ps4.setString(10, urun.getTarih());

            sonuc = ps4.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" satisDal eklenırken  hata meyadana geldi: " + ex);
        }

        return sonuc;
    }

    public int delete(int id) {

        int sonuc = 0;
        Connection con1;
        ResultSet resultSet;
        Statement statement;

        try {
            String qery = "delete from urunler where SatisId='" + id + "'";
            con1 = dbhelper.getConnection();
            statement = con1.createStatement();
            sonuc = statement.executeUpdate(qery);
            /*
            statement.close();
            con1.close();
             */
        } catch (Exception e) {
            System.out.println("silme işleminde hata yaşandı :" + e);
        }

        return sonuc;

    }

    /* public int update(Urunler urun, int id) {
        Connection conn2;
        ResultSet rs2;
        Statement st2;
        PreparedStatement ps2;

        int sonuc = 0;
        try {

            conn2 = dbhelper.getConnection();

            String query = "update  urunler set "
                    + "UrunNo=?,"
                    + "UrunAdi=?,"
                    + "SonKullanmaTarihi=?,"
                    + "UrunMiktar=?,"
                    + "UrunMarka=?,"
                    + "UrunKategori=?,"
                    + "UrunAlis=?,"
                    + "UrunSatis=?,"
                    + "UrunDurum=?,"
                    + "Aciklama=?,"
                    + "UrunAdet=? where urunId='" + id + "'";

            ps2 = conn2.prepareStatement(query);

            ps2.setString(1, urun.getUrunNo());
            ps2.setString(2, urun.getUrunAdi());
            ps2.setString(3, urun.getSonKullanmaTarihi());
            ps2.setString(4, urun.getUrunMiktar());
            ps2.setString(5, urun.getUrunMarka());
            ps2.setString(6, urun.getUrunKategori());
            ps2.setFloat(7, urun.getUrunAlis());
            ps2.setFloat(8, urun.getUrunSatis());
            ps2.setString(9, urun.getUrunDurum());
            ps2.setString(10, urun.getAciklama());
            ps2.setString(11, urun.getUrunAdet());

            sonuc = ps2.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("  guncellemede hata geldi: " + ex);
        }
        return sonuc;
    }*/
}
