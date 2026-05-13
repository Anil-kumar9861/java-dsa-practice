select * from employee;

--Adding Salary column 
alter table employee add column department varchar(20);

-- update Salary
update employee  set department='HR' where id =1;

--1. Find total salary department-wise
select department,sum(salary) from employee group by department;

--2.Write a query to count how many employees are present in every department.
select department ,count(*) from employee group by department ;


--3. Find average salary department-wise
select department,avg(salary) from employee group by department;

-- 4. Find highest salary in each department
select department,max(Salary) from employee group by department; 

--5. Find minimum salary in each department
select department,min(Salary) from employee group by department; 

--6. Find departments having more than 2 employees
select department , count(employee) as emp from employee group by department having count(employee) > 2;

--7. Find total salary greater than 100000 department-wise
select department ,sum(salary) from employee group by department having sum(salary)>=100000;

--8. Find average age in each city
select address ,avg(age) from employee group by address ;

--9. Count students branch-wise
select branch, count(*) from student group by branch; 

--10. Find duplicate names
select name ,count(*) from employee group by name having count(*)>=1;  

--11. Find second highest salary department-wise
select * from employee order by salary desc offset 1 limit 1; 

--12. Find departments where average salary is greater than company average salary
select department ,avg(salary)  from employee group by department having avg(salary)>(select avg(salary) from employee);

--13. Find month-wise sales total
SELECT TO_CHAR(order_date, 'Month') AS month,
       SUM(amount) AS total_sales
FROM orders
GROUP BY TO_CHAR(order_date, 'Month')
ORDER BY MIN(order_date);