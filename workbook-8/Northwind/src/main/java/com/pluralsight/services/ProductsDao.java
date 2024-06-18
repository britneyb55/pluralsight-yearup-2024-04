package com.pluralsight.services;

import com.pluralsight.models.Product;

import java.util.List;

public interface ProductsDao
{
    Product getProductById(int id);
    List<Product> getProductsByCategory(int Category);
    List<Product> getProductsByPrice(Double price);

}
