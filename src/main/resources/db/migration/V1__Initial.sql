CREATE TABLE IF NOT EXISTS user (
    `id` INT UNSIGNED AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
     PRIMARY KEY ( `id` )
) ENGINE=InnoDB DEFAULT CHARSET=utf8;