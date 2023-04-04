package com.example.triforkhomeexercise.repositories;

import com.example.triforkhomeexercise.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public Iterable<User> findByCompanyId(Long companyId);
}
