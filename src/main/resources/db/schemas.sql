DROP TABLE IF EXISTS customer;

CREATE TABLE customer(
  id BIGINT NOT NULL AUTO_INCREMENT ,
  first_name varchar(50),
  last_name varchar(50),
  primary key (id)
)
