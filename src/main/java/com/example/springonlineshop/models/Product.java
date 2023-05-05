package com.example.springonlineshop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false, columnDefinition = "text", unique = true)
    @NotEmpty(message = "Наименование товара не может быть пустым")
    private String title;

    @Column(name = "description", nullable = false, columnDefinition = "text")
    @NotEmpty(message = "Описание товара не может быть пустым")
    private String description;

    @Column(name = "price", nullable = false)
    @Min(value = 1, message = "Цена товара должна быть больше 1")
    private float price;

    @Column(name = "warehouse", nullable = false, columnDefinition = "text")
    @NotEmpty(message = "Поле склад не может быть пустым")
    private String warehouse;

    @Column(name = "seller", nullable = false, columnDefinition = "text")
    @NotEmpty(message = "Информация о продавце не может быть пустой")
    private String seller;
}
