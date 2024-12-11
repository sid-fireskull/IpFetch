package com.ip.fetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ip.fetch.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
