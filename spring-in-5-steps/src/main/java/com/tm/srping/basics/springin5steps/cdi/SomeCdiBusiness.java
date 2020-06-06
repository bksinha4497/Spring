package com.tm.srping.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao dao;

	public SomeCdiDao getDao() {
		return dao;
	}

	public void setDao(SomeCdiDao dao) {
		this.dao = dao;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = dao.getData();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
