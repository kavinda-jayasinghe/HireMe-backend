package com.example.project.DTO.request.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkerSaveDTO {

    private String first_name;
    private String last_name;
    private String photo;
    private double hourlyCharge;
    private String email;
    private String city;
    private String contact;
    private String category;
    private String password;
    private String certifications;
    private String address;
    private String description;
}