package com.szoftteszt.orderApp;

public class Order {

	private int order_Id;
	private String customer;
	private String address;
	private String notes;
	private Book book;
	
	public Order() {
	}

	public Order(int order_Id, String customer, String address, String notes, Book book) {
		super();
		this.setOrder_Id(order_Id);
		this.customer = customer;
		this.address = address;
		this.notes = notes;
		this.book = book;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public String getOrderPrice(Currency usedCurrency)	{
		
		double bookprice = book.getPrice().getAmount();
		
		switch (usedCurrency) {
			case USD:
				bookprice = bookprice*0.003437;
				break;
			case EUR:
				bookprice = bookprice*0.00323598;
				break;
			case JPY:
				bookprice = bookprice*0.38138;
				break;
			case GBP:
				bookprice = bookprice*0.00275493355;
				break;
			case AUD:
				bookprice = bookprice*0.00465292585;
				break;
			case CAD:
				bookprice = bookprice*0.004609;
				break;
			case CHF:
				bookprice = bookprice*0.00347566679;
				break;
			case CNY:
				bookprice = bookprice*0.023684;
				break;
			case HUF:
				break;

		}
		return bookprice + " " + usedCurrency.toString();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
}