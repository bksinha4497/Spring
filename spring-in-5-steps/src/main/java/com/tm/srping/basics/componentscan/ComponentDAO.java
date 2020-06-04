package com.tm.srping.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConncetion;

	public ComponentJdbcConnection getJdbcConncetion() {
		return jdbcConncetion;
	}

	public void setJdbcConncetion(ComponentJdbcConnection jdbcConncetion) {
		this.jdbcConncetion = jdbcConncetion;
	}

}
