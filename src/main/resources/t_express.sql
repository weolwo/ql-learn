/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 12/03/2024 23:05:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_express
-- ----------------------------
DROP TABLE IF EXISTS `t_express`;
CREATE TABLE `t_express`  (
  `id` tinyint NOT NULL COMMENT '注解',
  `activity_code` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '活动code',
  `params` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '参数',
  `exp_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '表达式名称',
  `method_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '方法名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_express
-- ----------------------------
INSERT INTO `t_express` VALUES (1, 'firstActivity', 'java.lang.String loginName,java.lang.String productId', 'selectUser', 'selectUser');
INSERT INTO `t_express` VALUES (2, 'secondActivity', 'com.alex.bean.User user', 'updatedUser', 'updatedUser');
INSERT INTO `t_express` VALUES (3, '3', 'int x', 'getUserInfo', 'getUserInfo');

SET FOREIGN_KEY_CHECKS = 1;
