-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 07 Haz 2020, 21:30:27
-- Sunucu sürümü: 10.1.36-MariaDB
-- PHP Sürümü: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `supermarket`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `adminId` int(255) NOT NULL,
  `adminNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `adminTcNo` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `adminAd` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `adminSoyad` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `adminCinsiyet` enum('Kadın','Erkek','','') COLLATE utf8_turkish_ci NOT NULL,
  `adminTel` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `adminEmail` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `adminUsername` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `adminPassword` varchar(100) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`adminId`, `adminNo`, `adminTcNo`, `adminAd`, `adminSoyad`, `adminCinsiyet`, `adminTel`, `adminEmail`, `adminUsername`, `adminPassword`) VALUES
(1, '1', '11111111111', 'Muhammed', 'Yıldız', 'Erkek', '5519874512', 'muhammed@gmail.com', '1', '1234'),
(2, '2', '22222222222', 'Zeynep', 'Çağlayan', 'Kadın', '5518529634', 'zeynep@gmail.com', '12', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kasalar`
--

CREATE TABLE `kasalar` (
  `KasaId` int(255) NOT NULL,
  `KasaNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `KasaToplamPara` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kasalar`
--

INSERT INTO `kasalar` (`KasaId`, `KasaNo`, `KasaToplamPara`) VALUES
(1, '1', 0),
(2, '2', 0),
(3, '3', 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musterifis`
--

CREATE TABLE `musterifis` (
  `FisId` int(255) NOT NULL,
  `FisTarih` date NOT NULL,
  `KasaNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunIsim` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunFiyat` float NOT NULL,
  `SatisToplami` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `musterifis`
--

INSERT INTO `musterifis` (`FisId`, `FisTarih`, `KasaNo`, `UrunIsim`, `UrunMarka`, `UrunFiyat`, `SatisToplami`) VALUES
(1, '2020-05-06', '2', 'Kola', 'Coco-Cola', 10, 10);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriuruniade`
--

CREATE TABLE `musteriuruniade` (
  `musteriIadeId` int(255) NOT NULL,
  `UrunNo` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMiktar` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `MusteriAdi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `MusteriTelefon` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `UrunIadeTarihi` date NOT NULL,
  `UrunSatisTarihi` date NOT NULL,
  `UrunDurumu` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `IadeDurumu` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `IadeNedeni` varchar(200) COLLATE utf8_turkish_ci NOT NULL,
  `UrunFiyat` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `musteriuruniade`
--

INSERT INTO `musteriuruniade` (`musteriIadeId`, `UrunNo`, `UrunAdi`, `UrunMarka`, `UrunMiktar`, `MusteriAdi`, `MusteriTelefon`, `UrunIadeTarihi`, `UrunSatisTarihi`, `UrunDurumu`, `IadeDurumu`, `IadeNedeni`, `UrunFiyat`) VALUES
(1, '1', 'Un', 'Efsane', '1', 'Ali', '5554568521', '2020-05-06', '2020-05-09', 'Sağlam', 'Değiştirilidi', 'Değişim', 10),
(2, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(3, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(4, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(5, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(6, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(7, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(8, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7),
(9, '10', 'Adı', 'sxsd', '1', 'Müşteri Adı', '05555829798', '2020-09-09', '2020-09-09', 'Sağlam', 'Değiştirildi', 'fgt', 7);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personelgorevleri`
--

CREATE TABLE `personelgorevleri` (
  `GorevId` int(255) NOT NULL,
  `GorevKategori` varchar(100) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personelgorevleri`
--

INSERT INTO `personelgorevleri` (`GorevId`, `GorevKategori`) VALUES
(1, 'Kasiyer'),
(2, 'Şef'),
(3, 'Personel'),
(4, 'Depo');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personeller`
--

CREATE TABLE `personeller` (
  `personelId` int(255) NOT NULL,
  `personelNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `personelTcNo` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `personelAd` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `personelSoyad` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `personelCinsiyet` enum('Erkek','Kadın') COLLATE utf8_turkish_ci NOT NULL,
  `personelTel` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `personelEmail` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `personelMaas` int(11) NOT NULL,
  `personelDurum` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `personelGorev` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `personelAciklama` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personeller`
--

INSERT INTO `personeller` (`personelId`, `personelNo`, `personelTcNo`, `personelAd`, `personelSoyad`, `personelCinsiyet`, `personelTel`, `personelEmail`, `personelMaas`, `personelDurum`, `personelGorev`, `personelAciklama`, `username`, `password`) VALUES
(1, '1', '33333333333', 'Ayse Nur', 'Demir', 'Kadın', '5511234567', 'ayse@gmail.com', 2000, 'Calisiyor', 'Manav', 'yok', 'manav', '111'),
(2, '2', '33333333334', 'Fatma', 'Çevik', 'Kadın', '5514789632', 'fatma@gmail.com', 1800, 'Calisiyor', 'Tezgahtar', 'yok', '222', '222'),
(3, '3', '33333333335', 'Hülya', 'Ateş', 'Kadın', '5512364585', 'hulya@gmail.com', 30000, 'Calisiyor', 'Sef', 'yok', 'sef', '123'),
(4, '4', '33333333336', 'Vahap', 'Kara', 'Erkek', '5369874152', 'vahap@gmail.com', 2500, 'İzinli', 'Kasap', 'yok', 'kasap', '1234'),
(5, '5', '33333333337', 'Furkan Ahmet', 'Tilki', 'Erkek', '5441235665', 'furkan@gmail.com', 2000, 'Çalışıyor', 'Depo', 'yok', 'depo', '1236'),
(10, '10', '44488845679', 'Ayca', 'Yılmaz', 'Kadın', '5557418965', 'ayca@gmail.com', 2500, 'Calisiyor', 'Kasiyer', 'yok', '10', '1010'),
(12, '13', '44488845679', 'Ayca', 'Yılmaz', 'Kadın', '5557418965', 'ayca@gmail.com', 2500, 'İzinli', 'Kasiyer', 'yok', '10', '1010');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `satistoplam`
--

CREATE TABLE `satistoplam` (
  `SatisId` int(255) NOT NULL,
  `KasaNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Miktar` int(11) NOT NULL,
  `UrunAlis` float NOT NULL,
  `UrunSatis` float NOT NULL,
  `SatisToplam` float NOT NULL,
  `OdemeYontemi` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `Tarih` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `satistoplam`
--

INSERT INTO `satistoplam` (`SatisId`, `KasaNo`, `UrunNo`, `UrunAdi`, `UrunMarka`, `Miktar`, `UrunAlis`, `UrunSatis`, `SatisToplam`, `OdemeYontemi`, `Tarih`) VALUES
(1, '1', '1', 'un', 'Efsane', 1, 7, 10, 10, 'Nakit', '2020-06-04'),
(2, '1', '24', 'Makarna', 'Oba', 1, 5, 7, 7, 'Nakit', '2020-06-04'),
(3, '1', '34', 'Visne Suyu', 'Pınar', 1, 5, 7.5, 7.5, 'Nakit', '2020-06-07'),
(4, '', '30', 'Visne Suyu', 'Pınar', 1, 5, 7.5, 7.5, 'Nakit', '2020-06-07');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sepet`
--

CREATE TABLE `sepet` (
  `UrunAdi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Miktar` int(11) NOT NULL,
  `fiyat` float NOT NULL,
  `top` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uruniade`
--

CREATE TABLE `uruniade` (
  `UrunIadeId` int(255) NOT NULL,
  `UrunNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `urunFiyat` float NOT NULL,
  `UrunAciklama` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunIadeTarihi` date NOT NULL,
  `UrunSatisTarihi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `uruniade`
--

INSERT INTO `uruniade` (`UrunIadeId`, `UrunNo`, `UrunAdi`, `UrunMarka`, `urunFiyat`, `UrunAciklama`, `UrunIadeTarihi`, `UrunSatisTarihi`) VALUES
(1, '123I123', 'Kola', 'Coco', 8, 'tarihi gecmis', '2020-05-13', '2020-05-06'),
(2, '123I123', 'fanta', 'Coco', 8, 'tarihi gecmis', '2020-05-13', '2020-05-06');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunistek`
--

CREATE TABLE `urunistek` (
  `IstekId` int(255) NOT NULL,
  `urunAdi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `urunKategori` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `personelNo` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdet` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAciklama` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `sefOnay` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `depodurum` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `urunistek`
--

INSERT INTO `urunistek` (`IstekId`, `urunAdi`, `urunKategori`, `personelNo`, `UrunMarka`, `UrunAdet`, `UrunAciklama`, `sefOnay`, `depodurum`) VALUES
(1, 'Dana Eti', 'sipariş verildi', '6', 'yok', '50', 'acil', 'Onaylandı', 'sipariş verildi'),
(2, 'Balık', 'Kasap', '6', 'yok', '50', 'acil', 'Onaylanmadı', 'sipariş verildi'),
(3, 'Dana eti', 'Kasap', '6', 'yok', '50', 'acil', 'Onaylandı', 'sipariş verildi'),
(4, 'Sığır  Eti', 'Kasap', '6', 'yok', '50', 'acil', 'Onaylandı', ''),
(5, 'Sığır  Eti', 'Kasap', '7', 'yok', '50', 'acil', 'Onaylandı', 'sipariş verildi'),
(6, 'Sığır  Eti', 'Kasap', '7', 'yok', '50', 'acil', 'Onaylandı', 'sipariş verildi'),
(7, 'Elma', 'Manav', '8', 'yok', '5', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir'),
(8, 'Elma', 'Manav', '8', 'yok', '5', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir'),
(10, 'Erik', 'Manav', '8', 'yok', '5', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir'),
(11, 'Fasulye', 'Tezgahtar', '8', 'yok', '1', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir'),
(12, 'Fasulye', 'Tezgahtar', '8', 'yok', '1', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir'),
(13, 'Fasulye', 'Tezgahtar', '8', 'yok', '1', 'kilo cinsinden', 'sef onay verebilir', 'depo onay verebilir');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunkategori`
--

CREATE TABLE `urunkategori` (
  `UrunKategoriId` int(255) NOT NULL,
  `UrunKategoriNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `KategoriAd` varchar(100) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `urunkategori`
--

INSERT INTO `urunkategori` (`UrunKategoriId`, `UrunKategoriNo`, `KategoriAd`) VALUES
(1, '123M123S', 'Meyve-Sebze'),
(2, '123E123T123S', 'Et-Balık-Tavuk'),
(3, '123S123K', 'Süt-Kahvaltılık'),
(4, '123G123S', 'Gıda-Sekerleme'),
(5, '123I123', 'İçecek'),
(6, '123D123T', 'Deterjan-Temizlik'),
(7, 'K123K123', 'Kagıt-Kozmetik'),
(8, 'B123O123', 'Bebek-Oyuncak'),
(9, '123E123P', 'Ev-Pet');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunler`
--

CREATE TABLE `urunler` (
  `UrunId` int(255) NOT NULL,
  `UrunNo` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `SonKullanmaTarihi` date NOT NULL,
  `UrunMiktar` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunKategori` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAlis` float NOT NULL,
  `UrunSatis` float NOT NULL,
  `UrunDurum` enum('Rafda','Depo','Yok','') COLLATE utf8_turkish_ci NOT NULL,
  `Aciklama` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdet` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `urunler`
--

INSERT INTO `urunler` (`UrunId`, `UrunNo`, `UrunAdi`, `SonKullanmaTarihi`, `UrunMiktar`, `UrunMarka`, `UrunKategori`, `UrunAlis`, `UrunSatis`, `UrunDurum`, `Aciklama`, `UrunAdet`) VALUES
(27, '2', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Rafda', 'yok', 1),
(29, '2', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(30, '3', 'un', '2020-06-19', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Rafda', 'yok', 1),
(31, '4', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(32, '5', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(33, '6', 'un', '2020-06-19', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Rafda', 'yok', 1),
(34, '7', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(35, '8', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(36, '3', 'un', '2020-06-19', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Rafda', 'yok', 1),
(37, '9', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(38, '10', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(39, '6', 'un', '2020-06-19', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Rafda', 'yok', 1),
(40, '11', 'Un', '2020-06-30', '1', 'Efsane', 'Gıda-Sekerleme', 7, 10, 'Depo', 'yok', 1),
(41, '12', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Rafda', 'yok', 1),
(42, '13', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(43, '12', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Rafda', 'yok', 1),
(44, '13', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(45, '14', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(46, '15', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(47, '16', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(48, '17', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(49, '18', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(50, '19', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(51, '20', 'Yağ', '2020-06-30', '5', 'Ayçiçek', 'Gıda-Sekerleme', 90, 100, 'Depo', 'yok', 1),
(52, '21', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Rafda', 'yok', 1),
(53, '22', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Depo', 'yok', 1),
(54, '21', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Rafda', 'yok', 1),
(55, '22', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Depo', 'yok', 1),
(57, '25', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Rafda', 'yok', 1),
(58, '26', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Depo', 'yok', 1),
(59, '27', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Sekerleme', 5, 7, 'Depo', 'yok', 1),
(61, '31', 'Süt', '2020-06-03', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(63, '31', 'Süt', '2020-06-03', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(64, '32', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(65, '33', 'Süt', '2020-06-03', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(67, '35', 'Süt', '2020-06-03', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(68, '36', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(69, '37', 'Süt', '2020-06-03', '1', 'Pınar', 'İçecek', 5, 7.5, 'Rafda', 'yok', 1),
(70, '37', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Depo', 'yok', 1),
(71, '38', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Depo', 'yok', 1),
(72, '39', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Depo', 'yok', 1),
(73, '40', 'Portakal  Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Depo', 'yok', 1),
(74, '1', 'Makarna', '2020-06-30', '1', 'Oba', 'Gıda-Şekerleme', 5, 7.5, 'Rafda', 'yok', 1),
(79, '76', 'Visne Suyu', '2020-06-30', '1', 'Pınar', 'İçecek', 5, 7.5, 'Depo', 'yok', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunsiparis`
--

CREATE TABLE `urunsiparis` (
  `UrunSiparisId` int(255) NOT NULL,
  `UrunAdı` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunKategori` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunMarka` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `UrunAdet` int(11) NOT NULL,
  `UrunAlıs` float NOT NULL,
  `UrunSiparisT` date NOT NULL,
  `UrunGelisT` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `urunsiparis`
--

INSERT INTO `urunsiparis` (`UrunSiparisId`, `UrunAdı`, `UrunKategori`, `UrunMarka`, `UrunAdet`, `UrunAlıs`, `UrunSiparisT`, `UrunGelisT`) VALUES
(4, 'patetes', 'Meyve-Sebze', 'çiflikten', 50, 300, '2020-09-09', '2020-09-09'),
(5, 'DOMATES', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(6, 'patlican', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(7, 'salatalık', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(8, 'salatalık', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(9, 'biber', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(10, 'kabak', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(12, 'muz', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09'),
(13, 'Un', 'Gıda-Şekerleme', 'Efsane', 50, 100, '2020-09-09', '2020-09-09'),
(14, 'Un', 'Gıda-Şekerleme', 'Efsane', 50, 100, '2020-09-09', '2020-09-09'),
(16, 'salatalık', 'Meyve-Sebze', 'çiflikten', 50, 100, '2020-09-09', '2020-09-09');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `adminler`
--
ALTER TABLE `adminler`
  ADD PRIMARY KEY (`adminId`);

--
-- Tablo için indeksler `kasalar`
--
ALTER TABLE `kasalar`
  ADD PRIMARY KEY (`KasaId`);

--
-- Tablo için indeksler `musterifis`
--
ALTER TABLE `musterifis`
  ADD PRIMARY KEY (`FisId`);

--
-- Tablo için indeksler `musteriuruniade`
--
ALTER TABLE `musteriuruniade`
  ADD PRIMARY KEY (`musteriIadeId`);

--
-- Tablo için indeksler `personelgorevleri`
--
ALTER TABLE `personelgorevleri`
  ADD PRIMARY KEY (`GorevId`);

--
-- Tablo için indeksler `personeller`
--
ALTER TABLE `personeller`
  ADD PRIMARY KEY (`personelId`);

--
-- Tablo için indeksler `satistoplam`
--
ALTER TABLE `satistoplam`
  ADD PRIMARY KEY (`SatisId`);

--
-- Tablo için indeksler `uruniade`
--
ALTER TABLE `uruniade`
  ADD PRIMARY KEY (`UrunIadeId`);

--
-- Tablo için indeksler `urunistek`
--
ALTER TABLE `urunistek`
  ADD PRIMARY KEY (`IstekId`);

--
-- Tablo için indeksler `urunkategori`
--
ALTER TABLE `urunkategori`
  ADD PRIMARY KEY (`UrunKategoriId`);

--
-- Tablo için indeksler `urunler`
--
ALTER TABLE `urunler`
  ADD PRIMARY KEY (`UrunId`);

--
-- Tablo için indeksler `urunsiparis`
--
ALTER TABLE `urunsiparis`
  ADD PRIMARY KEY (`UrunSiparisId`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `adminler`
--
ALTER TABLE `adminler`
  MODIFY `adminId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `kasalar`
--
ALTER TABLE `kasalar`
  MODIFY `KasaId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `musterifis`
--
ALTER TABLE `musterifis`
  MODIFY `FisId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `musteriuruniade`
--
ALTER TABLE `musteriuruniade`
  MODIFY `musteriIadeId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `personelgorevleri`
--
ALTER TABLE `personelgorevleri`
  MODIFY `GorevId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `personeller`
--
ALTER TABLE `personeller`
  MODIFY `personelId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Tablo için AUTO_INCREMENT değeri `satistoplam`
--
ALTER TABLE `satistoplam`
  MODIFY `SatisId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `uruniade`
--
ALTER TABLE `uruniade`
  MODIFY `UrunIadeId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `urunistek`
--
ALTER TABLE `urunistek`
  MODIFY `IstekId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `urunkategori`
--
ALTER TABLE `urunkategori`
  MODIFY `UrunKategoriId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `urunler`
--
ALTER TABLE `urunler`
  MODIFY `UrunId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- Tablo için AUTO_INCREMENT değeri `urunsiparis`
--
ALTER TABLE `urunsiparis`
  MODIFY `UrunSiparisId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
