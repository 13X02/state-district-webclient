package com.com.StateService.service;

import com.com.StateService.dto.DistrictDto;
import com.com.StateService.dto.ResponseDto;
import com.com.StateService.model.District;
import com.com.StateService.model.State;
import com.com.StateService.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StateService {


    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private WebClient webClient;


    @Autowired
    private RestTemplate restTemplate;

    public List<State> saveState(List<State> state){
        return stateRepository.saveAll(state);
    }

    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    public State getStateById(Long id){
        return stateRepository.findById(id).orElse(null);
    }
    public State getStateByStateCode(String stateCode){
        return stateRepository.findByStatecode(stateCode).get();
    }

    public ResponseDto getStateDistrict(String stateCode){
//        List district = webClient.get()
//                .uri("http://localhost:9098/districts/state/" + stateCode)
//                .retrieve()
//                .bodyToMono(new ParameterizedTypeReference<List<District>>() {}).block();

        List<DistrictDto> district = restTemplate.getForObject("http://localhost:9098/districts/state/"+stateCode,List.class);
        State state = getStateByStateCode(stateCode);
        ResponseDto responseDto = new ResponseDto(state.getStatename(), district);
        return responseDto;

    }


}
