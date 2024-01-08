package com.cookbook.back.controller;

import com.cookbook.back.domain.Recipe;
import com.cookbook.back.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipes")
    public Iterable<Recipe> getRecipes() {
        return recipeService.findAll();
    }
}
