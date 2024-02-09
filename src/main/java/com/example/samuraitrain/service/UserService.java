package com.example.samuraitrain.service;


import com.example.samuraitrain.entity.Station;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.entity.User;
import com.example.samuraitrain.model.FindTrainAndStops;
import com.example.samuraitrain.model.GetAllTrain;

import java.util.List;

public interface UserService {
    User createUser(User user);
    Station createStation(Station station);
    Train addTrain(Train train);
    List<Station> getAllStations();
    List<FindTrainAndStops> getAllTrains(Integer station_id);
}
