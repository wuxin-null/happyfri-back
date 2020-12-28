--创建数据库
CREATE DATABASE IF NOT EXISTS wuxin DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
--创建用户
create user 'lhx'@'localhost' identified by '1234';
select user,host from mysql.user;
--用户授权数据库
grant all privileges on 'wuxin'.* to 'lhx'@'%' identified by '1234'; 
--刷新权限
flush privileges; 
--授予用户“test”通过外网IP对于该数据库“testdb”中表的创建、修改、删除权限,以及表数据的增删查改权限
grant create,alter,drop,select,insert,update,delete on wuxin.* to lhx@'%';	 
--查看用户权限
show grants for wuxin;