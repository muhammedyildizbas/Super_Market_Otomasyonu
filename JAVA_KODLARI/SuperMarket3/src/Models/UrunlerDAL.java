/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBHelper;
import Entities.Urunler;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UrunlerDAL {

    DBHelper dbhelper = new DBHelper();

    List<Urunler> urunList = new ArrayList<>();

    public List<Urunler> getAll() {
        Connection conn;
        Statement statement;
        PreparedStatement prStatement;
        ResultSet resultSet;
        String query = "select * from urunler";

        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Urunler urunler = new Urunler();

                urunler.setUrunId(resultSet.getInt("UrunId"));
                urunler.setUrunNo(resultSet.getString("UrunNo"));
                urunler.setUrunAdi(resultSet.getString("UrunAdi"));
                urunler.setUrunDurum(resultSet.getString("UrunDurum"));
                urunler.setSonKullanmaTarihi(resultSet.getString("SonKullanmaTarihi"));
                urunler.setUrunMiktar(resultSet.getString("UrunMiktar"));
                urunler.setUrunMarka(resultSet.getString("UrunMarka"));
                urunler.setUrunKategori(resultSet.getString("UrunKategori"));
                urunler.setUrunAlis(resultSet.getFloat("UrunAlis"));
                urunler.setUrunSatis(resultSet.getFloat("UrunSatis"));
                urunler.setUrunAdet(resultSet.getString("UrunAdet"));
                urunler.setAciklama(resultSet.getString("Aciklama"));
                urunList.add(urunler);

            }

        } catch (SQLException ex) {
            System.out.println("urunDAL urun  getirilirken hata meyadana geldi: " + ex);

        }

        return urunList;

    }
       public List<Urunler> getDepoAll() {
        Connection conn;
        Statement statement;
        PreparedStatement prStatement;
        ResultSet resultSet;
        String query = "select * from urunler where UrunDurum = 'Depo'";

        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Urunler urunler = new Urunler();

                urunler.setUrunId(resultSet.getInt("UrunId"));
                urunler.setUrunNo(resultSet.getString("UrunNo"));
                urunler.setUrunAdi(resultSet.getString("UrunAdi"));
                urunler.setUrunDurum(resultSet.getString("UrunDurum"));
                urunler.setSonKullanmaTarihi(resultSet.getString("SonKullanmaTarihi"));
                urunler.setUrunMiktar(resultSet.getString("UrunMiktar"));
                urunler.setUrunMarka(resultSet.getString("UrunMarka"));
                urunler.setUrunKategori(resultSet.getString("UrunKategori"));
                urunler.setUrunAlis(resultSet.getFloat("UrunAlis"));
                urunler.setUrunSatis(resultSet.getFloat("UrunSatis"));
                urunler.setUrunAdet(resultSet.getString("UrunAdet"));
                urunler.setAciklama(resultSet.getString("Aciklama"));
                urunList.add(urunler);

            }

        } catch (SQLException ex) {
            System.out.println("urunDAL urun  getirilirken hata meyadana geldi: " + ex);

        }

        
        return urunList;

    }
       

        public List<Urunler> getRafAll() {
        Connection conn;
        Statement statement;
        PreparedStatement prStatement;
        ResultSet resultSet;
        String query = "select * from urunler where UrunDurum = 'Rafda'";

        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Urunler urunler = new Urunler();

                urunler.setUrunId(resultSet.getInt("UrunId"));
                urunler.setUrunNo(resultSet.getString("UrunNo"));
                urunler.setUrunAdi(resultSet.getString("UrunAdi"));
                urunler.setUrunDurum(resultSet.getString("UrunDurum"));
                urunler.setSonKullanmaTarihi(resultSet.getString("SonKullanmaTarihi"));
                urunler.setUrunMiktar(resultSet.getString("UrunMiktar"));
                urunler.setUrunMarka(resultSet.getString("UrunMarka"));
                urunler.setUrunKategori(resultSet.getString("UrunKategori"));
                urunler.setUrunAlis(resultSet.getFloat("UrunAlis"));
                urunler.setUrunSatis(resultSet.getFloat("UrunSatis"));
                urunler.setUrunAdet(resultSet.getString("UrunAdet"));
                urunler.setAciklama(resultSet.getString("Aciklama"));
                urunList.add(urunler);

            }

        } catch (SQLException ex) {
            System.out.println("urunDAL urun  getirilirken hata meyadana geldi: " + ex);

        }
        return urunList;

    }

