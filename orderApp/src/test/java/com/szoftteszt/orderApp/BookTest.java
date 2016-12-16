package com.szoftteszt.orderApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	private Book book;
	
	@Before
	public void setUp() throws Exception {
		Price price = new Price(2000.0, Currency.HUF);
		book = new Book("1234", "Tesztkönyv", "Bekő Tóni", "krimi", price);
	}

	@After
	public void tearDown() throws Exception {
		book = null;
	}

	@Test
	public void testGetName() {
		assertEquals("Tesztkönyv", book.getName());
	}

	@Test
	public void testSetName() {
		book.setName("Másik tesztkönyv");
		assertEquals("Másik tesztkönyv", book.getName());
	}

	@Test
	public void testGetPrice(Price price) {
		assertEquals(price, book.getPrice());
	}

	@Test
	public void testSetPrice() {
		Price price2 = new Price(3000, Currency.HUF);
		book.setPrice(price2);
		assertEquals(price2, book.getPrice());
	}

	@Test
	public void testGetDescription() {
		assertEquals("krimi", book.getDescription());
	}

	@Test
	public void testSetDescription() {
		book.setDescription("kaland");
		assertEquals("kaland", book.getDescription());
	}

	@Test
	public void testGetWriter() {
		assertEquals("Bekő Tóni", book.getWriter());
	}

	@Test
	public void testSetWriter() {
		book.setWriter("Alacsony Áron");
		assertEquals("Alacsony Áron", book.getWriter());
	}

	@Test
	public void testGetIsbn() {
		assertEquals("1234", book.getIsbn());
	}

	@Test
	public void testSetIsbn() {
		book.setIsbn("5678");
		assertEquals("5678", book.getIsbn());
	}

}
