package com.unitbv.service;

import com.unitbv.model.Ingredient;

import java.util.List;

public interface PantryService {

    List<Ingredient> getAllIngredients();
    Ingredient postIngredient(Ingredient ingredient);
    Ingredient putIngredient(Ingredient ingredient);
    Boolean delete(String ingredient);
}
