
/*
 Navicat Premium Data Transfer

 Source Server         : localhost_PGSQL
 Source Server Type    : PostgreSQL
 Source Server Version : 140003
 Source Host           : localhost:5432
 Source Catalog        : basic_backend
 Source Schema         : user

 Target Server Type    : PostgreSQL
 Target Server Version : 140003
 File Encoding         : 65001

 Date: 17/10/2022 13:52:44
*/


-- ----------------------------
-- Sequence structure for department_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."department_id_seq";
CREATE SEQUENCE "user"."department_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for permission_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."permission_id_seq";
CREATE SEQUENCE "user"."permission_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for rel_user_permission_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."rel_user_permission_id_seq";
CREATE SEQUENCE "user"."rel_user_permission_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for rel_user_role_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."rel_user_role_id_seq";
CREATE SEQUENCE "user"."rel_user_role_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for role_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."role_id_seq";
CREATE SEQUENCE "user"."role_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for user_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "user"."user_id_seq";
CREATE SEQUENCE "user"."user_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS "user"."department";
CREATE TABLE "user"."department" (
  "id" int4 NOT NULL DEFAULT nextval('"user".department_id_seq'::regclass),
  "dept_name" varchar(255) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "del_flag" int2 DEFAULT 0
)
;
COMMENT ON COLUMN "user"."department"."create_time" IS '创建时间';
COMMENT ON COLUMN "user"."department"."update_time" IS '更新时间';
COMMENT ON COLUMN "user"."department"."del_flag" IS '0代表未删除';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO "user"."department" VALUES (1, '测试部门', '2022-08-24 14:57:39', '2022-08-24 14:57:39', 0);
INSERT INTO "user"."department" VALUES (2, '测试部门2', '2022-08-24 14:57:46', '2022-08-24 14:57:46', 0);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS "user"."permission";
CREATE TABLE "user"."permission" (
  "id" int4 NOT NULL DEFAULT nextval('"user".permission_id_seq'::regclass),
  "permission_name" varchar(200) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "del_flag" int2 DEFAULT 0
)
;
COMMENT ON COLUMN "user"."permission"."id" IS '权限id';
COMMENT ON COLUMN "user"."permission"."permission_name" IS '权限名称';
COMMENT ON COLUMN "user"."permission"."create_time" IS '创建信息时间';
COMMENT ON COLUMN "user"."permission"."update_time" IS '更新信息时间';
COMMENT ON COLUMN "user"."permission"."del_flag" IS '0代表未删除';

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO "user"."permission" VALUES (1, 'super-admin', '2022-08-20 18:00:27', '2022-08-20 18:00:27', 0);
INSERT INTO "user"."permission" VALUES (2, 'basic-admin', '2022-08-20 18:00:42', '2022-08-20 18:00:42', 0);
INSERT INTO "user"."permission" VALUES (3, 'add-user', '2022-08-20 18:00:50', '2022-08-20 18:00:50', 0);
INSERT INTO "user"."permission" VALUES (4, 'update-user', '2022-08-20 18:00:56', '2022-08-20 18:00:56', 0);
INSERT INTO "user"."permission" VALUES (5, 'delete-user', '2022-08-20 18:01:01', '2022-08-20 18:01:01', 0);
INSERT INTO "user"."permission" VALUES (6, 'checked-user', '2022-08-20 18:01:14', '2022-08-20 18:01:14', 0);

-- ----------------------------
-- Table structure for rel_user_permission
-- ----------------------------
DROP TABLE IF EXISTS "user"."rel_user_permission";
CREATE TABLE "user"."rel_user_permission" (
  "id" int4 NOT NULL DEFAULT nextval('"user".rel_user_permission_id_seq'::regclass),
  "user_id" int4,
  "permission_id" int4,
  "del_flag" int2 DEFAULT 0,
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone)
)
;
COMMENT ON COLUMN "user"."rel_user_permission"."id" IS '关系id';
COMMENT ON COLUMN "user"."rel_user_permission"."user_id" IS '用户id';
COMMENT ON COLUMN "user"."rel_user_permission"."permission_id" IS '权限id';
COMMENT ON COLUMN "user"."rel_user_permission"."del_flag" IS '0代表未删除';
COMMENT ON COLUMN "user"."rel_user_permission"."create_time" IS '创建信息时间';
COMMENT ON COLUMN "user"."rel_user_permission"."update_time" IS '更新信息时间';

