package com.tsystems.ecrono.testrepository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.TimeStampEntity;

public class GetClassificationListService extends SessionManager {

    @Override
    public void execute(Session session) {

	List<DorsalEntity> classification = session.createCriteria(DorsalEntity.class)//
		.add(Restrictions.eq("raceId", 1L))//
		.setFetchMode("timeStamps", FetchMode.JOIN)//
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)//
		.list();

	for (DorsalEntity dorsalEntity : classification) {
	    System.out.println(dorsalEntity);
	    for (TimeStampEntity timeStamp : dorsalEntity.getTimeStamps()) {
		System.out.println(timeStamp);
	    }
	}

	RaceEntity race = (RaceEntity) session.createCriteria(RaceEntity.class)//
		.add(Restrictions.eq("id", 1L))//
		.createAlias("dorsals", "dorsales")//
		.createAlias("dorsales.timeStamps", "tiempos")//
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)//
		.add(Restrictions.gt("dorsales.dorsalNumber", 2))//
		.uniqueResult();

	System.out.println(race);

	for (DorsalEntity dorsalEntity : classification) {
	    System.out.println(dorsalEntity);
	    for (TimeStampEntity timeStamp : dorsalEntity.getTimeStamps()) {
		System.out.println(timeStamp);
	    }
	}
    }
}
