
package Models;

import Database.DBHelper;
import Entities.UrunIade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UrunIadeDAL {

    DBHelper dbHelper = new DBHelper();

    List<UrunIade> iadeList;

    public List<UrunIade> getAll() {
        Connection con;
        ResultSet rs;
        Statement st;
        try {
            iadeList = new ArrayList<>();
            String query = "Select * from uruniade ";
            con = dbHelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                UrunIade iade = new UrunIade();
                iade.setUrunIadeId(rs.getInt("UrunIadeId"));
                iade.setUrunNo(rs.getString("UrunNo"));
                iade.setUrunAdi(rs.getString("UrunAdi"));
                iade.setUrunMarka(rs.getString("UrunMarka"));
                iade.setUrunFiyat(rs.getFloat("UrunFiyat"));
                iade.setUrunSatisTarihi(rs.getString("UrunSatisTarihi"));
                iade.setUrunIadeTarihi(rs.getString("UrunIadeTarihi"));
                iade.setUrunAciklama(rs.getString("UrunAcıklama"));
                iadeList.add(iade);

            }

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi");

        }
        return iadeList;
    }

    public UrunIade findById(String id) {
        Connection con1;
        ResultSet rs1;
        Statement st1;
        UrunIade iade = new UrunIade();
        try {
            iadeList = new ArrayList<>();
            String query = "Select * from uruniade  where urunIadeId='" + id + "'";
            con1 = dbHelper.getConnection();
            st1 = con1.createStatement();
            rs1 = st1.executeQuery(query);
            while (rs1.next()) {

                iade.setUrunIadeId(rs1.getInt("UrunIadeId"));
                iade.setUrunNo(rs1.getString("UrunNo"));
                iade.setUrunAdi(rs1.getString("UrunAdi"));
                iade.setUrunMarka(rs1.getString("UrunMarka"));
                iade.setUrunFiyat(rs1.getFloat("UrunFiyat"));
                iade.setUrunSatisTarihi(rs1.getString("UrunSatisTarihi"));
                iade.setUrunIadeTarihi(rs1.getString("UrunIadeTarihi"));
                iade.setUrunAciklama(rs1.getString("UrunAciklama"));

            }

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);

        }
        return iade;
    }

    public int delete(int id) {
        Connection con2;
        ResultSet rs2;
        Statement st2;
        int sonuc = 0;
        try {
            String query = "delete from uruniade where UrunIadeId='" + id + "'";
            con2 = dbHelper.getConnection();
            st2 = con2.createStatement();
            sonuc=st2.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("silinirken bir hata meydana geldi:" + ex);
        }
        return sonuc;
    }

    public int update(UrunIade iade, int id) {
        Connection con3;

        int sonuc = 0;
        con3 = dbHelper.getConnection();
        PreparedStatement ps;
        try {
            String query = "update uruniade set " + " UrunNo=?," + "UrunAdi=?," + "UrunMarka=?," + "urunFiyat=?," + "UrunSatisTarihi=?," + "UrunIadeTarihi=?," + "UrunAciklama=? where UrunIadeId='" + id + "'";
            ps = con3.prepareStatement(query);
            ps.setString(1, iade.getUrunNo());
            ps.setString(2, iade.getUrunAdi());
            ps.setString(3, iade.getUrunMarka());
            ps.setFloat(4, iade.getUrunFiyat());
            ps.setString(5, iade.getUrunSatisTarihi());
            ps.setString(6, iade.getUrunIadeTarihi());
            ps.setString(7, iade.getUrunAciklama());
            sonuc = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("guncellenırken bir hata  meydana geldi:" + ex);
        }
        return sonuc;

    }

    public int create(UrunIade iade) {
        Connection con;

        int sonuc = 0;
        con = dbHelper.getConnection();
        PreparedStatement ps2;
        try {
            String query = "insert into uruniade(UrunNo,UrunAdi,UrunMarka,urunFiyat,UrunSatisTarihi,UrunIadeTarihi,UrunAciklama) values (?,?,?,?,?,?,?)";
            ps2 = con.prepareStatement(query);
            ps2.setString(1, iade.getUrunNo());
            ps2.setString(2, iade.getUrunAdi());
            ps2.setString(3, iade.getUrunMarka());
            ps2.setFloat(4, iade.getUrunFiyat());
            ps2.setString(5, iade.getUrunSatisTarihi());
            ps2.setString(6, iade.getUrunIadeTarihi());
            ps2.setString(7, iade.getUrunAciklama());
            sonuc = ps2.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("eklenirken  bir hata  meydana geldi:" + ex);
        }
        return sonuc;

    }

}
