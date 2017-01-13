package com.tsystems.ecrono;

import com.tsystems.ecrono.configuration.HibernateUtil;
import com.tsystems.ecrono.testrepository.GetClassificationListService;

public class Aplication {

    public static void main(String[] args) {

	try {
	    // System.out.println("----GET_RUNNERS----");
	    // new GetRunnersInRaceService().doSomething();
	    // System.out.println("----CREATE_RACE----");
	    // new CreateRaceService().doSomething();
	    // System.out.println("----GET_TIME_STAMP----");
	    // new GetTimeStampByDorsalIdService().doSomething();
	    System.out.println("----GET_CLASSIFICATION----");
	    new GetClassificationListService().doSomething();
	} finally {
	    HibernateUtil.close();
	}
    }

}
