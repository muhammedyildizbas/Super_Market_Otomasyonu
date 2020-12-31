package Views;

import Views.depo.frmDepo;

import Entities.Admin;
import Entities.Personeller;
import Models.AdminDAL;
import Models.PersonelDAL;
import Views.Kasiyer.frmKasaSec;
import Views.Kasiyer.frmKasiyer;
import Views.Personel.frmPersonel;
import Views.Personel.frmSifreDegistirme;
import Views.Sef.frmSef;
import Views.Sef.frmSefSifreDegistirme;
import Views.Yonetici.frmYonetici;
import Views.depo.frmDepoSifreDegistirme;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammed
 *
 */
public class Login extends javax.swing.JFrame {

    frmDepo depo = new frmDepo();
    frmSef sef = new frmSef();
    frmYonetici yonetici = new frmYonetici();
    frmKasiyer sec=new frmKasiyer();
    frmPersonel personel = new frmPersonel();

    public Login() {
        initComponents();
    }

    public void yoneticiGiris(String kul_adi, String sifre) {
        AdminDAL admin1 = new AdminDAL();
        List<Admin> adminList = admin1.getAll();
        for (Admin admin : adminList) {
            //System.out.println(admin.getAdminAd());

            if (admin.getAdminUserName().equals(kul_adi) && admin.getAdminPassword().equals(sifre)) {
                System.out.println("tebrikler");
                frmYonetici.id = txtKul.getText();
                System.out.println("id:" + frmYonetici.id);
                JOptionPane.showMessageDialog(this, "sifre ve kul. adı dogru ");
                yonetici.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "sifre veya kullanıcı adı hatali");
    }

    public void sefGiris(String kul_adi, String sifre) {
        PersonelDAL per= new PersonelDAL();
 
        List<Personeller> perList = per.getAll();
        for (Personeller pers : perList) {
            // System.out.println(pers.getPersonelAd());
            if (pers.getUsername().equals(kul_adi) && pers.getPassword().equals(sifre)) {
                frmSef.id = txtKul.getText();
                frmSef.username = txtKul.getText();
                JOptionPane.showMessageDialog(this, "sifre ve kul. adı dogru ");
                sef.setVisible(true);
                return;
            }

        }
        JOptionPane.showMessageDialog(this, "sifre veya kullanıcı adı hatali");
    }

    public void perGiris(String kul_adi, String sifre) {
        PersonelDAL per= new PersonelDAL();
        List<Personeller> perList = per.getAll();
        for (Personeller pers : perList) {

            if (pers.getUsername().equals(kul_adi) && pers.getPassword().equals(sifre)) {
                frmPersonel.id = txtKul.getText();
                frmPersonel.username = txtKul.getText();

                JOptionPane.showMessageDialog(this, "sifre ve kul. adı dogru ");
                personel.setVisible(true);
                return;
            }

        }
        JOptionPane.showMessageDialog(this, "sifre veya kullanıcı adı hatali");

    }

    public void kasiyerGiris(String kul_adi, String sifre) {
      PersonelDAL per= new PersonelDAL();
        List<Personeller> perList = per.getAll();
        for (Personeller pers : perList) {
            // System.out.println(pers.getPersonelAd());
            if (pers.getUsername().equals(kul_adi) && pers.getPassword().equals(sifre)) {
                JOptionPane.showMessageDialog(this, "sifre ve kul. adı dogru ");
                sec.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "sifre veya kullanıcı adı hatali");
    }

    public void depoGiris(String kul_adi, String sifre) {
       PersonelDAL per= new PersonelDAL();
        List<Personeller> perList = per.getAll();
        for (Personeller pers : perList) {

            if (pers.getUsername().equals(kul_adi) && pers.getPassword().equals(sifre)) {
                frmDepo.id = txtKul.getText();
                frmDepo.username = txtKul.getText();
                JOptionPane.showMessageDialog(this, "sifre ve kul. adı dogru ");
                depo.setVisible(true);
                return;
            }

        }

        JOptionPane.showMessageDialog(this, "sifre veya kullanıcı adı hatali");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKul = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        bGiris = new javax.swing.JButton();
        lblKullanıcıGirisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kullanıcı Girişi");
        setBackground(new java.awt.Color(51, 110, 123));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(430, 170));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));

        jPanel2.setBackground(new java.awt.Color(51, 110, 123));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("Kullanıcı Adı  :");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Şifre          :");

        txtKul.setBackground(new java.awt.Color(171, 183, 183));

        txtSifre.setBackground(new java.awt.Color(171, 183, 183));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKul, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtSifre))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        bGiris.setBackground(new java.awt.Color(75, 119, 190));
        bGiris.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bGiris.setForeground(new java.awt.Color(255, 255, 255));
        bGiris.setText("GİRİŞ");
        bGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGirisActionPerformed(evt);
            }
        });

        lblKullanıcıGirisi.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblKullanıcıGirisi.setForeground(new java.awt.Color(255, 255, 255));
        lblKullanıcıGirisi.setText("Kullanıcı Girişi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGiris)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblKullanıcıGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblKullanıcıGirisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bGiris)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGirisActionPerformed

        // TODO add your handling code here:
        String kullanici_adi = txtKul.getText();

        String sifre = txtSifre.getText();
        //System.out.println("kul :" + kullanici_adi + "  şifre :" + sifre);//dogrulufguna bakmak icn silinecek
        if (kullanici_adi.equals("") || sifre.equals("")) {
            //ilk olarrak kutucuklar bosmu ona baksın
            JOptionPane.showMessageDialog(this, "Lutfen kutucukları boş bırakmayın");
        } else {

            String kontrol = AnaEkran.kontrol;
            switch (kontrol) {
                case "Yonetici":
                    yoneticiGiris(kullanici_adi, sifre);
                    break;
                case "Sef":
                    //  sef.setVisible(true);
                    sefGiris(kullanici_adi, sifre);
                    break;
                case "Kasiyer":
                    kasiyerGiris(kullanici_adi, sifre);
                    break;
                case "Depo":

                    depoGiris(kullanici_adi, sifre);
                    break;
                case "Personel":
                    // personel.setVisible(true);
                    perGiris(kullanici_adi, sifre);
                    break;

            }
             this.setVisible(false);


    }//GEN-LAST:event_bGirisActionPerformed
/*   */
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
              
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblKullanıcıGirisi;
    private javax.swing.JTextField txtKul;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
