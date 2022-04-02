

SET FOREIGN_KEY_CHECKS=0;

ALTER TABLE patient ADD first_visit_age varchar(8) NULL COMMENT '初诊年龄';
ALTER TABLE treat_course_chest ADD first_target_use_date varchar(32) NULL COMMENT '初次靶向应用时间';
ALTER TABLE treat_course_chest ADD first_target_treat_date varchar(32) NULL COMMENT '初次靶向放疗时间';
ALTER TABLE treat_course_chest ADD kps varchar(32) NULL COMMENT 'KPS评分';
ALTER TABLE treat_course_chest ADD nrs2002 varchar(32) NULL COMMENT 'NRS2002评分';
ALTER TABLE treat_course_chest ADD nrs varchar(32) NULL COMMENT 'NRS评分';
ALTER TABLE treat_course_chest ADD aprint varchar(32) NULL COMMENT 'APRINI评分';


ALTER TABLE treat_course_galactophore ADD first_target_use_date varchar(32) NULL COMMENT '初次靶向应用时间';
ALTER TABLE treat_course_galactophore ADD first_target_treat_date varchar(32) NULL COMMENT '初次靶向放疗时间';
ALTER TABLE treat_course_galactophore ADD kps varchar(32) NULL COMMENT 'KPS评分';
ALTER TABLE treat_course_galactophore ADD nrs2002 varchar(32) NULL COMMENT 'NRS2002评分';
ALTER TABLE treat_course_galactophore ADD nrs varchar(32) NULL COMMENT 'NRS评分';
ALTER TABLE treat_course_galactophore ADD aprint varchar(32) NULL COMMENT 'APRINI评分';

-- ----------------------------
-- 病理结果
-- Table structure for `pathology_result`
-- ----------------------------

CREATE TABLE `pathology_result` (
`id`  int(11) NOT NULL AUTO_INCREMENT,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`finding`         varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肉眼所见' ,
`diagnosis`         varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '病理诊断' ,
`additional_diagnosis`         varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '补充病理诊断' ,
`immunity`         varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '免疫组化' ,
`pathology_number`         varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '病理号' ,
`pathology_type`         varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '病理类型' ,
`pathology_source`         varchar(16) NULL COMMENT 'self:本院 | other:外院' ,
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

-- ----------------------------
-- 病理报告截图
-- Table structure for `pathology_result_photo`
-- ----------------------------
CREATE TABLE `pathology_result_photo` (
`id`  int(11) NOT NULL AUTO_INCREMENT,
`pathology_result_id`   int(11) NOT NULL ,
`file_uuid`    varchar(36) NOT NULL ,
`blob_content`   blob NULL ,
`description`    varchar(256) NULL ,
`status`         varchar(12) NOT NULL default 'active' COMMENT 'active 正常的；deleted 已删除' ,
`created_at`  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
`created_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人' ,
`updated_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`updated_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人' ,
PRIMARY KEY (`id`),
CONSTRAINT fk_pathology_result_photo_id FOREIGN KEY(`pathology_result_id`) REFERENCES `pathology_result`(`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;
