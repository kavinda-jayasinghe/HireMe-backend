package com.example.project.service.impl;

import com.example.project.DTO.request.customer.CustomerDTO;
import com.example.project.entity.Customer;
import com.example.project.repo.CustomerRepo;
import com.example.project.service.CustomerService;

import com.example.project.util.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String registerCustomer(CustomerDTO customerDTO) {
        Customer customer=new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getFirst_name(),
                customerDTO.getLast_name(),
                customerDTO.getEmail(),
                customerDTO.getPassword(),
                customerDTO.getCity()
        );
        customerRepo.save(customer);
        return customer.getFirstName() + " "+customer.getLastName() +" is registered..!";
    }
}
