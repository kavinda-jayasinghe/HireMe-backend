package com.example.project.DTO.response.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerProfileDTO {

    private String first_name;
    private String last_name;
    private String photo;
    private String city;
    private String description;
    private String contact;
    private String category;
}
