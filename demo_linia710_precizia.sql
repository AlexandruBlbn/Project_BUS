-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `linia710_precizia`
--

DROP TABLE IF EXISTS `linia710_precizia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linia710_precizia` (
  `Ora_Hour` int DEFAULT NULL,
  `Minutul_Minute` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linia710_precizia`
--

LOCK TABLES `linia710_precizia` WRITE;
/*!40000 ALTER TABLE `linia710_precizia` DISABLE KEYS */;
INSERT INTO `linia710_precizia` VALUES (5,2),(5,24),(5,50),(6,2),(6,14),(6,28),(6,42),(7,6),(7,18),(7,30),(7,44),(7,58),(8,12),(8,26),(8,40),(8,54),(9,8),(9,22),(9,36),(9,50),(10,4),(10,18),(10,32),(10,46),(11,0),(11,14),(11,28),(11,42),(11,56),(12,10),(12,24),(12,38),(12,52),(13,6),(13,20),(13,34),(13,46),(13,58),(14,10),(14,22),(14,34),(14,46),(14,58),(15,10),(15,22),(15,34),(15,46),(15,58),(16,10),(16,22),(16,34),(16,46),(16,58),(17,10),(17,22),(17,34),(17,46),(17,58),(18,12),(18,26),(18,40),(18,54),(19,8),(19,22),(19,36),(19,50),(20,4),(20,18),(20,32),(20,46),(21,0),(21,14),(21,28),(21,48),(22,8),(22,28),(22,50),(23,16),(23,38);
/*!40000 ALTER TABLE `linia710_precizia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-09 23:02:04
