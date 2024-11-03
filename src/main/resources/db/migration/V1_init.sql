CREATE TABLE student
(
    id          SERIAL PRIMARY KEY,
    first_name  VARCHAR(50),
    last_name   VARCHAR(50),
    second_name VARCHAR(50),
    group_name  VARCHAR(50),
    avg_grade   DECIMAL(3, 2)
);