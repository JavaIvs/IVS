/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.18-log : Database - ivs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ivs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ivs`;

/*Table structure for table `dantoc` */

DROP TABLE IF EXISTS `dantoc`;

CREATE TABLE `dantoc` (
  `dantoc_id` int(11) NOT NULL AUTO_INCREMENT,
  `dantoc_ten` varchar(255) NOT NULL,
  PRIMARY KEY (`dantoc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

/*Data for the table `dantoc` */

insert  into `dantoc`(`dantoc_id`,`dantoc_ten`) values (1,'Kinh'),(2,'Tày'),(3,'Thái'),(4,'Mường'),(5,'Khơ Me'),(6,'H\'Mông'),(7,'Nùng'),(8,'Hoa'),(9,'Dao'),(10,'Gia Rai'),(11,'Ê Đê'),(12,'Ba Na'),(13,'Xơ Đăng'),(14,'Sán Chay'),(15,'Cơ Ho'),(16,'Chăm'),(17,'Sán Dìu'),(18,'Hrê'),(19,'Ra Giai'),(20,'M\'Nông'),(21,'X\'Tiêng'),(22,'Bru-Vân Kiều'),(23,'Thổ'),(24,'Khơ Mú'),(25,'Cơ Tu'),(26,'Giáy'),(27,'Giẻ Triêng'),(28,'Tà Ôi'),(29,'Mạ'),(30,'Co'),(31,'Chơ Ro'),(32,'Xinh Mun'),(33,'Hà Nhì'),(34,'Chu Ru'),(35,'Lào'),(36,'Kháng'),(37,'La Chí'),(38,'Phú Lá'),(39,'La Hủ'),(40,'La Ha'),(41,'Pà thẻn'),(42,'Chứt'),(43,'Lự'),(44,'Lô Lô'),(45,'Mảng'),(46,'Cờ Lao'),(47,'Bố Y'),(48,'Cống'),(49,'Ngái'),(50,'Si La'),(51,'Pu Péo'),(52,'Rơ Măm'),(53,'Brâu'),(54,'Ơ Đu');

/*Table structure for table `honnhan` */

DROP TABLE IF EXISTS `honnhan`;

CREATE TABLE `honnhan` (
  `hn_id` int(11) NOT NULL AUTO_INCREMENT,
  `hn_xa` int(11) NOT NULL,
  `nam_cmnd` varchar(255) NOT NULL,
  `nam_dantoc` varchar(255) NOT NULL,
  `nam_ngaysinh` varchar(255) NOT NULL,
  `nam_quoctich` varchar(255) NOT NULL,
  `nam_xa` varchar(255) NOT NULL,
  `nam_hoten` varchar(255) NOT NULL,
  `hn_ngaydk` varchar(255) NOT NULL,
  `hn_ngayhen` varchar(255) NOT NULL,
  `nu_cmnd` varchar(255) NOT NULL,
  `nu_dantoc` varchar(255) NOT NULL,
  `nu_hoten` varchar(255) NOT NULL,
  `nu_ngaysinh` varchar(255) NOT NULL,
  `nu_quoctich` varchar(255) NOT NULL,
  `nu_xa` varchar(255) NOT NULL,
  `hn_trangthai` varchar(255) NOT NULL,
  PRIMARY KEY (`hn_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `honnhan` */

insert  into `honnhan`(`hn_id`,`hn_xa`,`nam_cmnd`,`nam_dantoc`,`nam_ngaysinh`,`nam_quoctich`,`nam_xa`,`nam_hoten`,`hn_ngaydk`,`hn_ngayhen`,`nu_cmnd`,`nu_dantoc`,`nu_hoten`,`nu_ngaysinh`,`nu_quoctich`,`nu_xa`,`hn_trangthai`) values (11,9,'123456789','4','1995-01-01','1','1','Dỗ Công Hoan','2017-05-18','2017-05-18','123456789','1','Nguyễn Trần Tường Vi','1995-01-01','1','1','chuaxacminh'),(12,1,'123456789','1','1995-01-01','1','1','Thái Gia Ngọc','2017-05-16','2017-05-16','123456789','1','Nguyễn Thị Ngọc Minh','1995-01-01','1','1','chuaxacminh'),(13,8,'123456789','1','1995-01-01','1','1','Trần Văn Hiện','2017-05-17','2017-05-17','123456789','1','Đỗ Kim Danh','1995-01-01','1','1','chuaxacminh'),(14,6,'123456789','1','1995-01-01','1','1','Ô Nhật Tuyên','2017-05-17','2017-05-17','123456789','1','Nguyễn Thị Kim Tuyền','1995-01-01','1','1','chuaxacminh'),(15,2,'366026593','1','1995-12-19','1','1','Nguyễn Văn Huy','2017-05-17','2017-05-17','366026594','1','Nguyễn Ngọc Quyên','2002-01-17','1','1','chuaxacminh'),(16,4,'366026597','19','1995-01-01','3','6','Nguyễn Văn Bưởi','2017-05-18','2017-05-18','366026598','46','Trần Thị Cam','1995-01-01','8','8','chuaxacminh');

/*Table structure for table `quoctich` */

DROP TABLE IF EXISTS `quoctich`;

CREATE TABLE `quoctich` (
  `quoctich_id` int(11) NOT NULL AUTO_INCREMENT,
  `quoctich_ten` varchar(255) NOT NULL,
  PRIMARY KEY (`quoctich_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `quoctich` */

insert  into `quoctich`(`quoctich_id`,`quoctich_ten`) values (1,'Việt Nam'),(2,'Indonesia'),(3,'Myanmar'),(4,'Thái Lan'),(5,'Malaysia'),(6,'Philippines'),(7,'Lào'),(8,'Campuchia'),(9,'Đông Timor'),(10,'Brunei'),(11,'Singapore');

/*Table structure for table `xa` */

DROP TABLE IF EXISTS `xa`;

CREATE TABLE `xa` (
  `xa_id` int(11) NOT NULL AUTO_INCREMENT,
  `huyen_id` varchar(255) NOT NULL,
  `xa_ten` varchar(255) NOT NULL,
  PRIMARY KEY (`xa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `xa` */

insert  into `xa`(`xa_id`,`huyen_id`,`xa_ten`) values (1,'1','Phú Hữu'),(2,'1','Châu Khánh'),(4,'1','Hậu Thạnh'),(5,'1','Long Đức'),(6,'1','Long Phú'),(7,'1','Song Phụng'),(8,'1','Tân Thạnh'),(9,'1','Tân Hưng'),(10,'1','Trường Khánh');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
