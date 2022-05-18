-- create the schema
create schema potato-llc;

-- sets path to schema
set search_path to potato-llc;

-- create employee role table
create table employee_roles (
    id   int generated always as identity primary key,
    employee_role  varchar unique not null
);

-- create departnemt table
create table departnemts (
    id   int generated always as identity primary key,
    departnemts  varchar unique not null
);

-- create salary table
create table salaries (
    id int generated always as identity primary key,
    salaries varchar not null
);

-- create employee table
create table employees (
    id            int generated always as identity,
  first_name    varchar not null,
  last_name     varchar not null,
  department    varchar unique not null,
  salary      varchar  not null check ,
  role_id       int,

  constraint employees_pk
  primary key (id)
);