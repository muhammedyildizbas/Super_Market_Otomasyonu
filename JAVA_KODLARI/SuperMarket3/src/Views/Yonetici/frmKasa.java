/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Yonetici;

import Database.DBHelper;
import Models.PersonelDAL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HASAN
 */
public class frmKasa extends javax.swing.JFrame {

    //PersonelDAL dal=new PersonelDAL();
    DBHelper dbhelper = new DBHelper();
    public static float alıs;
    public static float satis;

    public frmKasa() {
        initComponents();
    }

    public void personelMaas() {
        int sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(personelMaas) from personeller";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
        
            }
            LMaas.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
     public void urunSiparis() {
        int sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(UrunAlıs) from urunsiparis";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
        
            }
            lUrunT.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
        public void DepoIade() {
        int sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(urunFiyat) from uruniade";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
        
            }
            LdepoIade.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
          public void UrunlerAlisToplam() {
        int sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(UrunAlis) from urunler";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
        
            }
            LurunAlis.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
          public void UrunlerSatisToplam() {
        int sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(UrunSatis) from urunler";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
        
            }
            LSatisToplam.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
          
          public void SatisToplam() {
        float sonuc = 0;
        Connection con2;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(UrunSatis) from satistoplam";
            con2 = dbhelper.getConnection();
            st = con2.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int c = rs.getInt(1);
                sonuc += c;
                 frmKasa.satis = sonuc;
            }
            LKasaSatis.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
           public void AlisToplam() {
       float sonuc = 0;
        Connection con;
        ResultSet rs ;
        Statement st;

        try {
            String query = "SELECT SUM(UrunAlis) from satistoplam";
            con = dbhelper.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                float c = rs.getFloat(1);
                sonuc += c;
         frmKasa.alıs = sonuc;
            }
            LKasaAlıs.setText(String.valueOf(sonuc));
           

        } catch (SQLException ex) {
            System.out.println("getirilirken bir hata meydana geldi" + ex);
        }

    }
           public void karHesapla(){
               float sonuc=frmKasa.satis-frmKasa.alıs;
               LKar.setText(String.valueOf(sonuc));
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LMaas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lUrunT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LdepoIade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LurunAlis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LSatisToplam = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LKasaSatis = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LKasaAlıs = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LKar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kasa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personele odenen toplam para                :");

        LMaas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LMaas.setForeground(new java.awt.Color(255, 255, 255));
        LMaas.setText("toplam tutar");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Siparis verilen ürünlere ödenen toplam para: ");

        lUrunT.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lUrunT.setForeground(new java.awt.Color(255, 255, 255));
        lUrunT.setText("uruntoplamtutar");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Depo iade edilen ürünler toplamı              :");

        LdepoIade.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LdepoIade.setForeground(new java.awt.Color(255, 255, 255));
        LdepoIade.setText("depoiadetoplamtutar");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ürünlerin alış fiyatı                            :");

        LurunAlis.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LurunAlis.setForeground(new java.awt.Color(255, 255, 255));
        LurunAlis.setText("alisfiyat");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ürünlerin Satış Fiyatı                          :");

        LSatisToplam.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LSatisToplam.setForeground(new java.awt.Color(255, 255, 255));
        LSatisToplam.setText("satisToplam");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kasa da yapılan toplam satış                  :");

        LKasaSatis.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LKasaSatis.setForeground(new java.awt.Color(255, 255, 255));
        LKasaSatis.setText("kasatoplam");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kasada yapılan  toplam satısların alıs fiyatı:");

        LKasaAlıs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LKasaAlıs.setForeground(new java.awt.Color(255, 255, 255));
        LKasaAlıs.setText("kasalistoplam");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kasa satışından elde edilen kar              :");

        LKar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LKar.setForeground(new java.awt.Color(255, 255, 255));
        LKar.setText("kar");

        jButton1.setBackground(new java.awt.Color(51, 110, 123));
        jButton1.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Satışı yapılan ürünleri göster");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lUrunT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMaas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LdepoIade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LurunAlis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LSatisToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LKasaSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LKasaAlıs, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LKar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMaas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUrunT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LdepoIade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LurunAlis))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LSatisToplam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LKasaSatis))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LKasaAlıs))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LKar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
        personelMaas();
        urunSiparis();
        DepoIade();
        UrunlerAlisToplam();
        UrunlerSatisToplam();
        SatisToplam();
        AlisToplam();
        karHesapla();
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frmSatılanUrunler  frm=new frmSatılanUrunler();
       
       frm.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmKasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LKar;
    private javax.swing.JLabel LKasaAlıs;
    private javax.swing.JLabel LKasaSatis;
    private javax.swing.JLabel LMaas;
    private javax.swing.JLabel LSatisToplam;
    private javax.swing.JLabel LdepoIade;
    private javax.swing.JLabel LurunAlis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lUrunT;
    // End of variables declaration//GEN-END:variables
}
