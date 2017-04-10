-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2017 at 06:58 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ivs`
--

-- --------------------------------------------------------

--
-- Table structure for table `dondangkykethon`
--

CREATE TABLE `dondangkykethon` (
  `DDKKH_ID` int(11) NOT NULL,
  `HN_ID` int(11) DEFAULT NULL,
  `DDKKH_TEN` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `DDKKH_CMND` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `DDKKH_NGAYDK` date NOT NULL,
  `DDKKH_NGAYHEN` date NOT NULL,
  `DDKKH_NGAYNHAN` date DEFAULT NULL,
  `DDKKH_GHICHU` varchar(50) COLLATE utf8_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `dondangkykethon`
--

INSERT INTO `dondangkykethon` (`DDKKH_ID`, `HN_ID`, `DDKKH_TEN`, `DDKKH_CMND`, `DDKKH_NGAYDK`, `DDKKH_NGAYHEN`, `DDKKH_NGAYNHAN`, `DDKKH_GHICHU`) VALUES
(1, NULL, 'Nguyễn Văn Huy', '366026593', '2017-04-07', '2017-04-08', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `honnhan`
--

CREATE TABLE `honnhan` (
  `HN_ID` int(11) NOT NULL,
  `U_ID` int(11) DEFAULT NULL,
  `DDKKH_ID` int(11) DEFAULT NULL,
  `HN_NOIDANGKY` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `HN_TRANGTHAI` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NAM_HOTEN` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NAM_NGAYSINH` date NOT NULL,
  `NAM_DANTOC` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NAM_QUOCTICH` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NAM_NOICUTRU` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NAM_CMND` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NU_HOTEN` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NU_NGAYSINH` date NOT NULL,
  `NU_DANTOC` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NU_QUOCTICH` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NU_NOICUTRU` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NU_CMND` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `honnhan`
--

INSERT INTO `honnhan` (`HN_ID`, `U_ID`, `DDKKH_ID`, `HN_NOIDANGKY`, `HN_TRANGTHAI`, `NAM_HOTEN`, `NAM_NGAYSINH`, `NAM_DANTOC`, `NAM_QUOCTICH`, `NAM_NOICUTRU`, `NAM_CMND`, `NU_HOTEN`, `NU_NGAYSINH`, `NU_DANTOC`, `NU_QUOCTICH`, `NU_NOICUTRU`, `NU_CMND`) VALUES
(1, 1, 1, 'Cần Thơ', '1', 'Nguyễn Văn Huy', '1995-12-19', 'Kinh', 'Việt Nam', 'Sóc Trăng', '366026593', 'Nguyễn Ngọc Quyên', '1995-01-17', 'Kinh', 'Việt Nam', 'Cần Thơ', '366026594'),
(2, 1, 1, 'C?n Th?', '1', 'Nguy?n V?n Huy', '1995-12-19', 'Kinh', 'Vi?t Nam', 'Sóc Tr?ng ', '123', 'Nguy?n Ng?c Quyên', '1995-01-17', 'Kinh', 'Vi?t Nam', 'C?n Th?', '566');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `U_ID` int(11) NOT NULL,
  `U_NAME` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `U_PASS` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`U_ID`, `U_NAME`, `U_PASS`) VALUES
(1, 'admin', 'admin'),
(2, 'user', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dondangkykethon`
--
ALTER TABLE `dondangkykethon`
  ADD PRIMARY KEY (`DDKKH_ID`),
  ADD KEY `HN_ID` (`HN_ID`);

--
-- Indexes for table `honnhan`
--
ALTER TABLE `honnhan`
  ADD PRIMARY KEY (`HN_ID`),
  ADD KEY `U_ID` (`U_ID`),
  ADD KEY `DDKKH_ID` (`DDKKH_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`U_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dondangkykethon`
--
ALTER TABLE `dondangkykethon`
  MODIFY `DDKKH_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `honnhan`
--
ALTER TABLE `honnhan`
  MODIFY `HN_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `U_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `dondangkykethon`
--
ALTER TABLE `dondangkykethon`
  ADD CONSTRAINT `dondangkykethon_ibfk_1` FOREIGN KEY (`HN_ID`) REFERENCES `honnhan` (`HN_ID`);

--
-- Constraints for table `honnhan`
--
ALTER TABLE `honnhan`
  ADD CONSTRAINT `honnhan_ibfk_1` FOREIGN KEY (`U_ID`) REFERENCES `user` (`U_ID`),
  ADD CONSTRAINT `honnhan_ibfk_2` FOREIGN KEY (`DDKKH_ID`) REFERENCES `dondangkykethon` (`DDKKH_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
