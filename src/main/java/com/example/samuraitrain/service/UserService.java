package com.example.samuraitrain.service;


import com.example.samuraitrain.entity.Station;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.entity.User;

public interface UserService {
    User createUser(User user);
    Station createStation(Station station);
    Train addTrain(Train train);
}
