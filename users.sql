-- 데이터베이스 선택
use web_db;

-- 테이블 생성
create table users (
    no          	int primary key auto_increment,
    id          	varchar(20) not null unique,
    password    	varchar(20) not null,
    name        	varchar(20),
    gender      	varchar(10)
);

-- 데이터베이스 목록 보기
show databases;

-- 현재 데이터베이스의 테이블 목록 보기
show tables;


-- users 테이블의 전체 컬럼 조회
select  no,
        id,
        password,
        name,
        gender
from users
order by id desc
;

