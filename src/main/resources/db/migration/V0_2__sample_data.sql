insert into product(id, category, name, description) values ('FI-SW-01', 'FISH', 'Angelfish', 'Salt Water fish from Australia');
insert into product(id, category, name, description) values ('FI-SW-02','FISH','Tiger Shark','Salt Water fish from Australia');
insert into product(id, category, name, description) values ('FI-FW-01','FISH', 'Koi','Fresh Water fish from Japan');
insert into product(id, category, name, description) values ('FI-FW-02','FISH', 'Goldfish','Fresh Water fish from China');
insert into product(id, category, name, description) values ('K9-BD-01','DOGS','Bulldog','Friendly dog from England');
insert into product(id, category, name, description) values ('K9-PO-02', 'DOGS', 'Poodle', 'Cute dog from France');
insert into product(id, category, name, description) values ('K9-DL-01','DOGS', 'Dalmation','Great dog for a Fire Station');
insert into product(id, category, name, description) values ('K9-RT-01','DOGS', 'Golden Retriever','Great family dog');
insert into product(id, category, name, description) values ('K9-RT-02','DOGS', 'Labrador Retriever','Great hunting dog');
insert into product(id, category, name, description) values ('K9-CW-01','DOGS', 'Chihuahua','Great companion dog');
insert into product(id, category, name, description) values ('RP-SN-01','REPTILES','Rattlesnake','Doubles as a watch dog');
insert into product(id, category, name, description) values ('RP-LI-02','REPTILES','Iguana','Friendly green friend');
insert into product(id, category, name, description) values ('FL-DSH-01','CATS','Manx','Great for reducing mouse populations');
insert into product(id, category, name, description) values ('FL-DLH-02', 'CATS', 'Persian', 'Friendly house cat, doubles as a princess');
insert into product(id, category, name, description) values ('AV-CB-01','BIRDS','Amazon Parrot','Great companion for up to 75 years');
insert into product(id, category, name, description) values ('AV-SB-02','BIRDS','Finch','Great stress reliever');

/** angelfish */
insert into item(id, product_id, price, specification) values ('EST-1', 'FI-SW-01', 16.50, 'Large');
insert into item(id, product_id, price, specification) values ('EST-2', 'FI-SW-01', 15.50, 'Small');
/** persian */
insert into item(id, product_id, price, specification) values ('EST-16', 'FL-DLH-02', 93.50, 'Adult Female');
insert into item(id, product_id, price, specification) values ('EST-17', 'FL-DLH-02', 93.50, 'Adult Male');
/* poodle */
insert into item(id, product_id, price, specification) values ('EST-22', 'K9-PO-02', 135.50, 'Adult Male');
insert into item(id, product_id, price, specification) values ('EST-23', 'K9-PO-02', 145.49, 'Adult Female');

