CREATE DATABASE tgenerica;

USE tgenerica;

CREATE TABLE Users(
id BIGINT NOT NULL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
mail VARCHAR(50) NOT NULL,
username VARCHAR(50) NOT NULL ,
pwd VARCHAR(50) NOT NULL
);

INSERT INTO Users values(1075875000,'Pepe','pepe@lepew.com','pepeLePew','123456789');


CREATE TABLE customers  (
cust_id BIGINT NOT NULL PRIMARY KEY,
cust_name VARCHAR(50) NOT NULL ,
cust_adress VARCHAR(50) NOT NULL,
cust_mail VARCHAR(50) NOT NULL,
cust_phone VARCHAR(50) NOT NULL
);

CREATE TABLE providers (
prov_id BIGINT NOT NULL PRIMARY KEY,
prov_name VARCHAR(50) NOT NULL ,
prov_city VARCHAR(50) NOT NULL,
prov_address VARCHAR(50) NOT NULL,
prov_phone VARCHAR(50) NOT NULL
);

CREATE TABLE sales (
sales_id BIGINT NOT NULL PRIMARY KEY,
sales_cust_id BIGINT NOT NULL ,
sales_total DOUBLE NOT NULL,
sales_saletax DOUBLE NOT NULL,
sales_salevalue DOUBLE NOT NULL,
sales_user_id BIGINT NOT NULL
);

CREATE TABLE products (
prod_id BIGINT NOT NULL PRIMARY KEY,
prod_name VARCHAR(50) NOT NULL,
prod_prov_id BIGINT NOT NULL,
prod_buy_price DOUBLE NOT NULL,
prod_sale_price DOUBLE NOT NULL,
prod_tax DOUBLE NOT NULL
);

CREATE TABLE salesDetail (
sd_id BIGINT NOT NULL PRIMARY KEY,
sd_sale_id BIGINT NOT NULL,
sd_prod_id BIGINT NOT NULL,
sd_sale_quantity DOUBLE NOT NULL,
sd_totalvalue DOUBLE NOT NULL,
sd_salevalue DOUBLE NOT NULL,
sd_taxvalue DOUBLE NOT NULL
);


