package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="admin")
public class Admin {

    @Id
    @Column(name="admin_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;
}
