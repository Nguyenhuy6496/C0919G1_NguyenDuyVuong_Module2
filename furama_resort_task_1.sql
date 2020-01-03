DROP DATABASE IF EXISTS furama_resort;
CREATE DATABASE furama_resort;
USE furama_resort;

CREATE TABLE workplace (
ID_workplace VARCHAR(10) PRIMARY KEY NOT NULL,
workplace VARCHAR(50)
);

CREATE TABLE capacity (
ID_capacity VARCHAR(10) PRIMARY KEY NOT NULL,
capacity VARCHAR(50)
);

CREATE TABLE department (
ID_department VARCHAR(10) PRIMARY KEY NOT NULL,
department VARCHAR(50)
);

CREATE TABLE employees (
ID_employee VARCHAR(10) PRIMARY KEY NOT NULL,
employee_name VARCHAR(50),
ID_workplace VARCHAR(10),
FOREIGN KEY (ID_workplace) REFERENCES workplace(ID_workplace),
ID_capacity VARCHAR(10),
FOREIGN KEY (ID_capacity) REFERENCES capacity(ID_capacity),
ID_department VARCHAR(10),
FOREIGN KEY (ID_department) REFERENCES department(ID_department),
birthday DATE,
idenity_card_number VARCHAR(12),
salary INT(20),
phone_number VARCHAR(10),
email VARCHAR(45),
adress VARCHAR(45)
);

CREATE TABLE service_included (
ID_service_included VARCHAR(10) PRIMARY KEY NOT NULL,
sevice_included_name VARCHAR(45),
cost INT(20),
availability VARCHAR(45)
);

CREATE TABLE contract_details (
ID_contract_details VARCHAR(10) PRIMARY KEY NOT NULL,
ID_contract VARCHAR(10),
ID_service_included VARCHAR(10),
FOREIGN KEY (ID_service_included) REFERENCES service_included(ID_service_included),
amount INT(20)
);

CREATE TABLE service_type (
ID_service_type VARCHAR(10) PRIMARY KEY NOT NULL,
service_type_name VARCHAR(45),
cost INT(10)
);

CREATE TABLE rental_type (
ID_rental_type VARCHAR(10) PRIMARY KEY NOT NULL,
rental_type_name VARCHAR(45),
coefficient INT(20)
);

CREATE TABLE services (
ID_service VARCHAR(10) PRIMARY KEY NOT NULL,
area INT(15),
number_of_floor INT(15),
max_number_of_people VARCHAR(45),
ID_rental_type VARCHAR(10),
FOREIGN KEY (ID_rental_type) REFERENCES rental_type(ID_rental_type),
ID_service_type VARCHAR(10),
FOREIGN KEY (ID_service_type) REFERENCES service_type(ID_service_type),
availability VARCHAR(45)
);

CREATE TABLE customer_type (
ID_customer_type VARCHAR(10) PRIMARY KEY NOT NULL,
customer_type_name VARCHAR(45)
);

CREATE TABLE customers (
ID_customer VARCHAR(10) PRIMARY KEY NOT NULL,
ID_customer_type VARCHAR(10),
FOREIGN KEY (ID_customer_type) REFERENCES customer_type(ID_customer_type),
customer_name VARCHAR(45),
birthday DATE,
idenity_card_number VARCHAR(12),
phone_number VARCHAR(10),
email VARCHAR(45),
adress VARCHAR(45)
);

CREATE TABLE contracts (
ID_contract VARCHAR(10) PRIMARY KEY NOT NULL,
ID_employee VARCHAR(10),
FOREIGN KEY (ID_employee) REFERENCES employees(ID_employee),
ID_customer VARCHAR(10),
FOREIGN KEY (ID_customer) REFERENCES customers(ID_customer),
ID_service VARCHAR(10),
FOREIGN KEY (ID_service) REFERENCES services(ID_service),
start_day DATE,
end_day DATE,
deposits INT(15),
total_pay INT(15)
);

ALTER TABLE contract_details ADD FOREIGN KEY (ID_contract) REFERENCES contracts(ID_contract);

