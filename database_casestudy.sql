DROP DATABASE IF EXISTS furama_resort;
CREATE DATABASE furama_resort;
USE furama_resort;

CREATE TABLE workplace (
id_workplace INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
workplace VARCHAR(50)
);

CREATE TABLE capacity (
id_capacity INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
capacity VARCHAR(50)
);

CREATE TABLE department (
id_department INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
department VARCHAR(50)
);

CREATE TABLE employees (
id_employee INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
employee_name VARCHAR(50),
id_workplace INT(10),
FOREIGN KEY (id_workplace) REFERENCES workplace(id_workplace),
id_capacity INT(10),
FOREIGN KEY (id_capacity) REFERENCES capacity(id_capacity),
id_department INT(10),
FOREIGN KEY (id_department) REFERENCES department(id_department),
birthday DATE,
idenity_card_number VARCHAR(12),
salary INT(20),
phone_number VARCHAR(10),
email VARCHAR(45),
adress VARCHAR(45)
);

CREATE TABLE service_included (
id_service_included INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
sevice_included_name VARCHAR(45),
cost INT(20),
availability VARCHAR(45)
);

CREATE TABLE contract_details (
id_contract_details INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
id_contract INT(10),
id_service_included INT(10),
FOREIGN KEY (id_service_included) REFERENCES service_included(id_service_included),
amount INT(20)
);

CREATE TABLE service_type (
id_service_type INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
service_type_name VARCHAR(45),
cost INT(10)
);

CREATE TABLE rental_type (
id_rental_type INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
rental_type_name VARCHAR(45),
coefficient INT(20)
);

CREATE TABLE services (
id_service INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
service_name VARCHAR(10),
area INT(15),
number_of_floor INT(15),
max_number_of_people VARCHAR(45),
rental_cost INT(20),
id_rental_type INT(10),
FOREIGN KEY (id_rental_type) REFERENCES rental_type(id_rental_type),
id_service_type INT(10),
FOREIGN KEY (id_service_type) REFERENCES service_type(id_service_type),
availability VARCHAR(45)
);

CREATE TABLE customer_type (
id_customer_type INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
customer_type_name VARCHAR(45)
);

CREATE TABLE customers (
id_customer INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
id_customer_type INT(10),
FOREIGN KEY (id_customer_type) REFERENCES customer_type(id_customer_type),
customer_name VARCHAR(45),
birthday DATE,
idenity_card_number VARCHAR(12),
phone_number VARCHAR(10),
email VARCHAR(45),
adress VARCHAR(45)
);

CREATE TABLE contracts (
id_contract INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
id_employee INT(10),
FOREIGN KEY (id_employee) REFERENCES employees(id_employee),
id_customer INT(10),
FOREIGN KEY (id_customer) REFERENCES customers(id_customer),
id_service INT(10),
FOREIGN KEY (id_service) REFERENCES services(id_service),
start_day DATE,
end_day DATE,
deposits INT(15),
total_pay INT(15)
);

ALTER TABLE contract_details ADD FOREIGN KEY (id_contract) REFERENCES contracts(id_contract);

SELECT * FROM furama_resort.workplace;
INSERT INTO workplace(id_workplace,workplace) 
VALUE ('1','Manager'),
	  ('2','Reception'),
	  ('3','Staff'),
	  ('4','Guard');

SELECT * FROM furama_resort.capacity;
INSERT INTO capacity(id_capacity,capacity) 
VALUE ('1','University'),
	  ('2','College'),
	  ('3','Intermediate'),
	  ('4','High school');

SELECT * FROM furama_resort.department;
INSERT INTO department(id_department,department) 
VALUE ('1','Finance department'),
('2','Prevention plan'),
('3','Human resouces department'),
('4','Business department'),
('5','Cleaning department'),
('6','Reception department'),
('7','Scurity department');

