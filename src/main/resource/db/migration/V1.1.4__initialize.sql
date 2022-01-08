

SET FOREIGN_KEY_CHECKS=0;

ALTER TABLE blood_tested ADD comment varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '备注';
ALTER TABLE blood_tested ADD status  varchar(12) NOT NULL default 'active' COMMENT 'active 正常的；deleted 已删除';
ALTER TABLE blood_tested ADD created_at  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间';
ALTER TABLE blood_tested ADD created_by  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人';
ALTER TABLE blood_tested ADD updated_at  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间';
ALTER TABLE blood_tested ADD updated_by  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人';

-- ----------------------------
-- 检查结果
-- Table structure for `test_result`
-- ----------------------------
CREATE TABLE `test_result` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`finding`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '检查所见' ,
`result`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '检查结果' ,
`image_number`         varchar(32) NULL COMMENT '影像号' ,
`image_evaluation`         varchar(256) NULL COMMENT '影像评估' ,
`test_dt`         varchar(32) NULL COMMENT '检测时间' ,
`comment`         varchar(512) NULL COMMENT '备注' ,
`status`         varchar(12) NOT NULL default 'active' COMMENT 'active 正常的；deleted 已删除' ,
`created_at`  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
`created_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人' ,
`updated_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`updated_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;
