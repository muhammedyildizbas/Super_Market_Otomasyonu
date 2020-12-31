/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Yonetici;
//depodan sipatis verilerek getririlen urunlerde yasanabicek aksaklıklar soonucu urun iade ksımımusteri ile aynı
//urun iade kısmını kullanacak!!müsteri tarafından gelen ürün iadeler depocu tarafından iade ettirilecek.

import Views.depo.*;
import Entities.UrunIade;
import Entities.Urunler;
import Models.UrunIadeDAL;
import Models.UrunlerDAL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ZEYNEP
 */
public class frmDepoUrunIade extends javax.swing.JFrame {

    DefaultTableModel model;
    
    UrunIadeDAL islemler=new UrunIadeDAL();
    List<UrunIade> iadeList = new ArrayList<>();

    public frmDepoUrunIade() {
        model = new DefaultTableModel();
        initComponents();
    }

    public void TabloGetir() {
        model = new DefaultTableModel(new String[]{"Iade ID", "No", "Adı", "Marka", "Fiyat", "Aciklama", "Iade Tarihi", "Satış Tarihi"}, 0);
        iadeList = islemler.getAll();
        for (UrunIade i : iadeList) {
            model.addRow(new Object[]{i.getUrunIadeId(), i.getUrunNo(), i.getUrunAdi(), i.getUrunMarka(), i.getUrunFiyat(), i.getUrunAciklama(), i.getUrunIadeTarihi(), i.getUrunSatisTarihi()});
            Tablo.setModel(model);
        }
        iadeList.clear();
    }

    public void urunEkle() {
        int sonuc = 0;
        UrunIade iade = new UrunIade();
        iade.setUrunNo(txtNo.getText());
        iade.setUrunAdi(txtUrunAdi.getText());
        iade.setUrunMarka(txtUrunMarka.getText());
        iade.setUrunFiyat(Float.parseFloat(txtUrunFiyat.getText()));
        iade.setUrunAciklama(txtUrunAciklama.getText());
        iade.setUrunIadeTarihi(txtİade.getText());
        iade.setUrunSatisTarihi(txtSatis.getText());
        sonuc = islemler.create(iade);
        if (sonuc < 0) {
            JOptionPane.showMessageDialog(this, "Listeye eklenemdi");
        } else {
            JOptionPane.showMessageDialog(this, "Listeye eklendi");
        }

    }

