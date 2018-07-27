DROP TABLE IF EXISTS `data_sync_record`;
CREATE TABLE `data_sync_record` (
`id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
`data_source` varchar(50) NULL COMMENT '数据来源，e精灵',
`url` varchar(300) NULL COMMENT '请求链接',
`method` varchar(20) NULL COMMENT 'post/get',
`parameters` text NULL COMMENT '参数，json',
`operator` varchar(255) NULL COMMENT '操作员',
`op_time` long NULL COMMENT '操作时间',
`is_success` boolean NULL COMMENT '是否成功',
PRIMARY KEY (`id`)
); ENGINE=InnoDB DEFAULT CHARSET=utf8;