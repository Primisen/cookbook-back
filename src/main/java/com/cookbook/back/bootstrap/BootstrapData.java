package com.cookbook.back.bootstrap;

import com.cookbook.back.domain.Ingredient;
import com.cookbook.back.domain.Recipe;
import com.cookbook.back.repository.IngredientRepository;
import com.cookbook.back.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final IngredientRepository ingredientRepository;
    private final RecipeRepository recipeRepository;

    public BootstrapData(IngredientRepository ingredientRepository, RecipeRepository recipeRepository) {
        this.ingredientRepository = ingredientRepository;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Ingredient potato = new Ingredient();
        potato.setName("Potato");

        Recipe roastedPotatoes = new Recipe();
        roastedPotatoes.setTitle("RoastedPotatoes");
        roastedPotatoes.setInstruction("Cut potatoes, fry, salt.");

        Ingredient potatoSaved = ingredientRepository.save(potato);
        Recipe roastedPotatoesSaved = recipeRepository.save(roastedPotatoes);

        Ingredient sugar = new Ingredient();
        sugar.setName("Sugar");

        Recipe caramel = new Recipe();
        caramel.setTitle("Caramel");
        caramel.setInstruction("Boil the sugar on a small fire until the sugar dissolves.");

        Ingredient sugarSaved = ingredientRepository.save(sugar);
        Recipe caramelSaved = recipeRepository.save(caramel);

        roastedPotatoesSaved.getIngredients().add(potatoSaved);
        caramelSaved.getIngredients().add(sugarSaved);

        recipeRepository.save(roastedPotatoesSaved);
        recipeRepository.save(caramelSaved);

        System.out.println("In Bootstrap");
        System.out.println("Recipe Count: " + recipeRepository.count());
        System.out.println("Ingredient Count: " + ingredientRepository.count());
    }
}
