/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.11-MariaDB : Database - simple_crud_gading
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`simple_crud_gading` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `simple_crud_gading`;

/*Table structure for table `reservation` */

DROP TABLE IF EXISTS `reservation`;

CREATE TABLE `reservation` (
  `id_reservation` bigint(20) NOT NULL AUTO_INCREMENT,
  `address_person` varchar(255) DEFAULT NULL,
  `email_person` varchar(100) DEFAULT NULL,
  `is_deleted` int(11) DEFAULT 0,
  `name_person` varchar(100) DEFAULT NULL,
  `phone_person` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_reservation`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `reservation` */

insert  into `reservation`(`id_reservation`,`address_person`,`email_person`,`is_deleted`,`name_person`,`phone_person`) values 
(1,'Jalan Manokwari','susanti@gmail.com',NULL,'Susanti','085647262611'),
(2,'Perumahan Jeruk','gadingramjets@gmail.com',NULL,'Gading','085647262644'),
(3,'Perumahan Apel','sararamjets@gmail.com',1,'Sara','085647262644'),
(4,'Jalan Nangka','anitadev@gmail.com',NULL,'Anita','085647262612'),
(5,'Jalan Merdeka','romariodev@gmail.com',NULL,'Romario','085647262622');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
