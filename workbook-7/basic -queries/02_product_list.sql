USE northwind;

-- Products hold the name of item Northwin sells
SELECT * 
FROM Products; 

-- Lists of all the product id, product name, and unit price of every product
SELECT ProductID
      , ProductName
      , UnitPrice
FROM Products;

-- List of all product id,name and order them by UnitPrice
SELECT ProductID
      , ProductName
      , UnitPrice
FROM Products
ORDER BY UnitPrice
;

-- All the produces that are less that $7.50
SELECT ProductID
       , ProductName
       , UnitPrice
FROM Products
WHERE UnitPrice <= 7.50
ORDER BY UnitPrice;

-- Products that have at least 100 units on Stock by largers price to lowest price 
SELECT ProductName
       , UnitPrice
       , UnitsInStock
FROM Products
WHERE UnitsInStock >= 100 
ORDER BY UnitPrice DESC, ProductName;


-- Units that we have zero in hand but have units in backOrder
SELECT ProductName
      ,UnitsInStock
      , UnitsOnOrder
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnOrder > 0
ORDER BY ProductName
;

-- Name of table that holds the types of categories of the items northwind sells
SELECT * 
FROM Categories
;

-- CategoryID of the seafood category Name
SELECT *
FROM Categories
WHERE CategoryName= 'Seafood';

-- Seafood items
SELECT p.ProductName
      , p.UnitPrice
      , c.CategoryName
FROM Products AS p 
INNER JOIN Categories AS c
ON p.CategoryID = c.CategoryID
WHERE c.CategoryName = 'Seafood';

SELECT *
FROM Employees
;

-- First and last name of all employees in Northwind
SELECT FirstName
       ,LastName
FROM Employees; 

-- Employess that have the title Manager
SELECT FirstName
       ,LastName
       ,Title
FROM Employees
WHERE Title = 'Sales Manager';

-- the distinct job titles in employees
SELECT DISTINCT(Title)
FROM Employees
;

-- Employees that have a salary that is between $200 and $2500
SELECT Salary
,FirstName
,LastName
FROM Employees
WHERE Salary BETWEEN 200 and 2500
;

-- List all of info about northwind suppliers
SELECT *
FROM Suppliers
;

-- List of products that Tokyo Traders supply northwind
SELECT P.productName
      , s.CompanyName
FROM Suppliers AS s
INNER JOIN Products AS p
ON s.SupplierID = p.SupplierID
WHERE s.CompanyName = 'Tokyo Traders';




