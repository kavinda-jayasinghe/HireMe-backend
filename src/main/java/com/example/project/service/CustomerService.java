package com.example.project.service;


import com.example.project.DTO.request.customer.CustomerDTO;
import com.example.project.DTO.request.customer.CustomerSaveRequestDTO;

public interface CustomerService {

    String registerCustomer(CustomerDTO customerDTO);
}
