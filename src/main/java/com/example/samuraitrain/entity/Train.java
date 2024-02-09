package com.example.samuraitrain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long train_id;
    private String train_name;
    private Integer capacity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "train_id", referencedColumnName = "train_id")
    private List<Stops> stops;

}
