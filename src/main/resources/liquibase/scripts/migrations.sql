-- liquibase formatted sql

-- changeset oalekseenko:1
create table colors (
    id bigint generated by default as identity primary key,
    name varchar unique not null
);
create table socks_stocks (
    id bigint generated by default as identity primary key,
    cotton_part int not null,
    quantity int not null,
    color_id bigint not null references colors(id) on delete cascade
);

-- changeset oalekseenko:2
alter table socks_stocks
    add constraint cotton_part_constraint check ( cotton_part >= 0 and cotton_part <= 100 );