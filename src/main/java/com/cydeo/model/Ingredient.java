package com.cydeo.model;


import com.cydeo.enums.QuantityType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;


}
