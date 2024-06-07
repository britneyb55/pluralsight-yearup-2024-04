USE northwind;

SELECT * 
FROM Products; 

SELECT ProductID
       , ProductName
       , UnitPrice
FROM Products
WHERE UnitPrice <= 7.50
ORDER BY UnitPrice;

SELECT ProductName
       , UnitPrice
       , UnitsInStock
FROM Products
WHERE UnitsInStock >= 100 
ORDER BY  ProductName , UnitPrice DESC;

SELECT ProductName
      ,UnitsInStock
      ,ReorderLevel
FROM Products
WHERE UnitsInStock = 0
ORDER BY ProductName
;

SELECT CategoryID
      ,ProductName
      , UnitsOnOrder
FROM Products
WHERE CategoryID = 8;

SELECT * 
FROM Categories
;

SELECT CategoryName
FROM Categories
;

SELECT *
FROM Employees
;

SELECT FirstName
       ,LastName
       ,Title
FROM Employees
WHERE Title = 'Sales Manager';

SELECT DISTINCT(Title)
FROM Employees
;

SELECT Salary
,FirstName
,LastName
FROM Employees
WHERE Salary BETWEEN 200 and 2500
;

SELECT *
FROM Suppliers
;




