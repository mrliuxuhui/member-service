DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30),
  `mobile` VARCHAR(30),
  `VIP` CHAR,
  `createTime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `updateTime` TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;