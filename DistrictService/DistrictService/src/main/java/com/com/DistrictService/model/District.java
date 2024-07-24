package com.com.DistrictService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class District {

    @Id
    private Long id;
    private String name;
    private Long stateid;
    private String statecode;
}
