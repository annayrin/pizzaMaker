package com.example.pizzamaker.model;
import lombok.*;
import java.util.List;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product {

    private int id;

    private int productTypeId;

    private String name;

    private float price;

    private String imagePath;

    private String currency;

}

