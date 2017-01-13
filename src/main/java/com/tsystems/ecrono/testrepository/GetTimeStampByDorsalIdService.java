package com.tsystems.ecrono.testrepository;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.TimeStampEntity;

public class GetTimeStampByDorsalIdService extends SessionManager {

    @Override
    public void execute(Session session) {

	DorsalEntity dorsal = (DorsalEntity) session.createCriteria(DorsalEntity.class)//
		.setFetchMode("timeStamp", FetchMode.JOIN)//
		.add(Restrictions.eq("id", 5L))//
		.uniqueResult();

	List list = session.createCriteria(TimeStampEntity.class)//
		.add(Restrictions.eq("dorsal.id", 5L))//
		.list();

	System.out.println(list);
    }
}
