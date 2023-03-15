package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="customer")
public class Customer {

        @Id
        @Column(name="customer_id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int customerId;

        @Column(name="first_name")
        private String firstName;


        @Column(name="last_name")
        private String lastName;

        @Column(name="email")
        private String email;

        @Column(name="password")
        private String password;

        @Column(name = "city")
        private String city;

        public Customer(String firstName, String lastName, String email, String password, String city) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.password = password;
                this.city = city;
        }
}
