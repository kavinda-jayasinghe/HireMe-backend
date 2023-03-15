package com.example.project.service.impl;

import com.example.project.DTO.request.customer.CustomerDTO;
import com.example.project.DTO.request.customer.CustomerSaveRequestDTO;
import com.example.project.entity.Customer;
import com.example.project.repo.CustomerRepo;
import com.example.project.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;



    @Override
    public String registerCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer=new Customer(

                customerSaveRequestDTO.getFirst_name(),
                customerSaveRequestDTO.getLast_name(),
                customerSaveRequestDTO.getEmail(),
                customerSaveRequestDTO.getPassword(),
                customerSaveRequestDTO.getCity()
        );
        customerRepo.save(customer);
        return customer.getFirstName() + " "+customer.getLastName() +" is registered..!";
    }
}
