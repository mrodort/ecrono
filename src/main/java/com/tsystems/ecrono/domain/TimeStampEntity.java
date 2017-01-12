package com.tsystems.ecrono.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity()
@Table(name = "time_stamps")
@Data
public class TimeStampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "time_stamp")
    private Instant timeStamp;
    @Column(name = "chip_code")
    private String chipCode;

}
