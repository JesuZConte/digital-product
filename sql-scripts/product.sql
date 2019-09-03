CREATE DATABASE  IF NOT EXISTS `product_catalogue`;
USE `product_catalogue`;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_url` varchar(45) DEFAULT NULL,
  `top_level_category_id` varchar(45) DEFAULT NULL,
  `top_level_category_name` varchar(45) DEFAULT NULL,
  `price` decimal(11) DEFAULT NULL
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `product`
--

INSERT INTO `product` VALUES 
	(1310,'/shop/product/lenox-federal-platinum-5-piece-place-setting?ID=1310','53630','Fine China', 143.00);



DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `has_video` tinyint(1) DEFAULT NULL,
  `review_statistics` decimal(11) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `upc_number` varchar(50) DEFAULT NULL,
  `available` tinyint(1) DEFAULT NULL,
  `availability_message` varchar(50) DEFAULT NULL
  UNIQUE KEY `detail_idx_1` (`id`),
  CONSTRAINT `detail_ibfk_1` FOREIGN KEY (`id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `detail` 
VALUES 
('1310','Federal Platinum 5-Piece Place Setting', 'From the Lenox Classic Collection, Federal Platinum formal dinnerware and dishes add a luxurious note to your place settings.', 0, 4.7, 'Lenox', '91709210890', 1, 'In Stock');

