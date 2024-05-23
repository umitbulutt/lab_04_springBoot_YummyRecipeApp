package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class InstagramShareServiceImpl implements ShareService {
    @Override
    public void shareRecipe(Recipe recipe) {
        System.out.println("The recipe : " + recipe.getName() + " has been shared on Instagram");
    }
}
