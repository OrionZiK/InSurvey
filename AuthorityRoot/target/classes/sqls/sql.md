# SQL语句
## USER表创建
```postgresql
CREATE TABLE AUTHORITYUSER(
ID INT PRIMARY   KEY     NOT NULL,
USERNAME         TEXT    NOT NULL,
PASSWORD         TEXT    NOT NULL,
EMAIL            CHAR(50),
STATE            INT     NOT NULL,
CREATETIME       DATE    NOT NULL,
UPDATETIME       DATE    NOT NULL
)
```
## PERMISSION表创建
```postgresql
CREATE TABLE AUTHORITYPERMISSION(
ID INT PRIMARY   KEY     NOT NULL,
NAME             TEXT    NOT NULL,
DESCRIPTION      TEXT    NOT NULL,
STATE            INT     NOT NULL,
CREATETIME       DATE    NOT NULL,
UPDATETIME       DATE    NOT NULL
)
```
## USERPERMISSION表创建
```postgresql

```
## 填充USER表
```postgresql
INSERT INTO authorityuser VALUES(1,'Paul','asdafas','231242@163.com','1','2022-8-2','2022-8-2');
INSERT INTO authorityuser VALUES(2,'Tim','afadfas','2111232@163.com','1','2022-8-2','2022-9-2');
INSERT INTO authorityuser VALUES(3,'Jazz','asgdffas','211112@163.com','1','2022-8-2','2022-9-11');
INSERT INTO authorityuser VALUES(4,'Jack','asdsd2fas','2222222@163.com','1','2022-8-2','2022-9-7');
INSERT INTO authorityuser VALUES(5,'Jackson','as24afas','2333332@163.com','1','2022-8-2','2022-9-7');
INSERT INTO authorityuser VALUES(6,'Daniel','asaf653as','2443222@163.com','1','2022-8-2','2022-8-11');
INSERT INTO authorityuser VALUES(7,'Bob','asda72ds','26666666@163.com','1','2022-8-2','2022-9-11');
INSERT INTO authorityuser VALUES(8,'Scott','as563as','237777@163.com','1','2022-8-2','2022-9-11');
INSERT INTO authorityuser VALUES(9,'Frank','asdk8as','29999992@163.com','1','2022-8-2','2022-8-11');
```