package com.ms.ecommerce.customer;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder // ✅ Generates builder-style methods for easy object creation.
@Document// 📄 Maps this class to the "customers" collection in MongoDB (default is class name @Document("customers") if not specified).
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
}
