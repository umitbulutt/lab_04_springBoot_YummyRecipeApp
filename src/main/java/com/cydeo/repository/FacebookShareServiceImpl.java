package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FacebookShareServiceImpl implements ShareService {
    @Override
    public void shareRecipe(Recipe recipe) {

        System.out.println("The recipe : " + recipe.getName() + " has been shared on Facebook");
    }
}
