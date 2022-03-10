package com.example.ultra.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    public String name;
    public String description;
    public String price; // TODO: 10.03.2022 should not use String
    public int quantity;
}
