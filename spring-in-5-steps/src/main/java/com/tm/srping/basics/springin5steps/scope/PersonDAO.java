package com.tm.srping.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	JdbcConnection jdbcConncetion;

	public JdbcConnection getJdbcConncetion() {
		return jdbcConncetion;
	}

	public void setJdbcConncetion(JdbcConnection jdbcConncetion) {
		this.jdbcConncetion = jdbcConncetion;
	}

}
