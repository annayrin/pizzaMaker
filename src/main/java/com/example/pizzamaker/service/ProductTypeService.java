package com.example.pizzamaker.service;

import com.example.pizzamaker.model.ProductType;
import com.example.pizzamaker.model.Table;

import java.util.List;

public interface ProductTypeService {
    ProductType read(int id);

    List<ProductType> readAll();

    void create(ProductType productType);

    ProductType update (int id, ProductType productType);

    void delete (int id);
}
