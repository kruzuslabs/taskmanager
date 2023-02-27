CREATE TABLE IF NOT EXISTS public.tasks
(
    taskid integer NOT NULL DEFAULT nextval('tasks_taskid_seq'::regclass),
    body text COLLATE pg_catalog."default",
    date text COLLATE pg_catalog."default",
    title text COLLATE pg_catalog."default",
    userid text COLLATE pg_catalog."default",
    CONSTRAINT tasks_pkey PRIMARY KEY (taskid)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tasks
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS public.users
(
    "userID" integer NOT NULL DEFAULT nextval('"users_userID_seq"'::regclass),
    username text COLLATE pg_catalog."default",
    password text COLLATE pg_catalog."default",
    registered_date text COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY ("userID")
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.users
    OWNER to postgres;