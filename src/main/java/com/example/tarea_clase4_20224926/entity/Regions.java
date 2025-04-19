package com.example.tarea_clase4_20224926.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @Column(name = "region_id", nullable = false, precision = 22, scale = 0)
    private Long regionId;

    @Column(name = "region_name", length = 25)
    private String regionName;
}
