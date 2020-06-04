package com.tm.mockito.mockitosample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void test() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20); // when called first time return 10 , second time return 20
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());

	}

	@Test
	void testGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("ZERO");
		assertEquals("ZERO", listMock.get(0));
		assertEquals(null, listMock.get(2));

	}

}
