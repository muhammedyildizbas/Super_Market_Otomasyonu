package Entities;

public class Urunler {
    private int UrunId;
    private String UrunNo;
    private String UrunAdi;//ben telden direk resmi cektıma
    private String SonKullanmaTarihi;
    private String UrunMiktar; 
    private String UrunMarka;
    private String UrunKategori;
    private Float UrunAlis;
    private Float UrunSatis;
    private String UrunDurum;
    private String Aciklama;
    private String UrunAdet;
  public Urunler() {
    }

    public Urunler(int UrunId, String UrunNo, String UrunAdi, String SonKullanmaTarihi, String UrunMiktar, String UrunMarka, String UrunKategori, Float UrunAlis, Float UrunSatis, String UrunDurum, String Aciklama, String UrunAdet) {
        this.UrunId = UrunId;
        this.UrunNo = UrunNo;
        this.UrunAdi = UrunAdi;
        this.SonKullanmaTarihi = SonKullanmaTarihi;
        this.UrunMiktar = UrunMiktar;
        this.UrunMarka = UrunMarka;
        this.UrunKategori = UrunKategori;
        this.UrunAlis = UrunAlis;
        this.UrunSatis = UrunSatis;
        this.UrunDurum = UrunDurum;
        this.Aciklama = Aciklama;
        this.UrunAdet = UrunAdet;
    }

    public int getUrunId() {
        return UrunId;
    }

    public void setUrunId(int UrunId) {
        this.UrunId = UrunId;
    }

    public String getUrunNo() {
        return UrunNo;
    }

    public void setUrunNo(String UrunNo) {
        this.UrunNo = UrunNo;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public void setUrunAdi(String UrunAdi) {
        this.UrunAdi = UrunAdi;
    }

    public String getSonKullanmaTarihi() {
        return SonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(String SonKullanmaTarihi) {
        this.SonKullanmaTarihi = SonKullanmaTarihi;
    }

    public String getUrunMiktar() {
        return UrunMiktar;
    }

    public void setUrunMiktar(String UrunMiktar) {
        this.UrunMiktar = UrunMiktar;
    }

    public String getUrunMarka() {
        return UrunMarka;
    }

    public void setUrunMarka(String UrunMarka) {
        this.UrunMarka = UrunMarka;
    }

    public String getUrunKategori() {
        return UrunKategori;
    }

    public void setUrunKategori(String UrunKategori) {
        this.UrunKategori = UrunKategori;
    }

    public Float getUrunAlis() {
        return UrunAlis;
    }

    public void setUrunAlis(Float UrunAlis) {
        this.UrunAlis = UrunAlis;
    }

    public Float getUrunSatis() {
        return UrunSatis;
    }

    public void setUrunSatis(Float UrunSatis) {
        this.UrunSatis = UrunSatis;
    }

    public String getUrunDurum() {
        return UrunDurum;
    }

    public void setUrunDurum(String UrunDurum) {
        this.UrunDurum = UrunDurum;
    }

    public String getAciklama() {
        return Aciklama;
    }

    public void setAciklama(String Aciklama) {
        this.Aciklama = Aciklama;
    }

    public String getUrunAdet() {
        return UrunAdet;
    }

    public void setUrunAdet(String UrunAdet) {
        this.UrunAdet = UrunAdet;
    }
    
    
}
