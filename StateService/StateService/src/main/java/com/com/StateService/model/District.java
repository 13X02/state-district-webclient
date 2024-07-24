package com.com.StateService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    private Long id;
    private String name;
    private Long stateid;
    private String statecode;
}
