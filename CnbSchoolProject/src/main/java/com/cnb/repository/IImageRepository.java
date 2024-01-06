package com.cnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnb.entity.Image;

@Repository
public interface IImageRepository extends JpaRepository<Image,Long>{

}
