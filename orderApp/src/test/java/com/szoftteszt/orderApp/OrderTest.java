package com.szoftteszt.orderApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	private Order order;
	
	@Before
	public void setUp() throws Exception {
		Price price = new Price(1000.0, Currency.HUF);
		Book book = new Book("1234", "Tesztkönyv", "Bekő Tóni", "krimi", price);
		order = new Order(1, "Har Mónika", "Zene utca 2.", "ajándék könyvjelzővel", book);
	}

	@After
	public void tearDown() throws Exception {
		order = null;
	}

	@Test
	public void testGetCustomer() {
		assertEquals("Har Mónika", order.getCustomer());
	}

	@Test
	public void testSetCustomer() {
		order.setCustomer("Mari néni");
		assertEquals("Mari néni", order.getCustomer());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Zene utca 2.", order.getAddress());
	}

	@Test
	public void testSetAddress() {
		order.setAddress("Zene utca 3.");
		assertEquals("Zene utca 3.", order.getAddress());
	}

	@Test
	public void testGetNotes() {
		assertEquals("ajándék könyvjelzővel", order.getNotes());
	}

	@Test
	public void testSetNotes() {
		order.setNotes("könyvjelző nélkül");
		assertEquals("könyvjelző nélkül", order.getNotes());
	}

	@Test
	public void testGetBook() {
		assertEquals("Tesztkönyv", order.getBook());
	}

	@Test
	public void testGetOrder_Id() {
		assertEquals(1, order.getOrder_Id());
	}

	@Test
	public void testSetOrder_Id() {
		order.setOrder_Id(2);
		assertEquals(2, order.getOrder_Id());
	}

	@Test
	public void testGetOrderPrice() {
		Currency usedCurrency = Currency.GBP;
		assertEquals("1000 GBP", order.getOrderPrice(usedCurrency));
	}

}
