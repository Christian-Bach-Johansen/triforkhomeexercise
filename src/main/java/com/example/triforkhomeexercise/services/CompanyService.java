package com.example.triforkhomeexercise.services;

import com.example.triforkhomeexercise.domain.Company;
import com.example.triforkhomeexercise.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository repository;

    public Company save(Company company) {
        return repository.save(company);
    }

    public Optional<Company> list(Long id) {
        return repository.findById(id);
    }

}
