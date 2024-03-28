package com.asamblea.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asamblea.web.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {}