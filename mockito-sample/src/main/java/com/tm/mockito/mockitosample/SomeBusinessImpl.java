package com.tm.mockito.mockitosample;

public class SomeBusinessImpl {

	public SomeBusinessImpl(DataService service) {
		super();
		this.service = service;
	}

	private DataService service;

	int findTheGreatest() {

		int[] data = service.retriveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
