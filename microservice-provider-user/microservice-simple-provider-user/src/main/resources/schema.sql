drop table USER if EXISTS ;
CREATE TABLE USER (id bigint generated by default as IDENTITY ,username varchar(40),name VARCHAR (20),age int(3),balance decimal(10,2),PRIMARY key (id));