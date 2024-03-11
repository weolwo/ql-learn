

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_express
-- ----------------------------
DROP TABLE IF EXISTS `t_express`;
CREATE TABLE `t_express`  (
  `id` tinyint NOT NULL COMMENT '注解',
  `express` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `activity_code` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_express
-- ----------------------------
INSERT INTO `t_express` VALUES (1, 'import java.time.LocalDateTime;now = LocalDateTime.now();return now;', '1');
INSERT INTO `t_express` VALUES (2, '        return getUserInfo();', '2');

SET FOREIGN_KEY_CHECKS = 1;
