USE northwind;

SELECT * 
FROM Suppliers;

-- how many suppliers are there?
SELECT COUNT(*) AS suppliers
FROM Suppliers;


SELECT *
FROM Employees;

-- sum of all employee salaries 
SELECT SUM(Salary)
FROM Employees;

SELECT * 
FROM Products;

-- Cheapest item name 
SELECT ProductName
     , UnitPrice
FROM Products
WHERE UnitPrice = (
		SELECT MIN(UnitPrice)
        FROM Products);


-- Average item price
SELECT AVG(UnitPrice)
FROM Products;

-- Most expensive item 
SELECT Product
MAX(UnitPrice)
FROM Products;

SELECT  SupplierID
       ,COUNT(*) As NumberOFItems_FromSupplier
FROM Products
GROUP BY SupplierID;

SELECT CategoryID
       ,AVG(Unitprice)
FROM Products
GROUP BY CategoryID;

SELECT SupplierID
      ,COUNT(*) As NumberOFItems_FromSupplier
FROM Products
GROUP BY SupplierID
HAVING COUNT(*) >= 5
;


