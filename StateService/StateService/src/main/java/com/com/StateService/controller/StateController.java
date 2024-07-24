package com.com.StateService.controller;

import com.com.StateService.dto.ResponseDto;
import com.com.StateService.model.State;
import com.com.StateService.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.Generated;
import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {


    @Autowired
    private StateService stateService;

    @PostMapping("/saveAll")
    public ResponseEntity<List<State>> saveAll(@RequestBody List<State> states){
        return ResponseEntity.ok(stateService.saveState(states));
    }

    @GetMapping("/getDistricts/{stateCode}")
    public ResponseEntity<ResponseDto> getDistricts(@PathVariable String stateCode){
        return ResponseEntity.ok(stateService.getStateDistrict(stateCode));
    }

}
