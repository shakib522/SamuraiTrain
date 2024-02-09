package com.example.samuraitrain.service;


import com.example.samuraitrain.entity.Station;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.entity.User;
import com.example.samuraitrain.repository.StationRepository;
import com.example.samuraitrain.repository.TrainRepository;
import com.example.samuraitrain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
