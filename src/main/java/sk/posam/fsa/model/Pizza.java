package sk.posam.fsa.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;
@Entity
@Table
public class Pizza{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @NotBlank(message = "Pizza name nesmie byť prázdne")private String name;
        @NotNull(message = "Veľkosť pizze nesmie byť null") private  String size;
        @PositiveOrZero(message = "Cena musí byť nezáporná") private double price;

}

