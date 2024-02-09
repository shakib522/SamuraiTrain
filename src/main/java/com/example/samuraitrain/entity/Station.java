package com.example.samuraitrain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Station {
    private String station_name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer station_id;
    private Float longitude;
    private Float latitude;
}
