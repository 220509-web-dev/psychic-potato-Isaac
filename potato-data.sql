set search_path to potato_llc;




-- Create employee roles
insert into employee_roles values ("Project Manager"), ("Project Lead"), ("Senior Developer"),("Junior Developer"), ("Intern"), ("HR Specialist");

-- Create departments data
insert into departments values ('Management'), ('Developers'), ('Human Resources');

-- Create salary table data
insert into salaries values ('250,000'),('115,000'),('95,000'),('75,000'), ('45,000'), ('65,000');


-- Create employee data
delete from employees where id is not null;
insert into employees values 
(default, 'JCena1', 'password', 'John', 'Cena', '250,000', 1),
(default, 'JCena12', 'password','Jack', 'Sparrow', '95,000', 2),
(default, 'JCena13', 'password','Mike', 'Jones', '115,000', 3),
(default, 'JCena14', 'password','Amy', 'Wateres', '75,000', 4),
(default, 'JCena1344', 'password','Kayla', 'Riviera', '65,000', 5),
(default, 'JCena134444', 'password','Rain', 'Markson', '45,000', 6);

update employees set username = concat(first_name,'.',last_name,'@revature.net') ;
select * from employees;


SELECT column_name FROM information_schema.columns WHERE table_schema = 'potato_llc' AND table_name = 'employees';















