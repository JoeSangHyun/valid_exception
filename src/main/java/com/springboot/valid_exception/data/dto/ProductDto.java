package com.springboot.valid_exception.data.dto;

import lombok.*;

@Data
//@Setter
//@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String name;
    private int price;
    private int stock;
}
