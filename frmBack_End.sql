drop database if exists employ;

create database if not exists employee;

create table if not exists emp
(
        empno varchar(7) primary key,
        basic decimal(10,2)not null,
        Ename char(15)not null,
        pf decimal(8,2),
        sex char(6),
        hra decimal(8,2),
        address char(20) not null,
        da decimal(8,2),
        city char(10),
        gross decimal(8,2),
        doj date not null,
        it decimal(8,2),
        designation char(10) not null,
        net decimal(10,2),
        department char(10) not null
);

create table if not exists login
(
fname varchar(10),
lname varchar(10),
Uid varchar(30) primary key,
pass varchar(20)not null,
repass varchar(20)not null,
gender varchar(8),
squestion varchar(30)not null,
urques varchar(50),
ans varchar(30)not null,
doj date
);

create table if not exists Attendance
(
empno varchar(7) primary key,
Date date not null,
cls double(8,2),
pls double(8,2),
mls double(8,2),
lwp double(8,2)
);