SELECT * FROM furama_resort.workplace;
INSERT INTO workplace(ID_workplace,workplace) VALUE ('WOR01','Manager');
INSERT INTO workplace(ID_workplace,workplace) VALUE ('WOR02','Reception');
INSERT INTO workplace(ID_workplace,workplace) VALUE ('WOR03','Staff');
INSERT INTO workplace(ID_workplace,workplace) VALUE ('WOR04','Guard');

SELECT * FROM furama_resort.capacity;
INSERT INTO capacity(ID_capacity,capacity) VALUE ('CAP01','University');
INSERT INTO capacity(ID_capacity,capacity) VALUE ('CAP02','College');
INSERT INTO capacity(ID_capacity,capacity) VALUE ('CAP03','Intermediate');
INSERT INTO capacity(ID_capacity,capacity) VALUE ('CAP04','High school');

SELECT * FROM furama_resort.department;
INSERT INTO department(ID_department,department) VALUE ('DEP01','Finance department');
INSERT INTO department(ID_department,department) VALUE ('DEP02','Prevention plan');
INSERT INTO department(ID_department,department) VALUE ('DEP03','Human resouces department');
INSERT INTO department(ID_department,department) VALUE ('DEP04','Business department');
INSERT INTO department(ID_department,department) VALUE ('DEP05','Cleaning department');
INSERT INTO department(ID_department,department) VALUE ('DEP06','Reception department');
INSERT INTO department(ID_department,department) VALUE ('DEP07','Scurity department');

SELECT * FROM furama_resort.employees;
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP01','AN','WOR02','CAP03','DEP06','1998/12/20','123958458125',7000000,'0906125498','nguyenvanan@gmail.com','Danang');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP02','KIEN','WOR01','CAP01','DEP03','1989/06/03','986758458125',15000000,'0451254706','trananhkien@gmail.com','Quangnam');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP03','LAM','WOR04','CAP04','DEP07','1980/05/16','159753265848',5000000,'0876598745','vuvanlam@gmail.com','Hue');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP04','THU','WOR03','CAP04','DEP05','1996/08/08','032561529875',6000000,'0653158469','tamthithu@gmail.com','Quangtri');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP05','TUNG','WOR02','CAP03','DEP06','1988/12/01','986748512548',7000000,'0853159856','hoangthanhtung@gmail.com','Danang');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP06','LINH','WOR03','CAP02','DEP04','1992/03/20','032568456125',8000000,'0865481235','phanvanlinh@gmail.com','Quangtri');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP07','DUONG','WOR03','CAP02','DEP01','1986/12/28','784512365264',8000000,'0305264512','nguyentrinhduong@gmail.com','Danang');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP08','TUYET','WOR03','CAP02','DEP02','1993/06/20','354162151254',9000000,'0781512546','phamthituyet@gmail.com','Hue');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP09','LONG','WOR03','CAP04','DEP05','2000/08/20','032154265485',6000000,'0905123658','nguyenthanhlong@gmail.com','Quangnam');
INSERT INTO employees(ID_employee,employee_name,ID_workplace,ID_capacity,ID_department,birthday,idenity_card_number,salary,phone_number,email,adress)
VALUE ('EMP10','HUNG','WOR03','CAP03','DEP01','1996/06/15','062597415214',7000000,'0865481254','vuvanhung@gmail.com','Danang');

SELECT * FROM furama_resort.customer_type;
INSERT INTO customer_type(ID_customer_type,customer_type_name) VALUE ('CUTY01','Diamond');
INSERT INTO customer_type(ID_customer_type,customer_type_name) VALUE ('CUTY02','Platinium');
INSERT INTO customer_type(ID_customer_type,customer_type_name) VALUE ('CUTY03','Gold');
INSERT INTO customer_type(ID_customer_type,customer_type_name) VALUE ('CUTY04','Silver');
INSERT INTO customer_type(ID_customer_type,customer_type_name) VALUE ('CUTY05','Member');

SELECT * FROM furama_resort.customers;
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS01','CUTY01','VUONG','1996/04/06','097458123658','0906408308','nguyenduyvuong@gmail.com','Danang');
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS02','CUTY01','LONG','1990/08/18','012354875414','0876512458','phanthanhlong@gmail.com','Hue');
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS03','CUTY04','LONG','1987/07/09','987462531526','0980074511','duongvietlinh@gmail.com','Danang');
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS04','CUTY01','HANG','1995/09/25','987452016485','0876954120','tranthanhhang@gmail.com','Danang');
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS05','CUTY01','DUONG','1991/11/30','068754125486','0906051248','nguyenthuyduong@gmail.com','Quangtri');
INSERT INTO customers(ID_customer,ID_customer_type,customer_name,birthday,idenity_card_number,phone_number,email,adress)
VAlUE ('CUS06','CUTY02','DUONG','2000/8/30','068754178686','0906045214','nguyentrinhduong@gmail.com','Danang');