SELECT * FROM furama_resort.employees;
INSERT INTO employees(id_employee,employee_name,id_workplace,id_capacity,id_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('1','AN','2','3','6','1998/12/20','123958458125',7000000,'0906125498','nguyenvanan@gmail.com','Danang'),
	  ('2','KIEN','1','1','3','1989/06/03','986758458125',15000000,'0451254706','trananhkien@gmail.com','Quangnam'),
	  ('3','LAM','4','4','7','1980/05/16','159753265848',5000000,'0876598745','vuvanlam@gmail.com','Hue'),
	  ('4','THU','3','4','5','1996/08/08','032561529875',6000000,'0653158469','tamthithu@gmail.com','Quangtri'),
	  ('5','TUNG','2','3','6','1988/12/01','986748512548',7000000,'0853159856','hoangthanhtung@gmail.com','Danang'),
	  ('6','LINH','3','2','4','1992/03/20','032568456125',8000000,'0865481235','phanvanlinh@gmail.com','Quangtri'),
	  ('7','DUONG','3','2','1','1986/12/28','784512365264',8000000,'0305264512','nguyentrinhduong@gmail.com','Danang'),
	  ('8','TUYET','3','2','2','1993/06/20','354162151254',9000000,'0781512546','phamthituyet@gmail.com','Hue'),
	  ('9','LONG','3','4','5','2000/08/20','032154265485',6000000,'0905123658','nguyenthanhlong@gmail.com','Quangnam'),
	  ('10','HUNG','3','3','1','1996/06/15','062597415214',7000000,'0865481254','vuvanhung@gmail.com','Danang');

SELECT * FROM furama_resort.customer_type;
INSERT INTO customer_type(id_customer_type,customer_type_name) 
VALUE ('1','Diamond'),
	  ('2','Platinium'),
	  ('3','Gold'),
	  ('4','Silver'),
	  ('5','Member');

SELECT * FROM furama_resort.customers;
INSERT INTO customers(id_customer,id_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('1','1','VUONG','1996/04/06','097458123658','0906408308','nguyenduyvuong@gmail.com','Danang'),
	  ('2','1','LONG','1990/08/18','012354875414','0876512458','phanthanhlong@gmail.com','Hue'),
	  ('3','4','LONG','1987/07/09','987462531526','0980074511','duongvietlinh@gmail.com','Danang'),
	  ('4','1','HANG','1995/09/25','987452016485','0876954120','tranthanhhang@gmail.com','Danang'),
	  ('5','1','DUONG','1991/11/30','068754125486','0906051248','nguyenthuyduong@gmail.com','Quangtri'),
	  ('6','2','DUONG','2000/8/30','068754178686','0906045214','nguyentrinhduong@gmail.com','Danang');

SELECT * FROM furama_resort.rental_type;
INSERT INTO rental_type(id_rental_type,rental_type_name,coefficient) 
VALUE ('1','Year',700),
	  ('2','Month',55),
	  ('3','Day',2),
	  ('4','Hour',1);

SELECT * FROM furama_resort.service_type;
INSERT INTO service_type(id_service_type,service_type_name,cost) 
VALUE ('1','Villa',1000000),
	  ('2','House',600000),
	  ('3','Room',200000);

SELECT * FROM furama_resort.services;
INSERT INTO services(id_service,service_name,area,number_of_floor,max_number_of_people,rental_cost,id_rental_type,id_service_type,availability)
VALUE ('1','Villa_1','450','4','15','1000000','3','1','Active'),
	  ('2','House_1','220','4','15','500000','3','2','Active'),
	  ('3','Room_1','40','2','3','200000','4','3','Active'),
	  ('4','Villa_2','350','4','15','1000000','3','1','Active'),
	  ('5','House_2','200','4','15','500000','3','2','Active'),
	  ('6','Room_2','50','3','3','200000','4','3','Active'),
	  ('7','Villa_3','500','4','15','1000000','3','1','Active'),
	  ('8','House_3','250','4','15','500000','3','2','Active'),
	  ('9','Room_3','35','2','3','200000','4','3','Active');

SELECT * FROM furama_resort.service_included;
INSERT INTO service_included(id_service_included,sevice_included_name,cost,availability)
VALUE ('1','KARAOKE','200000','Active'),
	  ('2','MASSAGE','500000','Active'),
	  ('3','RENT_CAR','350000','Active');

SELECT * FROM furama_resort.contracts;
INSERT INTO contracts(id_contract,id_employee,id_customer,id_service,start_day,end_day,deposits)
VALUES ('1','5','1','1','2018/05/25','2018/07/26',1000000),
	   ('2','5','2','9','2018/05/25','2018/07/26',1000000),
	   ('3','5','1','8','2018/05/25','2018/07/26',1000000),
	   ('4','1','3','6','2018/05/25','2018/07/26',1000000),
	   ('5','1','1','7','2019/08/25','2019/09/26',1000000),
	   ('6','1','4','5','2019/01/25','2019/01/30',1000000),
	   ('7','1','1','3','2019/03/25','2019/04/26',1000000),
	   ('8','3','3','4','2019/01/25','2019/02/26',1000000),
	   ('9','3','3','1','2019/02/25','2019/03/26',1000000),
	   ('10','2','4','2','2019/05/25','2019/07/26',1000000);

SELECT * FROM furama_resort.contract_details;
INSERT INTO contract_details(id_contract_details,id_contract,id_service_included,amount)
VALUE ('1','1','1',2),
	  ('2','2','3',2),
	  ('3','3','3',2),
	  ('4','4','1',2),
	  ('5','5','1',2),
	  ('6','6','2',2),
	  ('7','7','2',2),
	  ('8','8','1',2),
	  ('9','9','2',2),
	  ('10','10','2',2);