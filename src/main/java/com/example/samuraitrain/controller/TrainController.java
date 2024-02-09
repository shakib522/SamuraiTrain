package com.example.samuraitrain.controller;


import com.example.samuraitrain.entity.Station;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.entity.User;
import com.example.samuraitrain.error.DefaultException;
import com.example.samuraitrain.model.FindTrainAndStops;
import com.example.samuraitrain.model.GetAllStationResponse;
import com.example.samuraitrain.model.GetAllTrain;
import com.example.samuraitrain.model.TrainCreateResponse;
import com.example.samuraitrain.service.UserService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TrainController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) throws DefaultException {
        return ResponseEntity.status(201).body(userService.createUser(user));
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Samurai Train Service";
    }

    @PostMapping("/station")
    public ResponseEntity<Station> createStation(@RequestBody Station station) throws DefaultException {
        return ResponseEntity.status(201).body(userService.createStation(station));
    }
    @PostMapping("/trains")
    public ResponseEntity<TrainCreateResponse> addTrain(@RequestBody Train train) throws DefaultException {
        Train savedTrain = userService.addTrain(train);
        //int serviceStart = Integer.parseInt(savedTrain.getStops().get(0).getDeparture_time())-Integer.parseInt(savedTrain.getStops().get(0).getArrival_time());
        TrainCreateResponse response = TrainCreateResponse.builder()
                .train_id(savedTrain.getTrain_id())
                .train_name(savedTrain.getTrain_name())
                .capacity(savedTrain.getCapacity())
                .service_start(savedTrain.getStops().get(0).getDeparture_time())
                .service_ends(savedTrain.getStops().get(savedTrain.getStops().size()-1).getArrival_time())
                .num_stations(savedTrain.getStops().size())
                .build();
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/stations")
    public ResponseEntity<GetAllStationResponse> getAllStations() throws DefaultException {
        GetAllStationResponse response = GetAllStationResponse.builder()
                .stations(userService.getAllStations())
                .build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/stations/{stationId}/trains")
    public ResponseEntity<GetAllTrain> getAllTrains(@PathVariable Integer stationId) throws DefaultException {
        GetAllTrain response = GetAllTrain.builder()
                .build();
        ArrayList<Train> trains = new ArrayList<>();
        userService.getAllTrains(stationId).forEach(train -> {
            Train t = new Train();
            t.setTrain_id(train.getTrain_id().longValue());
            t.setTrain_name(train.getTrain_name());
            t.setCapacity(train.getTrain_capacity());
            trains.add(t);
        });
        response.setTrains(trains);

        return  ResponseEntity.ok().body(response);
    }

}