package com.example.project.util.mappers;


import com.example.project.DTO.request.customer.CustomerSaveRequestDTO;
import com.example.project.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

Customer DtoToEntity(CustomerSaveRequestDTO customerSaveRequestDTO);

}