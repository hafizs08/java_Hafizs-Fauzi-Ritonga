package com.section27.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.section27.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getDistinctTopByUsername(String username);
}
