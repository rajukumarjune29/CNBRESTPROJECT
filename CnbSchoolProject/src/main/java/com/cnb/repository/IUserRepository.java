package com.cnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnb.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