    public void Guncelle() {
        int sonuc = 0;
        UrunIade iade = new UrunIade();
        iade.setUrunNo(txtNo.getText());
        iade.setUrunAdi(txtUrunAdi.getText());
        iade.setUrunMarka(txtUrunMarka.getText());
        iade.setUrunFiyat(Float.parseFloat(txtUrunFiyat.getText()));
        iade.setUrunAciklama(txtUrunAciklama.getText());
        iade.setUrunIadeTarihi(txtİade.getText());
        iade.setUrunSatisTarihi(txtSatis.getText());
        int selectedrow = Tablo.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "tablo su an boş");
            } else {
                JOptionPane.showMessageDialog(this, "guncellencek bir urun secin");
            }
        } else {

            int id = (int) model.getValueAt(selectedrow, 0);

            sonuc = islemler.update(iade, id);
            if (sonuc < 0) {
                JOptionPane.showMessageDialog(this, "Listeye guncellenmedi");
            } else {
                JOptionPane.showMessageDialog(this, "Liste guncellendi");
            }
        }

    }

    public void sil() {
        int sonuc = 0;
        int selectedRow = Tablo.getSelectedRow();//tablodan secili olan satir dizinini geonderir yoksa -1
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {//model.getRowCount() bu metod model deki tablonu satir sayısjnı donderir
                JOptionPane.showMessageDialog(this, "tablo su an boş...");
            } else {

                JOptionPane.showMessageDialog(this, "Lütfen silinecek bir işlem seçin ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);// getValueAt (int rowIndex, int columnIndex)//ColumnIndex ve rowIndex konumundaki hücrenin değerini döndürür.//burda 0oldugunu Id uzerinden silme yapıyoruz id il sutunda yer alıyor hep
            sonuc = islemler.delete(id);
            if (sonuc < 0) {
                JOptionPane.showMessageDialog(this, "Listeden silinemedi");
            } else {
                JOptionPane.showMessageDialog(this, "Listeden silindi");
            }
            //  JOptionPane.showMessageDialog(this, "islem basarılı");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablo = new javax.swing.JTable();
        bEkle = new javax.swing.JButton();
        bSil = new javax.swing.JButton();
        bGuncelle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUrunad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtUrunMarka = new javax.swing.JTextField();
        txtUrunFiyat = new javax.swing.JTextField();
        txtUrunAciklama = new javax.swing.JTextField();
        txtİade = new javax.swing.JTextField();
        txtSatis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Urun İade");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));

        Tablo.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablo);

        bEkle.setBackground(new java.awt.Color(75, 119, 190));
        bEkle.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bEkle.setForeground(new java.awt.Color(255, 255, 255));
        bEkle.setText("Ekle");
        bEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEkleActionPerformed(evt);
            }
        });

        bSil.setBackground(new java.awt.Color(75, 119, 190));
        bSil.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bSil.setForeground(new java.awt.Color(255, 255, 255));
        bSil.setText("Sil");
        bSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSilActionPerformed(evt);
            }
        });

        bGuncelle.setBackground(new java.awt.Color(75, 119, 190));
        bGuncelle.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bGuncelle.setForeground(new java.awt.Color(255, 255, 255));
        bGuncelle.setText("Güncelle");
        bGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuncelleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ürün No       :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ürün Adı       :");

        txtUrunAdi.setBackground(new java.awt.Color(171, 183, 183));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ürün Marka   :");

        txtUrunad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtUrunad.setForeground(new java.awt.Color(255, 255, 255));
        txtUrunad.setText("Ürün Fiyat     :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ürün Açıklama :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ürün İade Tarihi  :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ürün Satış Tarihi  :");

        txtNo.setBackground(new java.awt.Color(171, 183, 183));

        txtUrunMarka.setBackground(new java.awt.Color(171, 183, 183));

        txtUrunFiyat.setBackground(new java.awt.Color(171, 183, 183));

        txtUrunAciklama.setBackground(new java.awt.Color(171, 183, 183));

        txtİade.setBackground(new java.awt.Color(171, 183, 183));

        txtSatis.setBackground(new java.awt.Color(171, 183, 183));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("İade edilen  ürünü ürünler listesinden silmeyi unutmayın.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(bGuncelle)
                                    .addGap(18, 18, 18)
                                    .addComponent(bSil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(txtUrunad)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUrunAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                        .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUrunAciklama))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtİade, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtİade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtSatis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUrunad)
                            .addComponent(txtUrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUrunAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuncelle)
                    .addComponent(bSil)
                    .addComponent(bEkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
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
        TabloGetir();
    }//GEN-LAST:event_formWindowOpened

    private void bEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEkleActionPerformed
        urunEkle();
        TabloGetir();
    }//GEN-LAST:event_bEkleActionPerformed

    private void TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabloMouseClicked
        int selectedrow = Tablo.getSelectedRow();
        txtNo.setText(model.getValueAt(selectedrow, 1).toString());
        txtUrunAdi.setText(model.getValueAt(selectedrow, 2).toString());
        txtUrunMarka.setText(model.getValueAt(selectedrow, 3).toString());
        txtUrunFiyat.setText(model.getValueAt(selectedrow, 4).toString());
        txtUrunAciklama.setText(model.getValueAt(selectedrow, 5).toString());
        txtİade.setText(model.getValueAt(selectedrow, 6).toString());
        txtSatis.setText(model.getValueAt(selectedrow, 7).toString());
    }//GEN-LAST:event_TabloMouseClicked

    private void bGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuncelleActionPerformed
        Guncelle();
        TabloGetir();
    }//GEN-LAST:event_bGuncelleActionPerformed

    private void bSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSilActionPerformed
        sil();
        TabloGetir();
    }//GEN-LAST:event_bSilActionPerformed

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
            java.util.logging.Logger.getLogger(frmDepoUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDepoUrunIade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablo;
    private javax.swing.JButton bEkle;
    private javax.swing.JButton bGuncelle;
    private javax.swing.JButton bSil;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSatis;
    private javax.swing.JTextField txtUrunAciklama;
    private javax.swing.JTextField txtUrunAdi;
    private javax.swing.JTextField txtUrunFiyat;
    private javax.swing.JTextField txtUrunMarka;
    private javax.swing.JLabel txtUrunad;
    private javax.swing.JTextField txtİade;
    // End of variables declaration//GEN-END:variables

}
