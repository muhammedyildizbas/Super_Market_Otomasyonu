/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Database.DBHelper;
import Entities.Admin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAL {

    DBHelper dbhelper = new DBHelper();
    Connection conn;
    ResultSet resultSet;
    Statement statement;

    public List<Admin> getAll() {

        List<Admin> adminList;
       
        adminList = new ArrayList<>();
        String query = "select * from adminler";
        
        try {
            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                  Admin admin = new Admin();
                admin.setAdminId(resultSet.getInt("adminId"));
                admin.setAdminNo(resultSet.getString("adminNo"));
                admin.setAdminTCNo(resultSet.getString("adminTCNo"));
                admin.setAdminAd(resultSet.getString("adminAd"));
                admin.setAdminSoyad(resultSet.getString("adminAd"));
                admin.setAdminCinsiyet(resultSet.getString("adminCinsiyet"));
                admin.setAdminTel(resultSet.getString("adminTel"));
                admin.setAdminEmail(resultSet.getString("adminEmail"));
                admin.setAdminUserName(resultSet.getString("adminUsername"));
                admin.setAdminPassword(resultSet.getString("adminPassword"));
                adminList.add(admin);

            }
            
        } catch (SQLException ex) {
            System.out.println("adminDAL admin getirilirken hata meyadana geldi: "+ex);
           
        }

        return adminList;

    }
    
    
     public Admin findByID(String ID) {

        Admin admin = null;

        String query = "select * from adminler where adminUsername = '" + ID+ "'";
       
        try {
            admin = new Admin();
             conn = dbhelper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                admin.setAdminId(resultSet.getInt("adminId"));
                admin.setAdminNo(resultSet.getString("adminNo"));
                admin.setAdminTCNo(resultSet.getString("adminTCNo"));
                admin.setAdminAd(resultSet.getString("adminAd"));
                admin.setAdminSoyad(resultSet.getString("adminSoyad"));
                admin.setAdminCinsiyet(resultSet.getString("adminCinsiyet"));
                admin.setAdminTel(resultSet.getString("adminTel"));
                admin.setAdminEmail(resultSet.getString("adminEmail"));
                admin.setAdminUserName(resultSet.getString("adminUsername"));
                admin.setAdminPassword(resultSet.getString("adminPassword"));  }
            
        } catch (SQLException ex) {
                System.out.println("adminDAL admin getirilirken hata meyadana geldi: "+ex);
        
        }

        return admin;

    }
public int create(Admin admin) {

        int sonuc = 0;
        try {
            conn = dbhelper.getConnection();
            PreparedStatement prStatement;
            String query = "insert into adminler("
                    
                    + "adminNo,"
                    + "adminTcNo,"
                    + "adminAd,"
                    + "adminSoyad,"
                    + "adminCinsiyet,"
                    + "adminTel,"
                    + "adminEmail,"
                    + "adminUsername,"
                    + "adminPassword) values (?,?,?,?,?,?,?,?,?)";

            prStatement = conn.prepareStatement(query);

          
            prStatement.setString(1, admin.getAdminNo());
            prStatement.setString(2, admin.getAdminTCNo());
            prStatement.setString(3, admin.getAdminAd());
             prStatement.setString(4, admin.getAdminSoyad());
            prStatement.setString(5, admin.getAdminCinsiyet());
            prStatement.setString(6, admin.getAdminTel());
            prStatement.setString(7, admin.getAdminEmail());
            prStatement.setString(8, admin.getAdminUserName());
            prStatement.setString(9, admin.getAdminPassword());

            sonuc = prStatement.executeUpdate();

           
        } catch (SQLException ex) {
            System.out.println("adminDAL admin eklenirekn hata meydana geldi: "+ex);
        }
        return sonuc;
    }
public int update(Admin admin) {

        int sonuc = 0;
        try {
            conn = dbhelper.getConnection();
            PreparedStatement prStatement;
            String query = "update  adminler set "
                    + "adminId=? ,"
                    + "adminNo=?,"
                    + "adminTcNo=?,"
                    + "adminAd=?,"
                    + "adminSoyad=?,"
                    + "adminCinsiyet=?,"
                    + "adminTel=?,"
                    + "adminEamil=?,"
                    + "adminUsername=?,"
                    + "adminPassword=? where adminId='" + admin.getAdminId() + "'";
                  

            prStatement = conn.prepareStatement(query);

          
            prStatement.setString(1, admin.getAdminNo());
            prStatement.setString(2, admin.getAdminTCNo());
            prStatement.setString(3, admin.getAdminAd());
             prStatement.setString(4, admin.getAdminSoyad());
            prStatement.setString(5, admin.getAdminCinsiyet());
            prStatement.setString(6, admin.getAdminTel());
            prStatement.setString(7, admin.getAdminEmail());
            prStatement.setString(8, admin.getAdminUserName());
            prStatement.setString(9, admin.getAdminPassword());

            sonuc = prStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("adminDAL admin guncellenirken hata meyadana geldi: "+ex);
        }
        return sonuc;
    }
public int updateKisisel(Admin admin,int id) {

        int sonuc = 0;
        try {
            Connection con;
            con = dbhelper.getConnection();
            PreparedStatement prStatement;
            String query = "update adminler set "
                    + "adminTel=?,"
                    + "adminEmail=?,"
                    + "adminUsername=?,"
                    + "adminPassword=? where adminId='" + id + "'";
                  

            prStatement = con.prepareStatement(query);
            prStatement.setString(1, admin.getAdminTel());
            prStatement.setString(2, admin.getAdminEmail());
            prStatement.setString(3, admin.getAdminUserName());
            prStatement.setString(4, admin.getAdminPassword());

            sonuc = prStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("adminDAL admin bilgileri guncellenirken hata meyadana geldi: "+ex);
        }
        if (sonuc > 0) {
            System.out.println("başarılı bir şekilde gucellendi");

        }
        return sonuc;
    }

public int delete(String id) {
        int sonuc = 0;
        try {

            conn = dbhelper.getConnection();
            statement = conn.createStatement();
            String qery = "delete from adminler where adminId='" + id + "'";
            sonuc = statement.executeUpdate(qery);
            
        } catch (Exception e) {
            System.out.println("silme işleminde hata yaşandı :" + e);
        }

        return sonuc;

    }

}
