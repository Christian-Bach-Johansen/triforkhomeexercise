package com.example.triforkhomeexercise.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long companyId;
    @Column( name = "company_name")
    private String name;
    private String description;

    public Company() {
    }
}
