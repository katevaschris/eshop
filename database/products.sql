CREATE TABLE public.products (
	id int8 NOT NULL,
	product_name varchar(255) NOT NULL,
	price float8 NOT NULL,
	quantity int4 NOT NULL,
	CONSTRAINT products_pkey PRIMARY KEY (id)
);