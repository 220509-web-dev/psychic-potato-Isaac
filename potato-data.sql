set search_path to potato-llc;

-- Create employee roles
insert into employee_role values ('Project Manager'), ('Project Lead'), ('Senior Developer'),('Junior Developer'), ('Intern'), ('HR Specialist');

-- Create departments data
insert into departments values ('Management'), ('Developers'), ('Human Resources');

-- Create salary table data
insert into salaries values ('250,000'),('115,000'),('95,000'),('75,000'), ('45,000'), ('65,000');

-- Create employee data
insert into employees values 
('John', 'Cena','Manangement', 'Project Manager', '250,000', 1, 1),
('Jack', 'Sparrow','Developers', 'Senior Developer', '95,000', 2, 2),
('Mike', 'Jones','Manangement', 'Project Lead', '115,000', 3, 3),
('Amy', 'Wateres','Developers', 'Junior Developer', '75,000', 4, 4),
('Kayla', 'Riviera','Human Resources', 'HR Specialist', '65,000', 5, 5),
('Rain', 'Markson','Developers', 'Intern', '45,000', 6, 6)