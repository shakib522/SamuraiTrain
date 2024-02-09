package com.example.samuraitrain.repository;

import com.example.samuraitrain.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
