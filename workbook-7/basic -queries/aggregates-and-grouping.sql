use northwind;

SELECT COUNT(*) AS suppliers
FROM Suppliers;

SELECT *
FROM Employees;

SELECT SUM(Salary)
FROM Employees;

SELECT * 
FROM Products;

SELECT MIN(UnitPrice)
FROM Products;

SELECT ProductName
FROM Products
WHERE UnitPrice = 2.5;

SELECT AVG(UnitPrice)
FROM Products;

SELECT MAX(UnitPrice)
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


