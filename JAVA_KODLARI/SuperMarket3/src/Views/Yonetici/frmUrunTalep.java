package Views.Yonetici;

import Views.Personel.*;
import Entities.UrunIstek;
import Models.UrunIstekDAL;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUrunTalep extends javax.swing.JFrame {

    DefaultTableModel model;
    List<UrunIstek> urunList = new ArrayList<>();
    UrunIstekDAL islemler = new UrunIstekDAL();

    public frmUrunTalep() {
        model = new DefaultTableModel();
        model.fireTableDataChanged();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablo = new javax.swing.JTable();
        bEkle = new javax.swing.JButton();
        bSil = new javax.swing.JButton();
        bGuncelle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMarka = new javax.swing.JTextField();
        txtad = new javax.swing.JTextField();
        txtAdet = new javax.swing.JTextField();
        txtAcıklama = new javax.swing.JTextField();
        txtPer = new javax.swing.JTextField();
        IKategori = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ISefOnay = new javax.swing.JComboBox<>();
        IDepoDurum = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ÜRÜN İSTEK");
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
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
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
        bEkle.setText("EKLE");
        bEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEkleActionPerformed(evt);
            }
        });

        bSil.setBackground(new java.awt.Color(75, 119, 190));
        bSil.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bSil.setForeground(new java.awt.Color(255, 255, 255));
        bSil.setText("SİL");
        bSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSilActionPerformed(evt);
            }
        });

        bGuncelle.setBackground(new java.awt.Color(75, 119, 190));
        bGuncelle.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bGuncelle.setForeground(new java.awt.Color(255, 255, 255));
        bGuncelle.setText("GÜNCELLE");
        bGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuncelleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERSONEL NO:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÜRÜN ADI     :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ÜRÜN MARKA :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KATEGORİ :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADET           :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AÇIKLAMA :");

        txtMarka.setBackground(new java.awt.Color(171, 183, 183));

        txtad.setBackground(new java.awt.Color(171, 183, 183));

        txtAdet.setBackground(new java.awt.Color(171, 183, 183));

        txtAcıklama.setBackground(new java.awt.Color(171, 183, 183));

        txtPer.setBackground(new java.awt.Color(171, 183, 183));

        IKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasap", "Manav", "Tezgahtar", " " }));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Şef Onay   :");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Depo Durum :");

        ISefOnay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Onaylandı", "Onaylanmadı" }));

        IDepoDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sipariş verildi", "siparis verilmedi" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bSil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPer, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtad)
                            .addComponent(txtMarka))))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAcıklama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISefOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDepoDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAcıklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ISefOnay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(IDepoDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuncelle)
                    .addComponent(bSil)
                    .addComponent(bEkle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
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
public void TabloGetir() {
        model.setRowCount(0);
        model = new DefaultTableModel(new String[]{"id", " personel No", "Ad", "Marka", "Kategorı", "Adet", "Acıklama","sef Onay","depo"}, 0);///durumda enum kullanımı kodda doğru yazdık mı acaba ona bakacam bir eksık var tamamlımw
        urunList = islemler.getAll();
        for (UrunIstek u : urunList) {
            model.addRow(new Object[]{u.getIstekId(), u.getPersonelNo(), u.getUrunAdi(), u.getUrunMarka(), u.getUrunKategori(), u.getUrunAdet(), u.getUrunAciklama(),u.getSefOnay(),u.getDepodurum()});

            Tablo.setModel(model);
        }
            urunList.clear();
    }

    public void urunEkle() {
        UrunIstek istek = new UrunIstek();

        istek.setPersonelNo(txtPer.getText());
        istek.setUrunKategori(IKategori.getSelectedItem().toString());
        istek.setUrunAdi(txtad.getText());
        istek.setUrunAdet(txtAdet.getText());
        istek.setUrunMarka(txtMarka.getText());
        istek.setUrunAciklama(txtAcıklama.getText());
        istek.setSefOnay(ISefOnay.getSelectedItem().toString());
        istek.setDepodurum(IDepoDurum.getSelectedItem().toString());
        islemler.create(istek);
    }

    public void urunGuncelle() {
        UrunIstek istek = new UrunIstek();

        istek.setPersonelNo(txtPer.getText());
        istek.setUrunKategori(IKategori.getSelectedItem().toString());
        istek.setUrunAdi(txtad.getText());
        istek.setUrunAdet(txtAdet.getText());
        istek.setUrunMarka(txtMarka.getText());
        istek.setUrunAciklama(txtAcıklama.getText());
         istek.setSefOnay(ISefOnay.getSelectedItem().toString());
        istek.setDepodurum(IDepoDurum.getSelectedItem().toString());
        int selectedrow = Tablo.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "tablo su an boş");
            } else {
                JOptionPane.showMessageDialog(this, "guncellencek bir urun secin");
            }
        } else {

            int id = (int) model.getValueAt(selectedrow, 0);

            islemler.update(istek, id);
            JOptionPane.showMessageDialog(this, "islem basarılı");

        }

    }

    public void sil() {
        int sonuc=0;
        
        int selectedRow = Tablo.getSelectedRow();//tablodan secili olan satir dizinini geonderir yoksa -1
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {//model.getRowCount() bu metod model deki tablonu satir sayısjnı donderir
                JOptionPane.showMessageDialog(this, "tablo su an boş...");
            } else {

                JOptionPane.showMessageDialog(this, "Lütfen silinecek bir işlem seçin ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);// getValueAt (int rowIndex, int columnIndex)//ColumnIndex ve rowIndex konumundaki hücrenin değerini döndürür.//burda 0oldugunu Id uzerinden silme yapıyoruz id il sutunda yer alıyor hep
            sonuc=islemler.delete(id);
            if(sonuc<0){
                  JOptionPane.showMessageDialog(this, "islem basarısız");
            }else{
            JOptionPane.showMessageDialog(this, "islem basarılı");
            }
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TabloGetir();
    }//GEN-LAST:event_formWindowOpened

    private void TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabloMouseClicked
        int selectedrow = Tablo.getSelectedRow();
        //"id", " personel No", "Ad", "Marka", "Kategorı", "Adet", "Acıklama"
        txtPer.setText(model.getValueAt(selectedrow, 1).toString());
        txtad.setText(model.getValueAt(selectedrow, 2).toString());
        txtMarka.setText(model.getValueAt(selectedrow, 3).toString());
        IKategori.setSelectedItem(model.getValueAt(selectedrow, 4).toString());
        txtAdet.setText(model.getValueAt(selectedrow, 5).toString());
        txtAcıklama.setText(model.getValueAt(selectedrow, 6).toString());
        ISefOnay.setSelectedItem(model.getValueAt(selectedrow, 7).toString());
        IDepoDurum.setSelectedItem(model.getValueAt(selectedrow, 8).toString());
    }//GEN-LAST:event_TabloMouseClicked

    private void bEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEkleActionPerformed
        urunEkle();
        TabloGetir();
    }//GEN-LAST:event_bEkleActionPerformed

    private void bGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuncelleActionPerformed
        urunGuncelle();
        TabloGetir();
    }//GEN-LAST:event_bGuncelleActionPerformed

    private void bSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSilActionPerformed
        sil();
        TabloGetir();
    }//GEN-LAST:event_bSilActionPerformed

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
            java.util.logging.Logger.getLogger(frmUrunTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUrunTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUrunTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUrunTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUrunTalep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IDepoDurum;
    private javax.swing.JComboBox<String> IKategori;
    private javax.swing.JComboBox<String> ISefOnay;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAcıklama;
    private javax.swing.JTextField txtAdet;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtad;
    // End of variables declaration//GEN-END:variables
}
