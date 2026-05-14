select  * from employee;

					 id |     name     |   res_no   | address | age | salary | department_id
					----+--------------+------------+---------+-----+--------+---------------
					  1 | Anil Kumar   | 2101289397 | BBSR    |     |  40000 |             1
					  2 | Suni Kumar   | 2101289398 | CUT     |  10 |  20000 |             2
					  3 | Kalyan Kumar | 2101289397 | BBSR    |  60 |  30000 |             3
					  4 | Akshya Kumar | 2101289398 | CUT     |   5 | 100000 |             4
					  5 | Kumar        | 2101289398 | ODI     |  10 | 100000 |             5

select * from department;
									
									department_id | derpartment_name
									---------------+------------------
									             1 | cloud
									             2 | HR
									             3 | IT
									             4 | IT
									             5 | HR

--1. Show employee name with department name

select name, d.derpartment_name
from employee 
join department d
on employee.department_id = d.department_id;

									    name     | derpartment_name
									--------------+------------------
									 Anil Kumar   | cloud
									 Suni Kumar   | HR
									 Kalyan Kumar | IT
									 Akshya Kumar | IT
									 Kumar        | HR

									 
--2.Show all employee details with department name.

select id,name,address,res_no,age,salary,e.department_id,d.department_name
from employee e
join department d
on e.department_id=d.department_id;



					 id |     name     | address |   res_no   | age | salary | department_id | department_name
					----+--------------+---------+------------+-----+--------+---------------+-----------------
					  1 | Anil Kumar   | BBSR    | 2101289397 |     |  40000 |             1 | cloud
					  2 | Suni Kumar   | CUT     | 2101289398 |  10 |  20000 |             2 | HR
					  3 | Kalyan Kumar | BBSR    | 2101289397 |  60 |  30000 |             3 | IT
					  4 | Akshya Kumar | CUT     | 2101289398 |   5 | 100000 |             4 | IT
					  5 | Kumar        | ODI     | 2101289398 |  10 | 100000 |             5 | HR

--3.Find employees working in IT department.


select e.name,d.department_name
from employee e
join department d
on e.department_id=d.department_id
where d.department_name='IT';


								     name     | department_name
								--------------+-----------------
								 Kalyan Kumar | IT
								 Akshya Kumar | IT


--4.Count employees in each department.
select d.department_name,count(*)
from employee e
join department d
on e.department_id=d.department_id
group by d.department_name;
									 department_name | count
									-----------------+-------
									 cloud           |     1
									 HR              |     2
									 IT              |     2

--5.Find average salary department-wise.
select d.department_name,avg(e.salary)
from employee e
join department d
on e.department_id=d.department_id
group by d.department_name;

								 department_name |        avg
								-----------------+--------------------
								 cloud           | 40000.000000000000
								 HR              | 60000.000000000000
								 IT              | 65000.000000000000

--6.Find highest salary employee with department name.
select e.name,e.salary,d.department_name
from employee e
join department d
on e.department_id = d.department_id
where e.salary=(select max(salary) from employee);

									     name     | salary | department_name
									--------------+--------+-----------------
									 Akshya Kumar | 100000 | IT
									 Kumar        | 100000 | HR

									 

--7.Show departments having more than 2 employees.
select d.department_name,count(*) as logi
from employee e
join department d
on e.department_id=d.department_id
group by department_name
having count(*)>=2;
					 department_name | logi
					-----------------+------
					 HR              |    2
					 IT              |    2

--8.Find employees whose salary is above their department average salary.

select e.name,e.salary,d.department_name
from employee e
join department d
on e.department_id=d.department_id
where e.salary>=(select avg(salary) from employee e1 where e1.department_id=e.department_id); 
							     name     | salary | department_name
							--------------+--------+-----------------
							 Anil Kumar   |  40000 | cloud
							 Suni Kumar   |  20000 | HR
							 Kalyan Kumar |  30000 | IT
							 Akshya Kumar | 100000 | IT
							 Kumar        | 100000 | HR

--9.Find departments with no employees.

select e.name ,d.department_name
from employee e
left join department d
on e.department_id = d.department_id
where d.department_id is null;

--10.Show all departments even if no employees exist.
select e.name ,d.department_name
from employee e
right join department d
on e.department_id = d.department_id;

--11.Find second highest salary in each department.
select d.department_name ,max(salary)
from employee e
join department d
on e.department_id = d.department_id
group by d.department_name ;

