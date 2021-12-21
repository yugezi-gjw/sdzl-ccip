

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 胸部（乳腺）
-- Table structure for `treat_course_galactophore`
-- ----------------------------
CREATE TABLE `treat_course_galactophore` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`age`         varchar(5) NULL COMMENT '年龄' ,
`menarche_age`         varchar(5) NULL COMMENT '初潮年龄' ,
`amenorrhea_age`         varchar(5) NULL COMMENT '闭经年龄' ,
`molecular_subtyping`       varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分子分型' ,
`er`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ER' ,
`pr`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'PR' ,
`her2`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'Her-2' ,
`ki67`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'Ki-67' ,
`stage`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分期（总）' ,
`stage_tnm`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分期(TNM)' ,
`surgery_mode`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手术方式' ,
`fish_augmentation`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'FISH扩增' ,
`genetic_test`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '基因检测（21基因/70基因/50基因）' ,
`steep_grade`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'STEEP评分' ,
`diagnosis_dt`  varchar(32) NULL COMMENT '准确诊断日期' ,
`death_dt`    varchar(32) NULL COMMENT '准确死亡日期' ,
`last_inpatient_dt`  varchar(32) NULL COMMENT '最近一次住院' ,
`accurate_os`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '准确OS' ,
`alive`  varchar(32) NULL COMMENT '生存状态:0死亡；1生存；' ,
`progress_dt`  varchar(64) NULL COMMENT '首次进展时间' ,
`delivered_fraction`  varchar(16) NULL COMMENT '放疗次数' ,
`metastasis_sites`  varchar(16) NULL COMMENT '放疗转移部位数量' ,
`is_multi_sites`  varchar(16) NULL COMMENT '是否为多部位放疗:0否；1是' ,
`is_galactophore_radiation`  varchar(16) NULL COMMENT '有无胸壁/乳腺放疗:0无；1有' ,
`galactophore_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胸壁放疗时间、范围及剂量' ,
`is_brain_metastases`  varchar(16) NULL COMMENT '有无脑转移:0无；1有' ,
`is_brain_radiation`  varchar(16) NULL COMMENT '有无脑放疗:0无；1有' ,
`brain_metastasis_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '脑转移放疗' ,
`is_bone_metastases`  varchar(16) NULL COMMENT '有无骨转移:0无；1有' ,
`is_bone_radiation`  varchar(16) NULL COMMENT '有无骨放疗:0无；1有' ,
`bone_metastasis_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '骨转移放疗' ,
`is_hepatic_metastases`  varchar(16) NULL COMMENT '有无肝转移:0无；1有' ,
`adrenal_metastasis_radiation`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肾上腺转移放疗' ,
`other_metastasis_radiation`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '其他转移放疗' ,
`her2_drug`  varchar(16) NULL COMMENT '是否用抗Her-2药物' ,
`incretion`  varchar(16) NULL COMMENT '是否用内分泌' ,
`immunized`  varchar(16) NULL COMMENT '是否用免疫' ,
`holistic_tx1`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案1' ,
`holistic_tx2`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案2' ,
`holistic_tx3`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案3' ,
`holistic_tx4`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案4' ,
`holistic_tx5`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案5' ,
`holistic_tx6`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案6' ,
`holistic_tx7`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '全身治疗方案7' ,
`status`  varchar(12) NOT NULL default 'in_progress' COMMENT 'in_progress 在治；completed 结束治疗' ,
`created_at`  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
`created_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人' ,
`updated_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`updated_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;