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

 Date: 28/09/2024 01:34:13
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
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '军事新闻标题', '军事新闻内容', 1, '2020-01-01 10:01:58');
INSERT INTO `news` VALUES (2, '娱乐新闻标题', '娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容娱乐新闻内容', 2, '2019-12-01 13:15:02');
INSERT INTO `news` VALUES (3, '长标题测试长标题测试长标题测试长标题测试长标题测试长标题测试', '测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容测试内容', 6, '2024-05-03 08:21:32');
INSERT INTO `news` VALUES (4, '游戏新闻标题', '游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻游戏新闻', 3, '2020-01-01 10:26:58');
INSERT INTO `news` VALUES (5, '娱乐新闻标题', '娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻娱乐新闻', 2, '2024-03-22 05:32:12');
INSERT INTO `news` VALUES (6, '美食新闻标题', '美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容美食新闻内容', 4, '2023-05-21 21:15:30');
INSERT INTO `news` VALUES (7, '科技新闻标题', '科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容科技新闻内容', 5, '2023-08-15 12:45:30');
INSERT INTO `news` VALUES (8, '教育新闻标题', '教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容教育新闻内容', 8, '2023-07-26 08:30:52');

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype`  (
  `typeid` int(4) NOT NULL AUTO_INCREMENT,
  `typename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES (1, '军事');
INSERT INTO `newstype` VALUES (2, '娱乐');
INSERT INTO `newstype` VALUES (3, '游戏');
INSERT INTO `newstype` VALUES (4, '美食');
INSERT INTO `newstype` VALUES (5, '科技');
INSERT INTO `newstype` VALUES (6, '测试');
INSERT INTO `newstype` VALUES (7, '社会');
INSERT INTO `newstype` VALUES (8, '教育');
INSERT INTO `newstype` VALUES (9, '探索');
INSERT INTO `newstype` VALUES (10, '其他');
INSERT INTO `newstype` VALUES (11, '汽车');
INSERT INTO `newstype` VALUES (12, '旅游');
INSERT INTO `newstype` VALUES (13, '国际');
INSERT INTO `newstype` VALUES (14, '其他');

SET FOREIGN_KEY_CHECKS = 1;
