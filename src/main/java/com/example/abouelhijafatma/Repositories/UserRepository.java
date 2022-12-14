package com.example.abouelhijafatma.Repositories;

import com.example.abouelhijafatma.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByFirstnameAndLastname(String firstName, String Lastname);
}
