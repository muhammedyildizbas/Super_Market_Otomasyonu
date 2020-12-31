/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Kasiyer;
/**
 *
 * @author Muhammed
 */
import Entities.MusteriUrunIade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Models.MusteriUrunIadeDAL;
import Entities.Urunler;
import Models.UrunlerDAL;
import Views.AnaEkran;

public class frmMusteriUrunIade extends javax.swing.JFrame {

    DefaultTableModel model;
    MusteriUrunIadeDAL islemler = new MusteriUrunIadeDAL();
    List<MusteriUrunIade> musteriIadeList = new ArrayList<>();

    public frmMusteriUrunIade() {
        initComponents();
        model = new DefaultTableModel();
        model.fireTableDataChanged();

    }

    public void TabloGetir() {
        model = new DefaultTableModel(new String[]{"ID", "No", "Adı", "Marka", "Miktar", "Fiyat", " Musteri Ad", "GSM", "Durumu", "İade Durumu ", "İade Tarih", "Satış Tarih", "İade Nedeni"}, 0);
        musteriIadeList = islemler.getAll();
        for (MusteriUrunIade i : musteriIadeList) {
            model.addRow(new Object[]{i.getMusteriIadeId(), i.getUrunNo(), i.getUrunAdi(), i.getUrunMarka(), i.getUrunMiktar(),i.getUrunFiyat(), i.getMusteriAdi(), i.getMusteriTelefon(), i.getUrunDurumu(),i.getIadeDurumu(),i.getUrunIadeTarihi(), i.getUrunSatisTarihi(), i.getIadeNedeni(),});
            IadeTablo.setModel(model);

        }
        musteriIadeList.clear();

    }
    
    
    public void iadeEkle() {
        //"ID", "No", "Adı", "Marka", "Miktar", "Fiyat", " Musteri Ad", "GSM", "Durumu", "İade Durumu ", "İade Tarih", "Satış Tarih", "İade Nedeni"
        MusteriUrunIade iade = new MusteriUrunIade();
        iade.setUrunNo(txtNo.getText());
        iade.setUrunAdi(txtUrunAdi.getText());
        iade.setUrunMarka(txtUrunMarka.getText());
        iade.setUrunMiktar(txtUrunMiktar.getText());
        iade.setUrunIadeTarihi(txtUrunIadeTarihi.getText());
        iade.setUrunSatisTarihi(txtUrunSatisTarihi.getText());
        iade.setMusteriAdi(txtMusteriAdi.getText());
        iade.setMusteriTelefon(txtMusteriTelefou.getText());
        iade.setIadeNedeni(txtpaneDegisimNedeni.getText());
        iade.setUrunDurumu(IUrunDurumu.getSelectedItem().toString());
        iade.setIadeDurumu(IIadeDurumu.getSelectedItem().toString());
        iade.setUrunFiyat(Float.parseFloat(txtUrunFiyat.getText()));
        islemler.create(iade);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUrunMiktar = new javax.swing.JTextField();
        txtMusteriAdi = new javax.swing.JTextField();
        txtMusteriTelefou = new javax.swing.JTextField();
        txtUrunFiyat = new javax.swing.JTextField();
        txtUrunSatisTarihi = new javax.swing.JTextField();
        IUrunDurumu = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        IIadeDurumu = new javax.swing.JComboBox();
        txtUrunAdi = new javax.swing.JTextField();
        txtUrunIadeTarihi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpaneDegisimNedeni = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        IadeTablo = new javax.swing.JTable();
        bEkle = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        txtUrunMarka = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 140, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 110, 123));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MÜŞTERİ ÜRÜN İADE");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ürün No    :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ürün Adı    :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marka       :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Miktar       :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fiyat        :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("İade Tarihi    :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Satış Tarihi    :");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ürün Durumu   :");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Müşteri Adı :");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefonu    :");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("İade Nedeni    :");

        txtUrunMiktar.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunMiktar.setText("1");

        txtMusteriAdi.setBackground(new java.awt.Color(171, 183, 183));
        txtMusteriAdi.setText("Müşteri Adı");

        txtMusteriTelefou.setBackground(new java.awt.Color(171, 183, 183));
        txtMusteriTelefou.setText("05XX XXX XX XX");

        txtUrunFiyat.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunFiyat.setText("0");

        txtUrunSatisTarihi.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunSatisTarihi.setText("Satış Tarih");

        IUrunDurumu.setBackground(new java.awt.Color(102, 102, 102));
        IUrunDurumu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sağlam", "Defolu", "Bozuk" }));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("İade Durumu   :");

        IIadeDurumu.setBackground(new java.awt.Color(102, 102, 102));
        IIadeDurumu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Değiştirildi", "Alındı" }));

        txtUrunAdi.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunAdi.setText("Adı");

        txtUrunIadeTarihi.setBackground(new java.awt.Color(171, 183, 183));
        txtUrunIadeTarihi.setText("İade Tarih");

        txtpaneDegisimNedeni.setBackground(new java.awt.Color(171, 183, 183));
        txtpaneDegisimNedeni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtpaneDegisimNedeni.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtpaneDegisimNedeni.setCaretColor(new java.awt.Color(153, 153, 153));
        txtpaneDegisimNedeni.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        txtpaneDegisimNedeni.setSelectionColor(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(txtpaneDegisimNedeni);

        IadeTablo.setBackground(new java.awt.Color(171, 183, 183));
        IadeTablo.setFont(new java.awt.Font("Comic Sans MS", 1, 7)); // NOI18N
        IadeTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        IadeTablo.setGridColor(new java.awt.Color(51, 51, 51));
        IadeTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IadeTabloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(IadeTablo);

        bEkle.setBackground(new java.awt.Color(75, 119, 190));
        bEkle.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        bEkle.setForeground(new java.awt.Color(255, 255, 255));
        bEkle.setText("Ekle");
        bEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEkleActionPerformed(evt);
            }
        });

        txtNo.setBackground(new java.awt.Color(171, 183, 183));

        txtUrunMarka.setBackground(new java.awt.Color(171, 183, 183));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/geri_1.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/geri_1.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ana-sayfa2.png"))); // NOI18N
        jLabel14.setText("Ana Sayfa");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMusteriTelefou, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMusteriAdi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUrunFiyat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUrunMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel13))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IIadeDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(257, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUrunSatisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUrunIadeTarihi))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IUrunDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(txtUrunIadeTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUrunMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMusteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMusteriTelefou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEkle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtUrunSatisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(IUrunDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(IIadeDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TabloGetir();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void bEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEkleActionPerformed
        iadeEkle();
        TabloGetir(); 
        
    }//GEN-LAST:event_bEkleActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        frmKasiyer kasiyerislem =new frmKasiyer();
        kasiyerislem.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        AnaEkran anaEkranDon =new AnaEkran();
        anaEkranDon.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void IadeTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IadeTabloMouseClicked
        // TODO add your handling code here:
        //"ID", "No", "Adı", "Marka", "Miktar", "Fiyat", " Musteri Ad", "GSM", "Durumu", "İade Durumu ", "İade Tarih", "Satış Tarih", "İade Nedeni"
        
        int selectedrow = IadeTablo.getSelectedRow();

        txtNo.setText(model.getValueAt(selectedrow, 1).toString());
        txtUrunAdi.setText(model.getValueAt(selectedrow, 2).toString());
        txtUrunMarka.setText(model.getValueAt(selectedrow, 3).toString());
        txtUrunMiktar.setText(model.getValueAt(selectedrow, 4).toString());
       txtUrunFiyat.setText(model.getValueAt(selectedrow, 5).toString());
        txtMusteriAdi.setText(model.getValueAt(selectedrow, 6).toString());
        txtMusteriTelefou.setText(model.getValueAt(selectedrow, 7).toString());
        IUrunDurumu.setSelectedItem(model.getValueAt(selectedrow, 8).toString());
        IIadeDurumu.setSelectedItem(model.getValueAt(selectedrow, 9).toString());
        txtUrunIadeTarihi.setText(model.getValueAt(selectedrow, 10).toString());
        txtUrunSatisTarihi.setText(model.getValueAt(selectedrow, 11).toString());
        txtpaneDegisimNedeni.setText(model.getValueAt(selectedrow, 12).toString());
        
    }//GEN-LAST:event_IadeTabloMouseClicked

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
            java.util.logging.Logger.getLogger(frmMusteriUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMusteriUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMusteriUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMusteriUrunIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMusteriUrunIade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox IIadeDurumu;
    private javax.swing.JComboBox IUrunDurumu;
    private javax.swing.JTable IadeTablo;
    private javax.swing.JButton bEkle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtMusteriAdi;
    private javax.swing.JTextField txtMusteriTelefou;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtUrunAdi;
    private javax.swing.JTextField txtUrunFiyat;
    private javax.swing.JTextField txtUrunIadeTarihi;
    private javax.swing.JTextField txtUrunMarka;
    private javax.swing.JTextField txtUrunMiktar;
    private javax.swing.JTextField txtUrunSatisTarihi;
    private javax.swing.JTextPane txtpaneDegisimNedeni;
    // End of variables declaration//GEN-END:variables
}
