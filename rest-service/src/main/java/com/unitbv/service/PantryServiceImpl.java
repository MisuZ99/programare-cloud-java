package com.unitbv.service;

import com.unitbv.datasource.MyPantry;
import com.unitbv.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PantryServiceImpl implements PantryService{

    private final MyPantry pantry;

    @Autowired
    public PantryServiceImpl(MyPantry pantry){
        this.pantry = pantry;
    }

    @Override
    public List<Ingredient> getAllIngredients(){
        return pantry.getAllIngredients();
    }

    @Override
    public Ingredient postIngredient(Ingredient ingredient) {
        return pantry.saveIngredient(ingredient);
    }

    @Override
    public Ingredient putIngredient(Ingredient ingredient){
        Ingredient newIngredient=pantry.updateIngredient(ingredient);
        return pantry.updateIngredient(ingredient);
    }

    @Override
    public Boolean delete(String ingredient) {
        return pantry.deleteIngredient(ingredient);
    }

}
