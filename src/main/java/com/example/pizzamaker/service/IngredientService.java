package com.example.pizzamaker.service;

import com.example.pizzamaker.model.Ingredient;
import com.example.pizzamaker.model.Table;

import java.util.List;

public interface IngredientService {
    Ingredient read(int id);

    List<Ingredient> readAll();

    void create(Ingredient ingredient);

    Ingredient update (int id, Ingredient ingredient);

    void delete (int id);
}
