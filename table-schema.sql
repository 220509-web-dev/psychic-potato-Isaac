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

-- create employee table
create table employees (
    id            int generated always as identity,
  first_name    varchar not null,
  last_name     varchar not null,
  email         varchar unique not null,
  username      varchar unique not null check (length(username) >= 6),
  role_id       int,

  constraint employees_pk
  primary key (id)
);