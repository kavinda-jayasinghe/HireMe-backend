package com.example.project.DTO.request.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDTO {

    private int customerId;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String city;
}
