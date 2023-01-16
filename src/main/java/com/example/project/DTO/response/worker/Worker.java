package com.example.project.DTO.response.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Worker {

    private String email;
    private String title;
    private String description;
    private String contact;
}
