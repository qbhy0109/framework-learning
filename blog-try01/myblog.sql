# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2022-01-08 11:33:07
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "bloguser"
#

DROP TABLE IF EXISTS `bloguser`;
CREATE TABLE `bloguser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Data for table "bloguser"
#

INSERT INTO `bloguser` VALUES (1,'yb','990212','yangbo','yb@email.com','me','this is description','2021-11-23 12:26:50','2021-11-23 12:26:50'),(9,'re','re',NULL,NULL,NULL,NULL,'2021-12-05 16:16:49',NULL),(10,'ab','ab',NULL,NULL,NULL,NULL,'2021-12-05 16:43:21',NULL);

#
# Structure for table "blogs"
#

DROP TABLE IF EXISTS `blogs`;
CREATE TABLE `blogs` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '',
  `context` varchar(255) NOT NULL DEFAULT '',
  `image` varchar(255) DEFAULT 'image',
  `views` varchar(255) NOT NULL DEFAULT '0',
  `comment_count` int(11) NOT NULL DEFAULT '0',
  `update_time` timestamp NULL DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `description` varchar(255) DEFAULT NULL,
  `author_id` bigint(20) DEFAULT NULL,
  `author` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`Id`),
  KEY `fk1` (`author_id`),
  CONSTRAINT `fk1` FOREIGN KEY (`author_id`) REFERENCES `bloguser` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "blogs"
#


#
# Structure for table "blog"
#

DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) NOT NULL DEFAULT '',
  `title` varchar(255) NOT NULL DEFAULT '',
  `context` varchar(255) NOT NULL DEFAULT '',
  `author_id` bigint(20) NOT NULL DEFAULT '1',
  `image` varchar(255) DEFAULT NULL,
  `views` int(11) NOT NULL DEFAULT '0',
  `comment_count` int(11) NOT NULL DEFAULT '0',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NULL DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_bloguser` (`author_id`),
  CONSTRAINT `fk_bloguser` FOREIGN KEY (`author_id`) REFERENCES `bloguser` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

#
# Data for table "blog"
#

INSERT INTO `blog` VALUES (22,'yb','不是吧','过两天又要开会了！！！',1,NULL,6,0,'2021-12-06 23:17:00','2021-12-05 19:22:30',NULL),(23,'re','水杯','银色的水杯',9,NULL,34,0,'2021-12-06 23:17:16','2021-12-05 19:27:19',NULL),(26,'yb','火热本人','任何人为人和善人二哥如果',1,NULL,3,0,'2021-12-05 23:19:22','2021-12-05 19:35:07',NULL),(28,'yb','作业','明天记得要做数字信号处理作业',1,NULL,5,0,'2021-12-06 22:52:55','2021-12-05 19:52:01',NULL);
