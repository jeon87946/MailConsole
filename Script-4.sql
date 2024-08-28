--이메일 테이블
CREATE TABLE tbl_member(
	id varchar(50) PRIMARY KEY
  , pwd varchar(50) NOT NULL
  , name varchar(50) NOT NULL
  , callno varchar(50) NOT NULL
  , 
 );

--DROP TABLE tbl_member;

SELECT * FROM TBL_member;
--회원가입
INSERT INTO tbl_member(id, pwd, name, callno)
 VALUES('hwh', '1234', '하원호', '01012345678');

COMMIT;

SELECT *
  FROM TBL_member 
 WHERE id = 'ab' AND pwd = '1234';

	
--DROP TABLE tbl_mail;

CREATE TABLE tbl_mail(
--	no
	title varchar(50) NOT NULL
 ,	writer varchar(50) NOT NULL 
 ,	dear varchar(50) NOT NULL
 , 	msg varchar(4000) NOT NULL
);


SELECT * FROM TBL_mail;


INSERT INTO tbl_mail(title, dear, msg)
 VALUES(?, ?, ?);

COMMIT;


select *
from tbl_member
WHERE name = '양세진';

SELECT * 
  FROM tbl_mail
 WHERE writer = ?;
 
 SELECT *
   FROM tbl_mail
  WHERE dear = ?;
  
 update tbl_member
 set pwd = '1234'
 where id = 'pjm'; 

--DELETE [FROM] 테이블 명
--WHERE 조건

--회원탈퇴	
DELETE FROM tbl_member
WHERE id = 'pjm' AND pwd = '1234' AND name = '박정미' AND callno = '01012345678';
 
select id
from tbl_member
WHERE id = 'ysj';