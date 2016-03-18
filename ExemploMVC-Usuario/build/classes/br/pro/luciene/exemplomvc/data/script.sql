CREATE DATABASE BDEXEMPLOMVC;

--ORACLE
CREATE TABLE TbUsuarios (
  idusuario number not null,
  login VARCHAR(15) NOT NULL,
  senha VARCHAR(15) NOT NULL,
  constraint pk_tbusuarios primary key (idusuario)
);


CREATE SEQUENCE sidusuario;
ALTER SEQUENCE sidusuario_seq NOCACHE;
