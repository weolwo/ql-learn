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

 Date: 04/10/2023 23:20:55
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`           int NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name`         varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
    `sex`          varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
    `age`          int NULL DEFAULT NULL COMMENT '年龄',
    `sal`          decimal(7, 2) NULL DEFAULT NULL COMMENT '工资',
    `user_level`   int NULL DEFAULT NULL COMMENT '级别',
    `created_date` datetime NULL DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX          `inx_name`(`name` ASC) USING BTREE,
    INDEX          `inx_name_age`(`name` ASC, `sex` ASC) USING BTREE,
    INDEX          `age_i`(`age` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 793490 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET
FOREIGN_KEY_CHECKS = 1;

INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe8722572', '男', 42, 13494.00, 4, '2023-09-17 06:13:21');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe587138', '女', 38, 18885.00, 9, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe7229155', '女', 12, 8917.00, 1, '2023-09-17 06:13:20');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe8197954', '男', 64, 7305.00, 1, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe4167733', '男', 85, 8235.00, 7, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe2129232', '男', 44, 15281.00, 8, '2023-09-17 06:13:24');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3834869', '女', 98, 8301.00, 3, '2023-09-17 06:13:25');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3874293', '女', 94, 12762.00, 6, '2023-09-17 06:13:18');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe648221', '女', 27, 9947.00, 9, '2023-09-17 06:13:21');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9253840', '男', 32, 6989.00, 10, '2023-09-17 06:13:22');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe2319369', '女', 34, 1838.00, 5, '2023-09-17 06:13:24');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe2670859', '女', 70, 4338.00, 1, '2023-09-17 06:13:19');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe8456712', '男', 56, 18279.00, 2, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9240873', '女', 19, 8057.00, 6, '2023-09-17 06:13:21');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe7642105', '男', 57, 3055.00, 2, '2023-09-17 06:13:25');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe205275', '女', 40, 14706.00, 7, '2023-09-17 06:13:25');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe1587222', '女', 98, 5173.00, 5, '2023-09-17 06:13:22');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe2866865', '男', 62, 1081.00, 5, '2023-09-17 06:13:26');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe6045375', '女', 63, 5684.00, 7, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe4009040', '男', 94, 8897.00, 6, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe4296527', '男', 49, 3830.00, 6, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3172895', '女', 99, 7856.00, 2, '2023-09-17 06:13:22');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3028739', '男', 74, 10241.00, 6, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe7344417', '男', 54, 12828.00, 8, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9723270', '男', 49, 19580.00, 8, '2023-09-17 06:13:21');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9795119', '女', 30, 19193.00, 2, '2023-09-17 06:13:18');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe1568827', '女', 64, 14240.00, 9, '2023-09-17 06:13:25');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe5141613', '男', 10, 7028.00, 6, '2023-09-17 06:13:19');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe5007219', '女', 59, 10328.00, 10, '2023-09-17 06:13:24');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe7580907', '男', 86, 8430.00, 7, '2023-09-17 06:13:26');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe8179996', '男', 63, 17735.00, 8, '2023-09-17 06:13:24');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3777828', '男', 108, 9381.00, 3, '2023-09-17 06:13:18');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe885099', '男', 44, 4246.00, 9, '2023-09-17 06:13:22');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe2806273', '男', 13, 16892.00, 1, '2023-09-17 06:13:18');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3376245', '男', 74, 9099.00, 2, '2023-09-17 06:13:20');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9882779', '男', 108, 11489.00, 9, '2023-09-17 06:13:24');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe4834643', '女', 101, 15645.00, 1, '2023-09-17 06:13:26');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe6101397', '男', 80, 19994.00, 9, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe5017662', '女', 65, 3841.00, 1, '2023-09-17 06:13:18');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe4167552', '女', 33, 6746.00, 8, '2023-09-17 06:13:27');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe9415569', '男', 83, 4022.00, 6, '2023-09-17 06:13:23');
INSERT INTO `test1`.`t_user` (`name`, `sex`, `age`, `sal`, `user_level`, `created_date`)
VALUES ('dhe3058355', '女', 71, 4252.00, 1, '2023-09-17 06:13:23');

