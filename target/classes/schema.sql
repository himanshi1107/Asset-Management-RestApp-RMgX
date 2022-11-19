DROP TABLE IF EXISTS ASSET;

CREATE TABLE Asset (
asset_name VARCHAR(50) PRIMARY KEY,
purchase_date DATE,
condition_notes VARCHAR(50),
category VARCHAR(50),
assignment_status VARCHAR(50),
assigned_employee_id INT(8)
);

DROP TABLE IF EXISTS Category;

CREATE TABLE Category (
category_id INT(8) PRIMARY KEY,
category_name VARCHAR(50),
description VARCHAR(50)
);
