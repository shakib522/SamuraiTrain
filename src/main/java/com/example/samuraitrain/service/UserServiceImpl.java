package com.example.samuraitrain.service;


import com.example.samuraitrain.entity.Station;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.entity.User;
import com.example.samuraitrain.error.DefaultException;
import com.example.samuraitrain.model.FindTrainAndStops;
import com.example.samuraitrain.model.GetAllTrain;
import com.example.samuraitrain.repository.StationRepository;
import com.example.samuraitrain.repository.TrainRepository;
import com.example.samuraitrain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final StationRepository stationRepository;
    private final  TrainRepository trainRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Station createStation(Station station) {
        return stationRepository.save(station);
    }

    @Override
    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public List<Station> getAllStations() {
        return stationRepository.getAllStations();
    }

    @Override
    public List<FindTrainAndStops> getAllTrains(Integer station_id) {
        Optional<Station> station = stationRepository.findById(station_id.longValue());
        if(station.isEmpty()){
            throw new DefaultException("station with id: "+station_id+" was not found",404);
        }
        return trainRepository.getAllTrain(station_id);
    }
}
