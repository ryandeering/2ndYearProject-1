# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  street_address                varchar(255),
  town                          varchar(255),
  eircode                       varchar(255),
  country                       varchar(255),
  constraint pk_address primary key (id)
);

create table basket (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  discount_discount_id          varchar(255),
  discount_set                  boolean default false not null,
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table category_product (
  category_id                   bigint not null,
  product_id                    bigint not null,
  constraint pk_category_product primary key (category_id,product_id)
);

create table discount (
  discount_id                   varchar(255) not null,
  discount_name                 varchar(255),
  valid                         boolean default false not null,
  amount                        double not null,
  constraint pk_discount primary key (discount_id)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  discount_discount_id          varchar(255),
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table platform (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_platform primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  platform_id                   bigint,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  developer                     varchar(255),
  publisher                     varchar(255),
  constraint pk_product primary key (id)
);

create table review (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  product_id                    bigint,
  date                          timestamp,
  rating                        integer not null,
  content                       varchar(255),
  constraint pk_review primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  password                      varchar(255),
  role                          varchar(255),
  address_id                    bigint,
  constraint uq_user_address_id unique (address_id),
  constraint pk_user primary key (email)
);

create table valid (
  password2                     varchar(255)
);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table basket add constraint fk_basket_discount_discount_id foreign key (discount_discount_id) references discount (discount_id) on delete restrict on update restrict;
create index ix_basket_discount_discount_id on basket (discount_discount_id);

alter table category_product add constraint fk_category_product_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (category_id);

alter table category_product add constraint fk_category_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_category_product_product on category_product (product_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table order_item add constraint fk_order_item_discount_discount_id foreign key (discount_discount_id) references discount (discount_id) on delete restrict on update restrict;
create index ix_order_item_discount_discount_id on order_item (discount_discount_id);

alter table product add constraint fk_product_platform_id foreign key (platform_id) references platform (id) on delete restrict on update restrict;
create index ix_product_platform_id on product (platform_id);

alter table review add constraint fk_review_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_review_customer_email on review (customer_email);

alter table review add constraint fk_review_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_review_product_id on review (product_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);

alter table user add constraint fk_user_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_email;

alter table basket drop constraint if exists fk_basket_discount_discount_id;
drop index if exists ix_basket_discount_discount_id;

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table order_item drop constraint if exists fk_order_item_discount_discount_id;
drop index if exists ix_order_item_discount_discount_id;

alter table product drop constraint if exists fk_product_platform_id;
drop index if exists ix_product_platform_id;

alter table review drop constraint if exists fk_review_customer_email;
drop index if exists ix_review_customer_email;

alter table review drop constraint if exists fk_review_product_id;
drop index if exists ix_review_product_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

alter table user drop constraint if exists fk_user_address_id;

drop table if exists address;

drop table if exists basket;

drop table if exists category;

drop table if exists category_product;

drop table if exists discount;

drop table if exists order_item;

drop table if exists platform;

drop table if exists product;

drop table if exists review;

drop table if exists shop_order;

drop table if exists user;

drop table if exists valid;

