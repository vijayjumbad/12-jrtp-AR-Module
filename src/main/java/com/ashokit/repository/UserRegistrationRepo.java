package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.UserRegistration;

public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Integer> {

}
