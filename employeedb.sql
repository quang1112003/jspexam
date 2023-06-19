CREATE DATABASE employee;
USE employee;
CREATE TABLE Employee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  full_name VARCHAR(100) NOT NULL,
  birthday DATE NOT NULL,
  address VARCHAR(200) NOT NULL,
  position VARCHAR(50) NOT NULL,
  department VARCHAR(50) NOT NULL
);


INSERT INTO Employee (full_name, birthday, address, position, department) 
VALUES 
('John Doe', '1990-05-15', '123 Main St, City', 'Manager', 'Sales'),
('Jane Smith', '1992-09-22', '456 Elm St, Town', 'Developer', 'IT'),
('Mark Johnson', '1988-12-01', '789 Oak St, Village', 'Analyst', 'Finance'),
('Emily Davis', '1995-07-10', '321 Pine St, County', 'Designer', 'Marketing');

/*2 bản ghi sau dùng web để add*/