package com.com.StateService.repository;

import com.com.StateService.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateRepository extends JpaRepository<State,Long> {
    Optional<State> findByStatecode(String stateCode);
}
