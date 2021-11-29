CREATE SCHEMA `cinema_database`;
CREATE TABLE `cinema_database`.`films`
(
    `film_id`       INT         NOT NULL AUTO_INCREMENT,
    `film_name`     VARCHAR(45) NOT NULL,
    `film_duration` FLOAT       NOT NULL,
    PRIMARY KEY (`film_id`),
    UNIQUE INDEX `idfilms_UNIQUE` (`film_id` ASC) VISIBLE
);

CREATE TABLE `cinema_database`.`sessions`
(
    `session_id`   INT  NOT NULL AUTO_INCREMENT,
    `session_date` DATE NOT NULL,
    `film_id`      INT  NOT NULL,
    `session_time` TIME NOT NULL,
    `price`        INT  NOT NULL,
    PRIMARY KEY (`session_id`),
    UNIQUE INDEX `session_id_UNIQUE` (`session_id` ASC) VISIBLE
);

CREATE TABLE `cinema_database`.`tickets`
(
    `ticket_number` INT NOT NULL AUTO_INCREMENT,
    `session_id`    INT NOT NULL,
    PRIMARY KEY (`ticket_number`),
    UNIQUE INDEX `idtickets_UNIQUE` (`ticket_number` ASC) VISIBLE
);

ALTER TABLE `cinema_database`.`sessions`
    ADD INDEX `film_id_idx` (`film_id` ASC) VISIBLE;
;
ALTER TABLE `cinema_database`.`sessions`
    ADD CONSTRAINT `film_id`
        FOREIGN KEY (`film_id`)
            REFERENCES `cinema_database`.`films` (`film_id`)
            ON DELETE RESTRICT
            ON UPDATE RESTRICT;

ALTER TABLE `cinema_database`.`tickets`
    ADD INDEX `session_id_idx` (`session_id` ASC) VISIBLE;
;
ALTER TABLE `cinema_database`.`tickets`
    ADD CONSTRAINT `session_id`
        FOREIGN KEY (`session_id`)
            REFERENCES `cinema_database`.`sessions` (`session_id`)
            ON DELETE NO RESTRICT
            ON UPDATE NO RESTRICT;

INSERT INTO `cinema_database`.`films` (`film_id`, `film_name`, `film_duration`) VALUES (1, 'Dune', '180');
INSERT INTO `cinema_database`.`films` (`film_id`, `film_name`, `film_duration`) VALUES (2, 'Soho', '120');
INSERT INTO `cinema_database`.`films` (`film_name`, `film_duration`) VALUES ('Richard', '120');
INSERT INTO `cinema_database`.`films` (`film_name`, `film_duration`) VALUES ('The Sky', '60');
INSERT INTO `cinema_database`.`films` (`film_name`, `film_duration`) VALUES ('Eternals', '150');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`,`session_end_time`, `price`) VALUES ('2021-11-28', '4', '09:15:00', '10:15:00', '220');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '5', '13:15:00', '15:45:00', '300');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '2', '15:10:00', '17:10:00', '380');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '3', '18:00:00', '20:00:00', '400');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '4', '19:15:00', '20:15:00', '400');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '5', '20:30:00', '23:00:00', '500');
INSERT INTO `cinema_database`.`sessions` (`session_date`, `film_id`, `session_time`, `session_end_time`, `price`) VALUES ('2021-11-28', '1', '22:45:00', '23:45:00', '400');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('1', '1');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('2', '1');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('3', '1');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('4', '1');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('5', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('6', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('7', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('8', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('9', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('10', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('11', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('12', '2');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('13', '3');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('14', '3');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('15', '3');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('16', '3');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('17', '4');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('18', '4');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('19', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('20', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('21', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('22', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('23', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('24', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('25', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('26', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('27', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('28', '5');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('29', '6');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('30', '6');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('31', '6');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('32', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('33', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('34', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('35', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('36', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('37', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('38', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('39', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('40', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('41', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('42', '7');
INSERT INTO `cinema_database`.`tickets` (`ticket_number`, `session_id`) VALUES ('43', '7');


