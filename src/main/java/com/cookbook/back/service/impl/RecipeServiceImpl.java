package com.cookbook.back.service.impl;

import com.cookbook.back.domain.Recipe;
import com.cookbook.back.repository.RecipeRepository;
import com.cookbook.back.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Iterable<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}
