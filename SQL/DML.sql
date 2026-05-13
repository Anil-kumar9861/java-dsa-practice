
Select * from employee;

			 id |    name    |   res_no   | address | age(Default 10)
			----+------------+------------+---------+-----
			  1 | Anil Kumar | 2101289397 | BBSR    |
			  2 | Suni Kumar | 2101289398 | CUT     |  10
			  


--Allias

Select name as Full_Name from employee; 

 full_name
------------
 Anil Kumar
 Suni Kumar

insert into employee values(3,'Kumar',2101289398,'ODI');

-- Distict

select distinct res_no from employee;

				   res_no
				------------
				 2101289397
				 2101289398

--Insert			
insert into employee values(4,'Kumar',2101289398,'ODI');
				
				 id |    name    |   res_no   | address | age
				----+------------+------------+---------+-----
				  1 | Anil Kumar | 2101289397 | BBSR    |
				  2 | Suni Kumar | 2101289398 | CUT     |  10
				  3 | Kumar      | 2101289398 | ODI     |  10
				 

--Update
update employee set name='kumal' where id=3;


			 id |    name    |   res_no   | address | age
			----+------------+------------+---------+-----
			  1 | Anil Kumar | 2101289397 | BBSR    |
			  2 | Suni Kumar | 2101289398 | CUT     |  10
			  3 | kumal      | 2101289398 | ODI     |  10
--Delete

delete from employee where id =3;
			 id |    name    |   res_no   | address | age
			----+------------+------------+---------+-----
			  1 | Anil Kumar | 2101289397 | BBSR    |
			  2 | Suni Kumar | 2101289398 | CUT     |  10
			  4 | Kumar      | 2101289398 | ODI     |  10
	