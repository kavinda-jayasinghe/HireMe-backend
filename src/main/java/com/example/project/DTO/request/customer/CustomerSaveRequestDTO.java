package com.example.project.DTO.request.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerSaveRequestDTO {
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String city;
}
