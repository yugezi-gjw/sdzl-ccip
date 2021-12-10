

SET FOREIGN_KEY_CHECKS=0;

 

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
CREATE TABLE `sys_permission` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '权限表' ,
`name`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`code`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '资源代码' ,
`parent_id`  int(11) NULL DEFAULT 0 COMMENT '自己表的父id' ,
`description`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`disabled`  tinyint(1) NULL DEFAULT 0 COMMENT '0有效；1作废' ,
`addtime`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci
AUTO_INCREMENT=29

;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------

INSERT INTO `sys_permission` VALUES ('6', '功能权限', 'sysPermission:*', '0', '功能权限删除', '0', '2017-08-09 15:03:45'), ('7', '功能权限列表', 'sysPermission:list', '6', '功能权限删除', '0', '2017-08-09 15:03:22'), ('8', '功能权限添加', 'sysPermission:add', '6', '功能权限删除', '0', '2017-08-09 15:03:28'), ('9', '功能权限更新', 'sysPermission:update', '6', '功能权限删除', '0', '2017-08-09 15:03:33'), ('10', '功能权限删除', 'sysPermission:del', '6', '功能权限删除', '0', '2017-08-02 14:59:17'), ('11', '基本授权', 'base:*', '0', '基本授权', '0', '2017-08-09 15:05:48'), ('12', '基本授权列表', 'base:list', '11', '基本授权列表', '0', '2017-08-09 15:06:06'), ('13', '基本授权添加', 'base:add', '11', '基本授权添加', '0', '2017-08-09 15:06:08'), ('14', '基本授权修改', 'base:update', '11', '基本授权修改', '0', '2017-08-09 15:06:09'), ('15', '基本授权删除', 'base:del', '11', '基本授权删除', '0', '2017-08-09 15:06:11'), ('18', '后台用户', 'sysuser:*', '0', '后台用户', '0', '2017-08-09 14:38:29'), ('19', '后台用户列表', 'sysuser:list', '18', '后台用户列表', '0', '2017-08-03 10:25:18'), ('20', '后台用户添加', 'sysuser:add', '18', '后台用户添加', '0', '2017-08-03 10:25:19'), ('21', '后台用户修改', 'sysuser:upd', '18', '后台用户修改', '0', '2017-08-03 10:25:20'), ('22', '后台用户删除', 'sysuser:del', '18', '后台用户删除', '0', '2017-08-03 10:25:22'), ('23', '角色管理', 'sysRole:*', '0', '角色管理', '0', '2017-08-09 14:39:08'), ('24', '角色列表', 'sysRole:list', '23', '角色列表', '0', '2017-08-09 14:39:13'), ('25', '角色添加', 'sysRole:add', '23', '角色添加', '0', '2017-08-09 14:39:16'), ('26', '角色修改', 'sysRole:upd', '23', '角色修改', '0', '2017-08-09 14:39:18'), ('27', '角色删除', 'sysRole:del', '23', '角色删除', '0', '2017-08-09 14:39:21');


-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
CREATE TABLE `sys_role` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '角色表' ,
`name`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`code`  varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`description`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`type`  int(11) NULL DEFAULT 1 COMMENT '1系统角色；2其他的下发的角色' ,
`disabled`  tinyint(1) NULL DEFAULT 0 COMMENT '0有效；1作废' ,
`addtime`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=4

;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

INSERT INTO `sys_role` VALUES ('1', 'admin', 'admin', '超级管理员', '1', '0', '2017-08-02 15:01:52'), ('2', 'user1', 'user', '成员用户', '0', '0', '2017-08-09 15:13:58'), ('3', 'test2', 't2est:*', 'testssss2', '1', '1', '2017-08-09 15:39:36');


-- ----------------------------
-- Table structure for `sys_role_permission`
-- ----------------------------
CREATE TABLE `sys_role_permission` (
`role_id`  int(11) NOT NULL COMMENT '角色ID' ,
`permission_id`  int(11) NOT NULL COMMENT '权限' ,
PRIMARY KEY (`role_id`, `permission_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
COMMENT='角色授权'

;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------

INSERT INTO `sys_role_permission` VALUES ('1', '6'), ('1', '11'), ('1', '18'), ('1', '23');


-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
CREATE TABLE `sys_user` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户表' ,
`login_name`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL ,
`name`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '真实姓名' ,
`password`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`salt`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT ' 加密参数' ,
`addtime`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
`disabled`  tinyint(1) NULL DEFAULT 0 COMMENT '1禁用；0否' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `login_name` (`login_name`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=6

;

-- ----------------------------
-- Records of sys_user
-- ----------------------------

INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin', '9b460ffe375e5da23c2adba423f0113a', 'tx3x', '2017-07-27 13:40:52', '0'), ('2', 'zivy', 'zivyiv', '90539cfde7843b59006e0db3bda19698', 'zivy', '2017-07-27 16:51:09', '0'), ('4', 'test', 'test', 'cdd979ec7f0d796797e8880973429574', '0ie5', '2017-08-03 11:09:46', '1');


-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
CREATE TABLE `sys_user_role` (
`role_id`  int(11) NOT NULL COMMENT '角色ID' ,
`user_id`  int(11) NOT NULL COMMENT '用户' ,
PRIMARY KEY (`role_id`, `user_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
COMMENT='用户角色'

;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

INSERT INTO `sys_user_role` VALUES ('1', '1'), ('1', '4'), ('2', '1'), ('2', '2'), ('2', '4');

-- ----------------------------
-- Auto increment value for `sys_permission`
-- ----------------------------
ALTER TABLE `sys_permission` AUTO_INCREMENT=29;

-- ----------------------------
-- Auto increment value for `sys_role`
-- ----------------------------
ALTER TABLE `sys_role` AUTO_INCREMENT=4;

-- ----------------------------
-- Auto increment value for `sys_user`
-- ----------------------------
ALTER TABLE `sys_user` AUTO_INCREMENT=6;

