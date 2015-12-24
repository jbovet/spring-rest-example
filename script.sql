CREATE SCHEMA `zbsys` ;


CREATE TABLE `zbsys`.`resultado` (
  `idresultado` INT NOT NULL AUTO_INCREMENT,
  `resultado` BIGINT NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`idresultado`));


INSERT INTO `zbsys`.`resultado` (`resultado`, `fecha`) VALUES ('343432', '2015-12-23 00:00:00');
INSERT INTO `zbsys`.`resultado` (`resultado`, `fecha`) VALUES ('665622', '2015-12-23 00:00:00');
INSERT INTO `zbsys`.`resultado` (`resultado`, `fecha`) VALUES ('97726',  '2015-12-23 00:00:00');
INSERT INTO `zbsys`.`resultado` (`resultado`, `fecha`) VALUES ('23823743', '2015-12-23 00:00:00');

