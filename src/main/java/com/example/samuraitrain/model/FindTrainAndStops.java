package com.example.samuraitrain.model;

public interface FindTrainAndStops {
    Integer getTrain_id();

    String getTrain_name();

    String getTrain_type();

    String getTrain_start_time();

    String getTrain_end_time();

    Integer getTrain_capacity();

    Integer getTrain_fare();

    Integer getTrain_stops_id();

    Integer getStation_id();

    String getStation_name();

    String getStation_code();

    String getStation_city();

    String getStation_state();

    String getStation_country();

    String getStation_zone();

    Integer getTrain_stops_distance();

    String getTrain_stops_arrival_time();

    String getTrain_stops_departure_time();
}
