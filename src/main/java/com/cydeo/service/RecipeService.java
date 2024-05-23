package com.cydeo.service;

import com.cydeo.enums.QuantityType;
import com.cydeo.enums.RecipeType;
import com.cydeo.model.Ingredient;
import com.cydeo.model.Recipe;
import com.cydeo.repository.RecipeRepository;
import com.cydeo.repository.ShareService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class RecipeService {

    private final Faker faker;
    private final ShareService shareService;
    private final RecipeRepository repository;

    public RecipeService(Faker faker, ShareService shareService, RecipeRepository repository) {
        this.faker = faker;
        this.shareService = shareService;
        this.repository = repository;
    }


    public void prepareRecipe(){
        Ingredient ingredient1  = new Ingredient();
        ingredient1.setName(faker.food().dish());
        ingredient1.setQuantity(2);
        ingredient1.setQuantityType(QuantityType.OUNCE);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);

        Recipe recipe = new Recipe();
        recipe.setId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(BigDecimal.valueOf(30.00));
        recipe.setPrepation(faker.lorem().paragraph(6));
        recipe.setIngredients(ingredients);
        recipe.setRecipeType(RecipeType.BAKED);

        shareService.shareRecipe(recipe);
        repository.saveRecipe(recipe);


    }

}
