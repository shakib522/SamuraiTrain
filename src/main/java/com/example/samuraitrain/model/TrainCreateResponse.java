package com.example.samuraitrain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainCreateResponse {
    private Long train_id;
    private String train_name;
    private Integer capacity;
    private String service_start;
    private String service_ends;
    private Integer num_stations;
}
