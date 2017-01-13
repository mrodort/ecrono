package com.tsystems.ecrono.testrepository;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import org.hibernate.Session;

import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.component.RaceType;

public class CreateRaceService extends SessionManager {

    private Random random = new Random();

    @Override
    public void execute(Session session) {

	RaceEntity raceEntity = createRandomRace();
	session.save(raceEntity);
    }

    private RaceEntity createRandomRace() {
	RaceEntity raceEntity = new RaceEntity();

	raceEntity.setDistanceInMeters(random.nextDouble() * 100);
	raceEntity.setInitTime(Instant.now().minus(Duration.ofDays(random.nextInt(365))));
	raceEntity.setName("Carrera Migue " + random.nextInt());
	raceEntity.setType(RaceType.values()[random.nextInt(4)]);
	return raceEntity;
    }

}
