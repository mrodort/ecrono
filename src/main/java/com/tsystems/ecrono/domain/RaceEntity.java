package com.tsystems.ecrono.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "races")
@Data
public class RaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "distance_in_meters")
    private Double distanceInMeters;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private RaceType type;
    @Column(name = "init_stamp")
    private Instant initStamp;
}
