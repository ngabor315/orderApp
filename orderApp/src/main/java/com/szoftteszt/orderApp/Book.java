package com.szoftteszt.orderApp;

public class Book {

	private String isbn;
	private String name;
	private String writer;
	private String description;
	private Price price;
	
	public Book() {
	}


	public Book(String isbn, String name, String writer, String description, Price price) {
		super();
		this.setIsbn(isbn);
		this.name = name;
		this.setWriter(writer);
		this.description = description;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}