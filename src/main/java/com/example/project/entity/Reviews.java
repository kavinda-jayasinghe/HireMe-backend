package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="reviews")
public class Reviews {
    @Id
    @Column(name="review_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;

    @Column(name="rate")
    private int rate;

    @Column(name="comment_section")
    private String commentSection;
}
