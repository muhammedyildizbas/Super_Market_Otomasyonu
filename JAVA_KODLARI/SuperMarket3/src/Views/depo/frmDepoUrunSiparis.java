/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.depo;

import Entities.UrunSiparis;
import Models.SiparisDAL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZEYNEP
 */
public class frmDepoUrunSiparis extends javax.swing.JFrame {

    DefaultTableModel model;
    List<UrunSiparis> sList = new ArrayList();
    SiparisDAL islemler = new SiparisDAL();

    public frmDepoUrunSiparis() {

        model = new DefaultTableModel();
        model.fireTableDataChanged();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        txtUrunMarka = new javax.swing.JTextField();
        IKategori = new javax.swing.JComboBox<>();
        txtAdetSayısı = new javax.swing.JTextField();
        txtAlis = new javax.swing.JTextField();
        txtSiparis = new javax.swing.JTextField();
        txtGelis = new javax.swing.JTextField();
        bEkle = new javax.swing.JButton();
        bSil = new javax.swing.JButton();
        bGuncelle = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sipariş");
        setLocation(new java.awt.Point(250, 110));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));

        Tablo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
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
        jScrollPane3.setViewportView(Tablo);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adı     :");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marka :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kategori :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adet     :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fiyat     :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sipariş Tarihi :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teslim Tarihi  :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sipariş sonucunda gelen ürünleri depoya eklemeyi unutmayın!");

        txtUrunAdi.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrunAdiActionPerformed(evt);
            }
        });

        txtUrunMarka.setBackground(new java.awt.Color(171, 183, 183));

        IKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meyve-Sebze", "Et-Balık-Tavuk", "Süt-Kahvaltılık", "Gıda-Şekerleme", "İçecek", "Detarjan-Temizlik", "Kağıt-Kozmetik", "Bebek-Oyuncak", "Ev-Pet" }));

        txtAdetSayısı.setBackground(new java.awt.Color(171, 183, 183));

        txtAlis.setBackground(new java.awt.Color(171, 183, 183));

        txtSiparis.setBackground(new java.awt.Color(171, 183, 183));

        txtGelis.setBackground(new java.awt.Color(171, 183, 183));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(15, 15, 15))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtAlis, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                .addComponent(txtAdetSayısı))
                                            .addComponent(IKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bSil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bGuncelle))
                                    .addComponent(bEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSiparis, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(txtGelis)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSiparis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(txtGelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(IKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bEkle)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdetSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSil)
                    .addComponent(bGuncelle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void siparisEkle() {
        int sonuc = 0;
        UrunSiparis s = new UrunSiparis();
        s.setUrunAdı(txtUrunAdi.getText());
        s.setUrunMarka(txtUrunMarka.getText());
        s.setUrunKategori(IKategori.getSelectedItem().toString());
        s.setUrunAdet(Integer.parseInt(txtAdetSayısı.getText()));
        s.setUrunAlis(Float.parseFloat(txtAlis.getText()));
        s.setUrunSiparisT(txtSiparis.getText());
        s.setUrunGelisT(txtGelis.getText());
        islemler.crate(s);
        if (sonuc < 0) {
            JOptionPane.showMessageDialog(this, "Listeye eklenemedi");
        } else {
            JOptionPane.showMessageDialog(this, "Listeye eklendi");
        }

    }
    
    
    
    public void tabloGetir() {
         model.setRowCount(0);//modeli sifirla
        model = new DefaultTableModel(new String[]{"Siparis İd", "ad", "marka", "kategori", "adet", "alis", "Siparis T", "TeslimTarihi"}, 0);
        sList = islemler.getAll();
        for (UrunSiparis s : sList) {
            model.addRow(new Object[]{s.getUrunSiparidsId(), s.getUrunAdı(), s.getUrunMarka(), s.getUrunKategori(), s.getUrunAdet(), s.getUrunAlis(), s.getUrunSiparisT(), s.getUrunGelisT()});
            Tablo.setModel(model);
        }
        sList.clear();

    }


    public void siparisGuncelle() {
        int sonuc = 0;
        UrunSiparis s = new UrunSiparis();
        s.setUrunAdı(txtUrunAdi.getText());
        s.setUrunMarka(txtUrunMarka.getText());
        s.setUrunKategori(IKategori.getSelectedItem().toString());
        s.setUrunAdet(Integer.parseInt(txtAdetSayısı.getText()));
        s.setUrunAlis(Float.parseFloat(txtAlis.getText()));
        s.setUrunSiparisT(txtSiparis.getText());
        s.setUrunGelisT(txtGelis.getText());
        int selectedrow = Tablo.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "tablo su an boş");
            } else {
                JOptionPane.showMessageDialog(this, "guncellencek bir urun secin");
            }
        } else {

            int id = (int) model.getValueAt(selectedrow, 0);

            sonuc = islemler.update(s, id);
            if (sonuc < 0) {
                JOptionPane.showMessageDialog(this, "Liste guncellenemdi");
            } else {
                JOptionPane.showMessageDialog(this, "Listeye guncellendi");
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

        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tabloGetir();
    }//GEN-LAST:event_formWindowOpened

    private void txtUrunAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrunAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrunAdiActionPerformed

    private void bEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEkleActionPerformed
        siparisEkle();
       
        tabloGetir();
    }//GEN-LAST:event_bEkleActionPerformed

    private void TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabloMouseClicked
        int selectedrow = Tablo.getSelectedRow();
//"Siparis İd", "ad", "marka", "kategori", "adet", "alis", "Siparis T", "TeslimTarihi"}, 0);     
        txtUrunAdi.setText(model.getValueAt(selectedrow, 1).toString());
        txtUrunMarka.setText(model.getValueAt(selectedrow, 2).toString());
        IKategori.setSelectedItem(model.getValueAt(selectedrow, 3).toString());
        txtAdetSayısı.setText(model.getValueAt(selectedrow, 4).toString());
        txtAlis.setText(model.getValueAt(selectedrow, 5).toString());
        txtSiparis.setText(model.getValueAt(selectedrow, 6).toString());
        txtGelis.setText(model.getValueAt(selectedrow, 7).toString());

    }//GEN-LAST:event_TabloMouseClicked

    private void bGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuncelleActionPerformed
        siparisGuncelle();
        tabloGetir();
    }//GEN-LAST:event_bGuncelleActionPerformed

    private void bSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSilActionPerformed
        sil();
        tabloGetir();
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
            java.util.logging.Logger.getLogger(frmDepoUrunSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDepoUrunSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDepoUrunSiparis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IKategori;
    private javax.swing.JTable Tablo;
    private javax.swing.JButton bEkle;
    private javax.swing.JButton bGuncelle;
    private javax.swing.JButton bSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAdetSayısı;
    private javax.swing.JTextField txtAlis;
    private javax.swing.JTextField txtGelis;
    private javax.swing.JTextField txtSiparis;
    private javax.swing.JTextField txtUrunAdi;
    private javax.swing.JTextField txtUrunMarka;
    // End of variables declaration//GEN-END:variables
}
