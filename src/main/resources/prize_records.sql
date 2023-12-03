

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for prize_records
-- ----------------------------
DROP TABLE IF EXISTS `prize_records`;
CREATE TABLE `prize_records`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `prize_name` varchar(25)  NULL DEFAULT NULL,
  `prize_amount` decimal(25, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
);

-- ----------------------------
-- Records of prize_records
-- ----------------------------
INSERT INTO `prize_records` VALUES (1, '1', 1);

