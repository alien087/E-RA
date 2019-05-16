-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Bulan Mei 2019 pada 09.54
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emoney_itera`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nim` varchar(9) NOT NULL,
  `id_karyawan` varchar(5) NOT NULL,
  `id_kantin` varchar(4) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `jumlah_transaksi` double NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`nim`, `id_karyawan`, `id_kantin`, `tgl_transaksi`, `jumlah_transaksi`, `keterangan`) VALUES
('14117060', 'KA001', 'K001', '2019-05-01', 50000, 'top up'),
('14117060', 'KA001', 'K001', '2019-05-05', 20000, 'top up'),
('14117060', 'KA002', 'K001', '2019-02-12', 50000, 'payment'),
('14117060', 'KA002', 'K001', '2019-02-16', 90000, 'payment'),
('14117060', 'KA002', 'K001', '2019-05-16', 55433, 'payment'),
('14117060', 'KA002', 'K001', '2019-06-16', 100000, 'payment'),
('14117060', 'KA002', 'K001', '2019-10-16', 26, 'payment'),
('14117060', 'KA002', 'K001', '2019-05-16', 26, 'payment'),
('14117114', 'KA002', 'K001', '2019-05-16', 20000, 'top up'),
('14117060', 'KA002', 'K001', '2019-05-16', 1000, 'payment'),
('14117060', 'KA002', 'K001', '2019-05-16', 1231, 'payment'),
('14117114', 'KA002', 'K001', '2019-05-16', 1000, 'payment'),
('14117114', 'KA002', 'K001', '2019-05-16', 2000, 'payment'),
('14117060', 'KA002', 'K001', '2019-05-16', 12311, 'payment'),
('14117060', 'KA002', 'K001', '2019-05-16', 123111, 'payment'),
('14117114', 'KA002', 'K001', '2019-05-16', 200000, 'top up'),
('14117060', 'KA002', 'K001', '2019-05-16', 5000, 'payment');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `id_karyawan` (`id_karyawan`),
  ADD KEY `id_kantin` (`id_kantin`),
  ADD KEY `nim` (`nim`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_kantin`) REFERENCES `kantin` (`id`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
