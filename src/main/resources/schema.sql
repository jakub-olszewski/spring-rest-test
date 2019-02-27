DROP TABLE IF EXISTS product;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE product (
                       id number(10) NOT NULL AUTO_INCREMENT,
                       version varchar2(512) DEFAULT NULL,
                       name varchar2(512) DEFAULT NULL,
                       price number(10) DEFAULT NULL,
                       product_id varchar2(255) DEFAULT NULL,
                       PRIMARY KEY (id)
);