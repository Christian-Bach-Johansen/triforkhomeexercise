package com.example.triforkhomeexercise.services;

import com.example.triforkhomeexercise.domain.User;
import com.example.triforkhomeexercise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public Iterable<User> save(List<User> users) {
        return repository.saveAll(users);
    }

    public Iterable<User> list() {
        return repository.findAll();
    }

    public Optional<User> list(Long id) {
        return repository.findById(id);
    }

    public Iterable<User> listByCompany(Long companyId) {
        return repository.findByCompanyId(companyId);
    }
}
