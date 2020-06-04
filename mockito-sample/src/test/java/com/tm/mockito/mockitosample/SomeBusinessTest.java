package com.tm.mockito.mockitosample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessTest {

	@Mock
	DataService mockService;

	@InjectMocks
	SomeBusinessImpl business;

	/* Using Annotations */
	@Test
	public void testFindTheGreatestUsingAnnotations() {

		when(mockService.retriveAllData()).thenReturn(new int[] { 24, 6, 5 });

		int result = business.findTheGreatest();
		assertEquals(24, result);
	}

	/* Using mocking without annotations */
	@Test
	public void testFindTheGreatest() {

		DataService mockService = mock(DataService.class);
		when(mockService.retriveAllData()).thenReturn(new int[] { 24, 6, 5 });
		SomeBusinessImpl business = new SomeBusinessImpl(mockService);
		int result = business.findTheGreatest();
		assertEquals(24, result);
	}

	/* Normal junit without mock */

	@Test
	public void testDindTheGreatest() {
		SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
		int result = business.findTheGreatest();
		assertEquals(24, result);
	}

	public class DataServiceStub implements DataService {

		public DataServiceStub() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int[] retriveAllData() {
			return new int[] { 24, 6, 15 };
		}
	}

}
