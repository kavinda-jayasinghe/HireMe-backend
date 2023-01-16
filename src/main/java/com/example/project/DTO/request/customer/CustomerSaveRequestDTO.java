package com.example.project.DTO.request.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerSaveRequestDTO {
    private String customerName;
    private String customerAddress;
    private double customerSalary;
    private String nic;
}
