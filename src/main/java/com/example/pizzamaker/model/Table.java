package com.example.pizzamaker.model;
import lombok.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Table {
    private int id;
    private int number;
    private int seats;
    private boolean busy;

}


