package com.szoftteszt.orderApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PriceTest {

	private Price price;
	
	@Before
	public void setUp() {
		price = new Price(2000.0, Currency.HUF);
	}
	
	@After
	public void tearDown() throws Exception {
		price = null;
	}

	@Test
	public void testGetAmount() {
		assertEquals(2000.0, price.getAmount(), 0);
	}

	@Test
	public void testSetAmount() {
		price.setAmount(200.0);
		assertEquals(200.0, price.getAmount(), 0);
	}

	@Test
	public void testGetCurrency() {
		assertEquals(Currency.HUF, price.getCurrency());
	}

	@Test
	public void testSetCurrency() {
		price.setCurrency(Currency.JPY);
		assertEquals(Currency.JPY, price.getCurrency());
	}

	@Test
	public void testToString() {
		assertEquals("2000.0 HUF", price.toString());
	}
}