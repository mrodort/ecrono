package com.tsystems.ecrono.testrepository;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.RaceEntity;

public class GetRunnersInRaceService extends SessionManager {

    public void execute(Session session) {

	RaceEntity race = (RaceEntity) session.createCriteria(RaceEntity.class)//
		.add(Restrictions.eq("id", 1L))//
		.setFetchMode("runners", FetchMode.JOIN)//
		.uniqueResult();

	System.out.println(race);
	System.out.println(race.getRunners());

    }

}
