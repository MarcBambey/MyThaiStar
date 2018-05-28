-- Deleta all data for Oracle

ALTER TABLE ORDERPOSITION DISABLE CONSTRAINT FK_ORDPOS2ORDER;
ALTER TABLE OFFER DISABLE CONSTRAINT FK_OFFER2MEAL;
ALTER TABLE OFFER DISABLE CONSTRAINT FK_OFFER2SIDEDISH;
ALTER TABLE OFFER DISABLE CONSTRAINT FK_OFFER2DRINK;
ALTER TABLE BILL_ORDERPOSITION DISABLE CONSTRAINT FK_BILLORDPOS2BILL;
ALTER TABLE BILL_ORDERPOSITION DISABLE CONSTRAINT FK_BILLORDPOS2ORDPOS;

DELETE FROM RESTAURANTTABLE;
DELETE FROM PRODUCT;
DELETE FROM OFFER;
DELETE FROM ORDERPOSITION;
DELETE FROM BILL;
DELETE FROM BILL_ORDERPOSITION;
DELETE FROM RESTAURANTORDER;
DELETE FROM STAFFMEMBER;

--Keep Staffmembers to allow authentication
--DELETE FROM STAFFMEMBER;

ALTER TABLE ORDERPOSITION ENABLE CONSTRAINT FK_ORDPOS2ORDER;
ALTER TABLE OFFER ENABLE CONSTRAINT FK_OFFER2MEAL;
ALTER TABLE OFFER ENABLE CONSTRAINT FK_OFFER2SIDEDISH;
ALTER TABLE OFFER ENABLE CONSTRAINT FK_OFFER2DRINK;
ALTER TABLE BILL_ORDERPOSITION ENABLE CONSTRAINT FK_BILLORDPOS2BILL;
ALTER TABLE BILL_ORDERPOSITION ENABLE CONSTRAINT FK_BILLORDPOS2ORDPOS;