package com.ms.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,

        @NotNull(message = "Customer fist name is required.")
        String firstName,

        @NotNull(message = "Customer last name is required.")
        String lastName,

        @NotNull(message = "Customer email is required.")
        @Email(message = "Customer email address is not valid email address.")
        String email,
        Address address
) {

}
