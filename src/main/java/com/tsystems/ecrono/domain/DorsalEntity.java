package com.tsystems.ecrono.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.tsystems.ecrono.domain.component.DorsalPrimaryKey;

import lombok.Data;

@Entity()
@Table(name = "dorsals")
@IdClass(value = DorsalPrimaryKey.class)
@Data
public class DorsalEntity {

    @Id
    @Column(name = "race_id")
    private Long raceId;
    @Id
    @Column(name = "dorsal_number")
    private int dorsalNumber;

    @Column(name = "chip_code")
    private String chipCode;

}
