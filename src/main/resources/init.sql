DROP DATABASE IF EXISTS template;
create database template;

USE template;

DROP USER IF EXISTS 'template'@localhost;

create user 'template'@'localhost';
grant all privileges on template.* to 'template'@'localhost';
flush privileges;


DROP TABLE IF EXISTS properties;
CREATE TABLE properties
(
    name  VARCHAR(255) PRIMARY KEY,
    value VARCHAR(255) NOT NULL
);

INSERT INTO properties (name, value)
VALUES ("version", "0");