package com.cydeo.model;


import com.cydeo.enums.RecipeType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Component
public class Recipe {

    private UUID id;
    private String name;
    private BigDecimal duration;
    private String prepation;
    private List<Ingredient> ingredients;
    private RecipeType recipeType;



}
