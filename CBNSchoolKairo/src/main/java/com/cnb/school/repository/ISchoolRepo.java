package com.cnb.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnb.school.model.Image;

public interface ISchoolRepo extends JpaRepository<Image, Integer>{

}