-- ----------------------------
-- Records of rel_user_permission
-- ----------------------------
INSERT INTO "user"."rel_user_permission" VALUES (2, 3, 2, 0, '2022-08-20 18:20:33', '2022-08-20 18:20:33');
INSERT INTO "user"."rel_user_permission" VALUES (3, 3, 3, 0, '2022-08-20 18:20:37', '2022-08-20 18:20:37');
INSERT INTO "user"."rel_user_permission" VALUES (4, 3, 4, 0, '2022-08-20 18:20:39', '2022-08-20 18:20:39');
INSERT INTO "user"."rel_user_permission" VALUES (5, 3, 5, 0, '2022-08-20 18:20:43', '2022-08-20 18:20:43');
INSERT INTO "user"."rel_user_permission" VALUES (6, 3, 6, 0, '2022-08-20 18:20:47', '2022-08-20 18:20:47');
INSERT INTO "user"."rel_user_permission" VALUES (7, 4, 3, 0, '2022-08-20 18:20:51', '2022-08-20 18:20:51');
INSERT INTO "user"."rel_user_permission" VALUES (8, 4, 4, 0, '2022-08-20 18:20:54', '2022-08-20 18:20:54');
INSERT INTO "user"."rel_user_permission" VALUES (9, 4, 5, 0, '2022-08-20 18:20:57', '2022-08-20 18:20:57');
INSERT INTO "user"."rel_user_permission" VALUES (10, 4, 6, 0, '2022-08-20 18:21:00', '2022-08-20 18:21:00');
INSERT INTO "user"."rel_user_permission" VALUES (1, 3, 1, 0, '2022-08-20 18:20:29', '2022-08-20 18:20:29');

-- ----------------------------
-- Table structure for rel_user_role
-- ----------------------------
DROP TABLE IF EXISTS "user"."rel_user_role";
CREATE TABLE "user"."rel_user_role" (
  "id" int4 NOT NULL DEFAULT nextval('"user".rel_user_role_id_seq'::regclass),
  "user_id" int4,
  "role_id" int4,
  "del_flag" int2 DEFAULT 0,
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone)
)
;
COMMENT ON COLUMN "user"."rel_user_role"."id" IS '关系id';
COMMENT ON COLUMN "user"."rel_user_role"."user_id" IS '用户id';
COMMENT ON COLUMN "user"."rel_user_role"."role_id" IS '角色id';
COMMENT ON COLUMN "user"."rel_user_role"."del_flag" IS '0代表未删除';
COMMENT ON COLUMN "user"."rel_user_role"."create_time" IS '创建信息时间';
COMMENT ON COLUMN "user"."rel_user_role"."update_time" IS '更新信息时间';

