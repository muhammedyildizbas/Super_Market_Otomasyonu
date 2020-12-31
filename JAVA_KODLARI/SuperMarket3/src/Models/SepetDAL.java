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

import Entities.Sepet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SepetDAL {

    DBHelper dbhelper = new DBHelper();

    List<Sepet> urunList = new ArrayList<>();

    public List<Sepet> getAll() {
        Connection conn;
        Statement statement;
        PreparedStatement prStatement;
        ResultSet resultSet;
        String query = "SELECT * FROM `sepet`";
//"Urun adı", "urun Marka", "urun miktar", "urun fiyar", "toplam"
        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Sepet s = new Sepet();
                s.setUrunAdi(resultSet.getString("urunAdi"));
                s.setUrunMarka(resultSet.getString("urunMarka"));
                s.setMiktar(resultSet.getInt("Miktar"));
                s.setFiyat(resultSet.getFloat("fiyat"));
                s.setTop(resultSet.getFloat("top"));
                urunList.add(s);

            }

        } catch (SQLException ex) {
            System.out.println("sepetdal urun  getirilirken hata meyadana geldi: " + ex);

        }

        return urunList;

    }

    public int create(Sepet s) {
        Connection conn4;
        ResultSet rs4;
        Statement st4;
        PreparedStatement ps4;

        int sonuc = 0;

        try {

            conn4 = dbhelper.getConnection();

            String query = "insert into sepet ( "
                    + "urunAdi,"
                    + "urunMarka,"
                    + "Miktar,"
                    + "fiyat,"
                    + "top)   values(?,?,?,?,?)";

            ps4 = conn4.prepareStatement(query);

            ps4.setString(1, s.getUrunAdi());
            ps4.setString(2, s.getUrunMarka());
            ps4.setInt(3, s.getMiktar());
            ps4.setFloat(4, s.getFiyat());
            ps4.setFloat(5, s.getTop());

            sonuc = ps4.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" eklenırken  hata meyadana geldi: " + ex);
        }

        return sonuc;
    }
    public void TabloyuSıfırla(){
           Connection con2;
        ResultSet rs2;
        Statement st2;
        int sonuc = 0;
        try {
            String query = "TRUNCATE TABLE `sepet`";
            con2 = dbhelper.getConnection();
            st2 = con2.createStatement();
            sonuc=st2.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("sıfırlarken  bir hata meydana geldi:" + ex);
        }
      
    }

}
