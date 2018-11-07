# WebTutorial4Java

## tree

c:/dev

  - /Servers/apache-tomcat-7.0.91

  - /sts-3.9.5.RELEASE

  - /WebTutorial4Java
    - /Java1HelloWorld
    - /Java2Gugu
    - /Java3String
    - /Java4Class
    - /Java5InOut
    - /Java6Etc
    - /Jsp1Hello
    - /Spring1Hello

	
## STEP 1. 자바 따라하기	

    - /Java1HelloWorld
    - /Java2Gugu
    - /Java3String
    - /Java4Class
    - /Java5InOut
    - /Java6Etc


## STEP 2. Web 서비스와 JSP

    - /Jsp1Hello

	
## STEP 3. Web 서비스를 위한 스프링 프레임워크 따라하기

    - /Spring1Hello
	

## Spring 프로젝트 튜토리얼 세부 내용

1. Spring Legacy 프로젝트 생성 후 실행
2. home.jsp 수정
2.1. 한글 깨짐 방지 UTF-8

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

2.2. table 태그 사용으로 게시판 모양 만들기

3. mySql 로 DB 생성(myfirstboard)

3.1. CMD(Shell) 에서 명령

mysql -uroot -p
CREATE DATABASE MYPDB CHARACTER SET utf8 COLLATE utf8_general_ci;
create user scott@localhost IDENTIFIED BY 'tiger';
grant all privileges on MYPDB.* to scott@localhost;

3.2. WorkBench 에서 실행

use MYPDB;
CREATE table `myFirstBoard`(
    M1ID INT(4) auto_increment ,
    M1AUTHOR VARCHAR(20),
    M1TITLE VARCHAR(100),
    M1TEXT VARCHAR(300),
    M1WDATE DATETIME DEFAULT NOW(),
    M1PDATE DATETIME,
    PRIMARY KEY (`M1ID`)
) ENGINE=innodb DEFAULT CHARSET=utf8;
