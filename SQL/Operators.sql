
insert into employee values(3,'Kalyan Kumar',2101289397,'BBSR',60);
insert into employee values(4,'Akshya Kumar',2101289398,'CUT',5);

select * from employee;

					 id |     name     |   res_no   | address | age
					----+--------------+------------+---------+-----
					  1 | Anil Kumar   | 2101289397 | BBSR    |
					  2 | Suni Kumar   | 2101289398 | CUT     |  10
					  4 | Kumar        | 2101289398 | ODI     |  10
					  3 | Kalyan Kumar | 2101289397 | BBSR    |  60
					  4 | Akshya Kumar | 2101289398 | CUT     |   5

-- WHERE and Logical Operator

select * from employee where id=4 and age =10;

			 id | name  |   res_no   | address | age
			----+-------+------------+---------+-----
			  4 | Kumar | 2101289398 | ODI     |  10

select * from employee where id=4 or age=10;
						 id |    name    |   res_no   | address | age
						----+------------+------------+---------+-----
						  2 | Suni Kumar | 2101289398 | CUT     |  10
						  4 | Kumar      | 2101289398 | ODI     |  10



--  ORDER BY
select * from employee order by age desc;
				 id |     name     |   res_no   | address | age
				----+--------------+------------+---------+-----
				  1 | Anil Kumar   | 2101289397 | BBSR    |
				  3 | Kalyan Kumar | 2101289397 | BBSR    |  60
				  2 | Suni Kumar   | 2101289398 | CUT     |  10
				  4 | Kumar        | 2101289398 | ODI     |  10
				  4 | Akshya Kumar | 2101289398 | CUT     |   5



-- DISTINCT

select  distinct age from employee;
			
			 age
			-----
			
			  60
			   5
			  10

-- LiMiT

select * from employee limit 2;
			 id |    name    |   res_no   | address | age
			----+------------+------------+---------+-----
			  1 | Anil Kumar | 2101289397 | BBSR    |
			  2 | Suni Kumar | 2101289398 | CUT     |  10

-- Comparison Operator

--Equal to

select * from employee where age =10;

			 id |    name    |   res_no   | address | age
			----+------------+------------+---------+-----
			  2 | Suni Kumar | 2101289398 | CUT     |  10
			  4 | Kumar      | 2101289398 | ODI     |  10


--Not Equal To

select * from employee where age !=10;

			 id |     name     |   res_no   | address | age
			----+--------------+------------+---------+-----
			  3 | Kalyan Kumar | 2101289397 | BBSR    |  60
			  4 | Akshya Kumar | 2101289398 | CUT     |   5
			  
-- Greater Than
select * from employee where age>10;

		  id |     name     |   res_no   | address | age
		----+--------------+------------+---------+-----
		  3 | Kalyan Kumar | 2101289397 | BBSR    |  60

-- Less Than
select * from employee where age<=10;

			 id |     name     |   res_no   | address | age
			----+--------------+------------+---------+-----
			  4 | Akshya Kumar | 2101289398 | CUT     |   5


-- Pattern Matching
select * from employee where name like 'A%';

			 id |     name     |   res_no   | address | age
			----+--------------+------------+---------+-----
			  1 | Anil Kumar   | 2101289397 | BBSR    |
			  4 | Akshya Kumar | 2101289398 | CUT     |   5

select * from employee where name like '%ar';

				 id |     name     |   res_no   | address | age
				----+--------------+------------+---------+-----
				  1 | Anil Kumar   | 2101289397 | BBSR    |
				  2 | Suni Kumar   | 2101289398 | CUT     |  10
				  4 | Kumar        | 2101289398 | ODI     |  10
				  3 | Kalyan Kumar | 2101289397 | BBSR    |  60
				  4 | Akshya Kumar | 2101289398 | CUT     |   5


--Between

select * from employee where age between 1 and 20;
				 id |     name     |   res_no   | address | age
				----+--------------+------------+---------+-----
				  2 | Suni Kumar   | 2101289398 | CUT     |  10
				  4 | Kumar        | 2101289398 | ODI     |  10
				  4 | Akshya Kumar | 2101289398 | CUT     |   5
-- isNUll/ is Not Null

select * from employee where age is null;
			  id |    name    |   res_no   | address | age
			----+------------+------------+---------+-----
			  1 | Anil Kumar | 2101289397 | BBSR    |


select * from employee where age is not  null;

				 id |     name     |   res_no   | address | age
				----+--------------+------------+---------+-----
				  2 | Suni Kumar   | 2101289398 | CUT     |  10
				  4 | Kumar        | 2101289398 | ODI     |  10
				  3 | Kalyan Kumar | 2101289397 | BBSR    |  60
				  4 | Akshya Kumar | 2101289398 | CUT     |   5
-- Aggregation Function

--Count

select count(age) from employee; 

				count
				-------
					4

-- Sum

select sum(id) from employee;

				 sum
				-----
				  14
-- Average

select avg(id) from employee;

			        avg
			--------------------
			 2.8000000000000000

-- Minimum 

select min(age) from employee;

						 min
						-----
						   5

--Maximum

select max(age) from employee;
							
							 max
							-----
							  60

--Grouping

--- GROUP BY
			select count(age), age from employee group by age;
			
						  count
						-------
						     0
						     1
						     1
			 			     2
-- Having


		select age from employee group by age having age<=10;
							   age
							  -----
								5
	    						10



