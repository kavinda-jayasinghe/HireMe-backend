package com.example.project.controller;


import com.example.project.DTO.request.customer.CustomerDTO;
import com.example.project.DTO.request.customer.CustomerSaveRequestDTO;
import com.example.project.DTO.request.worker.WorkerDTO;
import com.example.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private  CustomerService customerService;

    @PostMapping(path="/register")
    public String register(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        String name= customerService.registerCustomer(customerSaveRequestDTO);
        return name;

    }


}
