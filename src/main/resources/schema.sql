--
-- Тарифы
--
CREATE TABLE `rates`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор тарифа',
  `name` VARCHAR(300) NOT NULL COMMENT 'Наименование тарифа',
  `partner_id` BIGINT,
  PRIMARY KEY (`id`)
) ;

--
-- Временной элемент тарифа
--
CREATE TABLE `rate_date_item`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор временного элемента тарифа',
  `start_date` DATE NOT NULL COMMENT 'Дата начало действия',
  `rate_id` BIGINT NOT NULL COMMENT 'Идентификатор тарифа',
  PRIMARY KEY (`id`)
) ;

--
-- Услуги
--
CREATE TABLE `rate_service`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор сервиса/услуги',
  `guid` VARCHAR(50) NOT NULL COMMENT 'GUID-услуги',
  `name` VARCHAR(400) NOT NULL COMMENT 'Наименование улуги',
  `rate_date_item_id` BIGINT NOT NULL COMMENT 'Идентификатор временного элемента тарифа',
  `currency_id` BIGINT NOT NULL COMMENT 'Идентификатор валюты',
  `fix_payment` DECIMAL COMMENT 'Фиксированный платёж',
  `minimal_payment` DECIMAL COMMENT 'Минимальный платёж',
  `short_number` VARCHAR(32) COMMENT 'К-номер',
  `mandatory` TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'Признак обязательности услуги',
  PRIMARY KEY (`id`)
) ;

--
-- Шкалы тарифыного плана/услуги
--
CREATE TABLE `rate_scale`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор шкалы',
  `guid` VARCHAR(50) NOT NULL COMMENT 'GUID шкалы',
   `delivery_type` ENUM('sms','viber','social') NOT NULL COMMENT 'Тип доставки(sms, viber...)',
  `alias` ENUM('regular','mts','beeline','megafon','tele2','motiw','rostelecom','yota','other','world','all') NOT NULL COMMENT 'Alias/Оператор',
  `traffic_type` ENUM('advertising','service','transactional') NOT NULL COMMENT 'Тип трафика',
  `tarification_type` ENUM('smsSendCount','smsDeliveredCount','msgSendCount','msgDeliveredCount') NOT NULL COMMENT 'Тип тарификации',
  PRIMARY KEY (`id`)
) ;

--
-- Таблица для хранения цен тарифа.
--
CREATE TABLE `rate_price`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор цены',
  `rate_scale_id` BIGINT NOT NULL COMMENT 'Идентификатор шкалы',
  `range_to` BIGINT COMMENT 'Конец диапазона цены',
  `price` DECIMAL NOT NULL COMMENT 'Цена',
  PRIMARY KEY (`id`)
);
