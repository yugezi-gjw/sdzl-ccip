

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 肝功能
-- Table structure for `liver_tested`
-- ----------------------------

CREATE TABLE `liver_tested` (
`id`  int(11) NOT NULL AUTO_INCREMENT,
`treat_course_id`    varchar(64) NOT NULL COMMENT 'treat_course业务id' ,
`prothrombin_time`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '凝血酶原时间' ,
`prothrombin_activity`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '凝血酶原活动度' ,
`prothrombin_standard_ratio`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '凝血酶原国际标准化比值' ,
`thrombin_time`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '凝血酶时间' ,
`thrombokinase_time`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '活化部分凝血活酶时间' ,
`fibrinogen`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '纤维蛋白原' ,
`d_dimer`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'D-二聚体' ,
`potassium`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '钾' ,
`natrium`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '钠' ,
`chlorin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '氯' ,
`calcium`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '钙' ,
`magnesium`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '镁' ,
`phosphorus`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '磷' ,
`ferrumiron`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '铁' ,
`co2_cohesion`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '二氧化碳结合力' ,
`aat`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '丙氨酸氨基转移酶' ,
`aspartate_amino_transferase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '天门冬氨酸氨基转移酶' ,
`total_protein`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '总蛋白' ,
`albumin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '白蛋白' ,
`total_bilirubin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '总胆红素' ,
`direct_bilirubin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '直接胆红素' ,
`front_albumin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '前白蛋白' ,
`alkaline_phosphatase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '碱性磷酸酶' ,
`adenosine_deaminase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '腺苷脱氨酶' ,
`glycocholic_acid`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '甘胆酸' ,
`glutamyl_transferase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'y-谷氨酰基转移酶' ,
`acylneuraminate`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '唾液酸' ,
`creatine_kinase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肌酸激酶' ,
`isoenzymes_creatine_kinase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肌酸激酶同功酶' ,
`lactic_dehydrogenase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '乳酸脱氢酶' ,
`a_hbd`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'a-羟丁酸脱氢酶' ,
`amylase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '淀粉酶' ,
`cholinesterase`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胆碱脂酶' ,
`urea_nitrogen`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '尿素氮' ,
`creatinine`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '肌酐' ,
`uric_acid`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '尿酸' ,
`microglobulin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'β2-微球蛋白' ,
`cystatin_c`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胱抑素C' ,
`glucose`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '葡萄糖' ,
`total_cholesterin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '总胆固醇' ,
`triglyceride`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '甘油三酯' ,
`hdl_ch`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '高密度脂蛋白胆固醇' ,
`c_ldl`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '低密度脂蛋白胆固醇' ,
`free_fatty_acid`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '游离脂肪酸' ,
`small_c_ldl`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '小而密低密度脂蛋白胆固醇' ,
`indirect_bilirubin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '间接胆红素' ,
`globulin`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '球蛋白' ,
`s_l`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'S/L' ,
`ag`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '阴离子间隙' ,
`albumin_globulin_ratio`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '白球比' ,
`pro_bnp`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'B型钠尿肽前体' ,
`troponin_t`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '超敏肌钙蛋白T' ,
`c_antigen`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '癌胚抗原' ,
`neure_nse`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '神经元特异性烯醇化酶' ,
`cytokeratin19`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '细胞角蛋白19片段' ,
`grp_prosoma`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '胃泌素释放肽前体' ,
`epidermoid_carcinoma`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '鳞状细胞癌相关抗原' ,
`ft3`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '游离三碘甲状原氨酸' ,
`ft`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '游离甲状腺素' ,
`tsh`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '促甲状腺激素' ,
`tga`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '甲状腺球蛋白抗体' ,
`thyroprotein`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '甲状腺球蛋白' ,
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

