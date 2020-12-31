/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBHelper;
import Entities.MusteriUrunIade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusteriUrunIadeDAL {

 
      DBHelper dbHelper = new DBHelper();
      List<MusteriUrunIade> musteriIadeList= new ArrayList<>();
      public List<MusteriUrunIade> getAll(){
          
          Connection con;
          ResultSet rs;
          Statement st;
          
          try {
              
              con = dbHelper.getConnection();
              st=con.createStatement();
              String query = "SELECT * FROM `musteriuruniade` ";
              rs=st.executeQuery(query);
              while(rs.next()){
                  MusteriUrunIade urunIade = new MusteriUrunIade();
                  urunIade.setMusteriIadeId(rs.getInt("MusteriIadeId"));
                  urunIade.setUrunNo(rs.getString("UrunNo"));
                  urunIade.setUrunAdi(rs.getString("UrunAdi"));
                  urunIade.setUrunMarka(rs.getString("UrunMarka"));
                  urunIade.setUrunMiktar(rs.getString("UrunMiktar"));
                  urunIade.setMusteriAdi(rs.getString("MusteriAdi"));
                  urunIade.setMusteriTelefon(rs.getString("MusteriTelefon"));
                  urunIade.setUrunIadeTarihi(rs.getString("UrunIadeTarihi"));
                  urunIade.setUrunSatisTarihi(rs.getString("UrunSatisTarihi"));
                  urunIade.setUrunDurumu(rs.getString("UrunDurumu"));
                  urunIade.setIadeDurumu(rs.getString("IadeDurumu"));
                  urunIade.setIadeNedeni(rs.getString("IadeNedeni"));
                  urunIade.setUrunFiyat(rs.getFloat("UrunFiyat"));
                  musteriIadeList.add(urunIade);
              }  
          } catch (SQLException ex) {
              System.out.println("MusteriUrunIadeDal da hata meydana geldi." +ex);
          }
          return musteriIadeList;
      }
      public MusteriUrunIade findById(String id){
          Connection con1;
          ResultSet rsl;
          Statement stl;
          MusteriUrunIade urunIade = new MusteriUrunIade();
          try {
              musteriIadeList = new ArrayList<>();
              String query ="Select * from musteriuruniade where musteriIadeId='"+id+"'";
              con1=dbHelper.getConnection();
              stl = con1.createStatement();
              rsl=stl.executeQuery(query);
              while (rsl.next()) {
                  urunIade.setMusteriIadeId(rsl.getInt("musteriIadeId"));
                  urunIade.setUrunNo(rsl.getString("UrunNo"));
                  urunIade.setUrunAdi(rsl.getString("UrunAdi"));
                  urunIade.setUrunMarka(rsl.getString("UrunMarka"));
                  urunIade.setUrunMiktar(rsl.getString("UrunMiktar"));
                  urunIade.setMusteriAdi(rsl.getString("MusteriAdi"));
                  urunIade.setMusteriTelefon(rsl.getString("MusteriTelefon"));
                  urunIade.setUrunIadeTarihi(rsl.getString("UrunIadeTarihi"));
                  urunIade.setUrunSatisTarihi(rsl.getString("UrunSatisTarihi"));
                  urunIade.setUrunDurumu(rsl.getString("UrunDurumu"));
                  urunIade.setIadeDurumu(rsl.getString("UrunIadeDurumu"));
                  urunIade.setIadeNedeni(rsl.getString("UrunIade"));
                  urunIade.setUrunFiyat(rsl.getFloat("UrunFiyat"));
                  
              }
          
          } catch (SQLException ex) {
              System.out.println("Getirilirken hata oluştu");
          }
        return urunIade;          
      } 
      
      public int delete(int id){
          Connection con2;
          ResultSet rs2;
          Statement st2;
          int sonuc = 0;
          try {
              String query = "delete from musteriuruniade where musteriIadeId='"+id+"'";
            con2=dbHelper.getConnection();
            st2 =con2.createStatement();
            sonuc =st2.executeUpdate(query);
          } catch (SQLException ex) {
              System.out.println("Musteri Urun İade dal da silinirken hata meydana geldi");
          }
          return sonuc;
      }  
   public int update(MusteriUrunIade musteriUrunIade,int id){
       
       Connection con3;
       int sonuc = 0;
       con3= dbHelper.getConnection();
       PreparedStatement ps;
       try {
           String query ="update musteriuruniade set " + " UrunNo=?," + "UrunAdi=?," + "UrunMarka=?," + "UrunMiktar=?," +"MusteriAdi=?,"+"MusteriTelefon=?," + "UrunIadeTarihi=?,"+"UrunSatisTarihi=?," + "UrunDurumu=?,"+"IadeDurumu=?,"+"IadeNedeni=?,"+"UrunFiyat=? where musteriIadeId='" + id + "'";
     
       ps = con3.prepareStatement(query);
            ps.setString(1, musteriUrunIade.getUrunNo());
            ps.setString(2, musteriUrunIade.getUrunAdi());
            ps.setString(3, musteriUrunIade.getUrunMarka());
            ps.setString(4, musteriUrunIade.getMusteriAdi());
            ps.setString(5, musteriUrunIade.getMusteriTelefon());
            ps.setString(6, musteriUrunIade.getUrunIadeTarihi());
            ps.setString(7,musteriUrunIade.getUrunSatisTarihi());
            ps.setString(8, musteriUrunIade.getUrunDurumu());
            ps.setString(9, musteriUrunIade.getIadeDurumu());
            ps.setString(10, musteriUrunIade.getIadeNedeni());
            ps.setFloat(11, musteriUrunIade.getUrunFiyat());
           
            sonuc = ps.executeUpdate();
       } catch (SQLException ex) {
            System.out.println("Musteri Urun Dal guncellenırken bir hata  meydana geldi:" + ex);
       }
       return sonuc;
   }
    
   public  int create(MusteriUrunIade musteriUrunIade){
       
       Connection con3;
       int sonuc = 0;
       con3= dbHelper.getConnection();
       PreparedStatement ps2;
       try {
         String query = "insert into `musteriuruniade`(UrunNo,"
                 + "UrunAdi,"
                 + "UrunMarka,"
                 + "UrunMiktar,"
                 + "MusteriAdi,"
                 + "MusteriTelefon,"
                 + "UrunIadeTarihi,"
                 + "UrunSatisTarihi,"
                 + "UrunDurumu,"
                 + "IadeDurumu,"
                 + "IadeNedeni,"
                 + "UrunFiyat) values (?,?,?,?,?,?,?,?,?,?,?,?)";
     
       ps2 = con3.prepareStatement(query);
            ps2.setString(1, musteriUrunIade.getUrunNo());
            ps2.setString(2, musteriUrunIade.getUrunAdi());
            ps2.setString(3, musteriUrunIade.getUrunMarka());
            ps2.setString(4, musteriUrunIade.getUrunMiktar());
            ps2.setString(5, musteriUrunIade.getMusteriAdi());
            ps2.setString(6, musteriUrunIade.getMusteriTelefon());
            ps2.setString(7, musteriUrunIade.getUrunIadeTarihi());
            ps2.setString(8,musteriUrunIade.getUrunSatisTarihi());
            ps2.setString(9, musteriUrunIade.getUrunDurumu());
            ps2.setString(10, musteriUrunIade.getIadeDurumu());
            ps2.setString(11, musteriUrunIade.getIadeNedeni());
            ps2.setFloat(12, musteriUrunIade.getUrunFiyat());
           
            sonuc = ps2.executeUpdate();
       } catch (SQLException ex) {
            System.out.println("Musteri Urun Dal guncellenırken bir hata  meydana geldi:" + ex);
       }
       return sonuc;
   }
    
}
