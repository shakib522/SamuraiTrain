package com.example.samuraitrain.repository;

import com.example.samuraitrain.entity.Stops;
import com.example.samuraitrain.entity.Train;
import com.example.samuraitrain.model.FindTrainAndStops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

    @Query(value = "SELECT * FROM samuraiTrain.train t join samuraiTrain.stops s WHERE t.train_id = s.train_id and s.station_id=?1 ORDER BY s.departure_time ASC, s.arrival_time ASC, s.train_id ASC", nativeQuery = true)
    List<FindTrainAndStops> getAllTrain(Integer station_id);
}
