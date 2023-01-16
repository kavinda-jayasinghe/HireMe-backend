package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="advertisement")
public class Advertisement {
    @Id
    @Column(name="advertisement_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int advertisementId;

    @Column(name="contact")
    private String contact;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="working_time")
    private String workingTime;

    @Column(name="hourly_rate")
    private String hourlyRate;

    @Column(name="category")
    private String category;
}
