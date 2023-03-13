package com.example.esyfinancebackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.esyfinancebackend.dto.LoginResponseDTO;
import com.example.esyfinancebackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