// public Bolum getBolum(String id)

    public Urunler findByID(String ID) {
        Connection conn1;
        Statement st;
        ResultSet rs7;
        Urunler urunler = new Urunler();

        String query = "select * from urunler where UrunNo='"+ID+"'";

        try {
            conn1 = dbhelper.getConnection();
            st = conn1.createStatement();
            rs7 = st.executeQuery(query);
            while (rs7.next()) {

                urunler.setUrunId(rs7.getInt("UrunId"));
                urunler.setUrunNo(rs7.getString("UrunNo"));
                urunler.setUrunAdi(rs7.getString("UrunAdi"));
                urunler.setSonKullanmaTarihi(rs7.getString("SonKullanmaTarihi"));
                urunler.setUrunMiktar(rs7.getString("UrunMiktar"));
                urunler.setUrunMarka(rs7.getString("UrunMarka"));
                urunler.setUrunKategori(rs7.getString("UrunKategori"));
                urunler.setUrunAlis(rs7.getFloat("UrunAlis"));
                urunler.setUrunSatis(rs7.getFloat("UrunSatis"));
                urunler.setUrunAdet(rs7.getString("UrunAdet"));

            }

        } catch (SQLException ex) {
            System.out.println("urunDal urun getirilirken hata meyadana geldi: " + ex);

        }

        return urunler;

    }

    public int update(Urunler urun, int id) {
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
    }

    public int create(Urunler urun) {
        Connection conn4;
        ResultSet rs4;
        Statement st4;
        PreparedStatement ps4;

        int sonuc = 0;

        try {

            conn4 = dbhelper.getConnection();

            String query = "insert into urunler ( "
                    + "UrunId,"
                    + "UrunNo,"
                    + "UrunAdi,"
                    + "SonKullanmaTarihi,"
                    + "UrunMiktar,"
                    + "UrunMarka,"
                    + "UrunKategori,"
                    + "UrunAlis,"
                    + "UrunSatis,"
                    + "UrunDurum,"
                    + "Aciklama,"
                    + "UrunAdet) values(?,?,?,?,?,?,?,?,?,?,?,?)";

            ps4 = conn4.prepareStatement(query);

            ps4.setInt(1, urun.getUrunId());
            ps4.setString(2, urun.getUrunNo());
            ps4.setString(3, urun.getUrunAdi());
            ps4.setString(4, urun.getSonKullanmaTarihi());
            ps4.setString(5, urun.getUrunMiktar());
            ps4.setString(6, urun.getUrunMarka());
            ps4.setString(7, urun.getUrunKategori());
            ps4.setFloat(8, urun.getUrunAlis());
            ps4.setFloat(9, urun.getUrunSatis());
            ps4.setString(10, urun.getUrunDurum());
            ps4.setString(11, urun.getAciklama());
            ps4.setString(12, urun.getUrunAdet());

            sonuc = ps4.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" eklenırken  hata meyadana geldi: " + ex);
        }

        return sonuc;
    }

    public int delete(int id) {

        int sonuc = 0;
        Connection con1;
        ResultSet resultSet;
        Statement statement;

        try {
            String qery = "delete from urunler where UrunId='" + id + "'";
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
     public int delete2(String id) {

        int sonuc = 0;
        Connection con1;
        ResultSet resultSet;
        Statement statement;

        try {
            String query = "delete from urunler where UrunNo='" + id + "'";
            con1 = dbhelper.getConnection();
            statement = con1.createStatement();
            sonuc = statement.executeUpdate(query);
           
        } catch (Exception e) {
            System.out.println("silme işleminde hata yaşandı :" + e);
        }

        return sonuc;

    }
}
