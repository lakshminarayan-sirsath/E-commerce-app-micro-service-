package com.ms.ecommerce.customer;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder // ✅ Generates builder-style methods for easy object creation.
@Validated // This class fields are also considered for validation in DTO
public class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}
