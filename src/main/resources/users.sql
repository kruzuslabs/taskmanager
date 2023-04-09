CREATE SEQUENCE IF NOT EXISTS users_id_seq;
CREATE TABLE IF NOT EXISTS users
(
    "id" bigint NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    "username" character(40) COLLATE pg_catalog."default",
    "fullname" character(40) COLLATE pg_catalog."default",
    "password" character(100) COLLATE pg_catalog."default",
    "joined" text COLLATE pg_catalog."default" NOT NULL DEFAULT to_char(now(), 'mm/dd/yyyy'::text),
    "total_tasks" smallint NOT NULL DEFAULT 0,
    CONSTRAINT main_users_pkey PRIMARY KEY (id)
)