package com.example.samuraitrain.model;

import com.example.samuraitrain.entity.Station;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllStationResponse {
    private List<Station> stations;
}
