package Views.Yonetici;

import Views.depo.*;
import Entities.Urunler;
import Models.UrunlerDAL;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ZEYNEP
 */
public class frmUrunDepo extends javax.swing.JFrame {

    DefaultTableModel model;
  
    UrunlerDAL islemler=new UrunlerDAL();
    List<Urunler> urunList = new ArrayList<>();

    public frmUrunDepo() {
        model = new DefaultTableModel();
        model.fireTableDataChanged();
        initComponents();
    }//secme yaptıgımda bu hatayı alıyorum

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bUrunEkle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtuAdi = new javax.swing.JTextField();
        IuKategori = new javax.swing.JComboBox<>();
        IuDurumu = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtuMiktar = new javax.swing.JTextField();
        txtuAdet = new javax.swing.JTextField();
        txtuNo = new javax.swing.JTextField();
        txtuSonTarihi = new javax.swing.JTextField();
        txtuAlis = new javax.swing.JTextField();
        txtuSatis = new javax.swing.JTextField();
        txtuMarka = new javax.swing.JTextField();
        txtuAciklama = new javax.swing.JTextField();
        bUrunSil = new javax.swing.JButton();
        bGuncelle = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        UrunTable = new javax.swing.JTable();

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

        jButton2.setText("jButton2");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));

        bUrunEkle.setBackground(new java.awt.Color(75, 119, 190));
        bUrunEkle.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bUrunEkle.setForeground(new java.awt.Color(255, 255, 255));
        bUrunEkle.setText("Ürün Ekle");
        bUrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUrunEkleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ürün No      :");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ürün Adı     :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ürün Miktar :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ürün Adet   :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ürün Durumu  :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ürün Kategori :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Son Kullanma Tarihi : ");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ürün Alış             :");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ürün Satış          :");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ürün Marka        :");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Açıklama       :");

        txtuAdi.setBackground(new java.awt.Color(171, 183, 183));

        IuKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meyve-Sebze", "Et-Balık-Tavuk", "Süt-Kahvaltılık", "Gıda-Şekerleme", "İçecek", "Detarjan-Temizlik", "Kağıt-Kozmetik", "Bebek-Oyuncak", "Ev-Pet" }));

        IuDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rafda", "Depo", "Yok" }));

        txtuMiktar.setBackground(new java.awt.Color(171, 183, 183));

        txtuAdet.setBackground(new java.awt.Color(171, 183, 183));

        txtuNo.setBackground(new java.awt.Color(171, 183, 183));

        txtuSonTarihi.setBackground(new java.awt.Color(171, 183, 183));

        txtuAlis.setBackground(new java.awt.Color(171, 183, 183));

        txtuSatis.setBackground(new java.awt.Color(171, 183, 183));

        txtuMarka.setBackground(new java.awt.Color(171, 183, 183));

        txtuAciklama.setBackground(new java.awt.Color(171, 183, 183));
        txtuAciklama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuAciklamaActionPerformed(evt);
            }
        });

        bUrunSil.setBackground(new java.awt.Color(75, 119, 190));
        bUrunSil.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bUrunSil.setForeground(new java.awt.Color(255, 255, 255));
        bUrunSil.setText("Ürünü Sil");
        bUrunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUrunSilActionPerformed(evt);
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

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));

        UrunTable.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        UrunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        UrunTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UrunTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(UrunTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bUrunSil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bGuncelle))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IuDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IuKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtuAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtuNo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuAlis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtuSonTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(bUrunEkle))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtuAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuSonTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtuSatis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtuAlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtuAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtuMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IuKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(21, 21, 21))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtuMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IuDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bUrunEkle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bGuncelle)
                        .addComponent(bUrunSil)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tabloGetir();
    }//GEN-LAST:event_formWindowOpened
    public void urunEkle() {
        Urunler urun = new Urunler();
        /*
       cast icin
       1.
       float f = Float.parseFloat(text.getText); yada
       String a=text.getText();//Create a string to store the incoming data
float f = Float.parseFloat(a);
         */

        urun.setUrunNo(txtuNo.getText());
        urun.setUrunAdi(txtuAdi.getText());
        urun.setUrunMiktar(txtuMiktar.getText());
        urun.setUrunMarka(txtuMarka.getText());
        urun.setSonKullanmaTarihi(txtuSonTarihi.getText());
        urun.setUrunAlis(Float.parseFloat(txtuAlis.getText()));
        urun.setUrunSatis(Float.parseFloat(txtuSatis.getText()));
        urun.setUrunDurum(IuDurumu.getSelectedItem().toString());// 
        urun.setUrunKategori(IuKategori.getSelectedItem().toString());
        urun.setAciklama(txtuAciklama.getText());
        urun.setUrunAdet(txtuAdet.getText());

        islemler.create(urun);
    }

    public void urunGuncelle() {
        Urunler urun = new Urunler();
        urun.setUrunNo(txtuNo.getText());
        urun.setUrunAdi(txtuAdi.getText());
        urun.setUrunMiktar(txtuMiktar.getText());
        urun.setUrunMarka(txtuMarka.getText());
        urun.setSonKullanmaTarihi(txtuSonTarihi.getText());
        urun.setUrunAlis(Float.parseFloat(txtuAlis.getText()));
        urun.setUrunSatis(Float.parseFloat(txtuSatis.getText()));
        urun.setUrunDurum(IuDurumu.getSelectedItem().toString());// 
        urun.setUrunKategori(IuKategori.getSelectedItem().toString());
        urun.setAciklama(txtuAciklama.getText());
        urun.setUrunAdet(txtuAdet.getText());
        int selectedrow = UrunTable.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "tablo su an boş");
            } else {
                JOptionPane.showMessageDialog(this, "guncellencek bir urun secin");
            }
        } else {

            int id = (int) model.getValueAt(selectedrow, 0);

            islemler.update(urun, id);
            JOptionPane.showMessageDialog(this, "islem basarılı");

        }

    }

    public void sil() {
        int selectedRow = UrunTable.getSelectedRow();//tablodan secili olan satir dizinini geonderir yoksa -1
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {//model.getRowCount() bu metod model deki tablonu satir sayısjnı donderir
                JOptionPane.showMessageDialog(this, "tablo su an boş...");
            } else {

                JOptionPane.showMessageDialog(this, "Lütfen silinecek bir işlem seçin ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);// getValueAt (int rowIndex, int columnIndex)//ColumnIndex ve rowIndex konumundaki hücrenin değerini döndürür.//burda 0oldugunu Id uzerinden silme yapıyoruz id il sutunda yer alıyor hep
            islemler.delete(id);
            JOptionPane.showMessageDialog(this, "islem basarılı");

        }

    }

    public void tabloGetir() {
        model = new DefaultTableModel(new String[]{"id", "No", "Ad", "Miktar", "Marka", "Kategorı", "Durum", "SonKul.1tarihi", "Adet", "Alıs", "Satıs", "Acıklama"}, 0);///durumda enum kullanımı kodda doğru yazdık mı acaba ona bakacam bir eksık var tamamlımw
        urunList = islemler.getDepoAll();
        for (Urunler u : urunList) {
            model.addRow(new Object[]{u.getUrunId(), u.getUrunNo(), u.getUrunAdi(), u.getUrunMiktar(), u.getUrunMarka(), u.getUrunKategori(), u.getUrunDurum(), u.getSonKullanmaTarihi(), u.getUrunAdet(), u.getUrunAlis(), u.getUrunSatis(), u.getAciklama()});

            UrunTable.setModel(model);
        }
        urunList.clear();

    }
    private void bUrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUrunEkleActionPerformed
        
        urunEkle();
        tabloGetir();

    }//GEN-LAST:event_bUrunEkleActionPerformed

    private void txtuAciklamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuAciklamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuAciklamaActionPerformed

    private void UrunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrunTableMouseClicked
        //kodu bu
        int selectedrow = UrunTable.getSelectedRow();
       txtuNo.setText(model.getValueAt(selectedrow, 1).toString());
        txtuAdi.setText(model.getValueAt(selectedrow, 2).toString());
        txtuMiktar.setText(model.getValueAt(selectedrow, 3).toString());
        txtuMarka.setText(model.getValueAt(selectedrow, 4).toString());

        IuKategori.setSelectedItem(model.getValueAt(selectedrow, 5).toString());
        IuDurumu.setSelectedItem(model.getValueAt(selectedrow, 6).toString());
        txtuSonTarihi.setText(model.getValueAt(selectedrow, 7).toString());
        txtuAdet.setText(model.getValueAt(selectedrow, 8).toString());
        txtuAlis.setText(model.getValueAt(selectedrow, 9).toString());
        txtuSatis.setText(model.getValueAt(selectedrow, 10).toString());
        txtuAciklama.setText(model.getValueAt(selectedrow, 11).toString());

    }//GEN-LAST:event_UrunTableMouseClicked

    private void bUrunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUrunSilActionPerformed
        sil();
        tabloGetir();
    }//GEN-LAST:event_bUrunSilActionPerformed

    private void bGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuncelleActionPerformed
        // TODO add your handling code here:
        urunGuncelle();
        tabloGetir();
    }//GEN-LAST:event_bGuncelleActionPerformed

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
            java.util.logging.Logger.getLogger(frmUrunDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUrunDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUrunDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUrunDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUrunDepo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IuDurumu;
    private javax.swing.JComboBox<String> IuKategori;
    private javax.swing.JTable UrunTable;
    private javax.swing.JButton bGuncelle;
    private javax.swing.JButton bUrunEkle;
    private javax.swing.JButton bUrunSil;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtuAciklama;
    private javax.swing.JTextField txtuAdet;
    private javax.swing.JTextField txtuAdi;
    private javax.swing.JTextField txtuAlis;
    private javax.swing.JTextField txtuMarka;
    private javax.swing.JTextField txtuMiktar;
    private javax.swing.JTextField txtuNo;
    private javax.swing.JTextField txtuSatis;
    private javax.swing.JTextField txtuSonTarihi;
    // End of variables declaration//GEN-END:variables
}
