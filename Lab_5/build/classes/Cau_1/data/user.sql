﻿﻿alter session set "_ORACLE_SCRIPT"=true;
CREATE USER QLSP IDENTIFIED BY 123;
GRANT CONNECT, RESOURCE, DBA TO QLSP;

ALTER SESSION SET CURRENT_SCHEMA = QLSP;


CREATE TABLE Users(
    username VARCHAR(10) PRIMARY KEY,
    password VARCHAR(20)
)


INSERT INTO Users VALUES ('Ann', '123');
INSERT INTO Users VALUES ('Bao', '123');

SELECT * FROM USERS;
