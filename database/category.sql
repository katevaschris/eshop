CREATE TABLE public.category (
    id serial4 NOT NULL,
    "name" varchar(255) NOT NULL,
    description text NULL,
    CONSTRAINT categories_name_key UNIQUE (name),
    CONSTRAINT categories_pkey PRIMARY KEY (id)
);