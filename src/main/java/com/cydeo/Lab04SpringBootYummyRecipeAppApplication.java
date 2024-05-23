package com.cydeo;

import com.cydeo.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab04SpringBootYummyRecipeAppApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(Lab04SpringBootYummyRecipeAppApplication.class, args);

        RecipeService recipeService =  container.getBean(RecipeService.class);
        recipeService.prepareRecipe();























    }

}
