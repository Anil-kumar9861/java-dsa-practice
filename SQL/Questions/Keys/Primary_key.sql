---Primary Key

--1. Single Column Primary Key

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    EnrollmentDate DATE
);

--2. Composite Primary Key
CREATE TABLE CourseAssignments (
    StudentID INT,
    CourseID INT,
    Semester VARCHAR(10),
    PRIMARY KEY (StudentID, CourseID)
);

--add a primary key constraint to an existing

ALTER TABLE table_name 
ADD PRIMARY KEY (column_name);


--Composite Primary Key

ALTER TABLE table_name 
ADD PRIMARY KEY (column1, column2);

--Naming the Constraint

ALTER TABLE table_name
ADD CONSTRAINT p_name PRIMARY KEY(ID);
