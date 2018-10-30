-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.21


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema gastos
--

CREATE DATABASE IF NOT EXISTS gastos;
USE gastos;

--
-- Definition of table `tabela`
--

DROP TABLE IF EXISTS `tabela`;
CREATE TABLE `tabela` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `calendario` date NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `valor` float NOT NULL,
  `areaTipo` varchar(50) NOT NULL,
  `note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabela`
--

/*!40000 ALTER TABLE `tabela` DISABLE KEYS */;
INSERT INTO `tabela` (`codigo`,`calendario`,`tipo`,`valor`,`areaTipo`,`note`) VALUES 
 (5,'2018-06-27','Steam',9.68,'Ecommerce',NULL),
 (6,'2018-06-28','Combustivel',20,'Combustivel',NULL),
 (7,'2018-06-28','Combustivel',20,'Combustivel',NULL),
 (8,'2018-06-28','Cristal',6.08,'Supermercado',NULL),
 (9,'2018-06-30','Infohouse',45,'Supermercado',NULL),
 (10,'2018-06-30','Combustivel',20,'Combustivel',NULL),
 (11,'2018-07-03','Combustivel',20,'Combustivel',NULL),
 (12,'2018-07-04','Combustivel',50,'Combustivel',NULL),
 (13,'2018-07-10','Combustivel',20,'Combustivel',NULL),
 (14,'2018-07-11','Combustivel',20,'Combustivel',NULL),
 (15,'2018-07-20','Combustivel',50,'Combustivel',NULL),
 (16,'2018-07-12','Combustivel',20,'Combustivel',NULL),
 (17,'2018-07-25','Combustivel',20,'Combustivel',NULL),
 (18,'2018-07-26','Combustivel',20,'Combustivel',NULL),
 (19,'2018-07-26','Flavios',19.9,'Supermercado',NULL),
 (20,'2018-07-27','Combustivel',50,'Combustivel',NULL),
 (21,'2018-07-25','Estorno Wish',-15.07,'',NULL),
 (25,'2018-05-28','Casa de carne',14.69,'Supermercado',NULL),
 (26,'2018-06-04','Combustivel',20,'Combustivel',NULL),
 (27,'2018-06-04','Lanche',13.5,'Refeição',NULL),
 (28,'2018-06-05','Outro',10,'Lazer',NULL),
 (30,'2018-06-07','Combustivel',20,'Combustivel',NULL),
 (31,'2018-06-11','Wish',7.57,'Ecommerce',NULL),
 (32,'2018-06-15','Wish',25.11,'Ecommerce',NULL),
 (33,'2018-06-18','Bobs',3,'Lazer',NULL),
 (34,'2018-06-20','Assai Atacadista',17.66,'Supermercado',NULL),
 (35,'2018-06-23','Combustivel',20,'Combustivel',NULL),
 (36,'2018-06-26','Combustivel',50,'Combustivel',NULL),
 (37,'2018-04-21','Hinode',46.5,'Hinode',NULL),
 (38,'2018-05-23','Outro',10,'Lazer',NULL),
 (39,'2018-04-23','Uber',15.59,'Transporte',NULL),
 (40,'2018-05-03','Almoço',20.95,'Refeição',NULL),
 (41,'2018-05-08','Almoço',7,'Refeição',NULL),
 (42,'2018-05-08','Combustivel',20,'Combustivel',NULL),
 (43,'2018-05-10','Combustivel',20,'Combustivel',NULL),
 (44,'2018-05-11','Combustivel',50,'Combustivel',NULL),
 (45,'2018-05-12','Combustivel',10,'Combustivel',NULL),
 (46,'2018-05-12','Wish',15.26,'Combustivel',NULL),
 (47,'2018-05-15','Combustivel',20,'Combustivel',NULL),
 (48,'2018-05-15','Reembolso Wish',-8.37,'',NULL),
 (49,'2018-05-16','Almoço',7,'Refeição',NULL),
 (50,'2018-05-16','Combustivel',101,'Combustivel',NULL),
 (51,'2018-05-17','Outro',10,'Lazer',NULL),
 (52,'2018-05-17','Reembolso Wish',-10.47,'',NULL),
 (53,'2018-05-18','Almoço',18,'Refeição',NULL),
 (54,'2018-05-19','Combustivel',20,'Combustivel',NULL),
 (55,'2018-05-19','Almoço',5,'Refeição',NULL),
 (56,'2018-05-21','Cinema',58,'Lazer',NULL),
 (57,'2018-05-26','Almoço',13.5,'Refeição',NULL),
 (58,'2018-05-28','Multa atraso',29.07,'Juros',NULL),
 (59,'2018-08-01','Combustivel',20,'Combustivel',NULL),
 (60,'2018-08-01','Combustivel',50,'Combustivel',NULL),
 (61,'2018-08-04','Lanche',4,'Refeição',NULL),
 (62,'2018-08-07','Lanche',6,'Refeição',NULL),
 (63,'2018-08-07','Almoço',5,'Refeição',NULL),
 (64,'2018-08-08','Almoço',5,'Refeição',NULL),
 (65,'2018-08-09','Almoço',5,'Refeição',NULL),
 (66,'2018-08-10','Almoço',5,'Refeição',NULL),
 (67,'2018-08-11','Cristal',22.28,'Supermercado',NULL),
 (68,'2018-08-11','Luzes de freio',8,'Carro',NULL),
 (69,'2018-08-11','Combustivel',20,'Combustivel',NULL),
 (70,'2018-08-11','almoço',5,'Refeição',NULL),
 (71,'2018-08-13','Steam',25.85,'Ecommerce',NULL),
 (72,'2018-08-13','IOF Steam',1.65,'IOF',NULL),
 (73,'2018-08-14','almoço',5,'Refeição',NULL),
 (74,'2018-08-14','Combustivel',20,'Combustivel',NULL),
 (75,'2018-08-14','Lanche',6,'Refeição',NULL),
 (76,'2018-08-14','Estorno Wish',-7.22,'',NULL),
 (77,'2018-08-15','almoço',5,'Refeição',NULL),
 (78,'2018-08-16','almoço',5,'Refeição',NULL),
 (79,'2018-08-17','Lanche',4,'Refeição',NULL),
 (80,'2018-08-18','Combustivel',20,'Combustivel',NULL),
 (81,'2018-08-20','Sinuca',7,'Lazer',NULL),
 (82,'2018-08-20','JBL',66.5,'Ecommerce',NULL),
 (84,'2018-08-20','Combustivel',20,'Combustivel',NULL),
 (85,'2018-08-21','Estorno Wish',-24.63,'',NULL),
 (86,'2018-08-21','Lanche',4,'Refeição',NULL),
 (87,'2018-08-21','Combustivel',20,'Combustivel',NULL),
 (88,'2018-08-21','Combustivel',40,'Combustivel',NULL),
 (89,'2018-08-22','Almoço',6,'Refeição',NULL),
 (90,'2018-08-23','Almoço',10,'Refeição',NULL),
 (91,'2018-08-24','Combustivel',20,'Combustivel',NULL),
 (92,'2018-08-24','Lanche',4,'Refeição',NULL),
 (93,'2018-08-10','Variação Cambial',-0.05,'',NULL),
 (94,'2018-08-27','SheikPub',20,'Lazer',NULL),
 (95,'2018-08-28','JBL',66.5,'Ecommerce',NULL),
 (96,'2018-08-28','Lanche',4,'Refeição',NULL),
 (97,'2018-08-29','Almoço',5,'Refeição',NULL),
 (98,'2018-08-30','Combustivel',20,'Combustivel',NULL),
 (99,'2018-08-31','Almoço',5,'Refeição',NULL),
 (100,'2018-09-04','Lanche',6,'Refeição',NULL),
 (101,'2018-09-05','Almoço',5,'Refeição',NULL),
 (102,'2018-09-05','Combustivel',50,'Combustivel',NULL),
 (103,'2018-09-06','Lanche',5,'Refeição',NULL),
 (104,'2018-09-07','Steam',11.94,'Ecommerce',NULL),
 (105,'2018-09-07','Combustivel',20,'Combustivel',NULL),
 (106,'2018-09-07','IOF',0.76,'IOF',NULL),
 (107,'2018-09-07','Almoço',5,'Refeição',NULL),
 (108,'2018-09-08','Variação cambial',1.93,'IOF',NULL),
 (109,'2018-09-10','IOF',0.78,'IOF',NULL),
 (110,'2018-09-10','Steam',12.2,'Ecommerce',NULL),
 (111,'2018-09-11','Lanche',7.5,'Refeição',NULL),
 (112,'2018-09-11','Combustivel',50,'Combustivel',NULL),
 (113,'2018-09-12','Lanche',5,'Refeição',NULL),
 (114,'2018-09-13','Lanche',8,'Refeição',NULL),
 (115,'2018-09-13','Combustivel',30,'Combustivel',NULL),
 (116,'2018-09-15','Combustivel',30.91,'Combustivel',NULL),
 (117,'2018-09-15','Lanche',5,'Refeição',NULL),
 (118,'2018-09-18','Almoço',5,'Refeição',NULL),
 (119,'2018-09-18','Combustivel',20,'Combustivel',NULL),
 (120,'2018-09-19','Lanche',10,'Refeição',NULL),
 (121,'2018-09-19','Combustivel',20,'Combustivel',NULL),
 (122,'2018-09-21','Lanche',7,'Refeição',NULL),
 (123,'2018-09-22','Combustivel',20,'Combustivel',NULL),
 (124,'2018-09-22','Combustivel',20,'Combustivel',NULL),
 (125,'2018-09-22','Lanche',4,'Refeição',NULL),
 (126,'2018-09-25','Lanche',8.5,'Refeição',NULL),
 (127,'2018-09-26','Juros de rotativo',2.02,'Juros',NULL),
 (128,'2018-09-26','IOF rotativo',1.44,'IOF',NULL),
 (129,'2018-09-27','JBL',66.5,'Ecommerce',NULL),
 (130,'2018-09-27','Lanche',4,'Refeição',NULL),
 (131,'2018-09-28','Almoço',10.1,'Refeição',NULL),
 (132,'2018-09-29','Lanche',5.5,'Refeição',NULL),
 (133,'2018-09-28','Combustivel',20,'Combustivel',NULL),
 (134,'2018-10-01','Flor',10.9,'Lazer',NULL),
 (135,'2018-10-04','Almoço',8,'Refeição',NULL),
 (136,'2018-10-04','Combustivel',20,'Combustivel',NULL),
 (137,'2018-10-05','Lanche',7.5,'Refeição',NULL),
 (138,'2018-10-05','Combustivel',30,'Combustivel',NULL),
 (139,'2018-10-06','Combustivel',30,'Combustivel',NULL),
 (140,'2018-10-05','Almoço',15,'Refeição',NULL),
 (141,'2018-10-08','Almoço',8,'Refeição',NULL),
 (142,'2018-10-08','Lanche',18.52,'Refeição',NULL),
 (143,'2018-10-09','Posto Veredas',50,'Combustivel',NULL),
 (144,'2018-10-09','Almoço',6,'Comida',NULL),
 (145,'2018-10-10','Lanche',4,'Comida',NULL),
 (146,'2018-10-11','Almoço',8,'Comida',NULL),
 (147,'2018-10-11','Nuuvem',29.99,'Ecommerce',NULL),
 (148,'2018-10-16','Almoço',6,'Comida',NULL),
 (149,'2018-10-17','Almoço',8,'Comida',NULL),
 (150,'2018-10-18','Almoço',9.5,'Comida',NULL),
 (151,'2018-10-19','Lanche',5,'Comida',NULL),
 (152,'2018-10-19','Almoço',8,'Comida',NULL),
 (153,'2018-10-21','Refrigerante',7,'Supermercado',NULL),
 (154,'2018-10-22','Almoço',7.5,'Comida',NULL),
 (155,'2018-10-23','Almoço',8,'Comida',NULL),
 (156,'2018-10-23','Posto Floridian',20,'Combustivel',NULL),
 (157,'2018-10-25','Almoço',6.5,'Comida',NULL),
 (158,'2018-10-26','Almoço',6,'Comida',NULL),
 (159,'2018-10-26','Posto Petro Puro',30,'Combustivel',NULL);
/*!40000 ALTER TABLE `tabela` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
