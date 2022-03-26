package com.unitbv.controller;

import com.unitbv.model.Ingredient;
import com.unitbv.service.PantryService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/pantry")
public class PantryController {

    private final PantryService pantryService;

    @Autowired
    public PantryController(PantryService pantryService){
        this.pantryService = pantryService;
    }

    @GetMapping
    public ResponseEntity<List<Ingredient>> getAllIngredients(){
        return ok(pantryService.getAllIngredients());
    }

    @PostMapping
    public ResponseEntity postIngredient(@RequestBody Ingredient ingredient) {
        try {
            return ok(pantryService.postIngredient(ingredient));
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Ingredient with name "+ingredient.getName()+" already exists!");

        }
    }

    @PutMapping("/ingredient")
    public ResponseEntity putIngredient(@RequestBody Ingredient ingredient) {
        try {
            return ok(pantryService.putIngredient(ingredient));
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ingredient with name "+ingredient.getName()+" not found!");

        }
    }

    @DeleteMapping("/ingredient/{ingredient}")
    public ResponseEntity delete(@PathVariable("ingredient")String ingredient) {

        try {
            return ok(pantryService.delete(ingredient));
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ingredient with name "+ingredient+" not found!");

        }
    }



}
