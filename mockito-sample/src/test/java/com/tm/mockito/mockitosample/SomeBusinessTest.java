package com.tm.mockito.mockitosample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

class SomeBusinessTest {

	@Test
	void testFindTheGreatest() {

		DataService mockService = mock(DataService.class);
		when(mockService.retriveAllData()).thenReturn(new int[] { 24, 6, 5 });
		SomeBusinessImpl business = new SomeBusinessImpl(mockService);
		int result = business.findTheGreatest();
		assertEquals(24, result);
	}

	/* Normal junit without mock */

	/*
	 * @Test void testDindTheGreatest() { SomeBusinessImpl business = new
	 * SomeBusinessImpl(new DataServiceStub()); int result =
	 * business.findTheGreatest(); assertEquals(24, result); }
	 * 
	 * public class DataServiceStub implements DataService {
	 * 
	 * public int[] retriveAllData() { return new int[] { 24, 6, 15 }; } }
	 */

}
