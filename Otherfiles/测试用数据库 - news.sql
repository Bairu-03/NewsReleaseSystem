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

 Date: 26/09/2024 23:03:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `newsid` int(4) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `newscontent` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `typeid` int(4) NULL DEFAULT NULL,
  `createdate` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`newsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '军事新闻标题', '军事新闻内容', 1, '2020-1-1 10:01:58');
INSERT INTO `news` VALUES (2, '娱乐新闻标题', '娱乐新闻内容', 2, '2019-12-1 13:15:02');

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype`  (
  `typeid` int(4) NOT NULL AUTO_INCREMENT,
  `typename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES (1, '军事');
INSERT INTO `newstype` VALUES (2, '娱乐');
INSERT INTO `newstype` VALUES (3, '游戏');
INSERT INTO `newstype` VALUES (4, '美食');
INSERT INTO `newstype` VALUES (5, '热点');

SET FOREIGN_KEY_CHECKS = 1;
