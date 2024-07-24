package com.com.DistrictService.controller;


import com.com.DistrictService.model.District;
import com.com.DistrictService.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/districts")
@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;


    @PostMapping("/save")
    public ResponseEntity<List<District>> saveDistricts(@RequestBody List<District> districtList) {
        List<District> savedDistricts = districtService.saveDistricts(districtList);
        return new ResponseEntity<>(savedDistricts, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<District>> getAllDistricts() {
        List<District> districts = districtService.getAllDistricts();
        return new ResponseEntity<>(districts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<District> getDistrictById(@PathVariable Long id) {
        District district = districtService.getDistrictById(id);
        return district != null ? ResponseEntity.ok(district) : ResponseEntity.notFound().build();
    }

    @GetMapping("/state/{stateCode}")
    public ResponseEntity<List<District>> getDistrictsByStateCode(@PathVariable String stateCode) {
        List<District> districts = districtService.getDistrictByStateCode(stateCode);
        return new ResponseEntity<>(districts, HttpStatus.OK);
    }


}
