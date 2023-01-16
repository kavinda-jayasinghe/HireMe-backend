package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="payment")
public class Payment {
    @Id
    @Column(name="payment_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;

    @Column(name="amount")
    private String amount;

    @Column(name="date")
    private String date;
}
