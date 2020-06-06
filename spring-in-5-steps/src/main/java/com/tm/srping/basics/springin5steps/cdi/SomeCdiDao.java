package com.tm.srping.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

	public int[] getData() {
		return new int[] { 1, 2, 3, 4, 50 };
	}

}
