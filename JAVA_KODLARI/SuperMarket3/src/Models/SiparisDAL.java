/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBHelper;
import Entities.UrunSiparis;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SiparisDAL {

    DBHelper dbHelper = new DBHelper();
    List<UrunSiparis> sList = new ArrayList<>();

    public List<UrunSiparis> getAll() {
        try {
            Connection con;
            Statement st;
            ResultSet rs;
            String query = "Select * from urunsiparis ";
            con = dbHelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                UrunSiparis s = new UrunSiparis();
                s.setUrunSiparidsId(rs.getInt("UrunSiparisId"));
                s.setUrunAdı(rs.getString("UrunAdı"));
                s.setUrunKategori(rs.getString("UrunKategori"));
                s.setUrunMarka(rs.getString("UrunMarka"));
                s.setUrunAdet(rs.getInt("UrunAdet"));
                s.setUrunAlis(rs.getFloat("UrunAlis"));
                s.setUrunSiparisT(rs.getString("UrunSiparisT"));
                s.setUrunGelisT(rs.getString("UrunGelisT"));
                sList.add(s);
            }
        } catch (SQLException ex) {
            System.out.println("siparis listesi getirilirken bir hata meydana geldi"+ex);
        }

        return sList;
    }

    public int crate(UrunSiparis s) {
        int sonuc = 0;
        Connection con1;
        PreparedStatement ps;
        con1 = dbHelper.getConnection();
        try {
            String query = "insert into urunsiparis (UrunAdı,UrunKategori,UrunMarka,UrunAdet,UrunAlıs,UrunSiparisT,UrunGelisT) values(?,?,?,?,?,?,?)";
            ps = con1.prepareStatement(query);
            ps.setString(1, s.getUrunAdı());
            ps.setString(2, s.getUrunKategori());
            ps.setString(3, s.getUrunMarka());
            ps.setInt(4, s.getUrunAdet());
            ps.setFloat(5, s.getUrunAlis());
            ps.setString(6, s.getUrunSiparisT());
            ps.setString(7, s.getUrunGelisT());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("listeye eklnirken bir hata meydana geldi"+ex);
        }
        return sonuc;

    }

    public int update(UrunSiparis s, int id) {
        int sonuc = 0;
        Connection con2;
        PreparedStatement ps2;
        con2 = dbHelper.getConnection();
        try {
            String query = "update urunsiparis set "
                    + "UrunAdı=?,"
                    + "UrunKategori=?,"
                    +"UrunMarka=?,"
                    +"UrunAdet=?,"
                    +"UrunAlıs=?,"
                    +"UrunSiparisT=?,"
                    +"UrunGelisT=? where UrunSiparisId='"+id+"'";
            ps2 = con2.prepareStatement(query);
            ps2.setString(1, s.getUrunAdı());
            ps2.setString(2, s.getUrunKategori());
            ps2.setString(3, s.getUrunMarka());
            ps2.setInt(4, s.getUrunAdet());
            ps2.setFloat(5, s.getUrunAlis());
            ps2.setString(6, s.getUrunSiparisT());
            ps2.setString(7, s.getUrunGelisT());
            sonuc = ps2.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("listeye guncellenirken  bir hata meydana geldi"+ex);
        }
        return sonuc;

    }
    public int delete(int id){
          Connection con2;
        ResultSet rs2;
        Statement st2;
        int sonuc = 0;
        try {
            String query = "delete from urunsiparis where UrunSiparisId='" + id + "'";
            con2 = dbHelper.getConnection();
            st2 = con2.createStatement();
            sonuc=st2.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("silinirken bir hata meydana geldi:" + ex);
        }
        return sonuc;
        
    }

}
