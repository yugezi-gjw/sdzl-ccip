

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `encounter`
-- ----------------------------
CREATE TABLE `patient` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '患者表' ,
`inpatient_id`  varchar(64) NULL COMMENT '住院号' ,
`outpatient_id`  varchar(64) NULL COMMENT '门诊号' ,
`patient_name`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '患者姓名',
`pinyin`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '拼音' ,
`address`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址' ,
`gender`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别' ,
`birth_date`  varchar(16) NULL DEFAULT NULL COMMENT '出生日期' ,
`national_id`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证' ,
`telephone`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话' ,
`telephone2`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话2' ,
`smoker`  varchar(8) NULL DEFAULT 0 COMMENT '0否；1是' ,
`status`  varchar(12) NOT NULL default 'normal' COMMENT 'normal 正常的；deleted 已删除' ,
`patient_id1`  varchar(64) NULL COMMENT '预留字段 患者ID1' ,
`patient_id2`  varchar(64) NULL COMMENT '预留字段 患者ID2' ,
`patient_id3`  varchar(64) NULL COMMENT '预留字段 患者ID3' ,
`patient_id4`  varchar(64) NULL COMMENT '预留字段 患者ID4' ,
`bz1`  varchar(128) NULL COMMENT '预留字段' ,
`bz2`  varchar(128) NULL COMMENT '预留字段' ,
`bz3`  varchar(128) NULL COMMENT '预留字段' ,
`bz4`  varchar(256) NULL COMMENT '预留字段' ,
`bz5`  varchar(256) NULL COMMENT '预留字段' ,
`created_at`  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登记时间' ,
`created_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人' ,
`updated_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`updated_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人' ,
`deleted_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间' ,
`deleted_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '删除人' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Table structure for `bodypart`
-- ----------------------------
CREATE TABLE `bodypart` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`bodypart_code`    varchar(64) NULL COMMENT '部位code' ,
`bodypart`    varchar(64) NULL COMMENT '部位',
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of bodypart
-- ----------------------------

INSERT INTO `bodypart` VALUES (1, 'chest', '肺'), (2, 'galactophore', '乳腺');

-- ----------------------------
-- Table structure for `bodypart`
-- ----------------------------
CREATE TABLE `treat_course` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`patient_id`  int(11) NOT NULL COMMENT '患者表主键id' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT '业务id' ,
`bodypart_code`    varchar(64) NULL COMMENT '病种code' ,
`bodypart`    varchar(64) NULL COMMENT '病种' ,
`created_at`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
`created_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人' ,
`updated_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`updated_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人' ,
`deleted_at`  timestamp NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间' ,
`deleted_by`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '删除人' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- 胸部
-- Table structure for `treat_course_chest`
-- ----------------------------
CREATE TABLE `treat_course_chest` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`age`         varchar(5) NULL COMMENT '年龄' ,
`stage`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分期' ,
`egfr`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'EGFR基因突变' ,
`diagnosis_dt`  varchar(32) NULL COMMENT '准确诊断日期' ,
`death_dt`    varchar(32) NULL COMMENT '准确死亡日期' ,
`last_inpatient_dt`  varchar(32) NULL COMMENT '最近一次住院' ,
`accurate_os`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '准确OS' ,
`alive`  varchar(32) NULL COMMENT '生存状态:0死亡；1生存；' ,
`progress_dt`  varchar(64) NULL COMMENT '进展时间' ,
`delivered_fraction`  varchar(16) NULL COMMENT '放疗次数' ,
`treat_type`  varchar(16) NULL COMMENT '靶向先为1，放疗先为2，同步为0' ,
`synchronous`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '是否同步' ,
`metastasis_sites`  varchar(16) NULL COMMENT '放疗转移部位数量' ,
`is_multi_sites`  varchar(16) NULL COMMENT '是否为多部位放疗:0否；1是' ,
`is_pulmonary_radiation`  varchar(16) NULL COMMENT '有无肺部放疗:0无；1有' ,
`pulmonary_metastasis_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肺转移放疗' ,
`is_brain_metastases`  varchar(16) NULL COMMENT '有无脑转移:0无；1有' ,
`is_brain_radiation`  varchar(16) NULL COMMENT '有无脑放疗:0无；1有' ,
`brain_metastasis_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '脑转移放疗' ,
`is_bone_metastases`  varchar(16) NULL COMMENT '有无骨转移:0无；1有' ,
`is_bone_radiation`  varchar(16) NULL COMMENT '有无骨放疗:0无；1有' ,
`bone_metastasis_radiation`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '骨转移放疗' ,
`adrenal_metastasis_radiation`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肾上腺转移放疗' ,
`other_metastasis_radiation`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '其他转移放疗' ,
`cmd_time_seq`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胸部放疗与诊断时间时序' ,
`cms_time_seq`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胸部放疗与系统治疗时序' ,
`side_reaction`  varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '放射性副反应' ,
`tki`  varchar(16) NULL COMMENT 'TKI是否为一线用药' ,
`platinum_doublet`  varchar(16) NULL COMMENT 'Platinum doublet' ,
`gefitinib`  varchar(16) NULL COMMENT '是否用吉非替尼' ,
`angiostatin`  varchar(16) NULL COMMENT '是否用厄洛替尼' ,
`icotinib`  varchar(16) NULL COMMENT '是否用埃克替尼' ,
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

-- ----------------------------
-- Table structure for `blood_tested`
-- ----------------------------
CREATE TABLE `blood_tested` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '验血结果表' ,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`tested_name`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '检测name' ,
`white_cells`  varchar(16) DEFAULT NULL COMMENT '白细胞',
`neutrophil_leucocyte`  varchar(16) NULL DEFAULT NULL COMMENT '中性粒细胞',
`lymphocyte`  varchar(16) NULL DEFAULT NULL COMMENT '淋巴细胞',
`monocyte`  varchar(16) NULL DEFAULT NULL COMMENT '单核细胞',
`thrombocyte`  varchar(16) NULL DEFAULT NULL COMMENT '血小板',
`sii`  varchar(16) NULL DEFAULT NULL COMMENT 'SII',
`nlr`  varchar(16) NULL DEFAULT NULL COMMENT 'NLR',
`plr`  varchar(16) NULL DEFAULT NULL COMMENT 'PLR',
`lmr`  varchar(16) NULL DEFAULT NULL COMMENT 'LMR',
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;


-- ----------------------------
-- Records of sys_permission for patient
-- ----------------------------
INSERT INTO `sys_permission` VALUES
('50', '患者权限管理', 'patient:*', '0', '患者权限管理', '0', '2021-11-30 15:03:45'),
('51', '患者权限列表', 'patient:list', '50', '患者权限列表', '0', '2021-11-30 15:03:22'),
('52', '患者权限添加', 'patient:add', '50', '患者权限添加', '0', '2021-11-30 15:03:28'),
('53', '患者权限更新', 'patient:update', '50', '患者权限更新', '0', '2021-11-30 15:03:33'),
('54', '患者权限删除', 'patient:del', '50', '患者权限删除', '0', '2017-08-02 14:59:17'),
('55', '患者权限导入', 'patient:imp', '50', '患者权限导入', '0', '2017-08-02 14:59:17'),
('56', '患者权限导出', 'patient:exp', '50', '患者权限导出', '0', '2017-08-02 14:59:17');

-- ----------------------------
-- Records of sys_role_permission for patient
-- ----------------------------

INSERT INTO `sys_role_permission` VALUES ('1', '50');