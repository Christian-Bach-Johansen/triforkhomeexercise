package com.example.triforkhomeexercise.repositories;

import com.example.triforkhomeexercise.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
