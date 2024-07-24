package com.com.DistrictService.repository;

import com.com.DistrictService.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    List<District> findByStatecode(String stateCode);
}
