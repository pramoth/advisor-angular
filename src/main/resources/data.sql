
INSERT INTO customer(id,name,email,mobile) values(CUSTOMER_SEQ.nextVal,'Best','best@best.com','0987654321');
INSERT INTO customer(id,name,email,mobile) values(CUSTOMER_SEQ.nextVal,'Nut','nut@nut.com','0987987888');
INSERT INTO customer(id,name,email,mobile) values(CUSTOMER_SEQ.nextVal,'Ooo','o@o.com','098767878');
--INSERT INTO user(email,password) values('xx@xx.com','12345');I
INSERT INTO DEPARTMENT(id,name) values(DEPARTMENT_SEQ.nextVal,'software development');
-- //INSERT INTO USER(password,email,pid,nameth,nation,race,address,mobile,DEPARTMENT_ID) values('best','best','best','best','best','best','best',1);


INSERT INTO AUTHORITY values('insertemployee');
INSERT INTO AUTHORITY values('insertdoctor');
INSERT INTO AUTHORITY values('insertpatient');
INSERT INTO AUTHORITY values('insertdrug');
INSERT INTO AUTHORITY values('updateemployee');
INSERT INTO AUTHORITY values('updatedoctor');
INSERT INTO AUTHORITY values('updatepatient');
INSERT INTO AUTHORITY values('updyaedrug');
INSERT INTO AUTHORITY values('deleteemployee');
INSERT INTO AUTHORITY values('deletedoctor');
INSERT INTO AUTHORITY values('deletepatient');
INSERT INTO AUTHORITY values('deletedrug');
INSERT INTO AUTHORITY values('authorize');




-- INSERT INTO User(password,email,pid,nameth,nameeng,birthdate,sex,blood,soldierstatus,marrystatus,nation,race,addressofpid,address,mobile,startwork,endwork,workstatus,image)
-- values ('1234','best@best.com','1234567890','best','kittiporn','1993-09-16','male','ab','huu','single','thai','thai','ygyffytyru76rur7',
-- 'ftdreq1365jkughtdt','09878765645','2010-02-01','2013-05-01','nomal','gyfhftdrtr54');