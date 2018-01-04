package com.example.cloudserviceprovider.repository;

import com.example.cloudserviceprovider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getById(long id);
}
