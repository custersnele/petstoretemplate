CREATE TABLE orders(
	id int not null AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	email varchar(120) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE order_line(
    id int not null AUTO_INCREMENT,
    order_id int not null,
    item_id varchar(100) not null,
    quantity int not null,
    PRIMARY KEY(id),
    FOREIGN KEY(order_id) REFERENCES orders(id),
    FOREIGN KEY(item_id) REFERENCES item(id)
)
