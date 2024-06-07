USE northwind;

SELECT *
FROM Products;

-- List all product with the category Name and price of each product
SELECT p.ProductID
	  , p.ProductName
      , p.UnitPrice
      , c.CategoryName
FROM Products AS p
INNER JOIN Categories AS c
ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

--  Product Name and price with the supplier name contact name
SELECT p.ProductID
     , p.ProductName
	 , p.UnitPrice
     , S.ContactName
FROM Products AS p
INNER JOIN Suppliers AS S
ON p.SupplierID = S.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName
;

-- List of all  products with price and the different category Name. With the supplier contact name
SELECT p.ProductID
      , p.ProductName
      , p.UnitPrice
      , C.CategoryName
      , S.ContactName
FROM Products AS p 
INNER JOIN Suppliers AS S
ON p.SupplierID = S.SupplierID
INNER JOIN Categories as C
ON p.CategoryID = C.CategoryID
ORDER BY p.ProductName
;

SELECT p.ProductName
      , c.CategoryName
      , p.UnitPrice
FROM Products AS p
INNER JOIN Categories AS c
ON p.CategoryID = c.CategoryID
WHERE UnitPrice = 
          (SELECT MAX(UnitPrice) FROM Products);


SELECT o.orderID
     , o.ShipName
     , o.ShipAddress
     , s.CompanyName
     , o.ShipCountry
FROM Products AS p
INNER JOIN `Order Details` AS od
ON p.ProductID = od.ProductID
INNER JOIN Orders AS o 
ON od.OrderID = o.OrderID
INNER JOIN Shippers AS s
ON o.ShipVia = s.ShipperID
WHERE ShipCountry = 'Germany'
;

-- All the Orders that ordered Sasquarch Ale including  ship name and shi address
SELECT o.OrderID
	  , p.ProductName 
      , o.OrderDate
      , o.shipName
      , o.shipAddress
FROM Products AS P 
INNER JOIN `Order Details` AS od
ON p.ProductID = od.ProductID
INNER JOIN Orders as o 
ON od.OrderID = o.OrderID
WHERE p.ProductName = 'Sasquatch Ale'
;


