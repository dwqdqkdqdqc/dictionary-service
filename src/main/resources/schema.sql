drop table if exists document_type;
drop table if exists status;
drop table if exists document_type_status_map;

CREATE TABLE document_type (
    id serial primary key,
    name varchar,
    name_rus varchar
);

CREATE TABLE status (
    id serial primary key,
    name varchar,
    name_rus varchar
);

CREATE TABLE document_type_status_map (
    id serial primary key,
    document_type_id int references document_type,
    status_id int references status,
    status_order int not null,
    UNIQUE (document_type_id, status_id)
);