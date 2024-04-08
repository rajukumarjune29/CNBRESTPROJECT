package com.cnb.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnb.student.model.Mobile;

@Repository
public interface IMobileRepo extends JpaRepository<Mobile, Integer> {

}
