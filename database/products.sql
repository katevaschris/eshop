CREATE TABLE public.product (
	id int4 DEFAULT nextval('products_id_seq'::regclass) NOT NULL,
	"name" varchar(255) NOT NULL,
	description text NULL,
	price numeric(10, 2) NOT NULL,
	stock int4 NOT NULL,
	category int4 NULL,
	created_at timestamp DEFAULT now() NULL,
	CONSTRAINT products_pkey PRIMARY KEY (id),
	CONSTRAINT products_price_check CHECK ((price >= (0)::numeric)),
	CONSTRAINT products_stock_check CHECK ((stock >= 0))
);


-- public.product foreign keys

ALTER TABLE public.product ADD CONSTRAINT products_category_id_fkey FOREIGN KEY (category) REFERENCES public.category(id) ON DELETE SET NULL;