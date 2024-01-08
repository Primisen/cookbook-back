package com.cookbook.back.service;

import com.cookbook.back.domain.Recipe;

public interface RecipeService {

    Iterable<Recipe> findAll();
}
