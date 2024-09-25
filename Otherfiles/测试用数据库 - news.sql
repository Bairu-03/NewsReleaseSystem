/*
 Navicat Premium Dump SQL

 Source Server         : MySQL数据库
 Source Server Type    : MySQL
 Source Server Version : 50744 (5.7.44-log)
 Source Host           : localhost:3306
 Source Schema         : news

 Target Server Type    : MySQL
 Target Server Version : 50744 (5.7.44-log)
 File Encoding         : 65001

 Date: 25/09/2024 14:16:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype`  (
  `typeid` int(4) NOT NULL AUTO_INCREMENT,
  `typename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES (1, '军事');
INSERT INTO `newstype` VALUES (2, '娱乐');
INSERT INTO `newstype` VALUES (3, '科技');
INSERT INTO `newstype` VALUES (4, '美食');
INSERT INTO `newstype` VALUES (5, '政治');
INSERT INTO `newstype` VALUES (6, 'qwe');
INSERT INTO `newstype` VALUES (7, '测试');
INSERT INTO `newstype` VALUES (8, '游戏');
INSERT INTO `newstype` VALUES (9, '体育');
INSERT INTO `newstype` VALUES (10, '测试2');
INSERT INTO `newstype` VALUES (11, '热点');
INSERT INTO `newstype` VALUES (12, '热点新闻');

SET FOREIGN_KEY_CHECKS = 1;
