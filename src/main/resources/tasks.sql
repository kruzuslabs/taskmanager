CREATE SEQUENCE IF NOT EXISTS tasks_id_seq;

CREATE TABLE IF NOT EXISTS tasks
(
    id bigint NOT NULL DEFAULT nextval('tasks_id_seq'::regclass),
    title text COLLATE pg_catalog."default",
    body text COLLATE pg_catalog."default",
    "dueDate" text COLLATE pg_catalog."default" DEFAULT to_char(now(), 'mm/dd/yyyy'::text),
    "timePosted" text COLLATE pg_catalog."default" NOT NULL DEFAULT to_char(now(), 'hh:MI:SS AM'::text),
    user_id bigint,
    "completed" boolean NOT NULL DEFAULT false,
    "severity " smallint NOT NULL DEFAULT 1,
    CONSTRAINT main_tasks2_pkey PRIMARY KEY (id)
)