package com.example.project.service;


import com.example.project.DTO.request.customer.CustomerSaveRequestDTO;

public interface CustomerService {


    String registerCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);
}
