
-- Table: public.tasks

-- DROP TABLE IF EXISTS public.tasks;
CREATE SEQUENCE tasks_id_seq;

CREATE TABLE IF NOT EXISTS public.tasks
(
   id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('tasks_id_seq'::regclass),
    body TEXT,
    completed BOOLEAN NOT NULL DEFAULT false,
    due_date TEXT NOT NULL DEFAULT to_char(now(), 'mm/dd/yyyy'::text),
    severity SMALLINT NOT NULL DEFAULT 1,
    time_posted TEXT NOT NULL DEFAULT to_char(now(), 'hh:MI:SS AM'::text),
    title TEXT
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tasks
    OWNER to postgres;