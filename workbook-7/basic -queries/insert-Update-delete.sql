USE northwind;

-- Add a NEW Supplier
INSERT INTO Suppliers (Address, City,CompanyName)
VALUES( 1440 , 'Mexico' , 'MASECA');


SELECT LAST_INSERT_ID();

-- Add a New product that was provided by the suppliers
INSERT INTO Products(ProductName, QuantityPerUnit, UnitPrice, UnitsInStock, Discontinued)
VALUES ('MASA', '4.4 pounds', 3.50, 10, 0);

-- List All products and their supplies
SELECT *
FROM products as p 
INNER JOIN Suppliers as s
ON p.SupplierID = s.SupplierID;

-- rise the price 15% of the new product of the MASA
UPDATE Products
SET UnitPrice = UnitPrice + 0.525
WHERE ProductID = 78; 


-- The list of all products and prices from all the suppliers
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
WHERE ProductID = 78;

DELETE FROM Products
WHERE ProductID = 78; 

-- DELETE The New Supplier
SELECT *
FROM Suppliers;

SELECT * 
FROM Suppliers 
WHERE SupplierID = 30; 

DELETE FROM Suppliers
WHERE SupplierID = 30; 

-- List all Products
SELECT *
FROM products; 

-- List all Suppliers
SELECT * 
FROM Suppliers;