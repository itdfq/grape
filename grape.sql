/*
Navicat MySQL Data Transfer

Source Server         : Mysql5.7
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : grape

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2020-07-30 16:44:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for msb
-- ----------------------------
DROP TABLE IF EXISTS `msb`;
CREATE TABLE `msb` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `kinds` varchar(255) NOT NULL,
  `reaction` varchar(255) NOT NULL COMMENT '反应型',
  `disease` varchar(255) DEFAULT NULL COMMENT '疫情指数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msb
-- ----------------------------
INSERT INTO `msb` VALUES ('1', '通化2号', '4', '56.97');
INSERT INTO `msb` VALUES ('5', '左山一', '反应型', '18.70');
INSERT INTO `msb` VALUES ('12', '左山一', '反应型', '18.70');
INSERT INTO `msb` VALUES ('19', '75082', '4', '52.65');

-- ----------------------------
-- Table structure for putao_gspzxz
-- ----------------------------
DROP TABLE IF EXISTS `putao_gspzxz`;
CREATE TABLE `putao_gspzxz` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `kinds` varchar(255) NOT NULL,
  `max` varchar(255) NOT NULL,
  `min` varchar(255) NOT NULL,
  `avg` varchar(255) NOT NULL,
  `sd` varchar(255) NOT NULL,
  `cv` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of putao_gspzxz
-- ----------------------------
INSERT INTO `putao_gspzxz` VALUES ('12', '果粒重量', '9067', '4.43', '6.79', '10.7', '15.36');
INSERT INTO `putao_gspzxz` VALUES ('19', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for putao_kinds
-- ----------------------------
DROP TABLE IF EXISTS `putao_kinds`;
CREATE TABLE `putao_kinds` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL COMMENT '品种名称',
  `bieming` varchar(255) NOT NULL COMMENT '别名',
  `characters` varchar(255) NOT NULL COMMENT '品种特性',
  `forms` varchar(255) NOT NULL COMMENT '来源',
  `projects` varchar(255) NOT NULL COMMENT '栽培事项',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of putao_kinds
-- ----------------------------
INSERT INTO `putao_kinds` VALUES ('13', '阳光玫瑰123', ' 手指葡萄,耀眼玫瑰', '颜色青绿、光亮', '', '栽植要中等密度');
INSERT INTO `putao_kinds` VALUES ('14', '123', '1123', '1123', '1123', '1123');
INSERT INTO `putao_kinds` VALUES ('16', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('17', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('18', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('19', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('20', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('21', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('22', '1', '1', '1', '1', '1');
INSERT INTO `putao_kinds` VALUES ('23', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for putao_zygsxz
-- ----------------------------
DROP TABLE IF EXISTS `putao_zygsxz`;
CREATE TABLE `putao_zygsxz` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `kinds` varchar(255) NOT NULL,
  `max` varchar(255) NOT NULL,
  `min` varchar(255) NOT NULL,
  `avg` varchar(255) DEFAULT NULL,
  `sd` varchar(255) NOT NULL,
  `cv` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of putao_zygsxz
-- ----------------------------
INSERT INTO `putao_zygsxz` VALUES ('1', '果穗长/cm', '21.75', '7.71', '12.58)', '2.17', '17.26');
INSERT INTO `putao_zygsxz` VALUES ('4', '果穗宽/cm', '9.67', '4.43', '6.79', '1.07', '15.36');
INSERT INTO `putao_zygsxz` VALUES ('6', '果穗大小<长*宽>/cm', '9067', '4.43', '6.79', '10.7', '15.36');
INSERT INTO `putao_zygsxz` VALUES ('7', '单穗果粒数/粒', '9067', '4.43', '6.79', '10.7', '15.36');
INSERT INTO `putao_zygsxz` VALUES ('9', '果穗重/g', '2', '2', '2', '2', '2');
INSERT INTO `putao_zygsxz` VALUES ('17', '12', '12', '12', '12', '12', '12');

-- ----------------------------
-- Table structure for putao_zyj
-- ----------------------------
DROP TABLE IF EXISTS `putao_zyj`;
CREATE TABLE `putao_zyj` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kinds` varchar(255) NOT NULL,
  `max` varchar(255) NOT NULL,
  `min` varchar(255) NOT NULL,
  `avg` varchar(255) NOT NULL,
  `sd` varchar(255) NOT NULL COMMENT '标准差',
  `cv` varchar(255) NOT NULL COMMENT '变异系数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of putao_zyj
-- ----------------------------
INSERT INTO `putao_zyj` VALUES ('1', '萌芽率/%', '98.95', '77.32', '90.49', '3.77', '4.17');
INSERT INTO `putao_zyj` VALUES ('2', '结果枝率/%', '99.51', '56.74', '84.58', '7.88', '9.31');
INSERT INTO `putao_zyj` VALUES ('3', '结果系数', '2.72', '1.44', '1.90', '0.23', '12.09');
INSERT INTO `putao_zyj` VALUES ('4', '每新梢果穗数/个', '25', '11', '18', '0.29', '17.33');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(25) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `num` varchar(11) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'duan', '123', '段先生', '115670336127', 'Y');
INSERT INTO `users` VALUES ('20', 'zhang', '123', '张三', '13145674589', 'N');
INSERT INTO `users` VALUES ('30', 'gao', '123', '高先生', '13345841399', 'N');
INSERT INTO `users` VALUES ('31', 'root', '123', 'root', '1233443', 'N');
INSERT INTO `users` VALUES ('32', 'admin', '123', '高先生', '123', 'N');
INSERT INTO `users` VALUES ('33', '1', '123', '1', '1', 'N');
