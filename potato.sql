-- create the schema
create schema potato_llc;

-- sets path to schema
set search_path to potato_llc;

-- create employee table
drop table if exists employees;
create table employees (
  id            int generated always as identity,
  username      varchar unique not null,
  password      varchar not null,
  first_name    varchar not null,
  last_name     varchar not null,
  salary        varchar  not null, 
  role_id       int,

  constraint employees_pk
  primary key (id)
);

-- create employee role table
create table employee_roles (
    id   int generated always as identity primary key,
    employee_role  varchar unique not null
);

-- create departnemt table
create table departments (
    id   int ,
    departments  varchar unique not null
);

-- create salary table
create table salaries (
    id int ,
    salaries varchar not null
);

