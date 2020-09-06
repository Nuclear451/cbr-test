create table if not exists document (
    id SERIAL,
    name varchar(100) not null,
    content bytea not null,
    accepted_at date,
    started_printed_at date,
    finished_at date,
    primary key (id)
);