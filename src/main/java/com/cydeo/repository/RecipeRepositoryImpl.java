package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeRepositoryImpl implements RecipeRepository{
    @Override
    public void saveRecipe(Recipe recipe) {
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(recipe);




    }
}
