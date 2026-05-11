-- Create Table

create table employee(id int,Name varchar(20),Reg_No int,Address varchar(20));

insert into employee values(1,'Anil Kumar',2101289397,'BBSR');
insert into employee values(2,'Suni Kumar',2101289398,'CUT');

select * from employee;


            id |    name    |   res_no   | address
            ----+------------+------------+-------
            1 | Anil Kumar | 2101289397 | BBSR    
            2 | Suni Kumar | 2101289398 | CUT     

-- Alter Table 

alter table employee add column phone_number int;

alter table employee drop column phone_number;

alter table employee rename column reg_no to res_no;

alter table employee add column age int;

alter table employee alter column age set default 10;


        id |    name    |   res_no   | address | age
        ----+------------+------------+---------+-----
        1 | Anil Kumar | 2101289397 | BBSR    |
        2 | Suni Kumar | 2101289398 | CUT     |  10





	
		