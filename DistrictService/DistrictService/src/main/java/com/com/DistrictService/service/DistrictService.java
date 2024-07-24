package com.com.DistrictService.service;

import com.com.DistrictService.model.District;
import com.com.DistrictService.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<District> saveDistricts(List<District> districtList) {
        return districtRepository.saveAll(districtList);
    }

    public List<District> getAllDistricts() {
        return districtRepository.findAll();
    }

    public District getDistrictById(Long id) {
        return districtRepository.findById(id).orElse(null);
    }

    public List<District> getDistrictByStateCode(String stateCode) {
        return districtRepository.findByStatecode(stateCode);
    }

}