-- ----------------------------
-- Records of rel_user_role
-- ----------------------------
INSERT INTO "user"."rel_user_role" VALUES (1, 3, 1, 0, '2022-08-20 18:18:41', '2022-08-20 18:18:41');
INSERT INTO "user"."rel_user_role" VALUES (2, 4, 2, 0, '2022-08-20 18:18:49', '2022-08-20 18:18:49');
INSERT INTO "user"."rel_user_role" VALUES (3, 3, 2, 0, '2022-08-20 18:18:57', '2022-08-20 18:18:57');
INSERT INTO "user"."rel_user_role" VALUES (4, 3, 3, 0, '2022-08-20 18:19:20', '2022-08-20 18:19:20');
INSERT INTO "user"."rel_user_role" VALUES (5, 4, 3, 0, '2022-08-20 18:19:22', '2022-08-20 18:19:22');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "user"."role";
CREATE TABLE "user"."role" (
  "id" int4 NOT NULL DEFAULT nextval('"user".role_id_seq'::regclass),
  "role_name" varchar(200) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "del_flag" int2 DEFAULT 0
)
;
COMMENT ON COLUMN "user"."role"."role_name" IS '角色名称';
COMMENT ON COLUMN "user"."role"."create_time" IS '创建时间';
COMMENT ON COLUMN "user"."role"."update_time" IS '更新时间';
COMMENT ON COLUMN "user"."role"."del_flag" IS '0代表未删除';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO "user"."role" VALUES (1, 'admin', '2022-08-20 17:28:59', '2022-08-20 17:28:59', 0);
INSERT INTO "user"."role" VALUES (2, 'user', '2022-08-20 17:33:31', '2022-08-20 17:33:31', 0);
INSERT INTO "user"."role" VALUES (3, 'visitor', '2022-08-20 17:37:05', '2022-08-20 17:37:05', 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "user"."user";
CREATE TABLE "user"."user" (
  "id" int4 NOT NULL DEFAULT nextval('"user".user_id_seq'::regclass),
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "phone" varchar(255) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "password" varchar(255) COLLATE "pg_catalog"."default" DEFAULT '123456'::character varying,
  "del_flag" int2 DEFAULT 0,
  "attempt_times" int2 NOT NULL DEFAULT 0,
  "attempt_time" timestamp(6),
  "locked_status" int2 DEFAULT 0,
  "username" varchar(255) COLLATE "pg_catalog"."default",
  "update_time" timestamp(6) DEFAULT timezone('UTC-8'::text, (now())::timestamp(0) without time zone),
  "dept_id" int4
)
;
COMMENT ON COLUMN "user"."user"."del_flag" IS '0代表未删除';
COMMENT ON COLUMN "user"."user"."attempt_times" IS '记录尝试次数,，尝试3次将锁定';
COMMENT ON COLUMN "user"."user"."attempt_time" IS '上次尝试时间';
COMMENT ON COLUMN "user"."user"."locked_status" IS '锁定标志，0为未锁定，1为锁定';
COMMENT ON COLUMN "user"."user"."username" IS '用户名';
COMMENT ON COLUMN "user"."user"."dept_id" IS '部门id';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO "user"."user" VALUES (4, 'test1', '123456', '2022-08-20 17:15:01', '123456', 0, 0, NULL, 0, '123456', '2022-08-20 17:15:01', 1);
INSERT INTO "user"."user" VALUES (1, 'test', 'siUHDg6kxckyzvXFJUTN0g==', '2020-11-20 11:08:04', 'GnMrmtkh4Upe3zH655mTtA==', 0, 0, NULL, 0, 'siUHDg6kxckyzvXFJUTN0g==', '2020-11-20 11:08:04', 2);
INSERT INTO "user"."user" VALUES (2, '123', '1234', '2021-11-08 10:01:46', '123456', 0, 0, NULL, 0, '1234', '2021-11-08 10:01:46', 2);
INSERT INTO "user"."user" VALUES (3, 'test', '123', '2020-11-20 11:08:04', '123456', 0, 0, NULL, 0, '123', '2020-11-20 11:08:04', 1);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."department_id_seq"', 3, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."permission_id_seq"', 8, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."rel_user_permission_id_seq"', 11, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."rel_user_role_id_seq"', 6, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."role_id_seq"', 4, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"user"."user_id_seq"', 5, true);

-- ----------------------------
-- Primary Key structure for table department
-- ----------------------------
ALTER TABLE "user"."department" ADD CONSTRAINT "department_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table permission
-- ----------------------------
ALTER TABLE "user"."permission" ADD CONSTRAINT "permission_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table rel_user_permission
-- ----------------------------
ALTER TABLE "user"."rel_user_permission" ADD CONSTRAINT "rel_user_permission_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table rel_user_role
-- ----------------------------
ALTER TABLE "user"."rel_user_role" ADD CONSTRAINT "rel_user_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE "user"."role" ADD CONSTRAINT "role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "user"."user" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("id");

