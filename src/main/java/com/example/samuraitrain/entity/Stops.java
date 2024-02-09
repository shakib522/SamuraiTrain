package com.example.samuraitrain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long station_id;
    private String arrival_time;
    private String departure_time;
    private Integer fare;
}
