package com.ms.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

// ✅ Generates equals() and hashCode() including fields from RuntimeException (superclass)
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;
}
