package com.example.samuraitrain.model;


import com.example.samuraitrain.entity.Train;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllTrain {
     Integer station_id;
     List<Train> trains;
}