SELECT * FROM furama_resort.rental_type;
INSERT INTO rental_type(ID_rental_type,rental_type_name,coefficient) VALUE ('RETY01','Year',700);
INSERT INTO rental_type(ID_rental_type,rental_type_name,coefficient) VALUE ('RETY02','Month',55);
INSERT INTO rental_type(ID_rental_type,rental_type_name,coefficient) VALUE ('RETY03','Day',2);
INSERT INTO rental_type(ID_rental_type,rental_type_name,coefficient) VALUE ('RETY04','Hour',1);

SELECT * FROM furama_resort.service_type;
INSERT INTO service_type(ID_service_type,service_type_name,cost) VALUE ('SETY01','Villa',1000000);
INSERT INTO service_type(ID_service_type,service_type_name,cost) VALUE ('SETY02','House',600000);
INSERT INTO service_type(ID_service_type,service_type_name,cost) VALUE ('SETY03','Room',200000);

SELECT * FROM furama_resort.services;
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER01','450','4','15','RETY03','SETY01','Active');
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER02','220','4','15','RETY03','SETY02','Active');
INSERT INTO services(ID_service,area,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER03','40','3','RETY04','SETY03','Active');
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER04','350','4','15','RETY03','SETY01','Active');
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER05','200','4','15','RETY03','SETY02','Active');
INSERT INTO services(ID_service,area,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER06','50','3','RETY04','SETY03','Active');
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER07','500','4','15','RETY03','SETY01','Active');
INSERT INTO services(ID_service,area,number_of_floor,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER08','250','4','15','RETY03','SETY02','Active');
INSERT INTO services(ID_service,area,max_number_of_people,ID_rental_type,ID_service_type,availability)
VALUE ('SER09','35','3','RETY04','SETY03','Active');


SELECT * FROM furama_resort.service_included;
INSERT INTO service_included(ID_service_included,sevice_included_name,cost,availability)
VALUE ('SEIN01','KARAOKE','200000','Active');
INSERT INTO service_included(ID_service_included,sevice_included_name,cost,availability)
VALUE ('SEIN02','MASSAGE','500000','Active');
INSERT INTO service_included(ID_service_included,sevice_included_name,cost,availability)
VALUE ('SEIN03','RENT_CAR','350000','Active');

SELECT * FROM furama_resort.contracts;
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON01','EMP05','CUS01','SER01','2018/05/25','2018/07/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON02','EMP05','CUS02','SER09','2018/05/25','2018/07/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON03','EMP05','CUS01','SER08','2018/05/25','2018/07/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON04','EMP01','CUS03','SER06','2018/05/25','2018/07/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON05','EMP01','CUS01','SER07','2019/08/25','2019/09/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON06','EMP01','CUS04','SER05','2019/01/25','2019/01/30',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON07','EMP01','CUS01','SER03','2019/03/25','2019/04/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON08','EMP030','CUS03','SER04','2019/01/25','2019/02/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON09','EMP03','CUS03','SER01','2019/02/25','2019/03/26',1000000);
INSERT INTO contracts(ID_contract,ID_employee,ID_customer,ID_service,start_day,end_day,deposits)
VALUES ('CON10','EMP02','CUS04','SER02','2019/05/25','2019/07/26',1000000);

SELECT * FROM furama_resort.contract_details;
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE01','CON01','SEIN01',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE02','CON02','SEIN03',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE03','CON03','SEIN03',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE04','CON04','SEIN01',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE05','CON05','SEIN01',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE06','CON06','SEIN02',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE07','CON07','SEIN02',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE08','CON08','SEIN01',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE09','CON09','SEIN02',2);
INSERT INTO contract_details(ID_contract_details,ID_contract,ID_service_included,amount)
VALUE ('CODE10','CON10','SEIN02',2);


