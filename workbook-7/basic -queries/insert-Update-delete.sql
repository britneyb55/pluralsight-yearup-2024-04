USE northwind;

-- Add a NEW Supplier
INSERT INTO Suppliers (Address, City,CompanyName)
VALUES( 1440 , 'Mexico' , 'MASECA');


SELECT LAST_INSERT_ID();

-- Add a New product that was provided by the suppliers
INSERT INTO Products(ProductName, QuantityPerUnit, UnitPrice, UnitsInStock, Discontinued)
VALUES ('MASA', '4.4 pounds', 3.50, 10, 0);



UPDATE Products
SET SupplierID = 34
WHERE ProductID = 78; 

SELECT *
FROM Products AS p 
RIGHT JOIN Suppliers as s
ON p.SupplierID = s.SupplierID;

UPDATE Products
SET UnitPrice = UnitPrice + 0.525
WHERE ProductID = 78; 

SELECT p.ProductName
	, p.UnitPrice
	, s.CompanyName
FROM Products AS p
LEFT JOIN Suppliers AS s
ON p.SupplierID = s.SupplierID
;

-- DELETE THE New Product
SELECT * 
FROM Products
WHERE ProductID = 79;

DELETE FROM Products
WHERE ProductID = 79; 

-- DELETE The New Supplier
SELECT *
FROM Suppliers;

SELECT * 
FROM Suppliers 
WHERE SupplierID = 34; 

DELETE FROM Suppliers
WHERE SupplierID = 34; 

-- List all Products
SELECT *
FROM products; 

-- List all Suppliers
SELECT * 
FROM Suppliers;