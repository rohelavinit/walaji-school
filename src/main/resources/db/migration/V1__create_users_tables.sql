CREATE TABLE `users` (
  `id`       INT          NOT NULL      AUTO_INCREMENT,
  `name`     VARCHAR(255) NOT NULL,
  `version`  INT          NULL          DEFAULT 0,
  `balance`  INT          NOT NULL,
  `created`  TIMESTAMP    NOT NULL      DEFAULT NOW(),
  `modified` TIMESTAMP    NOT NULL      DEFAULT NOW(),
  PRIMARY KEY (`id`));