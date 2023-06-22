CREATE TABLE product (
	id varchar(120) NOT NULL,
	category varchar(255) NOT NULL,
	name varchar(120) NOT NULL,
	description varchar(255),
	PRIMARY KEY (id)
);

CREATE TABLE item(
	id varchar(100) not null,
	product_id varchar(120) NOT NULL,
	price decimal(8,2) NOT NULL,
	specification varchar(100) NOT NULL,
	quantity int DEFAULT 0,
	PRIMARY KEY (id),
	FOREIGN KEY (product_id) REFERENCES product(id)
);






