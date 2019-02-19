# --- !Ups

insert into category (id,name) values ( 1,'Game' );
insert into category (id,name) values ( 2,'Console' );
insert into category (id,name) values ( 3,'Accessory' );

insert into product (id,name,brand,stock,price) values ( 1,'Outlast','Warner. Bros.',100,69.99 );
insert into product (id,name,brand,stock,price) values ( 2,'Xbox One','Microsoft',50,499.99);
insert into product (id,name,brand,stock,price) values ( 3,'Razer Thresher','Razer',50,175.00 );

insert into game (genre,developer) values ('Horror','Red Barrels');

insert into console (color,storage) values ('White',1000);

insert into accessory (type) values ('Headset');

insert into category_product (category_id,product_id) values (5,1);
insert into category_product (category_id,product_id) values (5,2);
insert into category_product (category_id,product_id) values (1,3);
insert into category_product (category_id,product_id) values (3,4);
insert into category_product (category_id,product_id) values (3,5);
insert into category_product (category_id,product_id) values (8,6);
insert into category_product (category_id,product_id) values (6,7);
insert into category_product (category_id,product_id) values (7,8);  
insert into category_product (category_id,product_id) values (3,9);
insert into category_product (category_id,product_id) values (5,10);
insert into category_product (category_id,product_id) values (4,11);
insert into category_product (category_id,product_id) values (2,12);
insert into category_product (category_id,product_id) values (5,7);
insert into category_product (category_id,product_id) values (3,8);
insert into category_product (category_id,product_id) values (3,3);