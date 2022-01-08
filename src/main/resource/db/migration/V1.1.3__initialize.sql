

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 多原发
-- Table structure for `multi_primary`
-- ----------------------------
CREATE TABLE `multi_primary` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`primary`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '原发病种' ,
`bodypart`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '部位' ,
`diagnosis_date`         varchar(16) NULL COMMENT '诊断时间' ,
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
-- 是否有过相关治疗
-- Table structure for `treat_history`
-- ----------------------------
CREATE TABLE `treat_history` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`treat_type`         varchar(64) NOT NULL COMMENT '类型：immunotherapy(免疫)，radiation(放射)，chemotherapy(化疗)，surgery(手术)，target(靶向治疗)，incretion(内分泌治疗)' ,
`plan`         varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '方案' ,
`treat_date`         varchar(16) NULL COMMENT '时间' ,
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