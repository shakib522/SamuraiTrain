package com.example.samuraitrain.repository;

import com.example.samuraitrain.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {

    @Query(value = "SELECT * FROM samuraiTrain.station",nativeQuery = true)
    List<Station>getAllStations();
}
