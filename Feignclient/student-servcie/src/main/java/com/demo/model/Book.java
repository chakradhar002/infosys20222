package com.demo.model;

public class Book {
	
	private Integer bookId;
    private String bookName;
    private Double bookCost;
	
	public Book(Integer id, String bookName, double bookCost) {
		
		this.bookId =id;
		this.bookName=bookName;
		this.bookCost=bookCost;
	
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	

}
