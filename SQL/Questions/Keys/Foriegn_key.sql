--Foreign Keys

--add to existing table
ALTER TABLE child_table
ADD CONSTRAINT fk_constraint_name
FOREIGN KEY (child_column) 
REFERENCES parent_table (parent_column);


--Create table using

1. Simple Inline Syntax

create table table_name1 id PRIMARY KEY,
        department_id references to table_name2(department_id);


2. Formal Table Constraint Syntax

CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    department_id INT,
    CONSTRAINT fk_department 
      FOREIGN KEY (department_id) 
      REFERENCES departments(id)
      ON DELETE CASCADE
);


