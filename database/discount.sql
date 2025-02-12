CREATE TABLE discount (
    id SERIAL PRIMARY KEY,
    discount NUMERIC(5,2) CHECK (discount BETWEEN 0 AND 100),
    product_id INT REFERENCES product(id) ON DELETE SET NULL,
    start_date DATE,
    end_date DATE
);
