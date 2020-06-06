package com.tm.srping.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BinarySearchTest {

	@Mock
	SomeCdiDao dao;

	@InjectMocks
	SomeCdiBusiness someCdiBusiness;

	@Test
	public void test() {
		when(dao.getData()).thenReturn(new int[] { 1, 4, 3, 2 });
		int result = someCdiBusiness.findGreatest();
		assertEquals(4, result);

	}

}
