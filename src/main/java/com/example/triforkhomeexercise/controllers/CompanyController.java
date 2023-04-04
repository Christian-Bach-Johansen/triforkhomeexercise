package com.example.triforkhomeexercise.controllers;

import com.example.triforkhomeexercise.domain.Company;
import com.example.triforkhomeexercise.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired( required = true)
    CompanyService service;

    @PostMapping("/savecompany")
    public Company saveCompany(@RequestBody Company company) {
        return service.save(company);
    }

    @GetMapping("/getcompany")
    public Optional<Company> getCompany(Long id) {
        return service.list(id);
    }
}
